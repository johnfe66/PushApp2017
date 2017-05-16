package com.johnfe.pushapp;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

/**
 * Created by root on 16/05/17.
 */

public class MyFcmListenerService extends FirebaseMessagingService {


    @Override
    public void onMessageReceived(RemoteMessage message){
        String from = message.getFrom();
        Map data = message.getData();

        System.out.println("from : "+from );
        System.out.println("Data: "+ message.getTtl());
        System.out.println("Data1: "+ message.getNotification().getBody());
        System.out.println("Data: "+ data.keySet().size());
        System.out.println("Data: "+ data.get("key1"));
        System.out.println("Data: "+ data.get("key2"));

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("mensajes");

        myRef.child("usuario").push().child("recibido").setValue(message.getNotification().getBody());









    }
}
