package com.johnfe.pushapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MyInstanceIDListenerService myInstanceIDListenerService = new MyInstanceIDListenerService();

        System.out.println("token fcm: "+FirebaseInstanceId.getInstance().getToken());
    }
}
