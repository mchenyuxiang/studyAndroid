package com.cyx.l008intents;

import java.io.File;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        findViewById(R.id.btnStartAty1).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
//				Intent i = new Intent();
//				//���������ͨ�����ַ�ʽ������һ��Intent,��������������Ҫ����·��
//				i.setComponent(new ComponentName("com.cyx.l008intents", "com.cyx.l008intents.Aty1"));
				Intent i = new Intent("com.cyx.l008intents.intent.action.Aty1");
				startActivity(i);

			}
		});
        
        findViewById(R.id.btnStartImage).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				File f = new File("/sdcard/Download/1.jpg");
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setDataAndType(Uri.fromFile(f), "image/*");
				startActivity(i);
				
			}
		});
        
        /**
         * ��ݴ�绰
         */
        findViewById(R.id.btnDel10086).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse("tel:10086"));
				startActivity(i);
			}
		});
        
        /**
         * ������������ҳ��
         */
        findViewById(R.id.btnNavToplaydba).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.playdba.com"));
				startActivity(i);
			}
		});
    }


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