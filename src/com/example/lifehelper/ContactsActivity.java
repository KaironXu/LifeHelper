package com.example.lifehelper;

import com.example.layout.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ContactsActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contacts);
	}
	
	//add a new contacts
	public void onClick_addContacts(View view) {
		startActivity(new Intent(this,AddContactsActivity.class));
	}
	
	//back to the last homepage
	public void onClick_back(View view) {
		
	}
}
