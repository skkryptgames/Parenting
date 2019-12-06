package com.example.parenting.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.parenting.fragment.AddChildFragment;
import com.example.parenting.R;

public class CreateAccountActivity extends AppCompatActivity {
    Button button;
    EditText firstName,lastName,email;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createaccount);

        firstName=findViewById(R.id.par_edittext_firstname);
        lastName=findViewById(R.id.par_edittext_lastname);
        email=findViewById(R.id.par_edittext_email);

        button=findViewById(R.id.par_button_next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(firstName.getText().toString()) && !TextUtils.isEmpty(lastName.getText().toString()) && !TextUtils.isEmpty(email.getText().toString()))
                {

                    Fragment fragment = new AddChildFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else{
                    Toast.makeText(getApplicationContext(),"Enter valid data",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
