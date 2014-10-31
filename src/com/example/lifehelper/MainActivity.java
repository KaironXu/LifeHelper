package com.example.lifehelper;

import com.example.layout.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
	protected Button btnAdd;
	RelativeLayout relatLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void onClick_View(View view) {
		switch (view.getId()) {
		case R.id.weather:
			Intent i = new Intent(MainActivity.this,WeatherActivity.class);
			startActivity(i);
			break;
		case R.id.note:
			startActivity(new Intent(MainActivity.this,NoteActivity.class));
			break;
		case R.id.contacts:
			startActivity(new Intent(MainActivity.this,ContactsActivity.class));
			break;
		case R.id.search:
			startActivity(new Intent(MainActivity.this,SearchActivty.class));
			break;
		default:
			break;
		}
	}
}
