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

public class Gicike44 extends Activity implements FragmentManager.OnBackStackChangedListener {
	TextView l1,l2,l3,l4,l5,l6,l7,l8,l9,l0;
	  private Handler mHandler = new Handler();
	    private boolean mShowingBack = false;
	MediaPlayer yanlis;
	Button restart44,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,
	button17,button18,button19,button20,button21,button22,button23,button24,button25,button26,button27,button28,button29,button30,button31,button32,button33,button34,button35,button36,
	button37,button38,button39,button40,button41,button42;
	TextView test44;
	String stopscore;
	//zaman deðiþkenleri
	private CountDownTimer zaman;
	 private final long baslangic = 200 * 1000;
	 private final long bitis = 1 * 1000;
	//
	//sharedpreference database
			private SharedPreference sharedPreference;
			Activity context = this;
		//sharedpreference database
//	ver
	TextView tscore44;
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
	 int b37topdegeri=37;int týk37=0;
	 int b38topdegeri=38;int týk38=0;
	 int b39topdegeri=39;int týk39=0;
	 int b40topdegeri=40;int týk40=0;
	 int b41topdegeri=41;int týk41=0;
	 int b42topdegeri=42;int týk42=0;
	 
	 int sayac=0;
	 int sayac25=0;
	 int score44=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gicike44);
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
		test44=(TextView)findViewById(R.id.test44);
			
		yanlis=MediaPlayer.create(Gicike44.this,R.raw.yanlis);
		
		button1=(Button)findViewById(R.id.V2x1);
		button2=(Button)findViewById(R.id.V2x2);
		button3=(Button)findViewById(R.id.V2x3);
		button4=(Button)findViewById(R.id.V2x4);
		button5=(Button)findViewById(R.id.V2x5);
		button6=(Button)findViewById(R.id.V2x6);
		button7=(Button)findViewById(R.id.V2x7);
		button8=(Button)findViewById(R.id.V2x8);
		button9=(Button)findViewById(R.id.V2x9);
		button10=(Button)findViewById(R.id.V2x10);
		button11=(Button)findViewById(R.id.V2x11);
		button12=(Button)findViewById(R.id.V2x12);
		button13=(Button)findViewById(R.id.V2x13);
		button14=(Button)findViewById(R.id.V2x14);
		button15=(Button)findViewById(R.id.V2x15);
		button16=(Button)findViewById(R.id.V2x16);
		button17=(Button)findViewById(R.id.V2x17);
		button18=(Button)findViewById(R.id.V2x18);
		button19=(Button)findViewById(R.id.V2x19);
		button20=(Button)findViewById(R.id.V2x20);
		button21=(Button)findViewById(R.id.V2x21);
		button22=(Button)findViewById(R.id.V2x22);
		button23=(Button)findViewById(R.id.V2x23);
		button24=(Button)findViewById(R.id.V2x24);
		button25=(Button)findViewById(R.id.V2x25);
		button26=(Button)findViewById(R.id.V2x26);
		button27=(Button)findViewById(R.id.V2x27);
		button28=(Button)findViewById(R.id.V2x28);
		button29=(Button)findViewById(R.id.V2x29);
		button30=(Button)findViewById(R.id.V2x30);
		button31=(Button)findViewById(R.id.V2x31);
		button32=(Button)findViewById(R.id.V2x32);
		button33=(Button)findViewById(R.id.V2x33);
		button34=(Button)findViewById(R.id.V2x34);
		button35=(Button)findViewById(R.id.V2x35);
		button36=(Button)findViewById(R.id.V2x36);
		button37=(Button)findViewById(R.id.V2x37);
		button38=(Button)findViewById(R.id.V2x38);
		button39=(Button)findViewById(R.id.V2x39);
		button40=(Button)findViewById(R.id.V2x40);
		button41=(Button)findViewById(R.id.V2x41);
		button42=(Button)findViewById(R.id.V2x42);
		
//		zaman geri sayým
		  	zaman = new Zamanim(baslangic, bitis);
		 
			//
		
		
		  Random r=new Random(); //random sýnýfý
	        a=r.nextInt(42)+1; // 1-25 arasý sayýlarýn getirimi için 	(4 dahil)	
	        String gelensayi = a + "";				        
	        test44.setText(gelensayi);	
	        
	    	tscore44=(TextView)findViewById(R.id.score44);			 
	    	sharedPreference = new SharedPreference();
			topscore = sharedPreference.getValue(context);	
		    tscore44.setText(String.valueOf(topscore));

		    restart44=(Button)findViewById(R.id.restart44);
	        restart44.setOnClickListener(new View.OnClickListener() {			
	        	@Override
	        	public void onClick(View v) 
	        	{
	        		 // Restart
					 try {
					      Bundle extras = new Bundle();
					      extras.putInt(TOPSCORE, topscore);
					 
					      Intent intent = new Intent();
					 
					      intent.putExtras(extras);
					  
					      intent.setClass(getApplicationContext(), Gicike44.class);
					      startActivity(intent);
					      Gicike44.this.finish();
					  
					    } catch (Exception e) {
					      e.printStackTrace();
					    }
					 //	
	        	}
	        	})   ;	
	      //Ana menuye donus
		       Button back=(Button)findViewById(R.id.back44);
		        back.setOnClickListener(new View.OnClickListener() {			
		        	@Override
		        	public void onClick(View v) 
		        	{
		        		Intent intent = new Intent();	      	 
		      	      intent.setClass(getApplicationContext(), Ana.class);
		      	      startActivity(intent);
		      	      Gicike44.this.finish();
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
		score44=score44-100;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
		      
	        }
		 else{
			 ScoreAl25();
	      }
	}
	else 
	{
		score44=score44-200;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
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
	if(týk2==4 && a == b2topdegeri)
	{
		sayac++;
		score44=score44+40;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
if(sayac<42){
	Random r=new Random(); //random sýnýfý
	        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
	        String gelensayi = a + "";				        
	        test44.setText(gelensayi);
	      
}else{
	  ScoreAl25();
}
	}	
	//fýrsat benzer 1. katman
	else if(týk2==3 && a == b2topdegeri)
	{
		týk2=3;
		button2.setBackgroundResource(R.drawable.besyuzmavi);
		score44=score44+40;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(týk2==2 && a == b2topdegeri)
	{
		týk2=2;
		button2.setBackgroundResource(R.drawable.besyuzmavikatman);
		score44=score44+40;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(týk2==1 && a == b2topdegeri)				
	{
			týk2=1;
			button2.setBackgroundResource(R.drawable.besyuzmavikatman2);
			score44=score44+40;
			stopscore=score44+topscore+"";
			tscore44.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test44.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
	else {týk2--;
		score44=score44-80;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
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
	if(a == b3topdegeri)
	{
		sayac++;
		score44=score44+20;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
		       
	        }
		 else{
			 ScoreAl25();
	      }
	}				
else   {
	score44=score44-40;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
	if(týk4==4 && a == b4topdegeri)
	{
		sayac++;
		score44=score44+40;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	//fýrsat benzer 1. katman
		else if(týk4==3 && a == b4topdegeri)
		{
			týk4=3;
			button4.setBackgroundResource(R.drawable.besyuzmavi);
			score44=score44+40;
			stopscore=score44+topscore+"";
			tscore44.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test44.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
		}
		else if(týk4==2 && a == b4topdegeri)
		{
			týk4=2;
			button4.setBackgroundResource(R.drawable.besyuzmavikatman);
			score44=score44+40;
			stopscore=score44+topscore+"";
			tscore44.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test44.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
		}
		else if(týk4==1 && a == b4topdegeri)				
		{
				týk4=1;
				button4.setBackgroundResource(R.drawable.besyuzmavikatman2);
				score44=score44+40;
				stopscore=score44+topscore+"";
				tscore44.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test44.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
	}
else  {týk4--;
	score44=score44-80;
stopscore=score44+topscore+"";
tscore44.setText(stopscore);
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
	if(a == b5topdegeri)
	{
		sayac++;
		score44=score44+30;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score44=score44-60;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
	// 2.katman
				týk6++;
				if(týk6==4 && a == b6topdegeri)
				{
		sayac++;
		score44=score44+40;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//fýrsat benzer 1. katman
				else if(týk6==3 && a == b6topdegeri)
				{
					týk6=3;
					button6.setBackgroundResource(R.drawable.besyuzmavi);
					score44=score44+40;
					stopscore=score44+topscore+"";
					tscore44.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test44.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(týk6==2 && a == b6topdegeri)
				{
					týk6=2;
					button6.setBackgroundResource(R.drawable.besyuzmavikatman);
					score44=score44+40;
					stopscore=score44+topscore+"";
					tscore44.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test44.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(týk6==1 && a == b6topdegeri)				
				{
						týk6=1;
						button6.setBackgroundResource(R.drawable.besyuzmavikatman2);
						score44=score44+40;
						stopscore=score44+topscore+"";
						tscore44.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random sýnýfý
						        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
						        String gelensayi = a + "";				        
						        test44.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {týk6--;
	score44=score44-80;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
		score44=score44+50;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
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
			score44=score44+50;
			stopscore=score44+topscore+"";
			tscore44.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test44.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
		}
		else if(týk7==1 && a == b7topdegeri)				
		{
				týk7=1;
				button7.setBackgroundResource(R.drawable.besyuzmorkatman);
				score44=score44+50;
				stopscore=score44+topscore+"";
				tscore44.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test44.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
	}		
else  {týk7--;
	score44=score44-100;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
		score44=score44+10;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score44=score44-20;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
		score44=score44+50;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
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
				score44=score44+50;
				stopscore=score44+topscore+"";
				tscore44.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test44.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(týk9==1 && a == b9topdegeri)				
			{
					týk9=1;
					button9.setBackgroundResource(R.drawable.besyuzmorkatman);
					score44=score44+50;
					stopscore=score44+topscore+"";
					tscore44.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test44.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}		
else  {týk9--;
	score44=score44-200;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
	if(a == b10topdegeri)
	{
		sayac++;
		score44=score44-100;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score44=score44-200;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
	// 2.katman
			týk11++;
			if(týk11==3 && a == b11topdegeri){
		sayac++;
		score44=score44+50;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//fýrsat benzer 1. katman
			else if(týk11==2 && a == b11topdegeri)
			{
				týk11=2;
				button11.setBackgroundResource(R.drawable.besyuzmor);
				score44=score44+50;
				stopscore=score44+topscore+"";
				tscore44.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test44.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(týk11==1 && a == b11topdegeri)				
			{
					týk11=1;
					button11.setBackgroundResource(R.drawable.besyuzmorkatman);
					score44=score44+50;
					stopscore=score44+topscore+"";
					tscore44.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test44.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}		
else  {týk11--;
	score44=score44-100;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
	if(a == b12topdegeri)
	{
		sayac++;
		score44=score44+10;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score44=score44-20;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
	if(a == b13topdegeri)
	{
		sayac++;
		score44=score44-100;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score44=score44-200;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
		if(týk14==4 && a == b14topdegeri)
		{
		sayac++;
		score44=score44+20;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
		//fýrsat benzer 1. katman
				else if(týk14==3 && a == b14topdegeri)
				{
					týk14=3;
					button14.setBackgroundResource(R.drawable.besyuzsari);
					score44=score44+20;
					stopscore=score44+topscore+"";
					tscore44.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test44.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(týk14==2 && a == b14topdegeri)
				{
					týk14=2;
					button14.setBackgroundResource(R.drawable.besyuzsarikatman);
					score44=score44+20;
					stopscore=score44+topscore+"";
					tscore44.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test44.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(týk14==1 && a == b14topdegeri)				
				{
						týk14=1;
						button14.setBackgroundResource(R.drawable.besyuzsarikatman2);
						score44=score44+20;
						stopscore=score44+topscore+"";
						tscore44.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random sýnýfý
						        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
						        String gelensayi = a + "";				        
						        test44.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {týk14--;
	score44=score44-40;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
		score44=score44+30;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score44=score44-60;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
	// 2.katman
		týk16++;
		if(týk16==4 && a == b16topdegeri)
		{
		sayac++;
		score44=score44+20;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
		//fýrsat benzer 1. katman
		else if(týk16==3 && a == b16topdegeri)
		{
			týk16=3;
			button16.setBackgroundResource(R.drawable.besyuzsari);
			score44=score44+20;
			stopscore=score44+topscore+"";
			tscore44.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test44.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
		}
		else if(týk16==2 && a == b16topdegeri)
		{
			týk16=2;
			button16.setBackgroundResource(R.drawable.besyuzsarikatman);
			score44=score44+20;
			stopscore=score44+topscore+"";
			tscore44.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test44.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
		}
		else if(týk16==1 && a == b16topdegeri)				
		{
				týk16=1;
				button16.setBackgroundResource(R.drawable.besyuzsarikatman2);
				score44=score44+20;
				stopscore=score44+topscore+"";
				tscore44.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test44.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
	}
else  {týk16--;
	score44=score44-40;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
	if(a == b17topdegeri)
	{
		sayac++;
		score44=score44+40;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score44=score44-80;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
		if(týk18==4 && a == b18topdegeri)
		{
		sayac++;
		score44=score44+20;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
		//fýrsat benzer 1. katman
		else if(týk18==3 && a == b18topdegeri)
		{
			týk18=3;
			button18.setBackgroundResource(R.drawable.besyuzsari);
			score44=score44+20;
			stopscore=score44+topscore+"";
			tscore44.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test44.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
		}
		else if(týk18==2 && a == b18topdegeri)
		{
			týk18=2;
			button18.setBackgroundResource(R.drawable.besyuzsarikatman);
			score44=score44+20;
			stopscore=score44+topscore+"";
			tscore44.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random sýnýfý
			        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
			        String gelensayi = a + "";				        
			        test44.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
		}
		else if(týk18==1 && a == b18topdegeri)				
		{
				týk18=1;
				button18.setBackgroundResource(R.drawable.besyuzsarikatman2);
				score44=score44+20;
				stopscore=score44+topscore+"";
				tscore44.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test44.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
	}
else  {týk18--;
	score44=score44-40;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
		score44=score44+10;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else {
			 ScoreAl25();
	      }
}
			//fýrsat benzer 1. katman
			else if(týk19==2 && a == b19topdegeri)
			{
				týk19=2;
				button19.setBackgroundResource(R.drawable.besyuz);
				score44=score44+10;
				stopscore=score44+topscore+"";
				tscore44.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test44.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(týk19==1 && a == b19topdegeri)				
			{
					týk19=1;
					button19.setBackgroundResource(R.drawable.besyuzkatman);
					score44=score44+10;
					stopscore=score44+topscore+"";
					tscore44.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test44.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}		
else  {týk19--;
	score44=score44-20;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
	if(a == b20topdegeri)
	{
		sayac++;
		score44=score44+40;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score44=score44-80;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
	// 2.katman
			týk21++;
			if(týk21==3 && a == b21topdegeri){
		sayac++;
		score44=score44+10;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//fýrsat benzer 1. katman
			else if(týk21==2 && a == b21topdegeri)
			{
				týk21=2;
				button21.setBackgroundResource(R.drawable.besyuz);
				score44=score44+10;
				stopscore=score44+topscore+"";
				tscore44.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test44.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(týk21==1 && a == b21topdegeri)				
			{
					týk21=1;
					button21.setBackgroundResource(R.drawable.besyuzkatman);
					score44=score44+10;
					stopscore=score44+topscore+"";
					tscore44.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test44.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}	
else  {týk21--;
	score44=score44-20;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
		score44=score44+50;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score44=score44-100;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
		score44=score44+10;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//fýrsat benzer 1. katman
			else if(týk23==2 && a == b23topdegeri)
			{
				týk23=2;
				button23.setBackgroundResource(R.drawable.besyuz);
				score44=score44+10;
				stopscore=score44+topscore+"";
				tscore44.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test44.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(týk23==1 && a == b23topdegeri)				
			{
					týk23=1;
					button23.setBackgroundResource(R.drawable.besyuzkatman);
					score44=score44+10;
					stopscore=score44+topscore+"";
					tscore44.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test44.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}	
else  {týk23--;
	score44=score44-20;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
	if(a == b24topdegeri)
	{
		sayac++;
		score44=score44-100;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score44=score44-200;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
	if(a == b25topdegeri)
	{
		sayac++;
		score44=score44+20;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;

		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score44=score44-40;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
	// 2.katman
			týk26++;
			if(týk26==3 && a == b26topdegeri){
		sayac++;
		score44=score44+100;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;

		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//fýrsat benzer 1. katman
			else if(týk26==2 && a == b26topdegeri)
			{
				týk26=2;
				button26.setBackgroundResource(R.drawable.besyuzturuncu);
				score44=score44+100;
				stopscore=score44+topscore+"";
				tscore44.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test44.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(týk26==1 && a == b26topdegeri)				
			{
					týk26=1;
					button26.setBackgroundResource(R.drawable.besyuzturuncukatman);
					score44=score44+100;
					stopscore=score44+topscore+"";
					tscore44.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test44.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}	
else  {týk26--;
	score44=score44-200;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
	if(a == b27topdegeri)
	{
		sayac++;
		score44=score44-100;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
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
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;

		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score44=score44-200;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
		score44=score44+100;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
		button28.setVisibility(View.INVISIBLE);	
	
		b29topdegeri--;
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;

		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//fýrsat benzer 1. katman
			else if(týk28==2 && a == b28topdegeri)
			{
				týk28=2;
				button28.setBackgroundResource(R.drawable.besyuzturuncu);
				score44=score44+100;
				stopscore=score44+topscore+"";
				tscore44.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test44.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(týk28==1 && a == b28topdegeri)				
			{
					týk28=1;
					button28.setBackgroundResource(R.drawable.besyuzturuncukatman);
					score44=score44+100;
					stopscore=score44+topscore+"";
					tscore44.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test44.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}	
else  {týk28--;
	score44=score44-200;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
		score44=score44+30;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
		button29.setVisibility(View.INVISIBLE);	
	
		b30topdegeri--;
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;

		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score44=score44-60;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
		score44=score44+100;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
		button30.setVisibility(View.INVISIBLE);		
		b31topdegeri--;
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;

		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//fýrsat benzer 1. katman
			else if(týk30==2 && a == b30topdegeri)
			{
				týk30=2;
				button30.setBackgroundResource(R.drawable.besyuzturuncu);
				score44=score44+100;
				stopscore=score44+topscore+"";
				tscore44.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test44.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(týk30==1 && a == b30topdegeri)				
			{
					týk30=1;
					button30.setBackgroundResource(R.drawable.besyuzturuncukatman);
					score44=score44+100;
					stopscore=score44+topscore+"";
					tscore44.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test44.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}	
else  {týk30--;
	score44=score44-200;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
	// 2.katman
				týk31++;
				if(týk31==3 && a == b31topdegeri){
		sayac++;
		score44=score44+30;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
		button31.setVisibility(View.INVISIBLE);		
		
		b32topdegeri--;
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;

		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//fýrsat benzer 1. katman
				else if(týk31==2 && a == b31topdegeri)
				{
					týk31=2;
					button31.setBackgroundResource(R.drawable.besyuzyesil);
					score44=score44+30;
					stopscore=score44+topscore+"";
					tscore44.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test44.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(týk31==1 && a == b31topdegeri)				
				{
						týk31=1;
						button31.setBackgroundResource(R.drawable.besyuzyesilkatman);
						score44=score44+30;
						stopscore=score44+topscore+"";
						tscore44.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random sýnýfý
						        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
						        String gelensayi = a + "";				        
						        test44.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}	
else  {týk31--;
	score44=score44-60;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
	if(a == b32topdegeri)
	{
		sayac++;
		score44=score44+50;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
		button32.setVisibility(View.INVISIBLE);		
		b33topdegeri--;
		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;

		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score44=score44-100;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
		score44=score44+30;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
		button33.setVisibility(View.INVISIBLE);		

		b34topdegeri--;
		b35topdegeri--;
		b36topdegeri--;
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;

		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//fýrsat benzer 1. katman
				else if(týk33==2 && a == b33topdegeri)
				{
					týk33=2;
					button33.setBackgroundResource(R.drawable.besyuzyesil);
					score44=score44+30;
					stopscore=score44+topscore+"";
					tscore44.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test44.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(týk33==1 && a == b33topdegeri)				
				{
						týk33=1;
						button33.setBackgroundResource(R.drawable.besyuzyesilkatman);
						score44=score44+30;
						stopscore=score44+topscore+"";
						tscore44.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random sýnýfý
						        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
						        String gelensayi = a + "";				        
						        test44.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}	
else  {týk33--;
	score44=score44-60;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
	if(a == b34topdegeri)
	{
		sayac++;
		score44=score44+10;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
		button34.setVisibility(View.INVISIBLE);		
		b35topdegeri--;
		b36topdegeri--;
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;

		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score44=score44-20;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
		score44=score44+30;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
		button35.setVisibility(View.INVISIBLE);		
		

		b36topdegeri--;
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;

		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//fýrsat benzer 1. katman
				else if(týk35==2 && a == b35topdegeri)
				{
					týk35=2;
					button35.setBackgroundResource(R.drawable.besyuzyesil);
					score44=score44+30;
					stopscore=score44+topscore+"";
					tscore44.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test44.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(týk35==1 && a == b35topdegeri)				
				{
						týk35=1;
						button35.setBackgroundResource(R.drawable.besyuzyesilkatman);
						score44=score44+30;
						stopscore=score44+topscore+"";
						tscore44.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random sýnýfý
						        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
						        String gelensayi = a + "";				        
						        test44.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}	
else  {týk35--;
	score44=score44-60;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
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
		score44=score44+40;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
		button36.setVisibility(View.INVISIBLE);
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
else  {
	score44=score44-80;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button37.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	if(a == b37topdegeri)
	{
		sayac++;
		score44=score44-100;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
		button37.setVisibility(View.INVISIBLE);
		
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
else  {
	score44=score44-200;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button38.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
			týk38++;
			if(týk38==4 && a == b38topdegeri)
			{
		sayac++;
		score44=score44+40;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
		button38.setVisibility(View.INVISIBLE);
		
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//fýrsat benzer 1. katman
			else if(týk38==3 && a == b38topdegeri)
			{
				týk38=3;
				button38.setBackgroundResource(R.drawable.besyuzmavi);
				score44=score44+40;
				stopscore=score44+topscore+"";
				tscore44.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test44.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(týk38==2 && a == b38topdegeri)
			{
				týk38=2;
				button38.setBackgroundResource(R.drawable.besyuzmavikatman);
				score44=score44+40;
				stopscore=score44+topscore+"";
				tscore44.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test44.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(týk38==1 && a == b38topdegeri)				
			{
					týk38=1;
					button38.setBackgroundResource(R.drawable.besyuzmavikatman2);
					score44=score44+40;
					stopscore=score44+topscore+"";
					tscore44.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test44.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}
else  {týk38--;
	score44=score44-80;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button39.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	if(a == b39topdegeri)
	{
		sayac++;
		score44=score44+20;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
		button39.setVisibility(View.INVISIBLE);

		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
else  {
	score44=score44-40;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button40.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
			týk40++;
			if(týk40==4 && a == b40topdegeri)
			{
		sayac++;
		score44=score44+40;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
		button40.setVisibility(View.INVISIBLE);
	
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}//fýrsat benzer 1. katman
			else if(týk40==3 && a == b40topdegeri)
			{
				týk40=3;
				button40.setBackgroundResource(R.drawable.besyuzmavi);
				score44=score44+40;
				stopscore=score44+topscore+"";
				tscore44.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test44.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(týk40==2 && a == b40topdegeri)
			{
				týk40=2;
				button40.setBackgroundResource(R.drawable.besyuzmavikatman);
				score44=score44+40;
				stopscore=score44+topscore+"";
				tscore44.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random sýnýfý
				        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
				        String gelensayi = a + "";				        
				        test44.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(týk40==1 && a == b40topdegeri)				
			{
					týk40=1;
					button40.setBackgroundResource(R.drawable.besyuzmavikatman2);
					score44=score44+40;
					stopscore=score44+topscore+"";
					tscore44.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test44.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}
else  {týk40--;
	score44=score44-80;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button41.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	if(a == b41topdegeri)
	{
		sayac++;
		score44=score44+50;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
		button41.setVisibility(View.INVISIBLE);
	
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
else  {
	score44=score44-100;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button42.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
				týk42++;
				if(týk42==4 && a == b42topdegeri)
				{
		sayac++;
		score44=score44+40;
		stopscore=score44+topscore+"";
		tscore44.setText(stopscore);
		
		button42.setVisibility(View.INVISIBLE);

		 if(sayac<42){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test44.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}//fýrsat benzer 1. katman
				else if(týk42==3 && a == b42topdegeri)
				{
					týk42=3;
					button42.setBackgroundResource(R.drawable.besyuzmavi);
					score44=score44+40;
					stopscore=score44+topscore+"";
					tscore44.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test44.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(týk42==2 && a == b42topdegeri)
				{
					týk42=2;
					button42.setBackgroundResource(R.drawable.besyuzmavikatman);
					score44=score44+40;
					stopscore=score44+topscore+"";
					tscore44.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random sýnýfý
					        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
					        String gelensayi = a + "";				        
					        test44.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(týk42==1 && a == b42topdegeri)				
				{
						týk42=1;
						button42.setBackgroundResource(R.drawable.besyuzmavikatman2);
						score44=score44+40;
						stopscore=score44+topscore+"";
						tscore44.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random sýnýfý
						        a=r.nextInt(42-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
						        String gelensayi = a + "";				        
						        test44.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {týk42--;
	score44=score44-80;
	stopscore=score44+topscore+"";
	tscore44.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
	}
	private void Scoreeksi(){
		 // score - ye dusunce	
if(score44+topscore<0)
{
	 // Restart
			 try {
				 
			      Bundle extras = new Bundle();
			      extras.putInt(TOPSCORE, topscore);
			 
			      Intent intent = new Intent();
			 
			      intent.putExtras(extras);
			  
			      intent.setClass(getApplicationContext(), Gicike44.class);
			      startActivity(intent);
			      Gicike44.this.finish();
			  
			    } catch (Exception e) {
			      e.printStackTrace();
			    }
			 //	
}
	}
	private void ScoreAl25() {
		topscore = Integer.parseInt(tscore44.getText().toString().trim());
		// Save the text in SharedPreference
	  	sharedPreference.save(context, topscore,44);
	  	// Save the text in SharedPreference
	    try {
	      Bundle extras = new Bundle();
	      extras.putInt(TOPSCORE, topscore);
	      Intent intent = new Intent();
	 
	      intent.putExtras(extras);
	 
	      intent.setClass(getApplicationContext(), Gicike45.class);
	      startActivity(intent);
	      Gicike44.this.finish();
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
			 public void onFinish() { l0.setVisibility(View.INVISIBLE);	
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
				 button37.setVisibility(View.INVISIBLE);
				 button38.setVisibility(View.INVISIBLE);
				 button39.setVisibility(View.INVISIBLE);
				 button40.setVisibility(View.INVISIBLE);
				 button41.setVisibility(View.INVISIBLE);
				 button42.setVisibility(View.INVISIBLE);
				 //
			 }
			 @Override
			 public void onTick(long a) {
				 if(a / 1000==180) 
				  	{							  		
					  l1.setVisibility(View.INVISIBLE);					  					  		
				  	}
				  if(a / 1000==160) 
				  	{							  		
					  l2.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==140) 
				  	{							  		
					  l3.setVisibility(View.INVISIBLE);							  					  		
				  	}
				  if(a / 1000==120) 
				  	{							  		
					  l4.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==100) 
				  	{							  		
					  l5.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==80) 
				  	{	
					  l7.setBackgroundResource(R.drawable.besyuzkir);
					  l8.setBackgroundResource(R.drawable.besyuzkir);
					  l9.setBackgroundResource(R.drawable.besyuzkir);		
					  l0.setBackgroundResource(R.drawable.besyuzkir);
					  l6.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==60) 
				  	{						
					  l7.setVisibility(View.INVISIBLE);	
										  					  		
				  	}
				  if(a / 1000==40) 
				  	{		
					  l8.setVisibility(View.INVISIBLE);	
							  					  		
				  	}
				  if(a / 1000==20) 
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