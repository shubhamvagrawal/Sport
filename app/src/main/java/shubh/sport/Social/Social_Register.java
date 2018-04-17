package shubh.sport.Social;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import shubh.sport.R;

public class Social_Register extends AppCompatActivity {
    private EditText nameField1;
    private EditText nameField2;
    private EditText emailField1;
    private EditText passField1;
    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        nameField1= findViewById(R.id.nameField);
        nameField2= findViewById(R.id.nameFieldbranch);
        emailField1= findViewById(R.id.emailField);
        passField1= findViewById(R.id.passField);
        passField1.setTransformationMethod(new PasswordTransformationMethod());
        mAuth= FirebaseAuth.getInstance();
        mDatabase= FirebaseDatabase.getInstance().getReference().child("Users");
        progressBar= findViewById(R.id.progressBar2);
        progressBar.setVisibility(View.GONE);

    }



    public void registerButtonCliked(View view) {
        progressBar.setVisibility(View.VISIBLE);
        final String name=nameField1.getText().toString().trim();
        final String branch=nameField2.getText().toString().trim();
        String email=emailField1.getText().toString().trim();
        String pass=passField1.getText().toString().trim();
        if(!TextUtils.isEmpty(name)&&!TextUtils.isEmpty(email)&&!TextUtils.isEmpty(pass)){
            mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        progressBar.setVisibility(View.GONE);
                        String user_id=mAuth.getCurrentUser().getUid();
                        DatabaseReference current_user_db=mDatabase.child(user_id);

                        mDatabase.child(user_id).child("name").setValue(name);
                        mDatabase.child(user_id).child("branch").setValue(branch);
                        current_user_db.child("image").setValue("default");
                        Intent mainIntent=new Intent(Social_Register.this,Social_Timeline.class);
                        mainIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(mainIntent);
                        finish();

                    }

                }
            });

        }
    }

    public void signonClick(View view) {
        Intent intent=new Intent(Social_Register.this,Social_Login.class);
        startActivity(intent);
    }
}


