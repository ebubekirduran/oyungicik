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

public class Gicikd33 extends Activity implements FragmentManager.OnBackStackChangedListener {
	TextView l1,l2,l3,l4,l5,l6,l7,l8,l9,l0;
	  private Handler mHandler = new Handler();
	    private boolean mShowingBack = false;
	MediaPlayer yanlis;
	Button restart33,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,
	button17,button18,button19,button20,button21,button22,button23,button24,button25,button26,button27,button28,button29,button30;
	TextView test33;
	String stopscore;
	//zaman de�i�kenleri
	private CountDownTimer zaman;
	 private final long baslangic = 100 * 1000;
	 private final long bitis = 1 * 1000;
	//
	//sharedpreference database
			private SharedPreference sharedPreference;
			Activity context = this;
		//sharedpreference database
//	ver
	TextView tscore33;
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
	 int b21topdegeri=21;int t�k21=0;
	 int b22topdegeri=22;int t�k22=0;
	 int b23topdegeri=23;int t�k23=0;
	 int b24topdegeri=24;int t�k24=0;
	 int b25topdegeri=25;int t�k25=0;
	 int b26topdegeri=26;int t�k26=0;
	 int b27topdegeri=27;int t�k27=0;
	 int b28topdegeri=28;int t�k28=0;
	 int b29topdegeri=29;int t�k29=0;
	 int b30topdegeri=30;int t�k30=0;
	 
	 int sayac=0;
	 int sayac25=0;
	 int score33=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gicikd33);
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
		test33=(TextView)findViewById(R.id.test33);
			
		yanlis=MediaPlayer.create(Gicikd33.this,R.raw.yanlis);
		
		button1=(Button)findViewById(R.id.J2x1);
		button2=(Button)findViewById(R.id.J2x2);
		button3=(Button)findViewById(R.id.J2x3);
		button4=(Button)findViewById(R.id.J2x4);
		button5=(Button)findViewById(R.id.J2x5);
		button6=(Button)findViewById(R.id.J2x6);
		button7=(Button)findViewById(R.id.J2x7);
		button8=(Button)findViewById(R.id.J2x8);
		button9=(Button)findViewById(R.id.J2x9);
		button10=(Button)findViewById(R.id.J2x10);
		button11=(Button)findViewById(R.id.J2x11);
		button12=(Button)findViewById(R.id.J2x12);
		button13=(Button)findViewById(R.id.J2x13);
		button14=(Button)findViewById(R.id.J2x14);
		button15=(Button)findViewById(R.id.J2x15);
		button16=(Button)findViewById(R.id.J2x16);
		button17=(Button)findViewById(R.id.J2x17);
		button18=(Button)findViewById(R.id.J2x18);
		button19=(Button)findViewById(R.id.J2x19);
		button20=(Button)findViewById(R.id.J2x20);
		button21=(Button)findViewById(R.id.J2x21);
		button22=(Button)findViewById(R.id.J2x22);
		button23=(Button)findViewById(R.id.J2x23);
		button24=(Button)findViewById(R.id.J2x24);
		button25=(Button)findViewById(R.id.J2x25);
		button26=(Button)findViewById(R.id.J2x26);
		button27=(Button)findViewById(R.id.J2x27);
		button28=(Button)findViewById(R.id.J2x28);
		button29=(Button)findViewById(R.id.J2x29);
		button30=(Button)findViewById(R.id.J2x30);
		
//		zaman geri say�m
		  	zaman = new Zamanim(baslangic, bitis);
		 
			//
		
		
		  Random r=new Random(); //random s�n�f�
	        a=r.nextInt(30)+1; // 1-25 aras� say�lar�n getirimi i�in 	(4 dahil)	
	        String gelensayi = a + "";				        
	        test33.setText(gelensayi);	
	        
	    	tscore33=(TextView)findViewById(R.id.score33);			 
	    	sharedPreference = new SharedPreference();
			topscore = sharedPreference.getValue(context);	
		    tscore33.setText(String.valueOf(topscore));

		    restart33=(Button)findViewById(R.id.restart33);
	        restart33.setOnClickListener(new View.OnClickListener() {			
	        	@Override
	        	public void onClick(View v) 
	        	{
	        		 // Restart
					 try {
					      Bundle extras = new Bundle();
					      extras.putInt(TOPSCORE, topscore);
					 
					      Intent intent = new Intent();
					 
					      intent.putExtras(extras);
					  
					      intent.setClass(getApplicationContext(), Gicikd33.class);
					      startActivity(intent);
					      Gicikd33.this.finish();
					  
					    } catch (Exception e) {
					      e.printStackTrace();
					    }
					 //	
	        	}
	        	})   ;	
	        //Ana menuye donus
		       Button back=(Button)findViewById(R.id.back33);
		        back.setOnClickListener(new View.OnClickListener() {			
		        	@Override
		        	public void onClick(View v) 
		        	{
		        		Intent intent = new Intent();	      	 
		      	      intent.setClass(getApplicationContext(), Ana.class);
		      	      startActivity(intent);
		      	      Gicikd33.this.finish();
		        	}});
button1.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) {	
	sayac25++;
	if(sayac25==1){
		 zaman.start();
	 }
	// 2.katman
		t�k1++;
		if(t�k1==3 && a == b1topdegeri){
		sayac++;
		score33=score33+10;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
		      
	        }
		 else{
			 ScoreAl25();
	      }
	}
		//f�rsat benzer 1. katman
		else if(t�k1==2 && a == b1topdegeri)
		{
			t�k1=2;
			button1.setBackgroundResource(R.drawable.besyuz);
			score33=score33+10;
			stopscore=score33+topscore+"";
			tscore33.setText(stopscore);
			 if(sayac<30){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test33.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
		}
		else if(t�k1==1 && a == b1topdegeri)				
		{
				t�k1=1;
				button1.setBackgroundResource(R.drawable.besyuzkatman);
				score33=score33+10;
				stopscore=score33+topscore+"";
				tscore33.setText(stopscore);
				 if(sayac<30){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test33.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
		}
	else 
	{t�k1--;
		score33=score33-20;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
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
			t�k2++;
			if(t�k2==3 && a == b2topdegeri){
		sayac++;
		score33=score33+30;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
if(sayac<30){
	Random r=new Random(); //random s�n�f�
	        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
	        String gelensayi = a + "";				        
	        test33.setText(gelensayi);
	      
}else{
	  ScoreAl25();
}
	}	
			//f�rsat benzer 1. katman
			else if(t�k2==2 && a == b2topdegeri)
			{
				t�k2=2;
				button2.setBackgroundResource(R.drawable.besyuzyesil);
				score33=score33+30;
				stopscore=score33+topscore+"";
				tscore33.setText(stopscore);
				 if(sayac<30){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test33.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k2==1 && a == b2topdegeri)				
			{
					t�k2=1;
					button2.setBackgroundResource(R.drawable.besyuzyesilkatman);
					score33=score33+30;
					stopscore=score33+topscore+"";
					tscore33.setText(stopscore);
					 if(sayac<30){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test33.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
			}
	else {t�k2--;
		score33=score33-60;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
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
	//f�rsat benzer 
			t�k3++;
			if(t�k3>=2 && a == b3topdegeri){
		sayac++;
		score33=score33+40;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
		       
	        }
		 else{
			 ScoreAl25();
	      }
	}	
	else if(a == b3topdegeri)
	{
		t�k3=1;
		button3.setBackgroundResource(R.drawable.besyuzmavi);
		score33=score33+40;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
}
else   {t�k3--;
	score33=score33-80;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
			t�k4++;
			if(t�k4==3 && a == b4topdegeri){
		sayac++;
		score33=score33+30;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k4==2 && a == b4topdegeri)
			{
				t�k4=2;
				button4.setBackgroundResource(R.drawable.besyuzyesil);
				score33=score33+30;
				stopscore=score33+topscore+"";
				tscore33.setText(stopscore);
				 if(sayac<30){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test33.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k4==1 && a == b4topdegeri)				
			{
					t�k4=1;
					button4.setBackgroundResource(R.drawable.besyuzyesilkatman);
					score33=score33+30;
					stopscore=score33+topscore+"";
					tscore33.setText(stopscore);
					 if(sayac<30){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test33.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
			}
else  {t�k4--;
	score33=score33-60;
stopscore=score33+topscore+"";
tscore33.setText(stopscore);
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
			t�k5++;
			if(t�k5==3 && a == b5topdegeri){
		sayac++;
		score33=score33+10;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k5==2 && a == b5topdegeri)
			{
				t�k5=2;
				button5.setBackgroundResource(R.drawable.besyuz);
				score33=score33+10;
				stopscore=score33+topscore+"";
				tscore33.setText(stopscore);
				 if(sayac<30){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test33.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k5==1 && a == b5topdegeri)				
			{
					t�k5=1;
					button5.setBackgroundResource(R.drawable.besyuzkatman);
					score33=score33+10;
					stopscore=score33+topscore+"";
					tscore33.setText(stopscore);
					 if(sayac<30){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test33.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
			}
else  {t�k5--;
	score33=score33-20;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
		score33=score33+10;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score33=score33-20;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
			t�k7++;
			if(t�k7==3 && a == b7topdegeri){
		sayac++;
		score33=score33+30;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k7==2 && a == b7topdegeri)
			{
				t�k7=2;
				button7.setBackgroundResource(R.drawable.besyuzyesil);
				score33=score33+30;
				stopscore=score33+topscore+"";
				tscore33.setText(stopscore);
				 if(sayac<30){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test33.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k7==1 && a == b7topdegeri)				
			{
					t�k7=1;
					button7.setBackgroundResource(R.drawable.besyuzyesilkatman);
					score33=score33+30;
					stopscore=score33+topscore+"";
					tscore33.setText(stopscore);
					 if(sayac<30){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test33.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
			}
else  {t�k7--;
	score33=score33-60;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
		score33=score33+10;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score33=score33-20;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
			t�k9++;
			if(t�k9==3 && a == b9topdegeri){
		sayac++;
		score33=score33+30;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k9==2 && a == b9topdegeri)
			{
				t�k9=2;
				button9.setBackgroundResource(R.drawable.besyuzyesil);
				score33=score33+30;
				stopscore=score33+topscore+"";
				tscore33.setText(stopscore);
				 if(sayac<30){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test33.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k9==1 && a == b9topdegeri)				
			{
					t�k9=1;
					button9.setBackgroundResource(R.drawable.besyuzyesilkatman);
					score33=score33+30;
					stopscore=score33+topscore+"";
					tscore33.setText(stopscore);
					 if(sayac<30){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test33.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
			}
else  {t�k9--;
	score33=score33-60;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
		score33=score33+10;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score33=score33-20;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
			t�k11++;
			if(t�k11==3 && a == b11topdegeri){
		sayac++;
		score33=score33+40;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k11==2 && a == b11topdegeri)
			{
				t�k11=2;
				button11.setBackgroundResource(R.drawable.besyuzmavi);
				score33=score33+40;
				stopscore=score33+topscore+"";
				tscore33.setText(stopscore);
				 if(sayac<30){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test33.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k11==1 && a == b11topdegeri)				
			{
					t�k11=1;
					button11.setBackgroundResource(R.drawable.besyuzmavikatman);
					score33=score33+40;
					stopscore=score33+topscore+"";
					tscore33.setText(stopscore);
					 if(sayac<30){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test33.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
			}
else  {t�k11--;
	score33=score33-80;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
		score33=score33+10;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score33=score33-20;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
			t�k13++;
			if(t�k13==3 && a == b13topdegeri){
		sayac++;
		score33=score33+20;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k13==2 && a == b13topdegeri)
			{
				t�k13=2;
				button13.setBackgroundResource(R.drawable.besyuzsari);
				score33=score33+20;
				stopscore=score33+topscore+"";
				tscore33.setText(stopscore);
				 if(sayac<30){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test33.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k13==1 && a == b13topdegeri)				
			{
					t�k13=1;
					button13.setBackgroundResource(R.drawable.besyuzsarikatman);
					score33=score33+20;
					stopscore=score33+topscore+"";
					tscore33.setText(stopscore);
					 if(sayac<30){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test33.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
			}
else  {t�k13--;
	score33=score33-40;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
	if(a == b14topdegeri)
	{
		sayac++;
		score33=score33+10;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score33=score33-20;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
	// 2.katman
			t�k15++;
			if(t�k15==3 && a == b15topdegeri){
		sayac++;
		score33=score33+40;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k15==2 && a == b15topdegeri)
			{
				t�k15=2;
				button15.setBackgroundResource(R.drawable.besyuzmavi);
				score33=score33+40;
				stopscore=score33+topscore+"";
				tscore33.setText(stopscore);
				 if(sayac<30){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test33.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k15==1 && a == b15topdegeri)				
			{
					t�k15=1;
					button15.setBackgroundResource(R.drawable.besyuzmavikatman);
					score33=score33+40;
					stopscore=score33+topscore+"";
					tscore33.setText(stopscore);
					 if(sayac<30){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test33.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
			}
else  {t�k15--;
	score33=score33-80;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
			t�k16++;
			if(t�k16==3 && a == b16topdegeri){
		sayac++;
		score33=score33+40;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k16==2 && a == b16topdegeri)
			{
				t�k16=2;
				button16.setBackgroundResource(R.drawable.besyuzmavi);
				score33=score33+40;
				stopscore=score33+topscore+"";
				tscore33.setText(stopscore);
				 if(sayac<30){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test33.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k16==1 && a == b16topdegeri)				
			{
					t�k16=1;
					button16.setBackgroundResource(R.drawable.besyuzmavikatman);
					score33=score33+40;
					stopscore=score33+topscore+"";
					tscore33.setText(stopscore);
					 if(sayac<30){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test33.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
			}
else  {t�k16--;
	score33=score33-80;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
		score33=score33+10;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score33=score33-20;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
			t�k18++;
			if(t�k18==3 && a == b18topdegeri){
		sayac++;
		score33=score33+20;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k18==2 && a == b18topdegeri)
			{
				t�k18=2;
				button18.setBackgroundResource(R.drawable.besyuzsari);
				score33=score33+20;
				stopscore=score33+topscore+"";
				tscore33.setText(stopscore);
				 if(sayac<30){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test33.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k18==1 && a == b18topdegeri)				
			{
					t�k18=1;
					button18.setBackgroundResource(R.drawable.besyuzsarikatman);
					score33=score33+20;
					stopscore=score33+topscore+"";
					tscore33.setText(stopscore);
					 if(sayac<30){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test33.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
			}
else  {t�k18--;
	score33=score33-40;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
	if(a == b19topdegeri)
	{
		sayac++;
		score33=score33+10;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else {
			 ScoreAl25();
	      }
}
	
else  {
	score33=score33-20;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
			t�k20++;
			if(t�k20==3 && a == b20topdegeri){
		sayac++;
		score33=score33+40;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k20==2 && a == b20topdegeri)
			{
				t�k20=2;
				button20.setBackgroundResource(R.drawable.besyuzmavi);
				score33=score33+40;
				stopscore=score33+topscore+"";
				tscore33.setText(stopscore);
				 if(sayac<30){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test33.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k20==1 && a == b20topdegeri)				
			{
					t�k20=1;
					button20.setBackgroundResource(R.drawable.besyuzmavikatman);
					score33=score33+40;
					stopscore=score33+topscore+"";
					tscore33.setText(stopscore);
					 if(sayac<30){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test33.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
			}
else  {t�k20--;
	score33=score33-80;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
		score33=score33+10;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
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
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score33=score33-20;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
	// 2.katman
				t�k22++;
				if(t�k22==3 && a == b22topdegeri){
		sayac++;
		score33=score33+30;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
		button22.setVisibility(View.INVISIBLE);		

		b23topdegeri--;
		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//f�rsat benzer 1. katman
				else if(t�k22==2 && a == b22topdegeri)
				{
					t�k22=2;
					button22.setBackgroundResource(R.drawable.besyuzyesil);
					score33=score33+30;
					stopscore=score33+topscore+"";
					tscore33.setText(stopscore);
					 if(sayac<30){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test33.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k22==1 && a == b22topdegeri)				
				{
						t�k22=1;
						button22.setBackgroundResource(R.drawable.besyuzyesilkatman);
						score33=score33+30;
						stopscore=score33+topscore+"";
						tscore33.setText(stopscore);
						 if(sayac<30){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test33.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
				}
else  {t�k22--;
	score33=score33-60;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
	if(a == b23topdegeri)
	{
		sayac++;
		score33=score33+10;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
		button23.setVisibility(View.INVISIBLE);		

		b24topdegeri--;
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score33=score33-20;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
				t�k24++;
				if(t�k24==3 && a == b24topdegeri){
		sayac++;
		score33=score33+30;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
		button24.setVisibility(View.INVISIBLE);		
		b25topdegeri--;
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;
		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//f�rsat benzer 1. katman
				else if(t�k24==2 && a == b24topdegeri)
				{
					t�k24=2;
					button24.setBackgroundResource(R.drawable.besyuzyesil);
					score33=score33+30;
					stopscore=score33+topscore+"";
					tscore33.setText(stopscore);
					 if(sayac<30){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test33.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k24==1 && a == b24topdegeri)				
				{
						t�k24=1;
						button24.setBackgroundResource(R.drawable.besyuzyesilkatman);
						score33=score33+30;
						stopscore=score33+topscore+"";
						tscore33.setText(stopscore);
						 if(sayac<30){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test33.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
				}
else  {t�k24--;
	score33=score33-60;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
		score33=score33+10;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
		button25.setVisibility(View.INVISIBLE);	
		b26topdegeri--;
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;

		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	
else  {
	score33=score33-20;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
				t�k26++;
				if(t�k26==3 && a == b26topdegeri){
		sayac++;
		score33=score33+10;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
		button26.setVisibility(View.INVISIBLE);	
	
		b27topdegeri--;
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;

		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//f�rsat benzer 1. katman
				else if(t�k26==2 && a == b26topdegeri)
				{
					t�k26=2;
					button26.setBackgroundResource(R.drawable.besyuz);
					score33=score33+10;
					stopscore=score33+topscore+"";
					tscore33.setText(stopscore);
					 if(sayac<30){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test33.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k26==1 && a == b26topdegeri)				
				{
						t�k26=1;
						button26.setBackgroundResource(R.drawable.besyuzkatman);
						score33=score33+10;
						stopscore=score33+topscore+"";
						tscore33.setText(stopscore);
						 if(sayac<30){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test33.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
				}
else  {t�k26--;
	score33=score33-20;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
				t�k27++;
				if(t�k27==3 && a == b27topdegeri){
		sayac++;
		score33=score33+30;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
		button27.setVisibility(View.INVISIBLE);	
	
		b28topdegeri--;
		b29topdegeri--;
		b30topdegeri--;

		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//f�rsat benzer 1. katman
				else if(t�k27==2 && a == b27topdegeri)
				{
					t�k27=2;
					button27.setBackgroundResource(R.drawable.besyuzyesil);
					score33=score33+30;
					stopscore=score33+topscore+"";
					tscore33.setText(stopscore);
					 if(sayac<30){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test33.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k27==1 && a == b27topdegeri)				
				{
						t�k27=1;
						button27.setBackgroundResource(R.drawable.besyuzyesilkatman);
						score33=score33+30;
						stopscore=score33+topscore+"";
						tscore33.setText(stopscore);
						 if(sayac<30){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test33.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
				}
else  {t�k27--;
	score33=score33-60;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
	//f�rsat benzer 
			t�k28++;
			if(t�k28>=2 && a == b28topdegeri){
		sayac++;
		score33=score33+40;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
		button28.setVisibility(View.INVISIBLE);	
	
		b29topdegeri--;
		b30topdegeri--;

		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			else if(a == b28topdegeri)
			{
				t�k28=1;
				button28.setBackgroundResource(R.drawable.besyuzmavi);
				score33=score33+40;
				stopscore=score33+topscore+"";
				tscore33.setText(stopscore);
				 if(sayac<30){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test33.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
		}
			
else  {t�k28--;
	score33=score33-80;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
	// 2.katman
				t�k29++;
				if(t�k29==3 && a == b29topdegeri){
		sayac++;
		score33=score33+30;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
		button29.setVisibility(View.INVISIBLE);	
	
		b30topdegeri--;

		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//f�rsat benzer 1. katman
				else if(t�k29==2 && a == b29topdegeri)
				{
					t�k29=2;
					button29.setBackgroundResource(R.drawable.besyuzyesil);
					score33=score33+30;
					stopscore=score33+topscore+"";
					tscore33.setText(stopscore);
					 if(sayac<30){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test33.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k29==1 && a == b29topdegeri)				
				{
						t�k29=1;
						button29.setBackgroundResource(R.drawable.besyuzyesilkatman);
						score33=score33+30;
						stopscore=score33+topscore+"";
						tscore33.setText(stopscore);
						 if(sayac<30){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test33.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
				}
else  {t�k29--;
	score33=score33-60;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
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
				t�k30++;
				if(t�k30==3 && a == b30topdegeri){
		sayac++;
		score33=score33+10;
		stopscore=score33+topscore+"";
		tscore33.setText(stopscore);
		
		button30.setVisibility(View.INVISIBLE);		

		 if(sayac<30){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test33.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//f�rsat benzer 1. katman
				else if(t�k30==2 && a == b30topdegeri)
				{
					t�k30=2;
					button30.setBackgroundResource(R.drawable.besyuz);
					score33=score33+10;
					stopscore=score33+topscore+"";
					tscore33.setText(stopscore);
					 if(sayac<30){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test33.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k30==1 && a == b30topdegeri)				
				{
						t�k30=1;
						button30.setBackgroundResource(R.drawable.besyuzkatman);
						score33=score33+10;
						stopscore=score33+topscore+"";
						tscore33.setText(stopscore);
						 if(sayac<30){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(30-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test33.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
				}
else  {t�k30--;
	score33=score33-20;
	stopscore=score33+topscore+"";
	tscore33.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
	}
	private void Scoreeksi(){
		 // score - ye dusunce	
if(score33+topscore<0)
{
	 // Restart
			 try {
			      Bundle extras = new Bundle();
			      extras.putInt(TOPSCORE, topscore);
			 
			      Intent intent = new Intent();
			 
			      intent.putExtras(extras);
			  
			      intent.setClass(getApplicationContext(), Gicikd33.class);
			      startActivity(intent);
			      Gicikd33.this.finish();
			  
			    } catch (Exception e) {
			      e.printStackTrace();
			    }
			 //	
}
	}
	private void ScoreAl25() {
		topscore = Integer.parseInt(tscore33.getText().toString().trim());
		// Save the text in SharedPreference
	  	sharedPreference.save(context, topscore,33);
	  	// Save the text in SharedPreference
	    try {
	      Bundle extras = new Bundle();
	      extras.putInt(TOPSCORE, topscore);
	      Intent intent = new Intent();
	 
	      intent.putExtras(extras);
	 
	      intent.setClass(getApplicationContext(), Gicikd34.class);
	      startActivity(intent);
	      Gicikd33.this.finish();
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
				 //
			 }
			 @Override
			 public void onTick(long a) {
				 if(a / 1000==90) 
				  	{							  		
					  l1.setVisibility(View.INVISIBLE);					  					  		
				  	}
				  if(a / 1000==80) 
				  	{							  		
					  l2.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==70) 
				  	{							  		
					  l3.setVisibility(View.INVISIBLE);							  					  		
				  	}
				  if(a / 1000==60) 
				  	{							  		
					  l4.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==50) 
				  	{							  		
					  l5.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==40) 
				  	{	
					  l7.setBackgroundResource(R.drawable.besyuzkir);
					  l8.setBackgroundResource(R.drawable.besyuzkir);
					  l9.setBackgroundResource(R.drawable.besyuzkir);		
					  l0.setBackgroundResource(R.drawable.besyuzkir);
					  l6.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==30) 
				  	{						
					  l7.setVisibility(View.INVISIBLE);	
										  					  		
				  	}
				  if(a / 1000==20) 
				  	{		
					  l8.setVisibility(View.INVISIBLE);	
							  					  		
				  	}
				  if(a / 1000==10) 
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