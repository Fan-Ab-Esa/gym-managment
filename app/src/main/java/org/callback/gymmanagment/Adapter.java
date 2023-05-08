package org.callback.gymmanagment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private Context context;

    private ArrayList<SingleSport> sportArrayList=new ArrayList<>();
    public void setSport(ArrayList<SingleSport> sportArrayList){
        this.sportArrayList=sportArrayList;
        notifyDataSetChanged();
    }

    public Adapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.box,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.sportTitle.setText(sportArrayList.get(position).getName());
        holder.shortDesc.setText(sportArrayList.get(position).getShortDescription());
        Glide.with(context).asBitmap().load(sportArrayList.get(position).getImgUrl()).into(holder.imageView);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               
                Intent intent=new Intent(context,InfoActivity.class);
                intent.putExtra("index",sportArrayList.indexOf(sportArrayList.get(position)));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return sportArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView sportTitle,shortDesc;
        private ImageView imageView;

        private CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            sportTitle=itemView.findViewById(R.id.sportTitle);
            shortDesc=itemView.findViewById(R.id.shortDesc);
            imageView=itemView.findViewById(R.id.imageView);
            cardView=itemView.findViewById(R.id.cardV);

        }
    }
}
