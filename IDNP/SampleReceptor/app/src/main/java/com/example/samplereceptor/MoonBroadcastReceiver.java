package com.example.samplereceptor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MoonBroadcastReceiver extends BroadcastReceiver {

    private static final String TAG = "Receiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getAction() != null) {
            String message = intent.getStringExtra("com.example.samplebroadcastreceiver.MoonBroadcastReceiver.EXTRA_MESSAGE");
            Log.d(TAG, "Mensaje recibido: " + message);

            // Mostrar un Toast para verificar que se recibió
            Toast.makeText(context, "Mensaje recibido: " + message, Toast.LENGTH_SHORT).show();

            // Actualizar el TextView en la actividad
            ((MainActivity) context).updateReceivedMessage(message);
        }
    }
}
