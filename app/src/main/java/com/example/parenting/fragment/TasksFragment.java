package com.example.parenting.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parenting.R;
import com.example.parenting.models.Tasks;

import java.util.ArrayList;
import java.util.List;

public class TasksFragment extends Fragment {
    ImageView leftButton,rightButton,mainImage;
    TextView taskName,type,amount;
    ArrayList<Tasks> mList=new ArrayList<>();
    int i=0;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tasks,container,false);

        populateList();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mainImage=view.findViewById(R.id.par_imageview_image);
        leftButton=view.findViewById(R.id.par_imageview_leftarrow);
        rightButton=view.findViewById(R.id.par_imageview_rightarrow);
        taskName=view.findViewById(R.id.par_textview_imagename);
        type=view.findViewById(R.id.par_textview_type);
        amount=view.findViewById(R.id.par_textview_amount);


        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i<mList.size()-1) {
                    i++;
                    mainImage.setImageResource(mList.get(i).getImage());
                    taskName.setText(mList.get(i).getName());
                    type.setText(mList.get(i).getType());
                    amount.setText(mList.get(i).getAmount());

                }
            }
        });
        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(i>0) {
                    i--;
                    mainImage.setImageResource(mList.get(i).getImage());
                    taskName.setText(mList.get(i).getName());
                    type.setText(mList.get(i).getType());
                    amount.setText(mList.get(i).getAmount());

                }

            }
        });


    }





    public void populateList(){
        Tasks one=new Tasks(R.drawable.ic_grape,"FRUIT","GET","100");
        Tasks two=new Tasks(R.drawable.ic_coins,"COINS","PAY","200");
        mList.add(one);
        mList.add(two);
        mList.add(one);
        mList.add(two);
        mList.add(one);
        mList.add(two);
    }
}
