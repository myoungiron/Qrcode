package com.example.qrcode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {
	private final int DISPLAY_TIME=5000;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
        new Handler().postDelayed(new Runnable(){ 
 
        @Override
         public void run() { 
             Intent mainIntent = new Intent(SplashActivity.this,MainActivity.class); 
             SplashActivity.this.startActivity(mainIntent); 
             SplashActivity.this.finish(); 
         } 
             
        },DISPLAY_TIME);
		
	}

}
