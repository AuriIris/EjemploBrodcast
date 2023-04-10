package com.example.ejemplobrodcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class CambioAvion extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //Toast.makeText(context,"Usted ah activado el modo avion",Toast.LENGTH_LONG).show();
        if(intent.getBooleanExtra("State", true)){
        Log.d("Salida","Modo avion");}
        else  {
            Log.d("Salida", "Modo Avion Desactivado");
        }
    }
}
