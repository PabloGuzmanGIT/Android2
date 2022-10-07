package com.example.ep1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import java.util.zip.Inflater;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_principal );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       MenuInflater inflater= getMenuInflater();
       inflater.inflate( R.menu.menu_inicio,menu );
       return true;
    }
}