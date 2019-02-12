package com.rikkei.appa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class OpenAppReceiver extends BroadcastReceiver {

    public static final String EXTRA_MESSAGE = "msg";

    @Override
    public void onReceive(Context context, Intent intent) {
        String msg = intent.getStringExtra(EXTRA_MESSAGE);
        Intent intentA = new Intent(context, MainActivity.class);
        intentA.putExtra(EXTRA_MESSAGE, msg);
        context.startActivity(intentA);
    }
}
