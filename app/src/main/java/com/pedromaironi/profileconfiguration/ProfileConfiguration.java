package com.pedromaironi.profileconfiguration;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.List;

public class ProfileConfiguration extends AppCompatActivity {

    //    TextView editProfilebtn;
    Button editProfilebtn;
    List<String> items;
    Adapter dropdown;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editProfilebtn = (Button) findViewById(R.id.EditProfileButton1);

        editProfilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileConfiguration.this, EditProfileActivity.class);
                startActivity(intent);
            }
        });
    }


}