package com.androstarkplatlogo.droidbusterxda;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Fullplatemuffin extends Activity {
	private TextView  andoridversion,androidversioncode,coneceptext,by,androstarktitle,droidbusterxda;
	private Typeface light,normal ;
	private ImageView muu;
	private Animation inte;
	private Animation close;
	private String [] spam = {"","","","","android :"};
	public static int ACTIVITY_CLOSE=7000;
	
	int muint =0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fullplatemuffin);
		close =AnimationUtils.loadAnimation(getApplicationContext(), R.anim.lastanim);
		 andoridversion =(TextView) findViewById(R.id.verionname);
			coneceptext =(TextView) findViewById(R.id.conceptid);
			by=(TextView) findViewById(R.id.byid);
			androstarktitle=(TextView) findViewById(R.id.androstarkdevelopersid);
			droidbusterxda =(TextView) findViewById(R.id.droidbusterxda);
			by.setVisibility(View.INVISIBLE);
		
			androstarktitle.setVisibility(View.INVISIBLE);
			droidbusterxda.setVisibility(View.INVISIBLE);
			
			coneceptext.setVisibility(View.INVISIBLE);
	inte= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.credits);
		 muu =(ImageView) findViewById(R.id.mm);
			muu.setImageResource(R.drawable.muffinlogo);
			muu.setAnimation(close);
			new Handler().postDelayed(new  Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					by.setVisibility(View.VISIBLE);
					
					androstarktitle.setVisibility(View.VISIBLE);
					droidbusterxda.setVisibility(View.VISIBLE);
					
					coneceptext.setVisibility(View.VISIBLE);
				
					 coneceptext.setAnimation(inte);
					by.setAnimation(inte);
					androstarktitle.setAnimation(inte);
				droidbusterxda.setAnimation(inte);
				
				
					
				}
			}, 3000);
			
			new Handler().postDelayed(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
						Intent b = new Intent(getApplicationContext(), Settings.class);
						startActivity(b);
				}
			}, ACTIVITY_CLOSE);
		 
		
		
		 androidversioncode = (TextView) findViewById(R.id.verioncode);
		 by.setTypeface(normal);
		 androstarktitle.setTypeface(light);
		 droidbusterxda.setTypeface(light);
		 coneceptext.setTypeface(normal);
		 androidversioncode.setTypeface(light);
		 by.setTextColor(0xFFFFFFFF);
		 androstarktitle.setTextColor(0xFFFFFFFF);
		 coneceptext.setTextColor(0xFFFFFFFF);
		 droidbusterxda.setTextColor(0xFFFFFFFF);
			final DisplayMetrics metrics = new DisplayMetrics();

		 normal = Typeface.createFromAsset(getAssets(), "Roboto-Bold.ttf");
		       light = Typeface.createFromAsset(getAssets(), "Roboto-Light.ttf");
			
		 androidversioncode.setTypeface(light);
		 androidversioncode.setTextColor(0xFFFFFFFF);
		 andoridversion.setTextColor(0xFFFFFFFF);
		 andoridversion.setShadowLayer(4*metrics.density, 0, 2*metrics.density, 0x66000000);
		 androidversioncode.setShadowLayer(4*metrics.density, 0, 2*metrics.density, 0x66000000);
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




}
