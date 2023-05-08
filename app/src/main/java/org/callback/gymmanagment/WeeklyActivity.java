package org.callback.gymmanagment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class WeeklyActivity extends AppCompatActivity {
    private RecyclerView recyclerView,recyclerTues,recyclerWedns,recyclerThurs,recyclerFriday,recyclerSaturday,recyclerSunday;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly);
        recyclerView=findViewById(R.id.sideRecycler);

        recyclerTues=findViewById(R.id.recyclerTues);
        recyclerWedns=findViewById(R.id.recyclerWedns);
        recyclerThurs=findViewById(R.id.recyclerThurs);
        recyclerFriday=findViewById(R.id.recyclerFriday);
        recyclerSaturday=findViewById(R.id.recyclerSaturday);
        recyclerSunday=findViewById(R.id.recyclerSunday);

      /*  Adapter adapter=new Adapter(this);
        adapter.setSport(Utils.getAllSports() );
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
*/


        if(Utils.getMonday().size()>0){

            Adapter adapter=new Adapter(this);
            adapter.setSport(Utils.getMonday() );
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        }

        if(Utils.getTuesday().size()>0){

            Adapter Tuesadapter=new Adapter(this);
            Tuesadapter.setSport(Utils.getTuesday() );
            recyclerTues.setAdapter(Tuesadapter);
            recyclerTues.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        }

        if(Utils.getWednsday().size()>0){

            Adapter weadapter=new Adapter(this);
            weadapter.setSport(Utils.getWednsday() );
            recyclerWedns.setAdapter(weadapter);
            recyclerWedns.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        }

        if(Utils.getThursday().size()>0){

            Adapter Thuradapter=new Adapter(this);
            Thuradapter.setSport(Utils.getThursday() );
            recyclerThurs.setAdapter(Thuradapter);
            recyclerThurs.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        }


        if(Utils.getSaturday().size()>0){

            Adapter Satadapter=new Adapter(this);
            Satadapter.setSport(Utils.getSaturday() );
            recyclerSaturday.setAdapter(Satadapter);
            recyclerSaturday.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        }

        if(Utils.getSunday().size()>0){

            Adapter Sunadapter=new Adapter(this);
            Sunadapter.setSport(Utils.getSunday() );
            recyclerSunday.setAdapter(Sunadapter);
            recyclerSunday.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        }


    }
}