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

public class Gicikb18 extends Activity implements FragmentManager.OnBackStackChangedListener {
	TextView l1,l2,l3,l4,l5,l6,l7,l8,l9,l0;
	  private Handler mHandler = new Handler();
	    private boolean mShowingBack = false;
	MediaPlayer yanlis;
	Button restart18,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20;
	TextView test18;
	String stopscore;
	//zaman deðiþkenleri
	private CountDownTimer zaman;
	 private final long baslangic = 30 * 1000;
	 private final long bitis = 1 * 1000;
	//
	//sharedpreference database
			private SharedPreference sharedPreference;
			Activity context = this;
		//sharedpreference database
//	ver
	TextView tscore18;
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
	 int b17topdegeri=17;int týk17=0;
	 int b18topdegeri=18;int týk18=0;
	 int b19topdegeri=19;int týk19=0;
	 int b20topdegeri=20;int týk20=0;
	 
	 int sayac=0;
	 int sayac18=0;
	 int score18=0;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gicikb18);
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
		
		test18=(TextView)findViewById(R.id.test18);
			
		yanlis=MediaPlayer.create(Gicikb18.this,R.raw.yanlis);
		
		button1=(Button)findViewById(R.id.S1);
		button2=(Button)findViewById(R.id.S2);
		button3=(Button)findViewById(R.id.S3);
		button4=(Button)findViewById(R.id.S4);
		button5=(Button)findViewById(R.id.S5);
		button6=(Button)findViewById(R.id.S6);
		button7=(Button)findViewById(R.id.S7);
		button8=(Button)findViewById(R.id.S8);
		button9=(Button)findViewById(R.id.S9);
		button10=(Button)findViewById(R.id.S10);
		button11=(Button)findViewById(R.id.S11);
		button12=(Button)findViewById(R.id.S12);
		button13=(Button)findViewById(R.id.S13);
		button14=(Button)findViewById(R.id.S14);
		button15=(Button)findViewById(R.id.S15);
		button16=(Button)findViewById(R.id.S16);
		button17=(Button)findViewById(R.id.S17);
		button18=(Button)findViewById(R.id.S18);
		button19=(Button)findViewById(R.id.S19);
		button20=(Button)findViewById(R.id.S20);
		
//		zaman geri sayým
		  	zaman = new Zamanim(baslangic, bitis);
		  			  
			//
		
		
		  Random r=new Random(); //random sýnýfý
	        a=r.nextInt(20)+1; // 1-9 arasý sayýlarýn getirimi için 	(4 dahil)	
	        String gelensayi = a + "";				        
	        test18.setText(gelensayi);	
	       	     
			
			tscore18=(TextView)findViewById(R.id.score18);			 
			sharedPreference = new SharedPreference();
			topscore = sharedPreference.getValue(context);	
		    tscore18.setText(String.valueOf(topscore));
		    
		    restart18=(Button)findViewById(R.id.restart18);
	        restart18.setOnClickListener(new View.OnClickListener() {			
	        	@Override
	        	public void onClick(View v) 
	        	{
	        		 // Restart
					 try {
					      Bundle extras = new Bundle();
					      extras.putInt(TOPSCORE, topscore);
					 
					      Intent intent = new Intent();
					 
					      intent.putExtras(extras);
					  
					      intent.setClass(getApplicationContext(), Gicikb18.class);
					      startActivity(intent);
					      Gicikb18.this.finish();
					  
					    } catch (Exception e) {
					      e.printStackTrace();
					    }
					 //	
	        	}
	        	})   ;	
	      //Ana menuye donus
		       Button back=(Button)findViewById(R.id.back18);
		        back.setOnClickListener(new View.OnClickListener() {			
		        	@Override
		        	public void onClick(View v) 
		        	{
		        		Intent intent = new Intent();	      	 
		      	      intent.setClass(getApplicationContext(), Ana.class);
		      	      startActivity(intent);
		      	      Gicikb18.this.finish();
		        	}});
button1.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) {	
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	if(a == b1topdegeri)
	{
		sayac++;
		score18=score18+20;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
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
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test18.setText(gelensayi);
		      
	        }
		 else{
			 ScoreAl15();
	      }
	}
	else 
	{
		score18=score18-40;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		Scoreeksi();
		yanlis.start();
		}				
}
})   ;
button2.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	if(a == b2topdegeri)
	{
		sayac++;
		score18=score18+10;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
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
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
if(sayac<20){
	Random r=new Random(); //random sýnýfý
	        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
	        String gelensayi = a + "";				        
	        test18.setText(gelensayi);
	      
}else{
	  ScoreAl15();
}
	}				
	else {
		score18=score18-20;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		Scoreeksi();
		yanlis.start();
		}			
}
})   ;


button3.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) {
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	// Fýrsat Buttonu
				týk3++;
				if(týk3>=2){
						button3.setVisibility(View.INVISIBLE);
							score18=score18-100;
							stopscore=score18+topscore+"";
							tscore18.setText(stopscore);
							b3topdegeri=-1;
						}
				//
				else if(a == b3topdegeri)
	{
		týk3=1;
		sayac++;
		score18=score18+10;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
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
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test18.setText(gelensayi);
		       
	        }
		 else{
			 ScoreAl15();
	      }
	}				
else   {
	týk3--;
	score18=score18-20;
	stopscore=score18+topscore+"";
	tscore18.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;


button4.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	// Fýrsat Buttonu
				týk4++;
				if(týk4>=2){
						button4.setVisibility(View.INVISIBLE);
							score18=score18+30;
							stopscore=score18+topscore+"";
							tscore18.setText(stopscore);
							b4topdegeri=-1;
						}
				//
				else if(a == b4topdegeri)
	{
		týk4=1;
		sayac++;
		score18=score18+10;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
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
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test18.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	týk4--;
	score18=score18-20;
	stopscore=score18+topscore+"";
	tscore18.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button5.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	if(a == b5topdegeri)
	{
		sayac++;
		score18=score18+20;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
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
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test18.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score18=score18-40;
	stopscore=score18+topscore+"";
	tscore18.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button6.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	if(a == b6topdegeri)
	{
		sayac++;
		score18=score18+20;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
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
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test18.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score18=score18-40;
	stopscore=score18+topscore+"";
	tscore18.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button7.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	// Fýrsat Buttonu
				týk7++;
				if(týk7>=2){
						button7.setVisibility(View.INVISIBLE);
							score18=score18-100;// 5 puan fazladan ver 20+5
							stopscore=score18+topscore+"";
							tscore18.setText(stopscore);
							b7topdegeri=-1;
						}
				//
				else if(a == b7topdegeri)
	{
		týk7=1;
		sayac++;	
		score18=score18+10;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
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
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test18.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	týk7--;
	score18=score18-20;
	stopscore=score18+topscore+"";
	tscore18.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button8.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	// Fýrsat Buttonu
	týk8++;
	if(týk8>=2){
			button8.setVisibility(View.INVISIBLE);
				score18=score18-100;// 5 puan fazladan ver 20+5
				stopscore=score18+topscore+"";
				tscore18.setText(stopscore);
				b8topdegeri=-1;
			}
	//
	else if(a == b8topdegeri)
	{
		týk8=1;
		sayac++;
		score18=score18+10;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
		button8.setVisibility(View.INVISIBLE);			

		b9topdegeri--;
		b10topdegeri--;	
		b11topdegeri--;
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test18.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	týk8--;
	score18=score18-20;
	stopscore=score18+topscore+"";
	tscore18.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button9.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	if(a == b9topdegeri)
	{
		sayac++;
		score18=score18+10;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
		button9.setVisibility(View.INVISIBLE);			
		b10topdegeri--;	
		b11topdegeri--;
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test18.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score18=score18-20;
	stopscore=score18+topscore+"";
	tscore18.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button10.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	// Fýrsat Buttonu
			týk10++;
			if(týk10>=2){
					button10.setVisibility(View.INVISIBLE);
						score18=score18+20;// 5 puan fazladan ver 20+5
						stopscore=score18+topscore+"";
						tscore18.setText(stopscore);
						b10topdegeri=-1;
					}
			//
			else if(a == b10topdegeri)
	{
		týk10=1;
		sayac++;
		score18=score18+30;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
		button10.setVisibility(View.INVISIBLE);			
		b11topdegeri--;
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test18.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	týk10--;
	score18=score18-60;
	stopscore=score18+topscore+"";
	tscore18.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button11.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	// Fýrsat Buttonu
				týk11++;
				if(týk11>=2){
						button11.setVisibility(View.INVISIBLE);
							score18=score18+20;
							stopscore=score18+topscore+"";
							tscore18.setText(stopscore);
							b11topdegeri=-1;
						}
				//
				else if(a == b11topdegeri)
	{
		týk11=1;
		sayac++;
		score18=score18+30;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
		button11.setVisibility(View.INVISIBLE);							
		b12topdegeri--;
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test18.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	týk11--;
	score18=score18-60;
	stopscore=score18+topscore+"";
	tscore18.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button12.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	if(a == b12topdegeri)
	{
		sayac++;
		score18=score18+10;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
		button12.setVisibility(View.INVISIBLE);							
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test18.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score18=score18-20;
	stopscore=score18+topscore+"";
	tscore18.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button13.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	// Fýrsat Buttonu
	týk13++;
	if(týk13>=2){
			button13.setVisibility(View.INVISIBLE);
				score18=score18-100;// 5 puan fazladan ver 20+5
				stopscore=score18+topscore+"";
				tscore18.setText(stopscore);
				b13topdegeri=-1;
			}
	//
	else if(a == b13topdegeri)
	{
		týk13=1;
		sayac++;
		score18=score18+10;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
		button13.setVisibility(View.INVISIBLE);							
		
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test18.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	týk13--;
	score18=score18-20;
	stopscore=score18+topscore+"";
	tscore18.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button14.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	// Fýrsat Buttonu
		týk14++;
		if(týk14>=2){
				button14.setVisibility(View.INVISIBLE);
					score18=score18-100;// 5 puan fazladan ver 20+5
					stopscore=score18+topscore+"";
					tscore18.setText(stopscore);
					b14topdegeri=-1;
				}
		//
		else if(a == b14topdegeri)
	{
		týk14=1;
		sayac++;
		score18=score18+10;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
		button14.setVisibility(View.INVISIBLE);							
	
		b15topdegeri--;
		b16topdegeri--;
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test18.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	týk14--;
	score18=score18-20;
	stopscore=score18+topscore+"";
	tscore18.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button15.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	if(a == b15topdegeri)
	{
		sayac++;
		score18=score18+20;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
		button15.setVisibility(View.INVISIBLE);							
		
		b16topdegeri--;
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test18.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score18=score18-40;
	stopscore=score18+topscore+"";
	tscore18.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button16.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	if(a == b16topdegeri)
	{
		sayac++;
		score18=score18+20;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
		button16.setVisibility(View.INVISIBLE);	
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test18.setText(gelensayi);
	        }
		 else {
			 ScoreAl15();
	      }
}
	
else  {
	score18=score18-40;
	stopscore=score18+topscore+"";
	tscore18.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button17.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	// Fýrsat Buttonu
	týk17++;
	if(týk17>=2){
			button17.setVisibility(View.INVISIBLE);
				score18=score18+30;
				stopscore=score18+topscore+"";
				tscore18.setText(stopscore);
				b17topdegeri=-1;
			}
	//
	else if(a == b17topdegeri)
	{
		týk17=1;
		sayac++;
		score18=score18+10;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
		button17.setVisibility(View.INVISIBLE);	
		
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test18.setText(gelensayi);
	        }
		 else {
			 ScoreAl15();
	      }
}
	
else  {
	týk17--;
	score18=score18-20;
	stopscore=score18+topscore+"";
	tscore18.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button18.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	// Fýrsat Buttonu
	týk18++;
	if(týk18>=2){
			button18.setVisibility(View.INVISIBLE);
				score18=score18-100;// 5 puan fazladan ver 20+5
				stopscore=score18+topscore+"";
				tscore18.setText(stopscore);
				b18topdegeri=-1;
			}
	//
	else if(a == b18topdegeri)
	{
		týk18=1;
		sayac++;
		score18=score18+10;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
		button18.setVisibility(View.INVISIBLE);
	
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test18.setText(gelensayi);
	        }
		 else {
			 ScoreAl15();
	      }
}
	
else  {
	týk18--;
	score18=score18-20;
	stopscore=score18+topscore+"";
	tscore18.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button19.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	if(a == b19topdegeri)
	{
		sayac++;
		score18=score18+10;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
		button19.setVisibility(View.INVISIBLE);	
	
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test18.setText(gelensayi);
	        }
		 else {
			 ScoreAl15();
	      }
}
	
else  {
	score18=score18-20;
	stopscore=score18+topscore+"";
	tscore18.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button20.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac18++;
	if(sayac18==1){
		 zaman.start();
	 }
	if(a == b20topdegeri)
	{
		sayac++;
		score18=score18+20;
		stopscore=score18+topscore+"";
		tscore18.setText(stopscore);
		
		button20.setVisibility(View.INVISIBLE);								
		 if(sayac<20){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(20-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test18.setText(gelensayi);
	        }
		 else {
			 ScoreAl15();
	      }
}
	
else  {
	score18=score18-40;
	stopscore=score18+topscore+"";
	tscore18.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
	}
	private void Scoreeksi(){
		 // score - ye dusunce	
if(score18+topscore<0)
{
	 // Restart
			 try {
			      Bundle extras = new Bundle();
			      extras.putInt(TOPSCORE, topscore);
			 
			      Intent intent = new Intent();
			 
			      intent.putExtras(extras);
			  
			      intent.setClass(getApplicationContext(), Gicikb18.class);
			      startActivity(intent);
			      Gicikb18.this.finish();
			  
			    } catch (Exception e) {
			      e.printStackTrace();
			    }
			 //	
}
	}
	private void ScoreAl15() {
		topscore = Integer.parseInt(tscore18.getText().toString().trim());
		// Save the text in SharedPreference
	  	sharedPreference.save(context, topscore,18);
	  	// Save the text in SharedPreference
	    try {
	      Bundle extras = new Bundle();
	      extras.putInt(TOPSCORE, topscore);
	      Intent intent = new Intent();
	 
	      intent.putExtras(extras);
	 
	      intent.setClass(getApplicationContext(), Gicikb19.class);
	      startActivity(intent);
	      Gicikb18.this.finish();
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
				 button17.setVisibility(View.INVISIBLE);
				 button18.setVisibility(View.INVISIBLE);
				 button19.setVisibility(View.INVISIBLE);
				 button20.setVisibility(View.INVISIBLE);
				 //
			 }
			 @Override
			 public void onTick(long a) {
//				1 sanýyelýk 10. fýrsat butonu		  
			  	if(a / 1000==15) // 10. sanýyede olanlar
			  	{				  		
			  		if(týk10==1){			  		
			  		button10.setBackgroundResource(R.drawable.besyuzsari);	
				  	button10.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==14){ //9. sanýyede olanlar
			  		if(týk10>=1){
			  		button10.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanýyelýk 11. fýrsat butonu		  
			  	if(a / 1000==8) // 10. sanýyede olanlar
			  	{				  		
			  		if(týk11==1){			  		
			  		button11.setBackgroundResource(R.drawable.besyuzsari);	
				  	button11.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==7){ //9. sanýyede olanlar
			  		if(týk11>=1){
			  		button11.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanýyelýk 4. fýrsat butonu		  
			  	if(a / 1000==9) // 10. sanýyede olanlar
			  	{				  		
			  		if(týk4==1){			  		
			  		button4.setBackgroundResource(R.drawable.besyuzyesil);	
				  	button4.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==8){ //9. sanýyede olanlar
			  		if(týk4>=1){
			  		button4.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanýyelýk 17. fýrsat butonu		  
			  	if(a / 1000==6) // 10. sanýyede olanlar
			  	{				  		
			  		if(týk17==1){			  		
			  		button17.setBackgroundResource(R.drawable.besyuzyesil);	
				  	button17.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==5){ //9. sanýyede olanlar
			  		if(týk17>=1){
			  		button17.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanýyelýk 3. fýrsat butonu		  
			  	if(a / 1000==8) // 10. sanýyede olanlar
			  	{				  		
			  		if(týk3==1){			  		
			  		button3.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button3.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==6){ //9. sanýyede olanlar
			  		if(týk3>=1){
			  		button3.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanýyelýk 7. fýrsat butonu		  
			  	if(a / 1000==12) // 10. sanýyede olanlar
			  	{				  		
			  		if(týk7==1){			  		
			  		button7.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button7.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==10){ //9. sanýyede olanlar
			  		if(týk7>=1){
			  		button7.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanýyelýk 8. fýrsat butonu		  
			  	if(a / 1000==4) // 10. sanýyede olanlar
			  	{				  		
			  		if(týk8==1){			  		
			  		button8.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button8.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==2){ //9. sanýyede olanlar
			  		if(týk8>=1){
			  		button8.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanýyelýk 13. fýrsat butonu		  
			  	if(a / 1000==6) // 10. sanýyede olanlar
			  	{				  		
			  		if(týk13==1){			  		
			  		button13.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button13.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==4){ //9. sanýyede olanlar
			  		if(týk13>=1){
			  		button13.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanýyelýk 14. fýrsat butonu		  
			  	if(a / 1000==12) // 10. sanýyede olanlar
			  	{				  		
			  		if(týk14==1){			  		
			  		button14.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button14.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==10){ //9. sanýyede olanlar
			  		if(týk14>=1){
			  		button14.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanýyelýk 18. fýrsat butonu		  
			  	if(a / 1000==10) // 10. sanýyede olanlar
			  	{				  		
			  		if(týk18==1){			  		
			  		button18.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button18.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==8){ //9. sanýyede olanlar
			  		if(týk18>=1){
			  		button18.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
			  	
			  	if(a / 1000==27) 
			  	{							  		
				  l1.setVisibility(View.INVISIBLE);					  					  		
			  	}
			  if(a / 1000==24) 
			  	{							  		
				  l2.setVisibility(View.INVISIBLE);								  					  		
			  	}
			  if(a / 1000==21) 
			  	{							  		
				  l3.setVisibility(View.INVISIBLE);							  					  		
			  	}
			  if(a / 1000==18) 
			  	{							  		
				  l4.setVisibility(View.INVISIBLE);								  					  		
			  	}
			  if(a / 1000==15) 
			  	{							  		
				  l5.setVisibility(View.INVISIBLE);								  					  		
			  	}
			  if(a / 1000==12) 
			  	{	
				  l7.setBackgroundResource(R.drawable.besyuzkir);
				  l8.setBackgroundResource(R.drawable.besyuzkir);
				  l9.setBackgroundResource(R.drawable.besyuzkir);		
				  l0.setBackgroundResource(R.drawable.besyuzkir);
				  l6.setVisibility(View.INVISIBLE);								  					  		
			  	}
			  if(a / 1000==9) 
			  	{						
				  l7.setVisibility(View.INVISIBLE);	
									  					  		
			  	}
			  if(a / 1000==6) 
			  	{		
				  l8.setVisibility(View.INVISIBLE);	
						  					  		
			  	}
			  if(a / 1000==3) 
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

