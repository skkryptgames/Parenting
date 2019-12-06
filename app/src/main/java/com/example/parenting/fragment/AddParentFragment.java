package com.example.parenting.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.example.parenting.R;
import com.example.parenting.activity.CreateAccountActivity;
import com.example.parenting.activity.HomeScreenActivity;

public class AddParentFragment extends Fragment {
    EditText firstName,lastName,email,phoneNumber;
    Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.addparent,container,false);

        firstName=view.findViewById(R.id.par_edittext_firstname);
        lastName=view.findViewById(R.id.par_edittext_lastname);
        email=view.findViewById(R.id.par_edittext_email);
        phoneNumber=view.findViewById(R.id.par_edittext_phonenumber);

        button=view.findViewById(R.id.par_button_done);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(firstName.getText().toString()) && !TextUtils.isEmpty(lastName.getText().toString()) && !TextUtils.isEmpty(email.getText().toString()) && !TextUtils.isEmpty(phoneNumber.getText().toString())) {
                    Intent intent=new Intent(getContext(),HomeScreenActivity.class);
                    startActivity(intent);
                    ((CreateAccountActivity)getContext()).finish();
                }else {
                    Toast.makeText(getContext(),"Enter valid data",Toast.LENGTH_SHORT).show();
                }

            }
        });
        return view;
    }
}
