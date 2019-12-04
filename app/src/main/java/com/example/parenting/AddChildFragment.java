package com.example.parenting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class AddChildFragment extends Fragment {
    Button nextButton,addChildButton;
    EditText firstName,lastName,age,gender;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.addchild,container,false);
        nextButton=view.findViewById(R.id.par_button_next);
        addChildButton=view.findViewById(R.id.par_button_addanotherchild);
        firstName=view.findViewById(R.id.par_edittext_firstname);
        lastName=view.findViewById(R.id.par_edittext_lastname);
        age=view.findViewById(R.id.par_edittext_age);
        gender=view.findViewById(R.id.par_edittext_gender);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new AddParentFragment();
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        addChildButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firstName.setText("");
                lastName.setText("");
                age.setText("");
                gender.setText("");

            }
        });
        return view;
    }
}
