package com.example.vick.mtaa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    Button btnsignnew;
    EditText etUsername, etid, etphone, etemail, etpassword, etconfirmpassword;
    String name, phone_number, email, password, confirm_password;
    String id_no;

    Database myHelper = new Database(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnsignnew = findViewById(R.id.signupbtn);
        etUsername = findViewById(R.id.etUsername);
        etid = findViewById(R.id.etid);
        etphone = findViewById(R.id.etphone);
        etemail = findViewById(R.id.etemail);
        etpassword = findViewById(R.id.etpassword);
        etconfirmpassword = findViewById(R.id.etconfirmpass);




    }

    public void addUser(View view) {
        name = etUsername.getText().toString();
        phone_number = etphone.getText().toString();
        email = etemail.getText().toString();
        id_no = etid.getText().toString();
        password = etpassword.getText().toString();
        confirm_password = etconfirmpassword.getText().toString();

        myHelper.addUser(new Users(id_no, name, email, phone_number));
        Toast.makeText(this, "Added " + name + " to users", Toast.LENGTH_LONG).show();

        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }
}
