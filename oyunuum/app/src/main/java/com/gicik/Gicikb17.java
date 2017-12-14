package com.gicik;

import java.util.Random;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Gicikb17 extends Activity implements FragmentManager.OnBackStackChangedListener {
	TextView l1,l2,l3,l4,l5,l6,l7,l8,l9,l0;
	  private Handler mHandler = new Handler();
	    private boolean mShowingBack = false;

	MediaPlayer yanlis;
	Button restart17,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16;
	TextView test17;
	String stopscore;
	//zaman deðiþkenleri
	private CountDownTimer zaman;
	 private final long baslangic = 20 * 1000;
	 private final long bitis = 1 * 1000;
	//
	//sharedpreference database
			private SharedPreference sharedPreference;
			Activity context = this;
		//sharedpreference database
//	ver
	TextView tscore17;
	 private int topscore = 0;	 
	//al
	  public static String TOPSCORE  = "topscore";	
	//
	  
	int a;
	 int b1topdegeri=1; int týk1=0;
	 int b2topdegeri=2;int týk2=0;
	 int b3topdegeri=3;int týk3=0;
	 int b4topdegeri=4;int týk4=0;
	 int b5topdegeri=5;int týk5=0;
	 int b6topdegeri=6;int týk6=0;
	 int b7topdegeri=7;int týk7=0;
	 int b8topdegeri=8;int týk8=0;
	 int b9topdegeri=9;int týk9=0;
	 int b10topdegeri=10;int týk10=0;
	 int b11topdegeri=11;int týk11=0;
	 int b12topdegeri=12;int týk12=0;
	 int b13topdegeri=13;int týk13=0;
	 int b14topdegeri=14;int týk14=0;
	 int b15topdegeri=15;int týk15=0;
	 int b16topdegeri=16;int týk16=0;
	 
	 int sayac=0;
	 int sayac17=0;
	 int score17=0;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gicikb17);
		l1=(TextView)findViewById(R.id.bir);
	   	 l2=(TextView)findViewById(R.id.iki);
	   	 l3=(TextView)findViewById(R.id.uc);
	   	 l4=(TextView)findViewById(R.id.dort);
	   	 l5=(TextView)findViewById(R.id.bes);
	   	 l6=(TextView)findViewById(R.id.alti);
	   	 l7=(TextView)findViewById(R.id.yedi);
	   	 l8=(TextView)findViewById(R.id.sekiz);
	   	 l9=(TextView)findViewById(R.id.dokuz);
	   	 l0=(TextView)findViewById(R.id.on);
		//animasyon		
    mShowingBack = (getFragmentManager().getBackStackEntryCount() > 0);        
getFragmentManager().addOnBackStackChangedListener(this);       
//
		
		test17=(TextView)findViewById(R.id.test17);
			
		yanlis=MediaPlayer.create(Gicikb17.this,R.raw.yanlis);
		
		button1=(Button)findViewById(R.id.R1);
		button2=(Button)findViewById(R.id.R2);
		button3=(Button)findViewById(R.id.R3);
		button4=(Button)findViewById(R.id.R4);
		button5=(Button)findViewById(R.id.R5);
		button6=(Button)findViewById(R.id.R6);
		button7=(Button)findViewById(R.id.R7);
		button8=(Button)findViewById(R.id.R8);
		button9=(Button)findViewById(R.id.R9);
		button10=(Button)findViewById(R.id.R10);
		button11=(Button)findViewById(R.id.R11);
		button12=(Button)findViewById(R.id.R12);
		button13=(Button)findViewById(R.id.R13);
		button14=(Button)findViewById(R.id.R14);
		button15=(Button)findViewById(R.id.R15);
		button16=(Button)findViewById(R.id.R16);
		
//		zaman geri sayým
		  	zaman = new Zamanim(baslangic, bitis);
		  			  
			//
		
		
		  Random r=new Random(); //random sýnýfý
	        a=r.nextInt(16)+1; // 1-9 arasý sayýlarýn getirimi için 	(4 dahil)	
	        String gelensayi = a + "";				        
	        test17.setText(gelensayi);	
	       	     
			
			tscore17=(TextView)findViewById(R.id.score17);			 
			sharedPreference = new SharedPreference();
			topscore = sharedPreference.getValue(context);	
		    tscore17.setText(String.valueOf(topscore));
		    
		    restart17=(Button)findViewById(R.id.restart17);
	        restart17.setOnClickListener(new View.OnClickListener() {			
	        	@Override
	        	public void onClick(View v) 
	        	{
	        		 // Restart
					 try {
					      Bundle extras = new Bundle();
					      extras.putInt(TOPSCORE, topscore);
					 
					      Intent intent = new Intent();
					 
					      intent.putExtras(extras);
					  
					      intent.setClass(getApplicationContext(), Gicikb17.class);
					      startActivity(intent);
					      Gicikb17.this.finish();
					  
					    } catch (Exception e) {
					      e.printStackTrace();
					    }
					 //	
	        	}
	        	})   ;	
	      //Ana menuye donus
		       Button back=(Button)findViewById(R.id.back17);
		        back.setOnClickListener(new View.OnClickListener() {			
		        	@Override
		        	public void onClick(View v) 
		        	{
		        		Intent intent = new Intent();	      	 
		      	      intent.setClass(getApplicationContext(), Ana.class);
		      	      startActivity(intent);
		      	      Gicikb17.this.finish();
		        	}});
button1.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) {	
	sayac17++;
	if(sayac17==1){
		 zaman.start();
	 }
	// Fýrsat Buttonu
		týk1++;
		if(týk1>=2){
				button1.setVisibility(View.INVISIBLE);
					score17=score17-100;// 5 puan fazladan ver 20+5
					stopscore=score17+topscore+"";
					tscore17.setText(stopscore);
					b1topdegeri=-1;
				}
		//
		else if(a == b1topdegeri)
	{
		týk1=1;
		sayac++;
		score17=score17+20;
		stopscore=score17+topscore+"";
		tscore17.setText(stopscore);
		
		button1.setVisibility(View.INVISIBLE);
		b2topdegeri--;
		b3topdegeri--;
		b4topdegeri--;	
		b5topdegeri--;
		b6topdegeri--;
		b7topdegeri--;
		b8topdegeri--;
		b9topdegeri--;
		b10topdegeri--;	
		b11topdegeri--;
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(16-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test17.setText(gelensayi);
		      
	        }
		 else{
			 ScoreAl15();
	      }
	}
	else 
	{
		týk1--;
		score17=score17-40;
		stopscore=score17+topscore+"";
		tscore17.setText(stopscore);
		Scoreeksi();
		yanlis.start();
		}				
}
})   ;
button2.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac17++;
	if(sayac17==1){
		 zaman.start();
	 }
	if(a == b2topdegeri)
	{
		sayac++;
		score17=score17+10;
		stopscore=score17+topscore+"";
		tscore17.setText(stopscore);
		
		button2.setVisibility(View.INVISIBLE);
		b3topdegeri--;
		b4topdegeri--;	
		b5topdegeri--;
		b6topdegeri--;
		b7topdegeri--;
		b8topdegeri--;
		b9topdegeri--;
		b10topdegeri--;	
		b11topdegeri--;
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;						
  if(sayac<16){
  	Random r=new Random(); //random sýnýfý
	        a=r.nextInt(16-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
	        String gelensayi = a + "";				        
	        test17.setText(gelensayi);
	      
  }else{
	  ScoreAl15();
  }
	}				
	else {
		score17=score17-20;
		stopscore=score17+topscore+"";
		tscore17.setText(stopscore);
		Scoreeksi();
		yanlis.start();
		}			
}
})   ;


button3.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) {
	sayac17++;
	if(sayac17==1){
		 zaman.start();
	 }
	if(a == b3topdegeri)
	{
		sayac++;
		score17=score17+10;
		stopscore=score17+topscore+"";
		tscore17.setText(stopscore);
		
		button3.setVisibility(View.INVISIBLE);		
		
		b4topdegeri--;	
		b5topdegeri--;
		b6topdegeri--;
		b7topdegeri--;
		b8topdegeri--;
		b9topdegeri--;
		b10topdegeri--;	
		b11topdegeri--;
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(16-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test17.setText(gelensayi);
		       
	        }
		 else{
			 ScoreAl15();
	      }
	}				
else   {
	score17=score17-20;
	stopscore=score17+topscore+"";
	tscore17.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;


button4.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac17++;
	if(sayac17==1){
		 zaman.start();
	 }
	// Fýrsat Buttonu
			týk4++;
			if(týk4>=2){
					button4.setVisibility(View.INVISIBLE);
						score17=score17-100;// 5 puan fazladan ver 20+5
						stopscore=score17+topscore+"";
						tscore17.setText(stopscore);
						b4topdegeri=-1;
					}
			//
			else if(a == b4topdegeri)
	{
		týk4=1;
		sayac++;
		score17=score17+20;
		stopscore=score17+topscore+"";
		tscore17.setText(stopscore);
		
		button4.setVisibility(View.INVISIBLE);			
			
		b5topdegeri--;
		b6topdegeri--;
		b7topdegeri--;
		b8topdegeri--;
		b9topdegeri--;
		b10topdegeri--;	
		b11topdegeri--;
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(16-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test17.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	týk4--;
	score17=score17-40;
	stopscore=score17+topscore+"";
	tscore17.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button5.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac17++;
	if(sayac17==1){
		 zaman.start();
	 }
	if(a == b5topdegeri)
	{
		sayac++;
		score17=score17+10;
		stopscore=score17+topscore+"";
		tscore17.setText(stopscore);
		
		button5.setVisibility(View.INVISIBLE);			
		
		b6topdegeri--;
		b7topdegeri--;
		b8topdegeri--;
		b9topdegeri--;
		b10topdegeri--;	
		b11topdegeri--;
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(16-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test17.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score17=score17-20;
	stopscore=score17+topscore+"";
	tscore17.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button6.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac17++;
	if(sayac17==1){
		 zaman.start();
	 }
	// Fýrsat Buttonu
			týk6++;
			if(týk6>=2){
					button6.setVisibility(View.INVISIBLE);
						score17=score17-100;// 5 puan fazladan ver 20+5
						stopscore=score17+topscore+"";
						tscore17.setText(stopscore);
						b6topdegeri=-1;
					}
			//
			else if(a == b6topdegeri)
	{
		týk6=1;
		sayac++;
		score17=score17+20;
		stopscore=score17+topscore+"";
		tscore17.setText(stopscore);
		
		button6.setVisibility(View.INVISIBLE);			
		
		b7topdegeri--;
		b8topdegeri--;
		b9topdegeri--;
		b10topdegeri--;	
		b11topdegeri--;
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(16-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test17.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	týk6--;
	score17=score17-40;
	stopscore=score17+topscore+"";
	tscore17.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button7.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac17++;
	if(sayac17==1){
		 zaman.start();
	 }
	// Fýrsat Buttonu
			týk7++;
			if(týk7>=2){
					button7.setVisibility(View.INVISIBLE);
						score17=score17-100;// 5 puan fazladan ver 20+5
						stopscore=score17+topscore+"";
						tscore17.setText(stopscore);
						b7topdegeri=-1;
					}
			//
			else if(a == b7topdegeri)
	{
		týk7=1;
		sayac++;	
		score17=score17+20;
		stopscore=score17+topscore+"";
		tscore17.setText(stopscore);
		
		button7.setVisibility(View.INVISIBLE);			
	
		b8topdegeri--;
		b9topdegeri--;
		b10topdegeri--;	
		b11topdegeri--;
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(16-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test17.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	týk7--;
	score17=score17-40;
	stopscore=score17+topscore+"";
	tscore17.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button8.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac17++;
	if(sayac17==1){
		 zaman.start();
	 }
	if(a == b8topdegeri)
	{
		sayac++;
		score17=score17+10;
		stopscore=score17+topscore+"";
		tscore17.setText(stopscore);
		
		button8.setVisibility(View.INVISIBLE);			

		b9topdegeri--;
		b10topdegeri--;	
		b11topdegeri--;
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(16-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test17.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score17=score17-20;
	stopscore=score17+topscore+"";
	tscore17.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button9.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac17++;
	if(sayac17==1){
		 zaman.start();
	 }
	if(a == b9topdegeri)
	{
		sayac++;
		score17=score17+10;
		stopscore=score17+topscore+"";
		tscore17.setText(stopscore);
		
		button9.setVisibility(View.INVISIBLE);			
		b10topdegeri--;	
		b11topdegeri--;
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(16-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test17.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score17=score17-20;
	stopscore=score17+topscore+"";
	tscore17.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button10.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac17++;
	if(sayac17==1){
		 zaman.start();
	 }
	// Fýrsat Buttonu
			týk10++;
			if(týk10>=2){
					button10.setVisibility(View.INVISIBLE);
						score17=score17-100;// 5 puan fazladan ver 20+5
						stopscore=score17+topscore+"";
						tscore17.setText(stopscore);
						b10topdegeri=-1;
					}
			//
			else if(a == b10topdegeri)
	{
		týk10=1;
		sayac++;
		score17=score17+20;
		stopscore=score17+topscore+"";
		tscore17.setText(stopscore);
		
		button10.setVisibility(View.INVISIBLE);			
		b11topdegeri--;
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(16-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test17.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	týk10--;
	score17=score17-40;
	stopscore=score17+topscore+"";
	tscore17.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button11.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac17++;
	if(sayac17==1){
		 zaman.start();
	 }
	// Fýrsat Buttonu
	týk11++;
	if(týk11>=2){
			button11.setVisibility(View.INVISIBLE);
				score17=score17-100;// 5 puan fazladan ver 20+5
				stopscore=score17+topscore+"";
				tscore17.setText(stopscore);
				b11topdegeri=-1;
			}
	//
	else if(a == b11topdegeri)
	{
		týk11=1;
		sayac++;
		score17=score17+20;
		stopscore=score17+topscore+"";
		tscore17.setText(stopscore);
		
		button11.setVisibility(View.INVISIBLE);							
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(16-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test17.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	týk11--;
	score17=score17-40;
	stopscore=score17+topscore+"";
	tscore17.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button12.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac17++;
	if(sayac17==1){
		 zaman.start();
	 }
	if(a == b12topdegeri)
	{
		sayac++;
		score17=score17+10;
		stopscore=score17+topscore+"";
		tscore17.setText(stopscore);
		
		button12.setVisibility(View.INVISIBLE);							
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(16-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test17.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score17=score17-20;
	stopscore=score17+topscore+"";
	tscore17.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button13.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac17++;
	if(sayac17==1){
		 zaman.start();
	 }
	// Fýrsat Buttonu
	týk13++;
	if(týk13>=2){
			button13.setVisibility(View.INVISIBLE);
				score17=score17-80;// 5 puan fazladan ver 20+5
				stopscore=score17+topscore+"";
				tscore17.setText(stopscore);
				b13topdegeri=-1;
			}
	//
	if(a == b13topdegeri)
	{
		týk13=1;
		sayac++;
		score17=score17+20;
		stopscore=score17+topscore+"";
		tscore17.setText(stopscore);
		
		button13.setVisibility(View.INVISIBLE);							
		
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(16-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test17.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	týk13--;
	score17=score17-40;
	stopscore=score17+topscore+"";
	tscore17.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button14.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac17++;
	if(sayac17==1){
		 zaman.start();
	 }
	if(a == b14topdegeri)
	{
		sayac++;
		score17=score17+10;
		stopscore=score17+topscore+"";
		tscore17.setText(stopscore);
		
		button14.setVisibility(View.INVISIBLE);							
	
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(16-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test17.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score17=score17-20;
	stopscore=score17+topscore+"";
	tscore17.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button15.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac17++;
	if(sayac17==1){
		 zaman.start();
	 }
	if(a == b15topdegeri)
	{
		sayac++;
		score17=score17+10;
		stopscore=score17+topscore+"";
		tscore17.setText(stopscore);
		
		button15.setVisibility(View.INVISIBLE);							
		
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(16-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test17.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score17=score17-20;
	stopscore=score17+topscore+"";
	tscore17.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button16.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac17++;
	if(sayac17==1){
		 zaman.start();
	 }
	// Fýrsat Buttonu
	týk16++;
	if(týk16>=2){
			button16.setVisibility(View.INVISIBLE);
				score17=score17-80;// 5 puan fazladan ver 20+5
				stopscore=score17+topscore+"";
				tscore17.setText(stopscore);
				b16topdegeri=-1;
			}
	//
	if(a == b16topdegeri)
	{
		týk16=1;
		sayac++;
		score17=score17+20;
		stopscore=score17+topscore+"";
		tscore17.setText(stopscore);
		
		button16.setVisibility(View.INVISIBLE);								
		 if(sayac<16){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(16-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test17.setText(gelensayi);
	        }
		 else {
			 ScoreAl15();
	      }
}
	
else  {
	týk16--;
	score17=score17-40;
	stopscore=score17+topscore+"";
	tscore17.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
	}
	private void Scoreeksi(){
		 // score - ye dusunce	
 if(score17+topscore<0)
 {
 	 // Restart
			 try {
			      Bundle extras = new Bundle();
			      extras.putInt(TOPSCORE, topscore);
			 
			      Intent intent = new Intent();
			 
			      intent.putExtras(extras);
			  
			      intent.setClass(getApplicationContext(), Gicikb17.class);
			      startActivity(intent);
			      Gicikb17.this.finish();
			  
			    } catch (Exception e) {
			      e.printStackTrace();
			    }
			 //	
 }
	}
	private void ScoreAl15() {
		topscore = Integer.parseInt(tscore17.getText().toString().trim());
		// Save the text in SharedPreference
	  	sharedPreference.save(context, topscore,17);
	  	// Save the text in SharedPreference
	    try {
	      Bundle extras = new Bundle();
	      extras.putInt(TOPSCORE, topscore);
	      Intent intent = new Intent();
	 
	      intent.putExtras(extras);
	 
	      intent.setClass(getApplicationContext(), Gicikb18.class);
	      startActivity(intent);
	      Gicikb17.this.finish();
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
		}
	//zaman
		 public class Zamanim extends CountDownTimer {
			 public Zamanim(long baslangic, long bitis) {
				 super(baslangic, bitis);
			 }
			 @Override
			 public void onFinish() {
				 l0.setVisibility(View.INVISIBLE);
				//süre bitince
				 FrameLayout container15=(FrameLayout)findViewById(R.id.container);
				 container15.setBackgroundResource(R.drawable.lose);	
				 button1.setVisibility(View.INVISIBLE);
				 button2.setVisibility(View.INVISIBLE);
				 button3.setVisibility(View.INVISIBLE);
				 button4.setVisibility(View.INVISIBLE);
				 button5.setVisibility(View.INVISIBLE);
				 button6.setVisibility(View.INVISIBLE);
				 button7.setVisibility(View.INVISIBLE);
				 button8.setVisibility(View.INVISIBLE);
				 button9.setVisibility(View.INVISIBLE);
				 button10.setVisibility(View.INVISIBLE);
				 button11.setVisibility(View.INVISIBLE);
				 button12.setVisibility(View.INVISIBLE);
				 button13.setVisibility(View.INVISIBLE);
				 button14.setVisibility(View.INVISIBLE);
				 button15.setVisibility(View.INVISIBLE);
				 button16.setVisibility(View.INVISIBLE);
				
				 //
			 }
			 @Override
			 public void onTick(long a) {
//				1 sanýyelýk 6. fýrsat butonu		  
			  	if(a / 1000==8) // 10. sanýyede olanlar
			  	{				  		
			  		if(týk6==1){			  		
			  		button6.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button6.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==6){ //9. sanýyede olanlar
			  		if(týk6>=1){
			  		button6.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanýyelýk 7. fýrsat butonu		  
			  	if(a / 1000==14) // 10. sanýyede olanlar
			  	{				  		
			  		if(týk7==1){			  		
			  		button7.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button7.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==12){ //9. sanýyede olanlar
			  		if(týk7>=1){
			  		button7.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanýyelýk 10. fýrsat butonu		  
			  	if(a / 1000==11) // 10. sanýyede olanlar
			  	{				  		
			  		if(týk10==1){			  		
			  		button10.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button10.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==9){ //9. sanýyede olanlar
			  		if(týk10>=1){
			  		button10.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanýyelýk 11. fýrsat butonu		  
			  	if(a / 1000==5) // 10. sanýyede olanlar
			  	{				  		
			  		if(týk11==1){			  		
			  		button11.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button11.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==3){ //9. sanýyede olanlar
			  		if(týk11>=1){
			  		button11.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanýyelýk 1. fýrsat butonu		  
			  	if(a / 1000==5) // 10. sanýyede olanlar
			  	{				  		
			  		if(týk1==1){			  		
			  		button1.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button1.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==3){ //9. sanýyede olanlar
			  		if(týk1>=1){
			  		button1.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanýyelýk 4. fýrsat butonu		  
			  	if(a / 1000==11) // 10. sanýyede olanlar
			  	{				  		
			  		if(týk4==1){			  		
			  		button4.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button4.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==9){ //9. sanýyede olanlar
			  		if(týk4>=1){
			  		button4.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanýyelýk 13. fýrsat butonu		  
			  	if(a / 1000==14) // 10. sanýyede olanlar
			  	{				  		
			  		if(týk13==1){			  		
			  		button13.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button13.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==12){ //9. sanýyede olanlar
			  		if(týk13>=1){
			  		button13.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
			  	if(a / 1000==18) 
			  	{							  		
				  l1.setVisibility(View.INVISIBLE);					  					  		
			  	}
			  if(a / 1000==16) 
			  	{							  		
				  l2.setVisibility(View.INVISIBLE);								  					  		
			  	}
			  if(a / 1000==14) 
			  	{							  		
				  l3.setVisibility(View.INVISIBLE);							  					  		
			  	}
			  if(a / 1000==12) 
			  	{							  		
				  l4.setVisibility(View.INVISIBLE);								  					  		
			  	}
			  if(a / 1000==10) 
			  	{							  		
				  l5.setVisibility(View.INVISIBLE);								  					  		
			  	}
			  if(a / 1000==8) 
			  	{	
				  l7.setBackgroundResource(R.drawable.besyuzkir);
				  l8.setBackgroundResource(R.drawable.besyuzkir);
				  l9.setBackgroundResource(R.drawable.besyuzkir);		
				  l0.setBackgroundResource(R.drawable.besyuzkir);
				  l6.setVisibility(View.INVISIBLE);								  					  		
			  	}
			  if(a / 1000==6) 
			  	{						
				  l7.setVisibility(View.INVISIBLE);	
									  					  		
			  	}
			  if(a / 1000==4) 
			  	{		
				  l8.setVisibility(View.INVISIBLE);	
						  					  		
			  	}
			  if(a / 1000==2) 
			  	{	
				  l9.setVisibility(View.INVISIBLE);	
									  					  		
			  	}
//
//				1 sanýyelýk 16. fýrsat butonu		  
			  	if(a / 1000==8) // 10. sanýyede olanlar
			  	{				  		
			  		if(týk16==1){			  		
			  		button16.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button16.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==6){ //9. sanýyede olanlar
			  		if(týk16>=1){
			  		button16.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
			 }
		 	}
		 @Override
		    public boolean onCreateOptionsMenu(Menu menu) {
		        super.onCreateOptionsMenu(menu);
		      
		        MenuItem item = menu.add(Menu.NONE, R.id.action_flip, Menu.NONE,
		                mShowingBack
		                        ? R.string.action_photo
		                        : R.string.action_info);
		        item.setIcon(mShowingBack
		                ? R.drawable.ic_back
		                : R.drawable.ic_info);
		        item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		        return true;
		    }

		    @Override
		    public boolean onOptionsItemSelected(MenuItem item) {
		        switch (item.getItemId()) {

		            case R.id.action_flip:
		                flipCard();
		                return true;
		        }

		        return super.onOptionsItemSelected(item);
		    }

			private void flipCard() {
		        if (mShowingBack) {
		            getFragmentManager().popBackStack();
		            return;
		        }
		        mShowingBack = true;

		        getFragmentManager()
		                .beginTransaction()           
		                .setCustomAnimations(
		                        R.anim.card_flip_right_in, R.anim.card_flip_right_out,
		                        R.anim.card_flip_left_in, R.anim.card_flip_left_out)                
		                .replace(R.id.container, new CardBackFragment())            
		                .addToBackStack(null)           
		                .commit();

		        
		        mHandler.post(new Runnable() {
		            @Override
		            public void run() {
		                invalidateOptionsMenu();
		            }
		        });
		    }

		    @Override
		    public void onBackStackChanged() {
		        mShowingBack = (getFragmentManager().getBackStackEntryCount() > 0);     
		        invalidateOptionsMenu();
		    }  

		    public static class CardBackFragment extends Fragment {
		        public CardBackFragment() {
		        }
		        @Override
		        public View onCreateView(LayoutInflater inflater, ViewGroup container,
		                Bundle savedInstanceState) {
		            return inflater.inflate(R.layout.goodluck, container, false);
		        }
		    }
		}

