package com.alex.beerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.alex.beerapp.controller.OnChangeTextListener;

public class SigInActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText emailEditTextView;
    private String email;
    private EditText passwordEdiTextView;
    private String password;
    private Button registerButtonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sig_in);

        emailEditTextView = (EditText) findViewById(R.id.editTextEmail);

        //Validate email with android email pattern
        emailEditTextView.addTextChangedListener(new OnChangeTextListener(this, emailEditTextView));
    }

    @Override
    public void onClick(View v) {
        email = emailEditTextView.getText().toString();
        if (checkEmail()) {
            password = passwordEdiTextView.getText().toString();
        }
    }

    private boolean checkEmail(){
        //query de email
        return true;
    }
}
