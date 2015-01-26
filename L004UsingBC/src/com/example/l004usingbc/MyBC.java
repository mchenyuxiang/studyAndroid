package com.example.l004usingbc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyBC extends BroadcastReceiver {

	/**
	 * action要求：包命.intent.action.名称
	 */
	public static final String ACTION = "com.example.l004usingbc.intent.action.MYBC";
	
	/**
	 * 得到广播消息时会首先执行onReceive方法
	 */
	@Override
	public void onReceive(Context context, Intent intent) {
		System.out.println("onReceive,data="+intent.getStringExtra("txt"));
	}

}
