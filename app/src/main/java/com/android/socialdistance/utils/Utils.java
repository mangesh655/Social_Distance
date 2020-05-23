package com.android.socialdistance.utils;

import android.app.Activity;
import android.app.UiAutomation;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;

import com.android.socialdistance.MainActivity;

public class Utils {

    Context mContext;
    public Utils(Context mContext) {
        this.mContext = mContext;
    }
    public static boolean checkBluetooth(BluetoothAdapter bluetoothAdapter) {

        // Ensures Bluetooth is available on the device and it is enabled. If not,
        // displays a dialog requesting user permission to enable Bluetooth.
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void requestUserBluetooth(Activity activity) {
        Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        activity.startActivityForResult(enableBtIntent, MainActivity.REQUEST_ENABLE_BT);
    }




}
