package com.cyx.l008intents;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageViewer extends Activity {
	
	private ImageView iv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		iv = new ImageView(this);
		setContentView(iv);
		
		iv.setImageURI(getIntent().getData());
	}
}
