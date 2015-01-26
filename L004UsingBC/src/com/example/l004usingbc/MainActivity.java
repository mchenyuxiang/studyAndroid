package com.example.l004usingbc;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
	
	private Button btnSendBroadcast,btnRegBCR,btnUnregBCR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnSendBroadcast = (Button) findViewById(R.id.btnSendBroadcast);
        btnSendBroadcast.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
//				Intent i = new Intent(MainActivity.this,MyBC.class);
				Intent i = new Intent(MyBC.ACTION);
				i.putExtra("txt", "hello eoe");
				
				sendBroadcast(i);
			}
		});
        
        btnRegBCR = (Button) findViewById(R.id.btnRegBCR);
        btnRegBCR.setOnClickListener(new View.OnClickListener() {
			
        	/**
        	 * 注册广播
        	 */
			@Override
			public void onClick(View v) {
				registerReceiver(mybc, new IntentFilter(MyBC.ACTION));
			}
		});
        
        btnUnregBCR = (Button) findViewById(R.id.btnUnregBCR);
        btnUnregBCR.setOnClickListener(new View.OnClickListener() {
			
        	/**
        	 * 取消注册广播
        	 */
			@Override
			public void onClick(View v) {
				unregisterReceiver(mybc);
			}
		});
        
    }

    private final MyBC mybc = new MyBC();

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
