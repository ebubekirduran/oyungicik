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

public class Gicikc20 extends Activity implements FragmentManager.OnBackStackChangedListener {
	TextView l1,l2,l3,l4,l5,l6,l7,l8,l9,l0;
	  private Handler mHandler = new Handler();
	    private boolean mShowingBack = false;
	MediaPlayer yanlis;
	Button restart20,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20;
	TextView test20;
	String stopscore;
	//zaman de�i�kenleri
	private CountDownTimer zaman;
	 private final long baslangic = 30 * 1000;
	 private final long bitis = 1 * 1000;
	//
	//sharedpreference database
			private SharedPreference sharedPreference;
			Activity context = this;
		//sharedpreference database
//	ver
	TextView tscore20;
	 private int topscore = 0;	 
	//al
	  public static String TOPSCORE  = "topscore";	
	//
	  
	int a;
	 int b1topdegeri=1; int t�k1=0;
	 int b2topdegeri=2;int t�k2=0;
	 int b3topdegeri=3;int t�k3=0;
	 int b4topdegeri=4;int t�k4=0;
	 int b5topdegeri=5;int t�k5=0;
	 int b6topdegeri=6;int t�k6=0;
	 int b7topdegeri=7;int t�k7=0;
	 int b8topdegeri=8;int t�k8=0;
	 int b9topdegeri=9;int t�k9=0;
	 int b10topdegeri=10;int t�k10=0;
	 int b11topdegeri=11;int t�k11=0;
	 int b12topdegeri=12;int t�k12=0;
	 int b13topdegeri=13;int t�k13=0;
	 int b14topdegeri=14;int t�k14=0;
	 int b15topdegeri=15;int t�k15=0;
	 int b16topdegeri=16;int t�k16=0;
	 int b17topdegeri=17;int t�k17=0;
	 int b18topdegeri=18;int t�k18=0;
	 int b19topdegeri=19;int t�k19=0;
	 int b20topdegeri=20;int t�k20=0;
	 
	 int sayac=0;
	 int sayac20=0;
	 int score20=0;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gicikc20);
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
		
		test20=(TextView)findViewById(R.id.test20);
			
		yanlis=MediaPlayer.create(Gicikc20.this,R.raw.yanlis);
		
		button1=(Button)findViewById(R.id.U1);
		button2=(Button)findViewById(R.id.U2);
		button3=(Button)findViewById(R.id.U3);
		button4=(Button)findViewById(R.id.U4);
		button5=(Button)findViewById(R.id.U5);
		button6=(Button)findViewById(R.id.U6);
		button7=(Button)findViewById(R.id.U7);
		button8=(Button)findViewById(R.id.U8);
		button9=(Button)findViewById(R.id.U9);
		button10=(Button)findViewById(R.id.U10);
		button11=(Button)findViewById(R.id.U11);
		button12=(Button)findViewById(R.id.U12);
		button13=(Button)findViewById(R.id.U13);
		button14=(Button)findViewById(R.id.U14);
		button15=(Button)findViewById(R.id.U15);
		button16=(Button)findViewById(R.id.U16);
		button17=(Button)findViewById(R.id.U17);
		button18=(Button)findViewById(R.id.U18);
		button19=(Button)findViewById(R.id.U19);
		button20=(Button)findViewById(R.id.U20);
		
//		zaman geri say�m
		  	zaman = new Zamanim(baslangic, bitis);
		  			  
			//
		
		
		  Random r=new Random(); //random s�n�f�
	        a=r.nextInt(20)+1; // 1-9 aras� say�lar�n getirimi i�in 	(4 dahil)	
	        String gelensayi = a + "";				        
	        test20.setText(gelensayi);	
	       	     
			
			tscore20=(TextView)findViewById(R.id.score20);			 
			sharedPreference = new SharedPreference();
			topscore = sharedPreference.getValue(context);	
		    tscore20.setText(String.valueOf(topscore));
		    
		    restart20=(Button)findViewById(R.id.restart20);
	        restart20.setOnClickListener(new View.OnClickListener() {			
	        	@Override
	        	public void onClick(View v) 
	        	{
	        		 // Restart
					 try {
					      Bundle extras = new Bundle();
					      extras.putInt(TOPSCORE, topscore);
					 
					      Intent intent = new Intent();
					 
					      intent.putExtras(extras);
					  
					      intent.setClass(getApplicationContext(), Gicikc20.class);
					      startActivity(intent);
					      Gicikc20.this.finish();
					  
					    } catch (Exception e) {
					      e.printStackTrace();
					    }
					 //	
	        	}
	        	})   ;	
	      //Ana menuye donus
		       Button back=(Button)findViewById(R.id.back20);
		        back.setOnClickListener(new View.OnClickListener() {			
		        	@Override
		        	public void onClick(View v) 
		        	{
		        		Intent intent = new Intent();	      	 
		      	      intent.setClass(getApplicationContext(), Ana.class);
		      	      startActivity(intent);
		      	      Gicikc20.this.finish();
		        	}});
button1.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) {	
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	if(a == b1topdegeri)
	{
		sayac++;
		score20=score20+20;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test20.setText(gelensayi);
		      
	        }
		 else{
			 ScoreAl15();
	      }
	}
	else 
	{
		score20=score20-40;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		Scoreeksi();
		yanlis.start();
		}				
}
})   ;
button2.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	// F�rsat Buttonu
	t�k2++;
	if(t�k2>=2){
			button2.setVisibility(View.INVISIBLE);
				score20=score20+30;// 5 puan fazladan ver 20+5
				stopscore=score20+topscore+"";
				tscore20.setText(stopscore);
				b2topdegeri=-1;
			}
	//
	else if(a == b2topdegeri)
	{
		t�k2=1;
		sayac++;
		score20=score20+10;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
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
	Random r=new Random(); //random s�n�f�
	        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
	        String gelensayi = a + "";				        
	        test20.setText(gelensayi);
	      
}else{
	  ScoreAl15();
}
	}				
	else {
		t�k2--;
		score20=score20-20;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		Scoreeksi();
		yanlis.start();
		}			
}
})   ;


button3.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) {
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	// F�rsat Buttonu
		t�k3++;
		if(t�k3>=2){
				button3.setVisibility(View.INVISIBLE);
					score20=score20+30;// 5 puan fazladan ver 20+5
					stopscore=score20+topscore+"";
					tscore20.setText(stopscore);
					b3topdegeri=-1;
				}
		//
		else if(a == b3topdegeri)
	{
		t�k3=1;
		sayac++;
		score20=score20+10;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test20.setText(gelensayi);
		       
	        }
		 else{
			 ScoreAl15();
	      }
	}				
else   {
	t�k3--;
	score20=score20-20;
	stopscore=score20+topscore+"";
	tscore20.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;


button4.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	if(a == b4topdegeri)
	{
		sayac++;
		score20=score20+20;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test20.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score20=score20-40;
	stopscore=score20+topscore+"";
	tscore20.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button5.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	if(a == b5topdegeri)
	{
		sayac++;
		score20=score20+20;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test20.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score20=score20-40;
	stopscore=score20+topscore+"";
	tscore20.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button6.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	// F�rsat Buttonu
		t�k6++;
		if(t�k6>=2){
				button6.setVisibility(View.INVISIBLE);
					score20=score20-100;// 5 puan fazladan ver 20+5
					stopscore=score20+topscore+"";
					tscore20.setText(stopscore);
					b6topdegeri=-1;
				}
		//
		else if(a == b6topdegeri)
	{
		t�k6=1;
		sayac++;
		score20=score20+20;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test20.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	t�k6--;
	score20=score20-40;
	stopscore=score20+topscore+"";
	tscore20.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button7.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	// F�rsat Buttonu
			t�k7++;
			if(t�k7>=2){
					button7.setVisibility(View.INVISIBLE);
						score20=score20-100;// 5 puan fazladan ver 20+5
						stopscore=score20+topscore+"";
						tscore20.setText(stopscore);
						b7topdegeri=-1;
					}
			//
			else if(a == b7topdegeri)
	{
		t�k7=1;
		sayac++;	
		score20=score20+20;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test20.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	t�k7--;
	score20=score20-40;
	stopscore=score20+topscore+"";
	tscore20.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button8.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	if(a == b8topdegeri)
	{
		sayac++;
		score20=score20+20;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test20.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score20=score20-40;
	stopscore=score20+topscore+"";
	tscore20.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button9.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	// F�rsat Buttonu
		t�k9++;
		if(t�k9>=2){
				button9.setVisibility(View.INVISIBLE);
					score20=score20+30;// 5 puan fazladan ver 20+5
					stopscore=score20+topscore+"";
					tscore20.setText(stopscore);
					b9topdegeri=-1;
				}
		//
		else if(a == b9topdegeri)
	{
		t�k9=1;
		sayac++;
		score20=score20+10;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test20.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	t�k9--;
	score20=score20-20;
	stopscore=score20+topscore+"";
	tscore20.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button10.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	// F�rsat Buttonu
			t�k10++;
			if(t�k10>=2){
					button10.setVisibility(View.INVISIBLE);
						score20=score20-100;// 5 puan fazladan ver 20+5
						stopscore=score20+topscore+"";
						tscore20.setText(stopscore);
						b10topdegeri=-1;
					}
			//
			else if(a == b10topdegeri)
	{
		t�k10=1;
		sayac++;
		score20=score20+20;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test20.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	t�k10--;
	score20=score20-40;
	stopscore=score20+topscore+"";
	tscore20.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button11.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	// F�rsat Buttonu
			t�k11++;
			if(t�k11>=2){
					button11.setVisibility(View.INVISIBLE);
						score20=score20-100;// 5 puan fazladan ver 20+5
						stopscore=score20+topscore+"";
						tscore20.setText(stopscore);
						b11topdegeri=-1;
					}
			//
			else if(a == b11topdegeri)
	{
		t�k11=1;
		sayac++;
		score20=score20+20;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test20.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	t�k11--;
	score20=score20-40;
	stopscore=score20+topscore+"";
	tscore20.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button12.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	// F�rsat Buttonu
		t�k12++;
		if(t�k12>=2){
				button12.setVisibility(View.INVISIBLE);
					score20=score20+30;// 5 puan fazladan ver 20+5
					stopscore=score20+topscore+"";
					tscore20.setText(stopscore);
					b12topdegeri=-1;
				}
		//
		else if(a == b12topdegeri)
	{
		t�k12=1;
		sayac++;
		score20=score20+10;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test20.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	t�k12--;
	score20=score20-20;
	stopscore=score20+topscore+"";
	tscore20.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button13.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	if(a == b13topdegeri)
	{
		sayac++;
		score20=score20+20;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
		button13.setVisibility(View.INVISIBLE);							
		
		b14topdegeri--;
		b15topdegeri--;
		b16topdegeri--;
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test20.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	score20=score20-40;
	stopscore=score20+topscore+"";
	tscore20.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button14.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	// F�rsat Buttonu
			t�k14++;
			if(t�k14>=2){
					button14.setVisibility(View.INVISIBLE);
						score20=score20-100;// 5 puan fazladan ver 20+5
						stopscore=score20+topscore+"";
						tscore20.setText(stopscore);
						b14topdegeri=-1;
					}
			//
			else if(a == b14topdegeri)
	{
		t�k14=1;
		sayac++;
		score20=score20+20;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
		button14.setVisibility(View.INVISIBLE);							
	
		b15topdegeri--;
		b16topdegeri--;
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test20.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	t�k14--;
	score20=score20-40;
	stopscore=score20+topscore+"";
	tscore20.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button15.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	// F�rsat Buttonu
			t�k15++;
			if(t�k15>=2){
					button15.setVisibility(View.INVISIBLE);
						score20=score20-100;// 5 puan fazladan ver 20+5
						stopscore=score20+topscore+"";
						tscore20.setText(stopscore);
						b15topdegeri=-1;
					}
			//
			else if(a == b15topdegeri)
	{
		t�k15=1;
		sayac++;
		score20=score20+20;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
		button15.setVisibility(View.INVISIBLE);							
		
		b16topdegeri--;
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test20.setText(gelensayi);
	        }
		 else{
			 ScoreAl15();
	      }
}
	
else  {
	t�k15--;
	score20=score20-40;
	stopscore=score20+topscore+"";
	tscore20.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button16.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	if(a == b16topdegeri)
	{
		sayac++;
		score20=score20+20;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
		button16.setVisibility(View.INVISIBLE);	
		b17topdegeri--;
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test20.setText(gelensayi);
	        }
		 else {
			 ScoreAl15();
	      }
}
	
else  {
	score20=score20-40;
	stopscore=score20+topscore+"";
	tscore20.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button17.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	if(a == b17topdegeri)
	{
		sayac++;
		score20=score20+20;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
		button17.setVisibility(View.INVISIBLE);	
	
		b18topdegeri--;
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test20.setText(gelensayi);
	        }
		 else {
			 ScoreAl15();
	      }
}
	
else  {
	score20=score20-40;
	stopscore=score20+topscore+"";
	tscore20.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button18.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	// F�rsat Buttonu
		t�k18++;
		if(t�k18>=2){
				button18.setVisibility(View.INVISIBLE);
					score20=score20+30;// 5 puan fazladan ver 20+5
					stopscore=score20+topscore+"";
					tscore20.setText(stopscore);
					b18topdegeri=-1;
				}
		//
		else if(a == b18topdegeri)
	{
		t�k18=1;
		sayac++;
		score20=score20+10;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
		button18.setVisibility(View.INVISIBLE);	
	
		b19topdegeri--;
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test20.setText(gelensayi);
	        }
		 else {
			 ScoreAl15();
	      }
}
	
else  {
	t�k18--;
	score20=score20-20;
	stopscore=score20+topscore+"";
	tscore20.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button19.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	// F�rsat Buttonu
		t�k19++;
		if(t�k19>=2){
				button19.setVisibility(View.INVISIBLE);
					score20=score20+30;// 5 puan fazladan ver 20+5
					stopscore=score20+topscore+"";
					tscore20.setText(stopscore);
					b19topdegeri=-1;
				}
		//
		else if(a == b19topdegeri)
	{
		t�k19=1;
		sayac++;
		score20=score20+10;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
		button19.setVisibility(View.INVISIBLE);	
		
		b20topdegeri--;
		 if(sayac<20){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test20.setText(gelensayi);
	        }
		 else {
			 ScoreAl15();
	      }
}
	
else  {
	t�k19--;
	score20=score20-20;
	stopscore=score20+topscore+"";
	tscore20.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button20.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac20++;
	if(sayac20==1){
		 zaman.start();
	 }
	if(a == b20topdegeri)
	{
		sayac++;
		score20=score20+20;
		stopscore=score20+topscore+"";
		tscore20.setText(stopscore);
		
		button20.setVisibility(View.INVISIBLE);								
		 if(sayac<20){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(20-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test20.setText(gelensayi);
	        }
		 else {
			 ScoreAl15();
	      }
}
	
else  {
	score20=score20-40;
	stopscore=score20+topscore+"";
	tscore20.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
	}
	private void Scoreeksi(){
		 // score - ye dusunce	
if(score20+topscore<0)
{
	 // Restart
			 try {
			      Bundle extras = new Bundle();
			      extras.putInt(TOPSCORE, topscore);
			 
			      Intent intent = new Intent();
			 
			      intent.putExtras(extras);
			  
			      intent.setClass(getApplicationContext(), Gicikc20.class);
			      startActivity(intent);
			      Gicikc20.this.finish();
			  
			    } catch (Exception e) {
			      e.printStackTrace();
			    }
			 //	
}
	}
	private void ScoreAl15() {
		topscore = Integer.parseInt(tscore20.getText().toString().trim());
		// Save the text in SharedPreference
	  	sharedPreference.save(context, topscore,20);
	  	// Save the text in SharedPreference
	    try {
	      Bundle extras = new Bundle();
	      extras.putInt(TOPSCORE, topscore);
	      Intent intent = new Intent();
	 
	      intent.putExtras(extras);
	 
	      intent.setClass(getApplicationContext(), Gicikc21.class);
	      startActivity(intent);
	      Gicikc20.this.finish();
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
				 button17.setVisibility(View.INVISIBLE);
				 button18.setVisibility(View.INVISIBLE);
				 button19.setVisibility(View.INVISIBLE);
				 button20.setVisibility(View.INVISIBLE);
				 //
			 }
			 @Override
			 public void onTick(long a) {
//				1 san�yel�k 2. f�rsat butonu		  
			  	if(a / 1000==15) // 10. san�yede olanlar
			  	{				  		
			  		if(t�k2==1){			  		
			  		button2.setBackgroundResource(R.drawable.besyuzyesil);	
				  	button2.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==14){ //9. san�yede olanlar
			  		if(t�k2>=1){
			  		button2.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 san�yel�k 3. f�rsat butonu		  
			  	if(a / 1000==9) // 10. san�yede olanlar
			  	{				  		
			  		if(t�k3==1){			  		
			  		button3.setBackgroundResource(R.drawable.besyuzyesil);	
				  	button3.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==8){ //9. san�yede olanlar
			  		if(t�k3>=1){
			  		button3.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 san�yel�k 9. f�rsat butonu		  
			  	if(a / 1000==11) // 10. san�yede olanlar
			  	{				  		
			  		if(t�k9==1){			  		
			  		button9.setBackgroundResource(R.drawable.besyuzyesil);	
				  	button9.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==10){ //9. san�yede olanlar
			  		if(t�k9>=1){
			  		button9.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 san�yel�k 12. f�rsat butonu		  
			  	if(a / 1000==5) // 10. san�yede olanlar
			  	{				  		
			  		if(t�k12==1){			  		
			  		button12.setBackgroundResource(R.drawable.besyuzyesil);	
				  	button12.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==4){ //9. san�yede olanlar
			  		if(t�k12>=1){
			  		button12.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 san�yel�k 18. f�rsat butonu		  
			  	if(a / 1000==7) // 10. san�yede olanlar
			  	{				  		
			  		if(t�k18==1){			  		
			  		button18.setBackgroundResource(R.drawable.besyuzyesil);	
				  	button18.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==6){ //9. san�yede olanlar
			  		if(t�k18>=1){
			  		button18.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 san�yel�k 19. f�rsat butonu		  
			  	if(a / 1000==13) // 10. san�yede olanlar
			  	{				  		
			  		if(t�k19==1){			  		
			  		button19.setBackgroundResource(R.drawable.besyuzyesil);	
				  	button19.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==12){ //9. san�yede olanlar
			  		if(t�k19>=1){
			  		button19.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
			  	//-------------------------------------- K�rm�z� bomb
//				1 san�yel�k 6. f�rsat butonu		  
			  	if(a / 1000==16) // 10. san�yede olanlar
			  	{				  		
			  		if(t�k6==1){			  		
			  		button6.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button6.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==14){ //9. san�yede olanlar
			  		if(t�k6>=1){
			  		button6.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 san�yel�k 7. f�rsat butonu		  
			  	if(a / 1000==5) // 10. san�yede olanlar
			  	{				  		
			  		if(t�k7==1){			  		
			  		button7.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button7.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==3){ //9. san�yede olanlar
			  		if(t�k7>=1){
			  		button7.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 san�yel�k 10. f�rsat butonu		  
			  	if(a / 1000==4) // 10. san�yede olanlar
			  	{				  		
			  		if(t�k10==1){			  		
			  		button10.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button10.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==2){ //9. san�yede olanlar
			  		if(t�k10>=1){
			  		button10.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 san�yel�k 11. f�rsat butonu		  
			  	if(a / 1000==6) // 10. san�yede olanlar
			  	{				  		
			  		if(t�k11==1){			  		
			  		button11.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button11.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==4){ //9. san�yede olanlar
			  		if(t�k11>=1){
			  		button11.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 san�yel�k 14. f�rsat butonu		  
			  	if(a / 1000==9) // 10. san�yede olanlar
			  	{				  		
			  		if(t�k14==1){			  		
			  		button14.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button14.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==7){ //9. san�yede olanlar
			  		if(t�k14>=1){
			  		button14.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 san�yel�k 15. f�rsat butonu		  
			  	if(a / 1000==12) // 10. san�yede olanlar
			  	{				  		
			  		if(t�k15==1){			  		
			  		button15.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button15.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==10){ //9. san�yede olanlar
			  		if(t�k15>=1){
			  		button15.setVisibility(View.INVISIBLE);
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
