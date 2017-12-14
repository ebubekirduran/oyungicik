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

public class Gicike41 extends Activity implements FragmentManager.OnBackStackChangedListener {
	TextView l1,l2,l3,l4,l5,l6,l7,l8,l9,l0;
	  private Handler mHandler = new Handler();
	    private boolean mShowingBack = false;
	MediaPlayer yanlis;
	Button restart41,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,
	button17,button18,button19,button20,button21,button22,button23,button24,button25,button26,button27,button28,button29,button30,button31,button32,button33,button34,button35,button36;
	TextView test41;
	String stopscore;
	//zaman deðiþkenleri
	private CountDownTimer zaman;
	 private final long baslangic = 150 * 1000;
	 private final long bitis = 1 * 1000;
	//
	//sharedpreference database
			private SharedPreference sharedPreference;
			Activity context = this;
		//sharedpreference database
//	ver
	TextView tscore41;
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
	 int b21topdegeri=21;int týk21=0;
	 int b22topdegeri=22;int týk22=0;
	 int b23topdegeri=23;int týk23=0;
	 int b24topdegeri=24;int týk24=0;
	 int b25topdegeri=25;int týk25=0;
	 int b26topdegeri=26;int týk26=0;
	 int b27topdegeri=27;int týk27=0;
	 int b28topdegeri=28;int týk28=0;
	 int b29topdegeri=29;int týk29=0;
	 int b30topdegeri=30;int týk30=0;
	 int b31topdegeri=31;int týk31=0;
	 int b32topdegeri=32;int týk32=0;
	 int b33topdegeri=33;int týk33=0;
	 int b34topdegeri=34;int týk34=0;
	 int b35topdegeri=35;int týk35=0;
	 int b36topdegeri=36;int týk36=0;
	 
	 int sayac=0;
	 int sayac25=0;
	 int score41=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gicike41);
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
		test41=(TextView)findViewById(R.id.test41);
			
		yanlis=MediaPlayer.create(Gicike41.this,R.raw.yanlis);
		
		button1=(Button)findViewById(R.id.S2x1);
		button2=(Button)findViewById(R.id.S2x2);
		button3=(Button)findViewById(R.id.S2x3);
		button4=(Button)findViewById(R.id.S2x4);
		button5=(Button)findViewById(R.id.S2x5);
		button6=(Button)findViewById(R.id.S2x6);
		button7=(Button)findViewById(R.id.S2x7);
		button8=(Button)findViewById(R.id.S2x8);
		button9=(Button)findViewById(R.id.S2x9);
		button10=(Button)findViewById(R.id.S2x10);
		button11=(Button)findViewById(R.id.S2x11);
		button12=(Button)findViewById(R.id.S2x12);
		button13=(Button)findViewById(R.id.S2x13);
		button14=(Button)findViewById(R.id.S2x14);
		button15=(Button)findViewById(R.id.S2x15);
		button16=(Button)findViewById(R.id.S2x16);
		button17=(Button)findViewById(R.id.S2x17);
		button18=(Button)findViewById(R.id.S2x18);
		button19=(Button)findViewById(R.id.S2x19);
		button20=(Button)findViewById(R.id.S2x20);
		button21=(Button)findViewById(R.id.S2x21);
		button22=(Button)findViewById(R.id.S2x22);
		button23=(Button)findViewById(R.id.S2x23);
		button24=(Button)findViewById(R.id.S2x24);
		button25=(Button)findViewById(R.id.S2x25);
		button26=(Button)findViewById(R.id.S2x26);
		button27=(Button)findViewById(R.id.S2x27);
		button28=(Button)findViewById(R.id.S2x28);
		button29=(Button)findViewById(R.id.S2x29);
		button30=(Button)findViewById(R.id.S2x30);
		button31=(Button)findViewById(R.id.S2x31);
		button32=(Button)findViewById(R.id.S2x32);
		button33=(Button)findViewById(R.id.S2x33);
		button34=(Button)findViewById(R.id.S2x34);
		button35=(Button)findViewById(R.id.S2x35);
		button36=(Button)findViewById(R.id.S2x36);
		
//		zaman geri sayým
		  	zaman = new Zamanim(baslangic, bitis);
		 
			//
		
		
		  Random r=new Random(); //random sýnýfý
	        a=r.nextInt(36)+1; // 1-25 arasý sayýlarýn getirimi için 	(4 dahil)	
	        String gelensayi = a + "";				        
	        test41.setText(gelensayi);	
	        
	    	tscore41=(TextView)findViewById(R.id.score41);			 
	    	sharedPreference = new SharedPreference();
			topscore = sharedPreference.getValue(context);	
		    tscore41.setText(String.valueOf(topscore));

		    restart41=(Button)findViewById(R.id.restart41);
	        restart41.setOnClickListener(new View.OnClickListener() {			
	        	@Override
	        	public void onClick(View v) 
	        	{
	        		 // Restart
					 try {
					      Bundle extras = new Bundle();
					      extras.putInt(TOPSCORE, topscore);
					 
					      Intent intent = new Intent();
					 
					      intent.putExtras(extras);
					  
					      intent.setClass(getApplicationContext(), Gicike41.class);
					      startActivity(intent);
					      Gicike41.this.finish();
					  
					    } catch (Exception e) {
					      e.printStackTrace();
					    }
					 //	
	        	}
	        	})   ;	
	      //Ana menuye donus
		       Button back=(Button)findViewById(R.id.back41);
		        back.setOnClickListener(new View.OnClickListener() {			
		        	@Override
		        	public void onClick(View v) 
		        	{
		        		Intent intent = new Intent();	      	 
		      	      intent.setClass(getApplicationContext(), Ana.class);
		      	      startActivity(intent);
		      	      Gicike41.this.finish();
		        	}});
button1.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	if(a == b1topdegeri)
	{
		sayac++;
		score41=score41-100;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
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
		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
		      
	        }
		 else{
			 ScoreAl25();
	      }
	}
	else 
	{
		score41=score41-200;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		Scoreeksi();
		yanlis.start();
	}				
}
})   ;
button2.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
				týk2++;
				if(týk2==3 && a == b2topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
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
		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;	
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
if(sayac<36){
	Random r=new Random(); //random sýnýfý
	        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
	        String gelensayi = a + "";				        
	        test41.setText(gelensayi);
	      
}else{
	  ScoreAl25();
}
	}	
				//fýrsat benzer 1. katman
				else if(týk2==2 && a == b2topdegeri)
				{
					týk2=2;
					button2.setBackgroundResource(R.drawable.besyuzmor);
					score41=score41+50;
					stopscore=score41+topscore+"";
					tscore41.setText(stopscore);
					 if(sayac<36){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test41.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(týk2==1 && a == b2topdegeri)				
				{
						týk2=1;
						button2.setBackgroundResource(R.drawable.besyuzmorkatman);
						score41=score41+50;
						stopscore=score41+topscore+"";
						tscore41.setText(stopscore);
						 if(sayac<36){
					        	Random r=new Random(); //random sýnýfý
						        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
						        String gelensayi = a + "";				        
						        test41.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
	else {týk2--;
		score41=score41-100;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		Scoreeksi();
		yanlis.start();
		}			
}
})   ;


button3.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
	týk3++;
	if(týk3==3 && a == b3topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
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
		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
		       
	        }
		 else{
			 ScoreAl25();
	      }
	}			//fýrsat benzer 1. katman
	else if(týk3==2 && a == b3topdegeri)
	{
		týk3=2;
		button3.setBackgroundResource(R.drawable.besyuzmor);
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(týk3==1 && a == b3topdegeri)				
	{
			týk3=1;
			button3.setBackgroundResource(R.drawable.besyuzmorkatman);
			score41=score41+50;
			stopscore=score41+topscore+"";
			tscore41.setText(stopscore);
			 if(sayac<36){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test41.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}		
else   {týk3--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;


button4.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
	týk4++;
	if(týk4==3 && a == b4topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
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
		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	//fýrsat benzer 1. katman
	else if(týk4==2 && a == b4topdegeri)
	{
		týk4=2;
		button4.setBackgroundResource(R.drawable.besyuzmor);
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(týk4==1 && a == b4topdegeri)				
	{
			týk4=1;
			button4.setBackgroundResource(R.drawable.besyuzmorkatman);
			score41=score41+50;
			stopscore=score41+topscore+"";
			tscore41.setText(stopscore);
			 if(sayac<36){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test41.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
else  {týk4--;
	score41=score41-100;
stopscore=score41+topscore+"";
tscore41.setText(stopscore);
Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button5.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
	týk5++;
	if(týk5==3 && a == b5topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
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
		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	//fýrsat benzer 1. katman
	else if(týk5==2 && a == b5topdegeri)
	{
		týk5=2;
		button5.setBackgroundResource(R.drawable.besyuzmor);
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(týk5==1 && a == b5topdegeri)				
	{
			týk5=1;
			button5.setBackgroundResource(R.drawable.besyuzmorkatman);
			score41=score41+50;
			stopscore=score41+topscore+"";
			tscore41.setText(stopscore);
			 if(sayac<36){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test41.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
else  {týk5--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button6.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	if(a == b6topdegeri)
	{
		sayac++;
		score41=score41-100;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
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
		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score41=score41-200;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button7.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
	týk7++;
	if(týk7==3 && a == b7topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
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
		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	//fýrsat benzer 1. katman
	else if(týk7==2 && a == b7topdegeri)
	{
		týk7=2;
		button7.setBackgroundResource(R.drawable.besyuzmor);
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(týk7==1 && a == b7topdegeri)				
	{
			týk7=1;
			button7.setBackgroundResource(R.drawable.besyuzmorkatman);
			score41=score41+50;
			stopscore=score41+topscore+"";
			tscore41.setText(stopscore);
			 if(sayac<36){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test41.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
else  {týk7--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button8.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {		
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	if(a == b8topdegeri)
	{
		sayac++;
		score41=score41-100;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
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
		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score41=score41-200;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button9.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
	týk9++;
	if(týk9==3 && a == b9topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
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
		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	//fýrsat benzer 1. katman
	else if(týk9==2 && a == b9topdegeri)
	{
		týk9=2;
		button9.setBackgroundResource(R.drawable.besyuzmor);
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(týk9==1 && a == b9topdegeri)				
	{
			týk9=1;
			button9.setBackgroundResource(R.drawable.besyuzmorkatman);
			score41=score41+50;
			stopscore=score41+topscore+"";
			tscore41.setText(stopscore);
			 if(sayac<36){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test41.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
else  {týk9--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button10.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
	týk10++;
	if(týk10==3 && a == b10topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
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
		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	//fýrsat benzer 1. katman
	else if(týk10==2 && a == b10topdegeri)
	{
		týk10=2;
		button10.setBackgroundResource(R.drawable.besyuzmor);
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(týk10==1 && a == b10topdegeri)				
	{
			týk10=1;
			button10.setBackgroundResource(R.drawable.besyuzmorkatman);
			score41=score41+50;
			stopscore=score41+topscore+"";
			tscore41.setText(stopscore);
			 if(sayac<36){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test41.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
else  {týk10--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button11.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	if(a == b11topdegeri)
	{
		sayac++;
		score41=score41-100;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
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
		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score41=score41-200;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button12.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
	týk12++;
	if(týk12==3 && a == b12topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button12.setVisibility(View.INVISIBLE);									
		b13topdegeri--;
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		b17topdegeri--;
		b18topdegeri--;	
		b19topdegeri--;
		b20topdegeri--;
		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	//fýrsat benzer 1. katman
	else if(týk12==2 && a == b12topdegeri)
	{
		týk12=2;
		button12.setBackgroundResource(R.drawable.besyuzmor);
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(týk12==1 && a == b12topdegeri)				
	{
			týk12=1;
			button12.setBackgroundResource(R.drawable.besyuzmorkatman);
			score41=score41+50;
			stopscore=score41+topscore+"";
			tscore41.setText(stopscore);
			 if(sayac<36){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test41.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
else  {týk12--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button13.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
		týk13++;
		if(týk13==3 && a == b13topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button13.setVisibility(View.INVISIBLE);							
				
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		b17topdegeri--;
		b18topdegeri--;	
		b19topdegeri--;
		b20topdegeri--;
		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
		//fýrsat benzer 1. katman
		else if(týk13==2 && a == b13topdegeri)
		{
			týk13=2;
			button13.setBackgroundResource(R.drawable.besyuzmor);
			score41=score41+50;
			stopscore=score41+topscore+"";
			tscore41.setText(stopscore);
			 if(sayac<36){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test41.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
		}
		else if(týk13==1 && a == b13topdegeri)				
		{
				týk13=1;
				button13.setBackgroundResource(R.drawable.besyuzmorkatman);
				score41=score41+50;
				stopscore=score41+topscore+"";
				tscore41.setText(stopscore);
				 if(sayac<36){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test41.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
	}
else  {týk13--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button14.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
		týk14++;
		if(týk14==3 && a == b14topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button14.setVisibility(View.INVISIBLE);							
		
		b15topdegeri--;
		b16topdegeri--;
		b17topdegeri--;
		b18topdegeri--;	
		b19topdegeri--;
		b20topdegeri--;
		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
		//fýrsat benzer 1. katman
		else if(týk14==2 && a == b14topdegeri)
		{
			týk14=2;
			button14.setBackgroundResource(R.drawable.besyuzmor);
			score41=score41+50;
			stopscore=score41+topscore+"";
			tscore41.setText(stopscore);
			 if(sayac<36){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test41.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
		}
		else if(týk14==1 && a == b14topdegeri)				
		{
				týk14=1;
				button14.setBackgroundResource(R.drawable.besyuzmorkatman);
				score41=score41+50;
				stopscore=score41+topscore+"";
				tscore41.setText(stopscore);
				 if(sayac<36){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test41.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
	}
else  {týk14--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button15.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	if(a == b15topdegeri)
	{
		sayac++;
		score41=score41-100;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button15.setVisibility(View.INVISIBLE);							
		
		b16topdegeri--;
		b17topdegeri--;
		b18topdegeri--;	
		b19topdegeri--;
		b20topdegeri--;
		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score41=score41-200;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button16.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	if(a == b16topdegeri)
	{
		sayac++;
		score41=score41-100;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button16.setVisibility(View.INVISIBLE);		
		b17topdegeri--;
		b18topdegeri--;	
		b19topdegeri--;
		b20topdegeri--;
		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score41=score41-200;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button17.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
			týk17++;
			if(týk17==3 && a == b17topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button17.setVisibility(View.INVISIBLE);		
		b18topdegeri--;	
		b19topdegeri--;
		b20topdegeri--;
		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//fýrsat benzer 1. katman
			else if(týk17==2 && a == b17topdegeri)
			{
				týk17=2;
				button17.setBackgroundResource(R.drawable.besyuzmor);
				score41=score41+50;
				stopscore=score41+topscore+"";
				tscore41.setText(stopscore);
				 if(sayac<36){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test41.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(týk17==1 && a == b17topdegeri)				
			{
					týk17=1;
					button17.setBackgroundResource(R.drawable.besyuzmorkatman);
					score41=score41+50;
					stopscore=score41+topscore+"";
					tscore41.setText(stopscore);
					 if(sayac<36){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test41.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}
else  {týk17--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button18.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
			týk18++;
			if(týk18==3 && a == b18topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button18.setVisibility(View.INVISIBLE);			
		b19topdegeri--;
		b20topdegeri--;
		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//fýrsat benzer 1. katman
			else if(týk18==2 && a == b18topdegeri)
			{
				týk18=2;
				button18.setBackgroundResource(R.drawable.besyuzmor);
				score41=score41+50;
				stopscore=score41+topscore+"";
				tscore41.setText(stopscore);
				 if(sayac<36){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test41.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(týk18==1 && a == b18topdegeri)				
			{
					týk18=1;
					button18.setBackgroundResource(R.drawable.besyuzmorkatman);
					score41=score41+50;
					stopscore=score41+topscore+"";
					tscore41.setText(stopscore);
					 if(sayac<36){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test41.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}
else  {týk18--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button19.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
			týk19++;
			if(týk19==3 && a == b19topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button19.setVisibility(View.INVISIBLE);		

		b20topdegeri--;
		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else {
			 ScoreAl25();
	      }
}
			//fýrsat benzer 1. katman
			else if(týk19==2 && a == b19topdegeri)
			{
				týk19=2;
				button19.setBackgroundResource(R.drawable.besyuzmor);
				score41=score41+50;
				stopscore=score41+topscore+"";
				tscore41.setText(stopscore);
				 if(sayac<36){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test41.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(týk19==1 && a == b19topdegeri)				
			{
					týk19=1;
					button19.setBackgroundResource(R.drawable.besyuzmorkatman);
					score41=score41+50;
					stopscore=score41+topscore+"";
					tscore41.setText(stopscore);
					 if(sayac<36){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test41.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}
else  {týk19--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button20.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
			týk20++;
			if(týk20==3 && a == b20topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button20.setVisibility(View.INVISIBLE);		

		b21topdegeri--;
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//fýrsat benzer 1. katman
			else if(týk20==2 && a == b20topdegeri)
			{
				týk20=2;
				button20.setBackgroundResource(R.drawable.besyuzmor);
				score41=score41+50;
				stopscore=score41+topscore+"";
				tscore41.setText(stopscore);
				 if(sayac<36){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test41.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(týk20==1 && a == b20topdegeri)				
			{
					týk20=1;
					button20.setBackgroundResource(R.drawable.besyuzmorkatman);
					score41=score41+50;
					stopscore=score41+topscore+"";
					tscore41.setText(stopscore);
					 if(sayac<36){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test41.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}
else  {týk20--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button21.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	if(a == b21topdegeri)
	{
		sayac++;
		score41=score41-100;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button21.setVisibility(View.INVISIBLE);		
		b22topdegeri--;
		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score41=score41-200;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button22.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	if(a == b22topdegeri)
	{
		sayac++;
		score41=score41-100;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button22.setVisibility(View.INVISIBLE);		

		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score41=score41-200;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button23.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
				týk23++;
				if(týk23==3 && a == b23topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button23.setVisibility(View.INVISIBLE);		

		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//fýrsat benzer 1. katman
				else if(týk23==2 && a == b23topdegeri)
				{
					týk23=2;
					button23.setBackgroundResource(R.drawable.besyuzmor);
					score41=score41+50;
					stopscore=score41+topscore+"";
					tscore41.setText(stopscore);
					 if(sayac<36){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test41.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(týk23==1 && a == b23topdegeri)				
				{
						týk23=1;
						button23.setBackgroundResource(R.drawable.besyuzmorkatman);
						score41=score41+50;
						stopscore=score41+topscore+"";
						tscore41.setText(stopscore);
						 if(sayac<36){
					        	Random r=new Random(); //random sýnýfý
						        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
						        String gelensayi = a + "";				        
						        test41.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {týk23--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button24.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
				týk24++;
				if(týk24==3 && a == b24topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button24.setVisibility(View.INVISIBLE);		
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//fýrsat benzer 1. katman
				else if(týk24==2 && a == b24topdegeri)
				{
					týk24=2;
					button24.setBackgroundResource(R.drawable.besyuzmor);
					score41=score41+50;
					stopscore=score41+topscore+"";
					tscore41.setText(stopscore);
					 if(sayac<36){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test41.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(týk24==1 && a == b24topdegeri)				
				{
						týk24=1;
						button24.setBackgroundResource(R.drawable.besyuzmorkatman);
						score41=score41+50;
						stopscore=score41+topscore+"";
						tscore41.setText(stopscore);
						 if(sayac<36){
					        	Random r=new Random(); //random sýnýfý
						        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
						        String gelensayi = a + "";				        
						        test41.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {týk24--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button25.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
				týk25++;
				if(týk25==3 && a == b25topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button25.setVisibility(View.INVISIBLE);	
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;

		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//fýrsat benzer 1. katman
				else if(týk25==2 && a == b25topdegeri)
				{
					týk25=2;
					button25.setBackgroundResource(R.drawable.besyuzmor);
					score41=score41+50;
					stopscore=score41+topscore+"";
					tscore41.setText(stopscore);
					 if(sayac<36){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test41.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(týk25==1 && a == b25topdegeri)				
				{
						týk25=1;
						button25.setBackgroundResource(R.drawable.besyuzmorkatman);
						score41=score41+50;
						stopscore=score41+topscore+"";
						tscore41.setText(stopscore);
						 if(sayac<36){
					        	Random r=new Random(); //random sýnýfý
						        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
						        String gelensayi = a + "";				        
						        test41.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {týk25--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button26.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	if(a == b26topdegeri)
	{
		sayac++;
		score41=score41-100;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button26.setVisibility(View.INVISIBLE);	
	
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;

		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score41=score41-200;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button27.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
				týk27++;
				if(týk27==3 && a == b27topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button27.setVisibility(View.INVISIBLE);	
	
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;

		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//fýrsat benzer 1. katman
				else if(týk27==2 && a == b27topdegeri)
				{
					týk27=2;
					button27.setBackgroundResource(R.drawable.besyuzmor);
					score41=score41+50;
					stopscore=score41+topscore+"";
					tscore41.setText(stopscore);
					 if(sayac<36){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test41.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(týk27==1 && a == b27topdegeri)				
				{
						týk27=1;
						button27.setBackgroundResource(R.drawable.besyuzmorkatman);
						score41=score41+50;
						stopscore=score41+topscore+"";
						tscore41.setText(stopscore);
						 if(sayac<36){
					        	Random r=new Random(); //random sýnýfý
						        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
						        String gelensayi = a + "";				        
						        test41.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {týk27--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button28.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
				týk28++;
				if(týk28==3 && a == b28topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button28.setVisibility(View.INVISIBLE);	
	
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;

		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//fýrsat benzer 1. katman
				else if(týk28==2 && a == b28topdegeri)
				{
					týk28=2;
					button28.setBackgroundResource(R.drawable.besyuzmor);
					score41=score41+50;
					stopscore=score41+topscore+"";
					tscore41.setText(stopscore);
					 if(sayac<36){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test41.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(týk28==1 && a == b28topdegeri)				
				{
						týk28=1;
						button28.setBackgroundResource(R.drawable.besyuzmorkatman);
						score41=score41+50;
						stopscore=score41+topscore+"";
						tscore41.setText(stopscore);
						 if(sayac<36){
					        	Random r=new Random(); //random sýnýfý
						        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
						        String gelensayi = a + "";				        
						        test41.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {týk28--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button29.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	if(a == b29topdegeri)
	{
		sayac++;
		score41=score41-100;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button29.setVisibility(View.INVISIBLE);	
	
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;

		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score41=score41-200;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button30.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
				týk30++;
				if(týk30==3 && a == b30topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button30.setVisibility(View.INVISIBLE);		
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;

		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//fýrsat benzer 1. katman
				else if(týk30==2 && a == b30topdegeri)
				{
					týk30=2;
					button30.setBackgroundResource(R.drawable.besyuzmor);
					score41=score41+50;
					stopscore=score41+topscore+"";
					tscore41.setText(stopscore);
					 if(sayac<36){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test41.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(týk30==1 && a == b30topdegeri)				
				{
						týk30=1;
						button30.setBackgroundResource(R.drawable.besyuzmorkatman);
						score41=score41+50;
						stopscore=score41+topscore+"";
						tscore41.setText(stopscore);
						 if(sayac<36){
					        	Random r=new Random(); //random sýnýfý
						        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
						        String gelensayi = a + "";				        
						        test41.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {týk30--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button31.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	if(a == b31topdegeri)
	{
		sayac++;
		score41=score41-100;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button31.setVisibility(View.INVISIBLE);		
		
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;

		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score41=score41-200;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button32.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
				týk32++;
				if(týk32==3 && a == b32topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button32.setVisibility(View.INVISIBLE);		
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;

		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//fýrsat benzer 1. katman
				else if(týk32==2 && a == b32topdegeri)
				{
					týk32=2;
					button32.setBackgroundResource(R.drawable.besyuzmor);
					score41=score41+50;
					stopscore=score41+topscore+"";
					tscore41.setText(stopscore);
					 if(sayac<36){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test41.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(týk32==1 && a == b32topdegeri)				
				{
						týk32=1;
						button32.setBackgroundResource(R.drawable.besyuzmorkatman);
						score41=score41+50;
						stopscore=score41+topscore+"";
						tscore41.setText(stopscore);
						 if(sayac<36){
					        	Random r=new Random(); //random sýnýfý
						        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
						        String gelensayi = a + "";				        
						        test41.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {týk32--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button33.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
	týk33++;
	if(týk33==3 && a == b33topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button33.setVisibility(View.INVISIBLE);		

		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;

		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	//fýrsat benzer 1. katman
	else if(týk33==2 && a == b33topdegeri)
	{
		týk33=2;
		button33.setBackgroundResource(R.drawable.besyuzmor);
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(týk33==1 && a == b33topdegeri)				
	{
			týk33=1;
			button33.setBackgroundResource(R.drawable.besyuzmorkatman);
			score41=score41+50;
			stopscore=score41+topscore+"";
			tscore41.setText(stopscore);
			 if(sayac<36){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test41.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
else  {týk33--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button34.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
	týk34++;
	if(týk34==3 && a == b34topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button34.setVisibility(View.INVISIBLE);		
		b35topdegeri--;
		b36topdegeri--;

		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	//fýrsat benzer 1. katman
	else if(týk34==2 && a == b34topdegeri)
	{
		týk34=2;
		button34.setBackgroundResource(R.drawable.besyuzmor);
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(týk34==1 && a == b34topdegeri)				
	{
			týk34=1;
			button34.setBackgroundResource(R.drawable.besyuzmorkatman);
			score41=score41+50;
			stopscore=score41+topscore+"";
			tscore41.setText(stopscore);
			 if(sayac<36){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test41.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
else  {týk34--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button35.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
	týk35++;
	if(týk35==3 && a == b35topdegeri){
		sayac++;
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button35.setVisibility(View.INVISIBLE);		
		

		b36topdegeri--;

		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	//fýrsat benzer 1. katman
	else if(týk35==2 && a == b35topdegeri)
	{
		týk35=2;
		button35.setBackgroundResource(R.drawable.besyuzmor);
		score41=score41+50;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(týk35==1 && a == b35topdegeri)				
	{
			týk35=1;
			button35.setBackgroundResource(R.drawable.besyuzmorkatman);
			score41=score41+50;
			stopscore=score41+topscore+"";
			tscore41.setText(stopscore);
			 if(sayac<36){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test41.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
else  {týk35--;
	score41=score41-100;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button36.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	if(a == b36topdegeri)
	{
		sayac++;
		score41=score41-100;
		stopscore=score41+topscore+"";
		tscore41.setText(stopscore);
		
		button36.setVisibility(View.INVISIBLE);		
		 if(sayac<36){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(36-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test41.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
else  {
	score41=score41-200;
	stopscore=score41+topscore+"";
	tscore41.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
	}
	private void Scoreeksi(){
		 // score - ye dusunce	
if(score41+topscore<0)
{
	 // Restart
			 try {
			      Bundle extras = new Bundle();
			      extras.putInt(TOPSCORE, topscore);
			 
			      Intent intent = new Intent();
			 
			      intent.putExtras(extras);
			  
			      intent.setClass(getApplicationContext(), Gicike41.class);
			      startActivity(intent);
			      Gicike41.this.finish();
			  
			    } catch (Exception e) {
			      e.printStackTrace();
			    }
			 //	
}
	}
	private void ScoreAl25() {
		topscore = Integer.parseInt(tscore41.getText().toString().trim());
		// Save the text in SharedPreference
	  	sharedPreference.save(context, topscore,41);
	  	// Save the text in SharedPreference
	    try {
	      Bundle extras = new Bundle();
	      extras.putInt(TOPSCORE, topscore);
	      Intent intent = new Intent();
	 
	      intent.putExtras(extras);
	 
	      intent.setClass(getApplicationContext(), Gicike42.class);
	      startActivity(intent);
	      Gicike41.this.finish();
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
			 public void onFinish() {	 l0.setVisibility(View.INVISIBLE);	
				//süre bitince
				 FrameLayout container25=(FrameLayout)findViewById(R.id.container);
				 container25.setBackgroundResource(R.drawable.lose);	
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
				 button21.setVisibility(View.INVISIBLE);
				 button22.setVisibility(View.INVISIBLE);
				 button23.setVisibility(View.INVISIBLE);
				 button24.setVisibility(View.INVISIBLE);
				 button25.setVisibility(View.INVISIBLE);
				 button26.setVisibility(View.INVISIBLE);
				 button27.setVisibility(View.INVISIBLE);
				 button28.setVisibility(View.INVISIBLE);
				 button29.setVisibility(View.INVISIBLE);
				 button30.setVisibility(View.INVISIBLE);
				 button31.setVisibility(View.INVISIBLE);
				 button32.setVisibility(View.INVISIBLE);
				 button33.setVisibility(View.INVISIBLE);
				 button34.setVisibility(View.INVISIBLE);
				 button35.setVisibility(View.INVISIBLE);
				 button36.setVisibility(View.INVISIBLE);
				 //
			 }
			 @Override
			 public void onTick(long a) {
				 if(a / 1000==135) 
				  	{							  		
					  l1.setVisibility(View.INVISIBLE);					  					  		
				  	}
				  if(a / 1000==120) 
				  	{							  		
					  l2.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==105) 
				  	{							  		
					  l3.setVisibility(View.INVISIBLE);							  					  		
				  	}
				  if(a / 1000==90) 
				  	{							  		
					  l4.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==75) 
				  	{							  		
					  l5.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==60) 
				  	{	
					  l7.setBackgroundResource(R.drawable.besyuzkir);
					  l8.setBackgroundResource(R.drawable.besyuzkir);
					  l9.setBackgroundResource(R.drawable.besyuzkir);		
					  l0.setBackgroundResource(R.drawable.besyuzkir);
					  l6.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==45) 
				  	{						
					  l7.setVisibility(View.INVISIBLE);	
										  					  		
				  	}
				  if(a / 1000==30) 
				  	{		
					  l8.setVisibility(View.INVISIBLE);	
							  					  		
				  	}
				  if(a / 1000==15) 
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
