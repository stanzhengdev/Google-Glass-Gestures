package com.example.glasswareXE12.main;

import com.google.android.glass.app.Card;
import com.google.android.glass.touchpad.GestureDetector;

import android.app.Activity;
import android.gesture.Gesture;
import android.view.View;
import android.view.Menu;
import android.os.Bundle;

public class MainActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState){	
		super.onCreate(savedInstanceState);
		
		Card card1 = new Card(this);
		card1.setText("Testing Card Main Section");
		card1.setFootnote("Footer Note ...");
		View card1View = card1.toView();
		
		setContentView(card1View);
	}
}