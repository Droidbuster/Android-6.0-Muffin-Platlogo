package com.androstarkplatlogo.droidbusterxda;

import java.util.ArrayList;

import com.androstarkplatlogo.droidbusterxda.R.anim;





import android.R.integer;
import android.media.MediaPlayer;
import android.os.BatteryManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.MediaStore.Audio.Media;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.WindowManager.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
int pos =0;
public  ImageView droidbusterplatlogoimg  ; //mascot image
Integer [] muupic ={R.drawable.muff1,R.drawable.muff2,R.drawable.muff3,R.drawable.muff4,R.drawable.muff5,R.drawable.muff6,R.drawable.muff7,}; //mascot2 images after click in array 
Integer [] busterpic ={R.drawable.logoorange,R.drawable.logoorange2,R.drawable.logoorange3,R.drawable.logoorange4,R.drawable.logoorange5};
private Animation animation1;
private Animation animatinmascot2,alpha;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.activity_main);
		
	
 droidbusterplatlogoimg =(ImageView) findViewById(R.id.imageView1);

 
	
		animation1 =AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation1);
	droidbusterplatlogoimg.setBackgroundResource(R.drawable.blankanim);
      droidbusterplatlogoimg.setImageResource(R.drawable.platlogo);
 	 droidbusterplatlogoimg.startAnimation(animation1);
		droidbusterplatlogoimg.setOnLongClickListener(new OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				// TODO Auto-generated method stub
Intent i = new Intent(getApplicationContext(), Fullplatemuffin.class);
startActivity(i);
				return true;
			}
		});
		droidbusterplatlogoimg.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.imageView1:
				pos++;
				
			if (pos > busterpic.length -1) {
				pos=0;
			}
			droidbusterplatlogoimg.setImageResource(busterpic[pos]);
				break;

			}}
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
		// TODO Auto-generated method stub
	switch (item.getItemId()) {
	case R.id.action_settings:
		Intent i = new Intent(getApplicationContext(), Settings.class);
		startActivity(i);
		break;

	}
		return super.onOptionsItemSelected(item);
	}	


@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		SharedPreferences pref =PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
		animatinmascot2 =AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation2);
		alpha =AnimationUtils.loadAnimation(getApplicationContext(), R.anim.aphha);
		String changetheme = pref.getString("theme_key", "Mascot1");
		if ("Mascot1".equals(changetheme)) {
			 droidbusterplatlogoimg.setBackgroundResource(R.drawable.blankanim);
			 
			droidbusterplatlogoimg.setImageResource(R.drawable.platlogo);
			 droidbusterplatlogoimg.startAnimation(animation1);
			 droidbusterplatlogoimg.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
					switch (v.getId()) {
					case R.id.imageView1:
						pos++;
						
					if (pos > busterpic.length -1) {
						pos=0;
					}
					droidbusterplatlogoimg.setImageResource(busterpic[pos]);
					 droidbusterplatlogoimg.startAnimation(alpha);
					 droidbusterplatlogoimg.setBackgroundResource(Color.TRANSPARENT);
						break;

					}}
				});
		}
		else if ( "Mascot2".equals(changetheme)) {
droidbusterplatlogoimg.setImageResource(Color.TRANSPARENT);
		
			 droidbusterplatlogoimg.startAnimation(animatinmascot2);
			 droidbusterplatlogoimg.setBackgroundResource(R.drawable.anim);
				droidbusterplatlogoimg.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
					switch (v.getId()) {
					case R.id.imageView1:
						pos++;
						
					if (pos > muupic.length -1) {
						pos=0;
					}
					 droidbusterplatlogoimg.startAnimation(alpha);
					droidbusterplatlogoimg.setImageResource(muupic[pos]);
					 droidbusterplatlogoimg.setBackgroundResource(Color.TRANSPARENT);
						break;

					}}
				});
				
				droidbusterplatlogoimg.setOnLongClickListener(new OnLongClickListener() {
					
					@Override
					public boolean onLongClick(View v) {
						// TODO Auto-generated method stub
			Intent i = new Intent(MainActivity.this, Fullplatemuffin.class);
			startActivity(i);
						return true;
					}
				});
		}
		
	



}
@Override
public void onWindowFocusChanged(boolean hasFocus) {
	// TODO Auto-generated method stub
	super.onWindowFocusChanged(hasFocus);
	 AnimationDrawable localAnimationDrawable = (AnimationDrawable)droidbusterplatlogoimg.getBackground();
if (hasFocus ==true) {
	localAnimationDrawable.start();
	return;
}
	  }


}
