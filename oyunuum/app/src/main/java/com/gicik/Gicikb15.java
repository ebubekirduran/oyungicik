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

public class Gicikb15 extends Activity implements FragmentManager.OnBackStackChangedListener {
	TextView l1,l2,l3,l4,l5,l6,l7,l8,l9,l0;
	  private Handler mHandler = new Handler();
	    private boolean mShowingBack = false;
	MediaPlayer yanlis;
	Button restart15,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16;
	TextView test15;
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
	TextView tscore15;
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
	 int sayac15=0;
	 int score15=0;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gicikb15);
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
		
		test15=(TextView)findViewById(R.id.test15);
			
		yanlis=MediaPlayer.create(Gicikb15.this,R.raw.yanlis);
		
		button1=(Button)findViewById(R.id.O1);
		button2=(Button)findViewById(R.id.O2);
		button3=(Button)findViewById(R.id.O3);
		button4=(Button)findViewById(R.id.O4);
		button5=(Button)findViewById(R.id.O5);
		button6=(Button)findViewById(R.id.O6);
		button7=(Button)findViewById(R.id.O7);
		button8=(Button)findViewById(R.id.O8);
		button9=(Button)findViewById(R.id.O9);
		button10=(Button)findViewById(R.id.O10);
		button11=(Button)findViewById(R.id.O11);
		button12=(Button)findViewById(R.id.O12);
		button13=(Button)findViewById(R.id.O13);
		button14=(Button)findViewById(R.id.O14);
		button15=(Button)findViewById(R.id.O15);
		button16=(Button)findViewById(R.id.O16);
		
//		zaman geri saym
		  	zaman = new Zamanim(baslangic, bitis);
			//
		
		
		  Random r=new Random(); //random snf
	        a=r.nextInt(16)+1; // 1-9 aras sayn getirimi in 	(4 dahil)
	        String gelensayi = a + "";				        
	        test15.setText(gelensayi);	
	       	     
			
			tscore15=(TextView)findViewById(R.id.score15);			 
			sharedPreference = new SharedPreference();
			topscore = sharedPreference.getValue(context);	
		    tscore15.setText(String.valueOf(topscore));
		    
		    restart15=(Button)findViewById(R.id.restart15);
	        restart15.setOnClickListener(new View.OnClickListener() {			
	        	@Override
	        	public void onClick(View v) 
	        	{
	        		 // Restart
					 try {
					      Bundle extras = new Bundle();
					      extras.putInt(TOPSCORE, topscore);
					 
					      Intent intent = new Intent();
					 
					      intent.putExtras(extras);
					  
					      intent.setClass(getApplicationContext(), Gicikb15.class);
					      startActivity(intent);
					      Gicikb15.this.finish();
					  
					    } catch (Exception e) {
					      e.printStackTrace();
					    }
					 //	
	        	}
	        	})   ;	
	      //Ana menuye donus
		       Button back=(Button)findViewById(R.id.back15);
		        back.setOnClickListener(new View.OnClickListener() {			
		        	@Override
		        	public void onClick(View v) 
		        	{
		        		Intent intent = new Intent();	      	 
		      	      intent.setClass(getApplicationContext(), Ana.class);
		      	      startActivity(intent);
		      	      Gicikb15.this.finish();
		        	}});
button1.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) {	
	sayac15++;
	if(sayac15==1){
		 zaman.start();
	 }
	if(a == b1topdegeri)
	{
		sayac++;
		score15=score15+20;
		stopscore=score15+topscore+"";
		tscore15.setText(stopscore);
		
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
		        a=r.nextInt(16-sayac)+1; // 1-4 arain
		        String gelensayi = a + "";				        
		        test15.setText(gelensayi);
		      
	        }
		 else{
			 ScoreAl15();
	      }
	}
	else 
	{
		score15=score15-40;
		stopscore=score15+topscore+"";
		tscore15.setText(stopscore);
		Scoreeksi();
		yanlis.start();
		}				
}
})   ;
button2.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac15++;
	if(sayac15==1){
		 zaman.start();
	 }
	if(a == b2topdegeri)
	{
		sayac++;
		score15=score15+10;
		stopscore=score15+topscore+"";
		tscore15.setText(stopscore);
		
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
      	Random r=new Random(); //random s
	        a=r.nextInt(16-sayac)+1; // 1-4 ar
	        String gelensayi = a + "";				        
	        test15.setText(gelensayi);
	      
      }else{
    	  ScoreAl15();
      }
	}				
	else {
		score15=score15-20;
		stopscore=score15+topscore+"";
		tscore15.setText(stopscore);
		Scoreeksi();
		yanlis.start();
		}			
}
})   ;


button3.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) {
	sayac15++;
	if(sayac15==1){
		 zaman.start();
	 }
	// Frsat Buttonu
				tk3++;
				if(tk3>=2){
						button3.setVisibility(View.INVISIBLE);
							score15=score15-100;
							stopscore=score15+topscore+"";
							tscore15.setText(stopscore);
							b3topdegeri=-1;
						}
				//
				else if(a == b3topdegeri)
	{
		tk3=1;
		sayac++;
		score15=score15+10;
		stopscore=score15+topscore+"";
		tscore15.setText(stopscore);
		
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
	        	Random r=new Random(); //random
		        a=r.nextInt(16-sayac)+1; // 1-4 arasin
		        String gelensayi = a + "";				        
		        test15.setText(gelensayi);
		       
	        }
		 else{
			 ScoreAl15();
	      }
	}				
else   {
	tk3--;
	score15=score15-20;
	stopscore=score15+topscore+"";
	tscore15.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;


button4.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac15++;
	if(sayac15==1){
		 zaman.start();
	 }
	if(a == b4topdegeri)
	{
		sayac++;
		score15=score15+10;
		stopscore=score15+topscore+"";
		tscore15.setText(stopscore);
		
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
	        	Random r=new Random(); //random s
		        a=r.nextInt(16-sayac)+1; // 1-4 aras
		        String gelensayi = a + "";				        
		        test15.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score15=score15-20;
	stopscore=score15+topscore+"";
	tscore15.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button5.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac15++;
	if(sayac15==1){
		 zaman.start();
	 }
	if(a == b5topdegeri)
	{
		sayac++;
		score15=score15+10;
		stopscore=score15+topscore+"";
		tscore15.setText(stopscore);
		
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
		        a=r.nextInt(16-sayac)+1; // 1-4 aras saylarn getirimi iin
		        String gelensayi = a + "";				        
		        test15.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score15=score15-20;
	stopscore=score15+topscore+"";
	tscore15.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button6.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac15++;
	if(sayac15==1){
		 zaman.start();
	 }
	if(a == b6topdegeri)
	{
		sayac++;
		score15=score15+20;
		stopscore=score15+topscore+"";
		tscore15.setText(stopscore);
		
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
		        a=r.nextInt(16-sayac)+1; // 1-4 arasin
		        String gelensayi = a + "";				        
		        test15.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score15=score15-40;
	stopscore=score15+topscore+"";
	tscore15.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button7.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac15++;
	if(sayac15==1){
		 zaman.start();
	 }
	// Fat Buttonu
		tk7++;
		if(tk7>=2){
				button7.setVisibility(View.INVISIBLE);
					score15=score15+20;
					stopscore=score15+topscore+"";
					tscore15.setText(stopscore);
					b7topdegeri=-1;
				}
		//
		else if(a == b7topdegeri)
	{
		tk7=1; //----------------------------------------------- gerekli
		sayac++;	
		score15=score15+10;
		stopscore=score15+topscore+"";
		tscore15.setText(stopscore);
		
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
	        	Random r=new Random(); //random s
		        a=r.nextInt(16-sayac)+1; // 1-4 arasn
		        String gelensayi = a + "";				        
		        test15.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	tk7--; //----------------------------------------------- gerekli
	score15=score15-20;
	stopscore=score15+topscore+"";
	tscore15.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button8.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac15++;
	if(sayac15==1){
		 zaman.start();
	 }
	// Ft Buttonu
	tk8++;
	if(tk8>=2){
			button8.setVisibility(View.INVISIBLE);
				score15=score15-100;
				stopscore=score15+topscore+"";
				tscore15.setText(stopscore);
				b8topdegeri=-1;
			}
	//
	else if(a == b8topdegeri)
	{
		tk8=1;
		sayac++;
		score15=score15+10;
		stopscore=score15+topscore+"";
		tscore15.setText(stopscore);
		
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
	        	Random r=new Random(); //random s
		        a=r.nextInt(16-sayac)+1; // 1-4 arasin
		        String gelensayi = a + "";				        
		        test15.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	tk8--;
	score15=score15-20;
	stopscore=score15+topscore+"";
	tscore15.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button9.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac15++;
	if(sayac15==1){
		 zaman.start();
	 }
	// Frsat Buttonu
		tk9++;
		if(tk9>=2){
				button9.setVisibility(View.INVISIBLE);
					score15=score15-100;
					stopscore=score15+topscore+"";
					tscore15.setText(stopscore);
					b9topdegeri=-1;
				}
		//
		else if(a == b9topdegeri)
	{
		tk9=1;
		sayac++;
		score15=score15+10;
		stopscore=score15+topscore+"";
		tscore15.setText(stopscore);
		
		button9.setVisibility(View.INVISIBLE);			
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
		        test15.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	tk9--;
	score15=score15-20;
	stopscore=score15+topscore+"";
	tscore15.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button10.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac15++;
	if(sayac15==1){
		 zaman.start();
	 }
	// Ft Buttonu
			tk10++;
			if(tk10>=2){
					button10.setVisibility(View.INVISIBLE);
						score15=score15+20;
						stopscore=score15+topscore+"";
						tscore15.setText(stopscore);
						b10topdegeri=-1;
					}
			//
			else if(a == b10topdegeri)
	{
		tk10=1; //----------------------------------------------- gerekli
		sayac++;
		score15=score15+10;
		stopscore=score15+topscore+"";
		tscore15.setText(stopscore);
		
		button10.setVisibility(View.INVISIBLE);			
		b11topdegeri--;
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random
		        a=r.nextInt(16-sayac)+1; // 1-4 arain
		        String gelensayi = a + "";				        
		        test15.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	tk10--; //----------------------------------------------- gerekli
	score15=score15-20;
	stopscore=score15+topscore+"";
	tscore15.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button11.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac15++;
	if(sayac15==1){
		 zaman.start();
	 }
	if(a == b11topdegeri)
	{
		sayac++;
		score15=score15+20;
		stopscore=score15+topscore+"";
		tscore15.setText(stopscore);
		
		button11.setVisibility(View.INVISIBLE);							
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random s
		        a=r.nextInt(16-sayac)+1; // 1-4 aran
		        String gelensayi = a + "";				        
		        test15.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score15=score15-40;
	stopscore=score15+topscore+"";
	tscore15.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button12.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac15++;
	if(sayac15==1){
		 zaman.start();
	 }
	if(a == b12topdegeri)
	{
		sayac++;
		score15=score15+10;
		stopscore=score15+topscore+"";
		tscore15.setText(stopscore);
		
		button12.setVisibility(View.INVISIBLE);							
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random s
		        a=r.nextInt(16-sayac)+1; // 1-4 arasin
		        String gelensayi = a + "";				        
		        test15.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score15=score15-20;
	stopscore=score15+topscore+"";
	tscore15.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button13.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac15++;
	if(sayac15==1){
		 zaman.start();
	 }
	if(a == b13topdegeri)
	{
		sayac++;
		score15=score15+10;
		stopscore=score15+topscore+"";
		tscore15.setText(stopscore);
		
		button13.setVisibility(View.INVISIBLE);							
		
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random s
		        a=r.nextInt(16-sayac)+1; // 1-4 arasin
		        String gelensayi = a + "";				        
		        test15.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score15=score15-20;
	stopscore=score15+topscore+"";
	tscore15.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button14.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac15++;
	if(sayac15==1){
		 zaman.start();
	 }
	// Frsat Buttonu
			tk14++;
			if(tk14>=2){
					button14.setVisibility(View.INVISIBLE);
						score15=score15-100;
						stopscore=score15+topscore+"";
						tscore15.setText(stopscore);
						b14topdegeri=-1;
					}
			//
			else if(a == b14topdegeri)
	{
		tk14=1;
		sayac++;
		score15=score15+10;
		stopscore=score15+topscore+"";
		tscore15.setText(stopscore);
		
		button14.setVisibility(View.INVISIBLE);							
	
		b15topdegeri--;
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random
		        a=r.nextInt(16-sayac)+1; // 1-4 arasin
		        String gelensayi = a + "";				        
		        test15.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	tk14--;
	score15=score15-20;
	stopscore=score15+topscore+"";
	tscore15.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button15.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac15++;
	if(sayac15==1){
		 zaman.start();
	 }
	if(a == b15topdegeri)
	{
		sayac++;
		score15=score15+10;
		stopscore=score15+topscore+"";
		tscore15.setText(stopscore);
		
		button15.setVisibility(View.INVISIBLE);							
		
		b16topdegeri--;
		 if(sayac<16){
	        	Random r=new Random(); //random s
		        a=r.nextInt(16-sayac)+1; // 1-4 arasn
		        String gelensayi = a + "";				        
		        test15.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score15=score15-20;
	stopscore=score15+topscore+"";
	tscore15.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button16.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac15++;
	if(sayac15==1){
		 zaman.start();
	 }
	if(a == b16topdegeri)
	{
		sayac++;
		score15=score15+20;
		stopscore=score15+topscore+"";
		tscore15.setText(stopscore);
		
		button16.setVisibility(View.INVISIBLE);								
		 if(sayac<16){
	        	Random r=new Random(); //random
		        a=r.nextInt(16-sayac)+1; // 1-4 arasin
		        String gelensayi = a + "";				        
		        test15.setText(gelensayi);
	        }
		 else {
			 ScoreAl15();
	      }
}
	
else  {
	score15=score15-40;
	stopscore=score15+topscore+"";
	tscore15.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
	}
	private void Scoreeksi(){
		 // score - ye dusunce	
     if(score15+topscore<0)
     {
     	 // Restart
			 try {
			      Bundle extras = new Bundle();
			      extras.putInt(TOPSCORE, topscore);
			 
			      Intent intent = new Intent();
			 
			      intent.putExtras(extras);
			  
			      intent.setClass(getApplicationContext(), Gicikb15.class);
			      startActivity(intent);
			      Gicikb15.this.finish();
			  
			    } catch (Exception e) {
			      e.printStackTrace();
			    }
			 //	
     }
	}
	private void ScoreAl15() {
		topscore = Integer.parseInt(tscore15.getText().toString().trim());
		// Save the text in SharedPreference
	  	sharedPreference.save(context, topscore,15);
	  	// Save the text in SharedPreference
	    try {
	      Bundle extras = new Bundle();
	      extras.putInt(TOPSCORE, topscore);
	      Intent intent = new Intent();
	 
	      intent.putExtras(extras);
	 
	      intent.setClass(getApplicationContext(), Gicikb16.class);
	      startActivity(intent);
	      Gicikb15.this.finish();
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
//				1 sannu
			  	if(a / 1000==5) // 10. san olanlar
			  	{				  		
			  		if(tk7==1){
			  		button7.setBackgroundResource(R.drawable.besyuzsari);	
				  	button7.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==4){ //9. sanyede olanlar
			  		if(tk7>=1){
			  		button7.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 san
			  	if(a / 1000==11) // 10. sanyede olanlar
			  	{				  		
			  		if(tk10==1){
			  		button10.setBackgroundResource(R.drawable.besyuzsari);	
				  	button10.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==10){ //9. sanyede olanlar
			  		if(tk10>=1){
			  		button10.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sant butonu
			  	if(a / 1000==13) // 10. sanyede olanlar
			  	{				  		
			  		if(tk3==1){
			  		button3.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button3.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==11){ //9. sanyede olanlar
			  		if(tk3>=1){
			  		button3.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanyelk 10. fsat butonu
			  	if(a / 1000==9) // 10. sanyede olanlar
			  	{				  		
			  		if(tk8==1){
			  		button8.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button8.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==7){ //9. sanyede olanlar
			  		if(tk8>=1){
			  		button8.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanyelk 10. frsat butonu
			  	if(a / 1000==4) // 10. sanyede olanlar
			  	{				  		
			  		if(tk9==1){
			  		button9.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button9.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==2){ //9. sanyede olanlar
			  		if(tk9>=1){
			  		button9.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanyelk 10. frsat butonu
			  	if(a / 1000==15) // 10. sanyede olanlar
			  	{				  		
			  		if(tk14==1){
			  		button14.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button14.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==13){ //9. sanyede olanlar
			  		if(tk14>=1){
			  		button14.setVisibility(View.INVISIBLE);
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