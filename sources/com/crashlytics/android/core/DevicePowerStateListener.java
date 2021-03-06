package com.crashlytics.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.p034v4.app.NotificationCompat;
import java.util.concurrent.atomic.AtomicBoolean;

class DevicePowerStateListener {
    private static final IntentFilter FILTER_BATTERY_CHANGED = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static final IntentFilter FILTER_POWER_CONNECTED = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
    private static final IntentFilter FILTER_POWER_DISCONNECTED = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
    private final Context context;
    /* access modifiers changed from: private */
    public boolean isPowerConnected;
    private final BroadcastReceiver powerConnectedReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            boolean unused = DevicePowerStateListener.this.isPowerConnected = true;
        }
    };
    private final BroadcastReceiver powerDisconnectedReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            boolean unused = DevicePowerStateListener.this.isPowerConnected = false;
        }
    };
    private final AtomicBoolean receiversRegistered = new AtomicBoolean(false);

    public DevicePowerStateListener(Context context2) {
        this.context = context2;
    }

    public void initialize() {
        boolean z = true;
        if (!this.receiversRegistered.getAndSet(true)) {
            Intent registerReceiver = this.context.registerReceiver((BroadcastReceiver) null, FILTER_BATTERY_CHANGED);
            int i = -1;
            if (registerReceiver != null) {
                i = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            }
            if (!(i == 2 || i == 5)) {
                z = false;
            }
            this.isPowerConnected = z;
            this.context.registerReceiver(this.powerConnectedReceiver, FILTER_POWER_CONNECTED);
            this.context.registerReceiver(this.powerDisconnectedReceiver, FILTER_POWER_DISCONNECTED);
        }
    }

    public boolean isPowerConnected() {
        return this.isPowerConnected;
    }

    public void dispose() {
        if (this.receiversRegistered.getAndSet(false)) {
            this.context.unregisterReceiver(this.powerConnectedReceiver);
            this.context.unregisterReceiver(this.powerDisconnectedReceiver);
        }
    }
}
