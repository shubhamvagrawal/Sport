package shubh.sport.Social;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import shubh.sport.R;

public class Social_Timeline extends AppCompatActivity {
    private RecyclerView mWitchlist;
    private DatabaseReference mDatabase;
    private DatabaseReference mDatabaseLike,mDatabaseLikeCounts;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private TextView count;
    private boolean mProcessLike=false;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);
        count= findViewById(R.id.numlikes);
        mWitchlist= findViewById(R.id.witch_list);
        mWitchlist.setHasFixedSize(true);
        mWitchlist.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setStackFromEnd(true);
        layoutManager.setReverseLayout(true);
        mWitchlist.setLayoutManager(layoutManager);
        mDatabase= FirebaseDatabase.getInstance().getReference().child("witchar2k18");



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Click action
                Intent intent = new Intent(Social_Timeline.this, Social_PostImage.class);
                startActivity(intent);
            }
        });





        mAuth= FirebaseAuth.getInstance();
        mAuthListener=new FirebaseAuth.AuthStateListener() {
           @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if(firebaseAuth.getCurrentUser()==null){
                    Intent loginIntent=new Intent(Social_Timeline.this,Social_Register.class);
                    loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(loginIntent);
                }

            }
        };

        mDatabaseLike= FirebaseDatabase.getInstance().getReference().child("Likes");

        mDatabaseLike.keepSynced(true);

    }

    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
        FirebaseRecyclerAdapter<insta,InstaviewHolder> FBRA=new FirebaseRecyclerAdapter<insta, InstaviewHolder>(
                insta.class,
                R.layout.inta_row,
                InstaviewHolder.class,
                mDatabase
        ) {
            @Override
            protected void populateViewHolder(InstaviewHolder viewHolder, insta model, int i)
            {
                final String post_key= getRef(i).getKey();
                viewHolder.setTitle(model.getTitle());
                viewHolder.setImage(getApplicationContext(),model.getImage());
                viewHolder.setUserName(model.getUsername());
                viewHolder.setBranch(model.getBranch());
                viewHolder.setLikebtn(post_key);
                viewHolder.setEvent(model.getEvent());
                viewHolder.setLikeco(String.valueOf(model.getLikeco()));

                viewHolder.mview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent singleInsta=new Intent(Social_Timeline.this,SingleInstaActivity.class);
                        singleInsta.putExtra("PostID",post_key);
                        startActivity(singleInsta);

                    }
                });
                viewHolder.mlikebtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mProcessLike=true;
                        final Boolean bool;

                        mDatabaseLikeCounts= FirebaseDatabase.getInstance().getReference().child("Likes").child(post_key).child("likecount");
                        mDatabaseLikeCounts.keepSynced(true);
                        final DatabaseReference newPost=mDatabaseLikeCounts.push();

                        mDatabase.addValueEventListener(new ValueEventListener()
                        {
                                @Override
                                public void onDataChange(DataSnapshot dataSnapshot) {
                                    if (mProcessLike) {
                                        if (dataSnapshot.child(post_key).hasChild(mAuth.getCurrentUser().getUid())) {
                                            mDatabase.child(post_key).child(mAuth.getCurrentUser().getUid()).removeValue();
                                            int likeco=0;
                                            likeco=dataSnapshot.child(post_key).child("likeco").getValue(Integer.class);
                                            mDatabase.child(post_key).child("likeco").setValue(likeco-1);

                                            mProcessLike = false;

                                        } else
                                            {
                                            mDatabase.child(post_key).child(mAuth.getCurrentUser().getUid()).setValue("RandomValue");
                                            mProcessLike = false;
                                            //updateCounter(true);
                                            int likeco=0;
                                            likeco=dataSnapshot.child(post_key).child("likeco").getValue(Integer.class);

                                            mDatabase.child(post_key).child("likeco").setValue(likeco+1);

                                        }
                                    }
                                }

                                @Override
                                public void onCancelled(DatabaseError databaseError) {

                                }
                            });

                    }
                });

            }

        };
       mWitchlist.setAdapter(FBRA);
    }




    public static class InstaviewHolder extends RecyclerView.ViewHolder{
        View mview;
        ImageButton mlikebtn;
        DatabaseReference mDatabaselike;
        FirebaseAuth mAuth;
        TextView count,s,t;

        public InstaviewHolder(View itemView){
            super(itemView);
            mview=itemView;
            mlikebtn= mview.findViewById(R.id.likes);
            count= mview.findViewById(R.id.numlikes);
            s= mview.findViewById(R.id.textBranch);
            mDatabaselike= FirebaseDatabase.getInstance().getReference().child("witchar2k18");
            mAuth= FirebaseAuth.getInstance();
            mDatabaselike.keepSynced(true);
        }

   public void setLikebtn(final String post_key){
            mDatabaselike.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    if (dataSnapshot.child(post_key).hasChild(mAuth.getCurrentUser().getUid())){
                        mlikebtn.setImageResource(R.drawable.alike);
                    }else{
                        mlikebtn.setImageResource(R.drawable.blikedd);
                    }
                }
                @Override
                public void onCancelled(DatabaseError databaseError) {
                }
            });

        }

        public void setTitle(String title){
            TextView post_title= mview.findViewById(R.id.text_title);
            post_title.setText(title);
        }
        public  void setEvent(String event){
            TextView evnts= mview.findViewById(R.id.eventname);
            evnts.setText(event);
        }
        public void setLikeco(String likeco){
            count= mview.findViewById(R.id.numlikes);
           count.setText(Integer.toString(Integer.parseInt(likeco)));
        }

        public void setImage(Context ctx,String image){
            ImageView post_image= mview.findViewById(R.id.post_image);
            Picasso.with(ctx).load(image).into(post_image);
        }
        public void setUserName(String userName){
            TextView postUsername= mview.findViewById(R.id.textUsername);
            postUsername.setText(userName);
        }
        public void setBranch(String branch){
            TextView branchm= mview.findViewById(R.id.textBranch);
            branchm.setText(branch);
        }


    }

}
