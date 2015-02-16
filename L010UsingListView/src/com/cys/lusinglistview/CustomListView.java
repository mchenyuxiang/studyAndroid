package com.cys.lusinglistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class CustomListView extends Activity {
	
	private ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.custom_listview);
		
		lv = (ListView) findViewById(R.id.lv);
		lv.setAdapter(adapter);
	}
	
	private BaseAdapter adapter = new BaseAdapter() {
		
		private CustomListCellData[] data = new CustomListCellData[]{
			new CustomListCellData("img1", "dec img1", R.drawable.ic_launcher),
			new CustomListCellData("img2", "dec img2", R.drawable.ic_launcher),
			new CustomListCellData("img3", "dec img3", R.drawable.ic_launcher),
		};
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			LinearLayout ll = null;
			if(convertView != null){
				ll = (LinearLayout) convertView;
			}else{
				ll = (LinearLayout) LayoutInflater.from(CustomListView.this)
						.inflate(R.layout.custom_listcell, null);
			}
			
			CustomListCellData data = (CustomListCellData) getItem(position);
			
			ImageView icon = (ImageView) ll.findViewById(R.id.icon);
			TextView name = (TextView) ll.findViewById(R.id.name);
			TextView dec = (TextView) ll.findViewById(R.id.dec);
			
			icon.setImageResource(data.iconId);
			name.setText(data.name);
			dec.setText(data.dec);
			
			return ll;
		}
		
		@Override
		public long getItemId(int position) {
			return 0;
		}
		
		@Override
		public Object getItem(int position) {
			return data[position];
		}
		
		@Override
		public int getCount() {
			return data.length;
		}
	};
}
