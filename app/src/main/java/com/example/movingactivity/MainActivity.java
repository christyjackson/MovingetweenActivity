package com.example.movingactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button changeacctivitybtn = findViewById(R.id.bt_activity1); // Button object referenced
        changeacctivitybtn.setOnClickListener(new View.OnClickListener() { //Onclick listener
            @Override
            public void onClick(View view) { //Event
                changeActivity(); // Method to be called
            }
        });
    }
    private void changeActivity(){
        Intent intent = new Intent(this,Activity2.class); //Announcement or moving from on activity to the other activity
        startActivity(intent);
    }
}