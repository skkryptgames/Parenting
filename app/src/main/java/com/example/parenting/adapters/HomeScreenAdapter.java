package com.example.parenting.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parenting.R;
import com.example.parenting.activity.HomeScreenActivity;
import com.example.parenting.fragment.TasksFragment;
import com.example.parenting.models.HomeScreenModel;

import java.util.ArrayList;


public class HomeScreenAdapter extends RecyclerView.Adapter<HomeScreenAdapter.MyViewHolder> {

    private Context mContext;
    private ArrayList<HomeScreenModel> activities;

    public HomeScreenAdapter(Context mContext, ArrayList<HomeScreenModel> activities) {
        this.mContext = mContext;
        this.activities = activities;
    }


    @NonNull
    @Override
    public HomeScreenAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item,
                parent, false);
        return new HomeScreenAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HomeScreenAdapter.MyViewHolder holder, int position) {

        holder.typeActivity.setText(activities.get(position).getActivityNames());
        holder.ActivityImage.setImageDrawable(mContext.getResources().getDrawable(activities.
                get(position).getActivityImages()));

        //holder.cardActivity.setBackgroundResource(R.drawable.card_background);

        holder.ActivityImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new TasksFragment();
                FragmentTransaction fragmentTransaction = ((HomeScreenActivity)mContext).getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

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
