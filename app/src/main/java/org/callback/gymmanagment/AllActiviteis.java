package org.callback.gymmanagment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllActiviteis extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<SingleSport>singleSports=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_activiteis);
        recyclerView=findViewById(R.id.recycler);
        Utils.getInstance();
        Adapter adapter=new Adapter(this);
        adapter.setSport(Utils.getAllSports() );
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
    }
}