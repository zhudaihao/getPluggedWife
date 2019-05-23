package com.example.administrator.lsn_9_demo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/**
 * 被动获取充电状态
 */

public class PowerConnectionReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action=intent.getAction();
        if(TextUtils.equals(action,Intent.ACTION_POWER_CONNECTED)){
            //充电
        }else{
            //没充电
        }
    }
}
