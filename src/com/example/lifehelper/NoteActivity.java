package com.example.lifehelper;

import com.example.layout.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NoteActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_note);
	}
	
	public void onClick_addNote(View view) {
		startActivity(new Intent(NoteActivity.this,AddNoteActivity.class));
	}
}
