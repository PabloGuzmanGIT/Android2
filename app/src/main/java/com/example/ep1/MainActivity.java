package com.example.ep1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView register = findViewById(R.id.txtRegister);
        Button login = findViewById( R.id.button );


        register.setOnClickListener(this);
        login.setOnClickListener( this );
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                startActivity(new Intent(this, PrincipalActivity.class));
                break;
            case R.id.txtRegister:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
        }
    }


}

