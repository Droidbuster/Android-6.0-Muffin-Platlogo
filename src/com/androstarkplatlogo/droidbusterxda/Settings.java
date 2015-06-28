package com.androstarkplatlogo.droidbusterxda;

import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.app.Activity;
import android.app.Notification.Action;
import android.content.Intent;
import android.view.Menu;

public class Settings extends PreferenceActivity{

@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	

	super.onCreate(savedInstanceState);
	
	
	
	addPreferencesFromResource(R.xml.settings);
	Preference androidstark =findPreference("androstark_key_web");
	Preference github =findPreference("github_key");
	Preference droidbuster =findPreference("droidbuster_key");
	Preference Prtish =findPreference("prtish_key");
	Preference Som =findPreference("Somnathkey");
	Preference bigboxx =findPreference("bigBoox_key");
	Preference endless =findPreference("endlesskey");
	Preference blackfrog =findPreference("blackfrog");
	Preference droidfantasy =findPreference("");
	
	blackfrog.setOnPreferenceClickListener(new OnPreferenceClickListener() {
		
		@Override
		public boolean onPreferenceClick(Preference arg0) {
			// TODO Auto-generated method stub
			 Uri uri = Uri.parse("https://www.facebook.com/BlackFrogDroid");
			 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
			 startActivity(intent);
			return false;
		}
	});
	endless.setOnPreferenceClickListener(new OnPreferenceClickListener() {
		
		@Override
		public boolean onPreferenceClick(Preference arg0) {
			// TODO Auto-generated method stub
			
			 Uri uri = Uri.parse("http://forum.xda-developers.com/member.php?u=5083624");
			 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
			 startActivity(intent);
			return true;
		}
	});
	bigboxx.setOnPreferenceClickListener(new OnPreferenceClickListener() {
		
		@Override
		public boolean onPreferenceClick(Preference arg0) {
			// TODO Auto-generated method stub
			 Uri uri = Uri.parse("http://www.bigboxx.in");
			 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
			 startActivity(intent);
			
			
			return true;
		}
	});
	Som.setOnPreferenceClickListener(new OnPreferenceClickListener() {
		
		@Override
		public boolean onPreferenceClick(Preference arg0) {
			// TODO Auto-generated method stub
			 Uri uri = Uri.parse("http://forum.xda-developers.com/member.php?u=4535816");
			 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
			 startActivity(intent);
			
			return true;
		}
	});
	Prtish.setOnPreferenceClickListener(new OnPreferenceClickListener() {
		
		@Override
		public boolean onPreferenceClick(Preference arg0) {
			// TODO Auto-generated method stub
			
			 Uri uri = Uri.parse("http://forum.xda-developers.com/member.php?u=5730719");
			 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
			 startActivity(intent);
			return true;
		}
	});
	droidbuster.setOnPreferenceClickListener(new OnPreferenceClickListener() {
		
		@Override
		public boolean onPreferenceClick(Preference arg0) {
			// TODO Auto-generated method stub
			
			Uri uri = Uri.parse("https://github.com/Droidbuster");
			Intent i = new Intent(Intent.ACTION_VIEW,uri);
		startActivity(i);
			return true;
		}
	});
	github.setOnPreferenceClickListener(new OnPreferenceClickListener() {
		
		@Override
		public boolean onPreferenceClick(Preference arg0) {
			// TODO Auto-generated method stub
			
			Uri uri = Uri.parse("https://github.com/Droidbuster");
			Intent i = new Intent(Intent.ACTION_VIEW,uri);
		startActivity(i);
			return true;
		}
	});

	androidstark.setOnPreferenceClickListener(new OnPreferenceClickListener() {
		
		@Override
		public boolean onPreferenceClick(Preference v) {
			// TODO Auto-generated method stub
			Uri uri = Uri.parse("http://www.androstarkdevelopers.com");
			Intent i = new Intent(Intent.ACTION_VIEW,uri);
		startActivity(i);
			return true;
		}
	});
}



}
