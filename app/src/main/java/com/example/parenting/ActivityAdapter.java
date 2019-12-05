package com.example.parenting;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ActivityAdapter extends RecyclerView.Adapter<ActivityAdapter.MyViewHolder> {

    private Context mContext;
    private ArrayList<Activity> activities;

    public ActivityAdapter(Context mContext, ArrayList<Activity> activities) {
        this.mContext = mContext;
        this.activities = activities;
    }


    @NonNull
    @Override
    public ActivityAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item,
                parent, false);
        return new ActivityAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ActivityAdapter.MyViewHolder holder, int position) {

        holder.typeActivity.setText(activities.get(position).getActivityNames());
        holder.ActivityImage.setImageDrawable(mContext.getResources().getDrawable(activities.
                get(position).getActivityImages()));

        //holder.cardActivity.setBackgroundResource(R.drawable.card_background);

        if(position == 0){
            holder.cardActivity.setCardBackgroundColor(mContext.getResources().getColor(R.color.silentBlue));
        }else if(position  == 1){
            holder.cardActivity.setCardBackgroundColor(mContext.getResources().getColor(R.color.Brick));
        }else if(position == 2){
            holder.cardActivity.setCardBackgroundColor(mContext.getResources().getColor(R.color.corn));
        }else if(position == 3) {
            holder.cardActivity.setCardBackgroundColor(mContext.getResources().getColor(R.color.fandango));
        }

    }

    @Override
    public int getItemCount() {
        return activities.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        CardView cardActivity;
        ImageView ActivityImage;
        TextView typeActivity;

        public MyViewHolder(View itemView) {
            super(itemView);

            cardActivity = itemView.findViewById(R.id.cardActivity);
            ActivityImage = itemView.findViewById(R.id.ActivityImage);
            typeActivity = itemView.findViewById(R.id.typeActivity);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });




        }
    }
}
