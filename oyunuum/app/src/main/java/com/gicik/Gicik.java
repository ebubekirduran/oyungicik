package com.gicik;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

public class Gicik extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gicik);
	 	
	     menuEkraninaGec();
	    }

	    private void menuEkraninaGec() {

	        Animation anim = AnimationUtils.loadAnimation(this, R.anim.gec_gelme);
	        ImageView girisLogo = (ImageView) findViewById(R.id.imageView1);	        
	        anim.reset();
	        girisLogo.clearAnimation();
	        girisLogo.startAnimation(anim);
	        
	        anim.setAnimationListener(new AnimationListener(){
	        
	        public void onAnimationEnd(Animation animation){
	        Intent intent =new Intent(Gicik.this,Ana.class);
	        	startActivity(intent);
	        	Gicik.this.finish();
	        }
	        public void onAnimationStart(Animation animation){}
	        public void onAnimationRepeat(Animation animation){}
	    });
	}
		
}
