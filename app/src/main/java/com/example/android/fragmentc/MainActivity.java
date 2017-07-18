package com.example.android.fragmentc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import layout.Fragment1;
import layout.FragmentB;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChangeFragment(View view) {
        Fragment fragment;

        if (view == findViewById(R.id.button4)) {
            fragment = new Fragment1();

            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
            android.support.v4.app.FragmentTransaction replace = ft.replace(R.id.fragment_place, fragment);
            ft.commit();

        }

        if (view == findViewById(R.id.button3)) {
            fragment = new FragmentB();

            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
            android.support.v4.app.FragmentTransaction replace = ft.replace(R.id.fragment_place, fragment);
            ft.commit();

        }


    }
}

