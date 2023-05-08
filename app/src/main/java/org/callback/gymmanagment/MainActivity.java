package org.callback.gymmanagment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnSeePlan,btnSeeAllActivity,btnAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Utils.getInstance();
        btnAbout=findViewById(R.id.btnAbout);
        btnSeeAllActivity=findViewById(R.id.btnSeeAllActivity);
        btnSeePlan=findViewById(R.id.btnSeePlan);
        btnSeeAllActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AllActiviteis.class);
                startActivity(intent);
            }
        });
        btnSeePlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,WeeklyActivity.class);
                startActivity(intent);
            }
        });
    }
}