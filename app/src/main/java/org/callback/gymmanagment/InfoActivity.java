package org.callback.gymmanagment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class InfoActivity extends AppCompatActivity implements DialogInterface{
    private TextView txtTitleBox,infoDisc, txtViewDT;
    private Button btnAddToPlan ,addInADialog;
    private ImageView infoImgView;

    int  a;

    @Override
    public void sendDayTime(String day, String time) {
        txtViewDT.setText("Date: "+day+" Time: "+time);
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        txtTitleBox=findViewById(R.id.txtTitlebox);
        infoDisc=findViewById(R.id.infoDisc);
        btnAddToPlan=findViewById(R.id.btnAddToPlan);
        infoImgView=findViewById(R.id.infoImgView);
        addInADialog=findViewById(R.id.addInADialog);
        txtViewDT=findViewById(R.id. txtViewDT);
        Intent intent=getIntent();
        if(intent!=null){ a=  intent.getIntExtra("index",-1);}
        String title=Utils.getAllSports().get(a).getName();
        String shortDisc=Utils.getAllSports().get(a).getShortDescription();
        String imgLink =Utils.getAllSports().get(a).getImgUrl();
        txtTitleBox.setText(title);
        infoDisc.setText(shortDisc);
        Glide.with(InfoActivity.this).asBitmap().load(imgLink).into(infoImgView);
        btnAddToPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(InfoActivity.this,AddFormActivity.class);
                intent1.putExtra("index",a);
                startActivity(intent1);
            }
        });
        addInADialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogJava dialog= new DialogJava();
                Bundle bundle =new Bundle();
                bundle.putString("title",txtTitleBox.getText().toString());
                dialog.setArguments(bundle);
                dialog.show(getSupportFragmentManager(),"dialog box is on");
            }
        });

        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        MyFragment myFragment=new MyFragment();
        Bundle bundle=new Bundle();
        bundle.putString("title",title);
        myFragment.setArguments(bundle);
        transaction.replace(R.id.container,myFragment);
        transaction.commit();
    }
}