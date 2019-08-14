package com.example.intentpassingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivityDataObject extends AppCompatActivity {
    public static String EXTRA_PERSON = "extra person";
    public TextView tvObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_data_object);
        tvObject = (TextView) findViewById(R.id.tv_object_received);
        Person mPerson = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = "Name : " + mPerson.getName() + ", Emai : "
        + mPerson.getEmail() + ", Age :" + mPerson.getAge() + ", Location : "
                + mPerson.getCity();
        tvObject.setText(text);
    }
}
