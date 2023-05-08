package org.callback.gymmanagment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class AddFormActivity extends AppCompatActivity {
    private Spinner dateSpinner;
    private TextView txtEcerTitle;
    private EditText editTime;
    private Button addToMyPlan;
    private int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_form);
        dateSpinner=findViewById(R.id.spinner);
        txtEcerTitle=findViewById(R.id.txtEcerTitle);
        editTime=findViewById(R.id.edtTime);
        addToMyPlan=findViewById(R.id.addToMyPlan);
        String[] dates={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        ArrayAdapter<String>dateAdapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,dates);
        dateSpinner.setAdapter(dateAdapter);
        Intent intent=getIntent();
        //a=0;
        if(intent!=null){
             a=intent.getIntExtra("index",-1);
            txtEcerTitle.setText(Utils.getAllSports().get(a).getName());
        }

        addToMyPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             int b=   dateSpinner.getSelectedItemPosition();
               // Toast.makeText(AddFormActivity.this, "added "+b, Toast.LENGTH_SHORT).show();
               switch (b){
                   case 0:
                       Utils.addToMonday(Utils.getAllSports().get(a));
                       break;
                   case 1:
                     Utils.addToTuesday(Utils.getAllSports().get(a));

                       break;
                   case 2:
                       Utils.addToWednsday(Utils.getAllSports().get(a));
                       break;
                   case 3:
                       Utils.addToThursday(Utils.getAllSports().get(a));
                       break;
                   case 4:
                       Utils.addToFriday(Utils.getAllSports().get(a));
                       break;
                   case 5:
                       Utils.addToSaturday(Utils.getAllSports().get(a));
                       break;
                   case 6:
                       Utils.addToSunday(Utils.getAllSports().get(a));
                       break;
                   default:
                       break;
               }

                //Toast.makeText(AddFormActivity.this, "Adding index "+dates[a], Toast.LENGTH_SHORT).show();
            }
        });

    }
}