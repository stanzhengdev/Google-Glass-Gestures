package com.stanzheng.gestures;

import com.google.android.glass.app.Card;
import com.google.android.glass.touchpad.GestureDetector;
import com.google.android.glass.touchpad.Gesture;
import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends Activity {
    private GestureDetector mGestureDetector;
    public  Card card;
 
	protected void onCreate(Bundle savedInstanceState){	
		super.onCreate(savedInstanceState);
        mGestureDetector = createGestureDetector(this);		
        Card card1 = new Card(this);
		
		card1.setText("Visual Gestures!");
		card1.setImageLayout(Card.ImageLayout.FULL);
		card1.setFootnote("Gestures's in Glass");
		View card1View = card1.toView();
		setContentView(card1View);
		card = card1;
	}
	
	
    
    @Override
    public boolean onKeyDown(int keycode, KeyEvent event) {
        if (keycode == KeyEvent.KEYCODE_DPAD_CENTER) {
            // user tapped touchpad, do something
            return true;
        }
        return false;
    }
    /*
     * Boiler plate genture code 
     */
    private GestureDetector createGestureDetector(Context context) {
    GestureDetector gestureDetector = new GestureDetector(context);
        //Create a base listener for generic gestures
        gestureDetector.setBaseListener( new GestureDetector.BaseListener() {
            @Override
            public boolean onGesture(Gesture gesture) {
                if (gesture == Gesture.TAP) {
                	Log.d("@@@@", "TAP");
            		card.setText("TAP!");
            		card.setImageLayout(Card.ImageLayout.FULL);
            		View card1View = card.toView();
            		setContentView(card1View);
                    // do something on tap
                    return true;
                } else if (gesture == Gesture.TWO_TAP) {
                    // do something on two finger tap
            		card.setText("TWO_TAP!");
            		card.setImageLayout(Card.ImageLayout.FULL);
            		View card1View = card.toView();
            		setContentView(card1View);
                	Log.d("@@@@", "2-TAP");
                	return true;
                } else if (gesture == Gesture.SWIPE_RIGHT) {
                    // do something on right (forward) swipe
                	Log.d("@@@@", "SWIPE_RIGHT");
            		card.setText("SWIPE_RIGHT!");
            		card.setImageLayout(Card.ImageLayout.FULL);
            		View card1View = card.toView();
            		setContentView(card1View);
                	return true;
                } else if (gesture == Gesture.SWIPE_LEFT) {
            		card.setText("SWIPE_LEFT!");
            		card.setImageLayout(Card.ImageLayout.FULL);
            		View card1View = card.toView();
            		setContentView(card1View);
                    // do something on left (backwards) swipe
                	Log.d("@@@@", "SWIPE_LEFT");
                	return true;
                }
                else if (gesture == Gesture.LONG_PRESS) {
            		card.setText("LONG_PRESS!");
            		card.setImageLayout(Card.ImageLayout.FULL);
            		View card1View = card.toView();
            		setContentView(card1View);
                    // do something on left (backwards) swipe
                	Log.d("@@@@", "LONG_PRESS");
                	return true;
                }
                else if (gesture == Gesture.THREE_LONG_PRESS) {
            		card.setText("THREE_LONG_PRESS!");
            		card.setImageLayout(Card.ImageLayout.FULL);
            		View card1View = card.toView();
            		setContentView(card1View);
                    // do something on left (backwards) swipe
                	Log.d("@@@@", "THREE_LONG_PRESS");
                	return true;
                }
                else if (gesture == Gesture.THREE_TAP) {
            		card.setText("THREE_TAP!");
            		card.setImageLayout(Card.ImageLayout.FULL);
            		View card1View = card.toView();
            		setContentView(card1View);
                	Log.d("@@@@", "THREE_TAP");
                	return true;
                }
                else if (gesture == Gesture.TWO_LONG_PRESS) {
            		card.setText("TWO_LONG_PRESS!");
            		card.setImageLayout(Card.ImageLayout.FULL);
            		View card1View = card.toView();
            		setContentView(card1View);
                	Log.d("@@@@", "TWO_LONG_PRESS");
                	return true;
                }
                else if (gesture == Gesture.TWO_SWIPE_DOWN) {
            		card.setText("TWO_SWIPE_DOWN!");
            		card.setImageLayout(Card.ImageLayout.FULL);
            		View card1View = card.toView();
            		setContentView(card1View);
                	Log.d("@@@@", "TWO_SWIPE_DOWN");
                	return true;
                }
                else if (gesture == Gesture.TWO_SWIPE_LEFT) {
            		card.setText("TWO_SWIPE_LEFT!");
            		card.setImageLayout(Card.ImageLayout.FULL);
            		View card1View = card.toView();
            		setContentView(card1View);
                	Log.d("@@@@", "TWO_SWIPE_LEFT");
                	return true;
                }
                else if (gesture == Gesture. TWO_SWIPE_RIGHT) {
            		card.setText(" TWO_SWIPE_RIGHT!");
            		card.setImageLayout(Card.ImageLayout.FULL);
            		View card1View = card.toView();
            		setContentView(card1View);
                	Log.d("@@@@", " TWO_SWIPE_RIGHT");
                	return true;
                }
                else if (gesture == Gesture. TWO_SWIPE_UP) {
            		card.setText(" TWO_SWIPE_UP!");
            		card.setImageLayout(Card.ImageLayout.FULL);
            		View card1View = card.toView();
            		setContentView(card1View);
                	Log.d("@@@@", " TWO_SWIPE_UP");
                	return true;
                }
                return false;
            }
        });
        gestureDetector.setFingerListener(new GestureDetector.FingerListener() {
            @Override
            public void onFingerCountChanged(int previousCount, int currentCount) {
              // do something on finger count changes
            }
        });
        gestureDetector.setScrollListener(new GestureDetector.ScrollListener() {
            @Override
            public boolean onScroll(float displacement, float delta, float velocity) {
				
            	return true;
                // do something on scrolling
            }
        });
        return gestureDetector;
    }

    /*
     * Send generic motion events to the gesture detector
     */
    @Override
    public boolean onGenericMotionEvent(MotionEvent event) {
        if (mGestureDetector != null) {
            return mGestureDetector.onMotionEvent(event);
        }
        return false;
    }

}
