package com.example.advertiser;

import android.app.Activity;
import android.os.Bundle;

import com.ads.advertiser.example.R;
import com.appota.ads.advertiser.AppotaAdvertiserSDK;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		AppotaAdvertiserSDK.configure(this);
		
	}
	
	
}
