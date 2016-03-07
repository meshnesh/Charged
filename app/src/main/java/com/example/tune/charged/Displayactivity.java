package com.example.tune.charged;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.widget.Button;

import com.example.tune.charged.R.layout.*;

import static com.example.tune.charged.R.layout.display;


/**
 * Created by tune on 07/03/16.
 */
public class Displayactivity extends AppCompatActivity {
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
    }

}


