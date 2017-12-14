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

public class Gicikb16 extends Activity implements FragmentManager.OnBackStackChangedListener {
	TextView l1,l2,l3,l4,l5,l6,l7,l8,l9,l0;
	  private Handler mHandler = new Handler();
	    private boolean mShowingBack = false;
	MediaPlayer yanlis;
	Button restart16,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16;
	TextView test16;
	String stopscore;
	//zaman de�i�kenleri
	private CountDownTimer zaman;
	 private final long baslangic = 20 * 1000;
	 private final long bitis = 1 * 1000;
	//
	//sharedpreference database
			private SharedPreference sharedPreference;
			Activity context = this;
		//sharedpreference database
//	ver
	TextView tscore16;
	 private int topscore = 0;	 
	//al
	  public static String TOPSCORE  = "topscore";	
	//
	  
	int a;
	 int b1topdegeri=1; int tk1=0;
	 int b2topdegeri=2;int tk2=0;
	 int b3topdegeri=3;int tk3=0;
	 int b4topdegeri=4;int tk4=0;
	 int b5topdegeri=5;int tk5=0;
	 int b6topdegeri=6;int tk6=0;
	 int b7topdegeri=7;int tk7=0;
	 int b8topdegeri=8;int tk8=0;
	 int b9topdegeri=9;int tk9=0;
	 int b10topdegeri=10;int tk10=0;
	 int b11topdegeri=11;int tk11=0;
	 int b12topdegeri=12;int tk12=0;
	 int b13topdegeri=13;int tk13=0;
	 int b14topdegeri=14;int tk14=0;
	 int b15topdegeri=15;int tk15=0;
	 int b16topdegeri=16;int tk16=0;
	 
	 int sayac=0;
	 int sayac16=0;
	 int score16=0;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gicikb16);
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
		
		test16=(TextView)findViewById(R.id.test16);
			
		yanlis=MediaPlayer.create(Gicikb16.this,R.raw.yanlis);
		
		button1=(Button)findViewById(R.id.P1);
		button2=(Button)findViewById(R.id.P2);
		button3=(Button)findViewById(R.id.P3);
		button4=(Button)findViewById(R.id.P4);
		button5=(Button)findViewById(R.id.P5);
		button6=(Button)findViewById(R.id.P6);
		button7=(Button)findViewById(R.id.P7);
		button8=(Button)findViewById(R.id.P8);
		button9=(Button)findViewById(R.id.P9);
		button10=(Button)findViewById(R.id.P10);
		button11=(Button)findViewById(R.id.P11);
		button12=(Button)findViewById(R.id.P12);
		button13=(Button)findViewById(R.id.P13);
		button14=(Button)findViewById(R.id.P14);
		button15=(Button)findViewById(R.id.P15);
		button16=(Button)findViewById(R.id.P16);
		
//		zaman geri say
		  	zaman = new Zamanim(baslangic, bitis);
		  			  
			//
		
		
		  Random r=new Random(); //random
	        a=r.nextInt(16)+1; // 1-9 arasin 	(4 dahil)
	        String gelensayi = a + "";				        
	        test16.setText(gelensayi);	
	       	     
			
			tscore16=(TextView)findViewById(R.id.score16);			 
			sharedPreference = new SharedPreference();
			topscore = sharedPreference.getValue(context);	
		    tscore16.setText(String.valueOf(topscore));
		    
		    restart16=(Button)findViewById(R.id.restart16);
	        restart16.setOnClickListener(new View.OnClickListener() {			
	        	@Override
	        	public void onClick(View v) 
	        	{
	        		 // Restart
					 try {
					      Bundle extras = new Bundle();
					      extras.putInt(TOPSCORE, topscore);
					 
					      Intent intent = new Intent();
					 
					      intent.putExtras(extras);
					  
					      intent.setClass(getApplicationContext(), Gicikb16.class);
					      startActivity(intent);
					      Gicikb16.this.finish();
					  
					    } catch (Exception e) {
					      e.printStackTrace();
					    }
					 //	
	        	}
	        	})   ;
	      //Ana menuye donus
		       Button back=(Button)findViewById(R.id.back16);
		        back.setOnClickListener(new View.OnClickListener() {			
		        	@Override
		        	public void onClick(View v) 
		        	{
		        		Intent intent = new Intent();	      	 
		      	      intent.setClass(getApplicationContext(), Ana.class);
		      	      startActivity(intent);
		      	      Gicikb16.this.finish();
		        	}});
button1.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) {	
	sayac16++;
	if(sayac16==1){
		 zaman.start();
	 }
	if(a == b1topdegeri)
	{
		sayac++;
		score16=score16+10;
		stopscore=score16+topscore+"";
		tscore16.setText(stopscore);
		
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
	        	Random r=new Random(); //random s
		        a=r.nextInt(16-sayac)+1; // 1-4 arasin
		        String gelensayi = a + "";				        
		        test16.setText(gelensayi);
		      
	        }
		 else{
			 ScoreAl15();
	      }
	}
	else 
	{
		score16=score16-20;
		stopscore=score16+topscore+"";
		tscore16.setText(stopscore);
		Scoreeksi();
		yanlis.start();
		}				
}
})   ;
button2.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac16++;
	if(sayac16==1){
		 zaman.start();
	 }
	// Frsat Buttonu
	tk2++;
	if(tk2>=2){
			button2.setVisibility(View.INVISIBLE);
				score16=score16-100;
				stopscore=score16+topscore+"";
				tscore16.setText(stopscore);
				b2topdegeri=-1;
			}
	//
	else if(a == b2topdegeri)
	{
		tk2=1;
		sayac++;
		score16=score16+10;
		stopscore=score16+topscore+"";
		tscore16.setText(stopscore);
		
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
    	Random r=new Random(); //random sn
	        a=r.nextInt(16-sayac)+1; // 1-4 aras saylarn getirimi iin
	        String gelensayi = a + "";				        
	        test16.setText(gelensayi);
	      
    }else{
  	  ScoreAl15();
    }
	}				
	else {
		tk2--;
		score16=score16-20;
		stopscore=score16+topscore+"";
		tscore16.setText(stopscore);
		Scoreeksi();
		yanlis.start();
		}			
}
})   ;


button3.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) {
	sayac16++;
	if(sayac16==1){
		 zaman.start();
	 }
	if(a == b3topdegeri)
	{
		sayac++;
		score16=score16+10;
		stopscore=score16+topscore+"";
		tscore16.setText(stopscore);
		
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
	        	Random r=new Random(); //random s
		        a=r.nextInt(16-sayac)+1; // 1-4 arasin
		        String gelensayi = a + "";				        
		        test16.setText(gelensayi);
		       
	        }
		 else{
			 ScoreAl15();
	      }
	}				
else   {
	score16=score16-20;
	stopscore=score16+topscore+"";
	tscore16.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;


button4.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac16++;
	if(sayac16==1){
		 zaman.start();
	 }
	if(a == b4topdegeri)
	{
		sayac++;
		score16=score16+20;
		stopscore=score16+topscore+"";
		tscore16.setText(stopscore);
		
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
	        	Random r=new Random(); //random
		        a=r.nextInt(16-sayac)+1; // 1-4 aras
		        String gelensayi = a + "";				        
		        test16.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score16=score16-40;
	stopscore=score16+topscore+"";
	tscore16.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button5.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac16++;
	if(sayac16==1){
		 zaman.start();
	 }
	// Frsat Buttonu
	tk5++;
	if(tk5>=2){
			button5.setVisibility(View.INVISIBLE);
				score16=score16-100;
				stopscore=score16+topscore+"";
				tscore16.setText(stopscore);
				b5topdegeri=-1;
			}
	//
	else if(a == b5topdegeri)
	{
		tk5=1;
		sayac++;
		score16=score16+10;
		stopscore=score16+topscore+"";
		tscore16.setText(stopscore);
		
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
	        	Random r=new Random(); //random
		        a=r.nextInt(16-sayac)+1; // 1-4 aras
		        String gelensayi = a + "";				        
		        test16.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	tk5--;
	score16=score16-20;
	stopscore=score16+topscore+"";
	tscore16.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button6.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac16++;
	if(sayac16==1){
		 zaman.start();
	 }
	// Frsat Buttonu
				tk6++;
				if(tk6>=2){
						button6.setVisibility(View.INVISIBLE);
							score16=score16+20;
							stopscore=score16+topscore+"";
							tscore16.setText(stopscore);
							b6topdegeri=-1;
						}
				//
				else if(a == b6topdegeri)
	{
		tk6=1;
		sayac++;
		score16=score16+10;
		stopscore=score16+topscore+"";
		tscore16.setText(stopscore);
		
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
	        	Random r=new Random(); //random
		        a=r.nextInt(16-sayac)+1; // 1-4 aras
		        String gelensayi = a + "";				        
		        test16.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	tk6--;
	score16=score16-20;
	stopscore=score16+topscore+"";
	tscore16.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button7.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac16++;
	if(sayac16==1){
		 zaman.start();
	 }
	if(a == b7topdegeri)
	{
		sayac++;	
		score16=score16+20;
		stopscore=score16+topscore+"";
		tscore16.setText(stopscore);
		
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
	        	Random r=new Random(); //random snf
		        a=r.nextInt(16-sayac)+1; // 1-4 aras saylarn getirimi iin
		        String gelensayi = a + "";				        
		        test16.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score16=score16-40;
	stopscore=score16+topscore+"";
	tscore16.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button8.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac16++;
	if(sayac16==1){
		 zaman.start();
	 }
	if(a == b8topdegeri)
	{
		sayac++;
		score16=score16+10;
		stopscore=score16+topscore+"";
		tscore16.setText(stopscore);
		
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
	        	Random r=new Random(); //random sn
		        a=r.nextInt(16-sayac)+1; // 1-4 aras sayla getirimi iin
		        String gelensayi = a + "";				        
		        test16.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score16=score16-20;
	stopscore=score16+topscore+"";
	tscore16.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button9.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac16++;
	if(sayac16==1){
		 zaman.start();
	 }
	if(a == b9topdegeri)
	{
		sayac++;
		score16=score16+10;
		stopscore=score16+topscore+"";
		tscore16.setText(stopscore);
		
		button9.setVisibility(View.INVISIBLE);			
		b10topdegeri--;	
		b11topdegeri--;
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random s
		        a=r.nextInt(16-sayac)+1; // 1-4 arasin
		        String gelensayi = a + "";				        
		        test16.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score16=score16-20;
	stopscore=score16+topscore+"";
	tscore16.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button10.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac16++;
	if(sayac16==1){
		 zaman.start();
	 }
	if(a == b10topdegeri)
	{
		sayac++;
		score16=score16+20;
		stopscore=score16+topscore+"";
		tscore16.setText(stopscore);
		
		button10.setVisibility(View.INVISIBLE);			
		b11topdegeri--;
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random s
		        a=r.nextInt(16-sayac)+1; // 1-4 arasin
		        String gelensayi = a + "";				        
		        test16.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score16=score16-40;
	stopscore=score16+topscore+"";
	tscore16.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button11.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac16++;
	if(sayac16==1){
		 zaman.start();
	 }
	// Fsat Buttonu
	tk11++;
	if(tk11>=2){
			button11.setVisibility(View.INVISIBLE);
				score16=score16+20;
				stopscore=score16+topscore+"";
				tscore16.setText(stopscore);
				b11topdegeri=-1;
			}
	//
	else if(a == b11topdegeri)
	{
		tk11=1;
		sayac++;
		score16=score16+10;
		stopscore=score16+topscore+"";
		tscore16.setText(stopscore);
		
		button11.setVisibility(View.INVISIBLE);							
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random snf
		        a=r.nextInt(16-sayac)+1; // 1-4 aras sayarn getirimi iin
		        String gelensayi = a + "";				        
		        test16.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	tk11--;
	score16=score16-20;
	stopscore=score16+topscore+"";
	tscore16.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button12.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac16++;
	if(sayac16==1){
		 zaman.start();
	 }
	// Frsat Buttonu
		tk12++;
		if(tk12>=2){
				button12.setVisibility(View.INVISIBLE);
					score16=score16-100;
					stopscore=score16+topscore+"";
					tscore16.setText(stopscore);
					b12topdegeri=-1;
				}
		//
		else if(a == b12topdegeri)
	{
		tk12=1;
		sayac++;
		score16=score16+10;
		stopscore=score16+topscore+"";
		tscore16.setText(stopscore);
		
		button12.setVisibility(View.INVISIBLE);							
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random sn
		        a=r.nextInt(16-sayac)+1; // 1-4 aras saylarn getirimi iin
		        String gelensayi = a + "";				        
		        test16.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	tk12--;
	score16=score16-20;
	stopscore=score16+topscore+"";
	tscore16.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button13.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac16++;
	if(sayac16==1){
		 zaman.start();
	 }
	if(a == b13topdegeri)
	{
		sayac++;
		score16=score16+20;
		stopscore=score16+topscore+"";
		tscore16.setText(stopscore);
		
		button13.setVisibility(View.INVISIBLE);							
		
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random sn
		        a=r.nextInt(16-sayac)+1; // 1-4 aras sayn getirimi iin
		        String gelensayi = a + "";				        
		        test16.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score16=score16-40;
	stopscore=score16+topscore+"";
	tscore16.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button14.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac16++;
	if(sayac16==1){
		 zaman.start();
	 }
	if(a == b14topdegeri)
	{
		sayac++;
		score16=score16+10;
		stopscore=score16+topscore+"";
		tscore16.setText(stopscore);
		
		button14.setVisibility(View.INVISIBLE);							
	
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random s
		        a=r.nextInt(16-sayac)+1; // 1-4 aras saylan getirimi iin
		        String gelensayi = a + "";				        
		        test16.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score16=score16-20;
	stopscore=score16+topscore+"";
	tscore16.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button15.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac16++;
	if(sayac16==1){
		 zaman.start();
	 }
	// Frsat Buttonu
			tk15++;
			if(tk15>=2){
					button15.setVisibility(View.INVISIBLE);
						score16=score16-100;// 5 puan fazladan ver 20+5
						stopscore=score16+topscore+"";
						tscore16.setText(stopscore);
						b15topdegeri=-1;
					}
			//
			else if(a == b15topdegeri)
	{
		tk15=1;
		sayac++;
		score16=score16+10;
		stopscore=score16+topscore+"";
		tscore16.setText(stopscore);
		
		button15.setVisibility(View.INVISIBLE);							
		
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random snf
		        a=r.nextInt(16-sayac)+1; // 1-4 aras saylarn getirimi iin
		        String gelensayi = a + "";				        
		        test16.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	tk15--;
	score16=score16-20;
	stopscore=score16+topscore+"";
	tscore16.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button16.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac16++;
	if(sayac16==1){
		 zaman.start();
	 }
	if(a == b16topdegeri)
	{
		sayac++;
		score16=score16+10;
		stopscore=score16+topscore+"";
		tscore16.setText(stopscore);
		
		button16.setVisibility(View.INVISIBLE);								
		 if(sayac<16){
	        	Random r=new Random(); //random nf
		        a=r.nextInt(16-sayac)+1; // 1-4 aras saylarn getirimi iin
		        String gelensayi = a + "";				        
		        test16.setText(gelensayi);
	        }
		 else {
			 ScoreAl15();
	      }
}
	
else  {
	score16=score16-20;
	stopscore=score16+topscore+"";
	tscore16.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
	}
	private void Scoreeksi(){
		 // score - ye dusunce	
   if(score16+topscore<0)
   {
   	 // Restart
			 try {
				 
			      Bundle extras = new Bundle();
			      extras.putInt(TOPSCORE, topscore);
			 
			      Intent intent = new Intent();
			 
			      intent.putExtras(extras);
			  
			      intent.setClass(getApplicationContext(), Gicikb16.class);
			      startActivity(intent);
			      Gicikb16.this.finish();
			  
			    } catch (Exception e) {
			      e.printStackTrace();
			    }
			 //	
   }
	}
	private void ScoreAl15() {
		topscore = Integer.parseInt(tscore16.getText().toString().trim());
		// Save the text in SharedPreference
	  	sharedPreference.save(context, topscore,16);
	  	// Save the text in SharedPreference
	    try {
	      Bundle extras = new Bundle();
	      extras.putInt(TOPSCORE, topscore);
	      Intent intent = new Intent();
	 
	      intent.putExtras(extras);
	 
	      intent.setClass(getApplicationContext(), Gicikb17.class);
	      startActivity(intent);
	      Gicikb16.this.finish();
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
				//s�re bitince
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
//				1 san frsat butonu
			  	if(a / 1000==5) // 10. sananlar
			  	{				  		
			  		if(tk6==1){
			  		button6.setBackgroundResource(R.drawable.besyuzsari);	
				  	button6.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==4){ //9. saede olanlar
			  		if(tk6>=1){
			  		button6.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sant butonu
			  	if(a / 1000==11) // 10.ede olanlar
			  	{				  		
			  		if(tk11==1){
			  		button11.setBackgroundResource(R.drawable.besyuzsari);	
				  	button11.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==10){ //9. sade olanlar
			  		if(tk11>=1){
			  		button11.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanyelk 10. fsat butonu
			  	if(a / 1000==13) // 10. sanyede olanlar
			  	{				  		
			  		if(tk2==1){
			  		button2.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button2.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==11){ //9. sanyede olanlar
			  		if(tk2>=1){
			  		button2.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sansat butonu
			  	if(a / 1000==9) // 10. sanyede olanlar
			  	{				  		
			  		if(tk12==1){
			  		button12.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button12.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==7){ //9. syede olanlar
			  		if(tk12>=1){
			  		button12.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 san�yel�k 10. f�rsat butonu		  
			  	if(a / 1000==4) // 10. san�yede olanlar
			  	{				  		
			  		if(tk5==1){
			  		button5.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button5.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==2){ //9. sanyede olanlar
			  		if(tk5>=1){
			  		button5.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanyelk 10. frsat butonu
			  	if(a / 1000==15) // 10. sanyede olanlar
			  	{				  		
			  		if(tk15==1){
			  		button15.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button15.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==13){ //9. sanyede olanlar
			  		if(tk15>=1){
			  		button15.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
			  	
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
