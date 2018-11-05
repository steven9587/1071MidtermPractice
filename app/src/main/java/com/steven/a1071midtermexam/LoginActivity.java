package com.steven.a1071midtermexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText edID;
    private EditText edPassword;
    private String id;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findviews();
    }

    private void findviews() {
        edID = findViewById(R.id.ed_ID);
        edPassword = findViewById(R.id.ed_password);
    }

    public void login(View view){
        id = edID.getText().toString();
        password = edPassword.getText().toString();
        if ("steven".equals(id) && "123456789".equals(password)) {
            setResult(RESULT_OK);
            finish();
        } else {
            setResult(RESULT_CANCELED);
            finish();
        }
    }
}
