package shubh.sport.Social;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import shubh.sport.R;

public class SingleInstaActivity extends AppCompatActivity {
   private String post_key=null;
   private DatabaseReference mDatabse;
   private ImageView singlePostImage;
   private TextView singlepostTitle;
   private TextView singlepostUser;
   private Button deleteButton;
   private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_insta);
        String post_key=getIntent().getExtras().getString("PostID");
        mDatabse= FirebaseDatabase.getInstance().getReference().child("witchar2k18");
        singlePostImage=(ImageView)findViewById(R.id.singleImageView);
        singlepostTitle= findViewById(R.id.singleTitle);
        singlepostUser= findViewById(R.id.singleUserName);
        mAuth= FirebaseAuth.getInstance();
        deleteButton= findViewById(R.id.singleDeleatebutton);
        deleteButton.setVisibility(View.INVISIBLE);

        mDatabse.child(post_key).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String post_title=(String)dataSnapshot.child("title").getValue();
                String post_uid=(String)dataSnapshot.child("uid").getValue();
                String post_name=(String)dataSnapshot.child("username").getValue();
                String post_image=(String)dataSnapshot.child("image").getValue();
                singlepostTitle.setText(post_title);
                singlepostUser.setText(post_name);
                Picasso.with(SingleInstaActivity.this).load(post_image).into(singlePostImage);
                if (mAuth.getCurrentUser().getUid().equals(post_uid)){
                    deleteButton.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
    public void deleteButtonClicked(View view){
        mDatabse.child(post_key).removeValue();
        Intent mai=new Intent(SingleInstaActivity.this,Social_Timeline.class);
        startActivity(mai);
    }
}
