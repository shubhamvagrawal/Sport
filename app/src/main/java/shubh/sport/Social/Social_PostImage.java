package shubh.sport.Social;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.ArrayList;
import java.util.List;

import shubh.sport.R;

public class Social_PostImage extends AppCompatActivity {
    private static final int GALLERY_REQUEST=2;
    private Uri uri11=null;
    private ImageButton image1;
    private EditText edt;
    private StorageReference storageReference;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference,likedatabse;
    private ProgressBar progressBar;
    private FirebaseAuth mAuth;
    private DatabaseReference mDatabaseusers;
    private FirebaseUser mCurrentUser;
    private Spinner sp;
    public  String item;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        edt= findViewById(R.id.editcaption);
        storageReference= FirebaseStorage.getInstance().getReference();
        databaseReference=database.getInstance().getReference().child("witchar2k18");
        likedatabse=database.getInstance().getReference().child("Likes");
        mAuth= FirebaseAuth.getInstance();
        mCurrentUser=mAuth.getCurrentUser();
        mDatabaseusers= FirebaseDatabase.getInstance().getReference().child("Users").child(mCurrentUser.getUid());

        progressBar= findViewById(R.id.progressBar2);
        progressBar.setVisibility(View.GONE);
        sp= findViewById(R.id.sp);


        List<String> names = new ArrayList<String>();
        names.add("ARCHERY");
        names.add("ATHLETICS");
        names.add("BADMINTON");



       // ArrayAdapter<String> adapter;

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, names);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // On selecting a spinner item
               item = adapterView.getItemAtPosition(i).toString();

                // Showing selected spinner item
                Toast.makeText(adapterView.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });





    }




    public void imageuButtonClicked(View view) {
        Intent gallaryintent=new Intent(Intent.ACTION_GET_CONTENT);
        gallaryintent.setType("image/*");
        startActivityForResult(gallaryintent,GALLERY_REQUEST);
    }


    @Override

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==GALLERY_REQUEST&&resultCode==RESULT_OK){
            uri11=data.getData();
            image1=(ImageButton)findViewById(R.id.Imageu);
            image1.setImageURI(uri11);


        }
    }

    public void uploadButtonClicked(View view) {
        progressBar.setVisibility(View.VISIBLE);
    final String titalValue=edt.getText().toString().trim();

    if (!TextUtils.isEmpty(titalValue)){
        StorageReference filePath=storageReference.child("Postimage").child(uri11.getLastPathSegment());
        filePath.putFile(uri11).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
               final  Uri downloadurl=taskSnapshot.getDownloadUrl();
                Toast.makeText(Social_PostImage.this, "Upload Complete", Toast.LENGTH_LONG).show();
                progressBar.setVisibility(View.GONE);


                final DatabaseReference newPost=databaseReference.push();
                final DatabaseReference newPostlike=likedatabse.push();
                mDatabaseusers.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        newPost.child("title").setValue(titalValue);
                        newPost.child("event").setValue(item);

                        newPost.child("likeco").setValue(0);

                        newPost.child("image").setValue(downloadurl.toString());
                        newPost.child("uid").setValue(mCurrentUser.getUid());
                        newPost.child("branch").setValue(dataSnapshot.child("branch").getValue()).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful()){

                                    finish();
                                }
                            }
                        });



                        newPost.child("username").setValue(dataSnapshot.child("name").getValue()).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful()){
                                    Intent timelineintent=new Intent(Social_PostImage.this,Social_Timeline.class);
                                    startActivity(timelineintent);
                                    finish();

                                }
                            }
                        });
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });



            }
        });
    }

    }
}
