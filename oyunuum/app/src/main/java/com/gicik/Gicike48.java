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

public class Gicike48 extends Activity implements FragmentManager.OnBackStackChangedListener {
	TextView l1,l2,l3,l4,l5,l6,l7,l8,l9,l0;
	  private Handler mHandler = new Handler();
	    private boolean mShowingBack = false;
	MediaPlayer yanlis;
	Button restart48,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,
	button17,button18,button19,button20,button21,button22,button23,button24,button25,button26,button27,button28,button29,button30,button31,button32,button33,button34,button35,button36,
	button37,button38,button39,button40,button41,button42;
	TextView test48;
	String stopscore;
	//zaman de�i�kenleri
	private CountDownTimer zaman;
	 private final long baslangic = 250 * 1000;
	 private final long bitis = 1 * 1000;
	//
	//sharedpreference database
			private SharedPreference sharedPreference;
			Activity context = this;
		//sharedpreference database
//	ver
	TextView tscore48;
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
	 int b31topdegeri=31;int t�k31=0;
	 int b32topdegeri=32;int t�k32=0;
	 int b33topdegeri=33;int t�k33=0;
	 int b34topdegeri=34;int t�k34=0;
	 int b35topdegeri=35;int t�k35=0;
	 int b36topdegeri=36;int t�k36=0;
	 int b37topdegeri=37;int t�k37=0;
	 int b38topdegeri=38;int t�k38=0;
	 int b39topdegeri=39;int t�k39=0;
	 int b40topdegeri=40;int t�k40=0;
	 int b41topdegeri=41;int t�k41=0;
	 int b42topdegeri=42;int t�k42=0;
	 
	 int sayac=0;
	 int sayac25=0;
	 int score48=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gicike48);
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
		test48=(TextView)findViewById(R.id.test48);
			
		yanlis=MediaPlayer.create(Gicike48.this,R.raw.yanlis);
		
		button1=(Button)findViewById(R.id.B3x1);
		button2=(Button)findViewById(R.id.B3x2);
		button3=(Button)findViewById(R.id.B3x3);
		button4=(Button)findViewById(R.id.B3x4);
		button5=(Button)findViewById(R.id.B3x5);
		button6=(Button)findViewById(R.id.B3x6);
		button7=(Button)findViewById(R.id.B3x7);
		button8=(Button)findViewById(R.id.B3x8);
		button9=(Button)findViewById(R.id.B3x9);
		button10=(Button)findViewById(R.id.B3x10);
		button11=(Button)findViewById(R.id.B3x11);
		button12=(Button)findViewById(R.id.B3x12);
		button13=(Button)findViewById(R.id.B3x13);
		button14=(Button)findViewById(R.id.B3x14);
		button15=(Button)findViewById(R.id.B3x15);
		button16=(Button)findViewById(R.id.B3x16);
		button17=(Button)findViewById(R.id.B3x17);
		button18=(Button)findViewById(R.id.B3x18);
		button19=(Button)findViewById(R.id.B3x19);
		button20=(Button)findViewById(R.id.B3x20);
		button21=(Button)findViewById(R.id.B3x21);
		button22=(Button)findViewById(R.id.B3x22);
		button23=(Button)findViewById(R.id.B3x23);
		button24=(Button)findViewById(R.id.B3x24);
		button25=(Button)findViewById(R.id.B3x25);
		button26=(Button)findViewById(R.id.B3x26);
		button27=(Button)findViewById(R.id.B3x27);
		button28=(Button)findViewById(R.id.B3x28);
		button29=(Button)findViewById(R.id.B3x29);
		button30=(Button)findViewById(R.id.B3x30);
		button31=(Button)findViewById(R.id.B3x31);
		button32=(Button)findViewById(R.id.B3x32);
		button33=(Button)findViewById(R.id.B3x33);
		button34=(Button)findViewById(R.id.B3x34);
		button35=(Button)findViewById(R.id.B3x35);
		button36=(Button)findViewById(R.id.B3x36);
		button37=(Button)findViewById(R.id.B3x37);
		button38=(Button)findViewById(R.id.B3x38);
		button39=(Button)findViewById(R.id.B3x39);
		button40=(Button)findViewById(R.id.B3x40);
		button41=(Button)findViewById(R.id.B3x41);
		button42=(Button)findViewById(R.id.B3x42);
	
//		zaman geri say�m
		  	zaman = new Zamanim(baslangic, bitis);
		 
			//
		
		
		  Random r=new Random(); //random s�n�f�
	        a=r.nextInt(42)+1; // 1-25 aras� say�lar�n getirimi i�in 	(4 dahil)	
	        String gelensayi = a + "";				        
	        test48.setText(gelensayi);	
	        
	    	tscore48=(TextView)findViewById(R.id.score48);			 
	    	sharedPreference = new SharedPreference();
			topscore = sharedPreference.getValue(context);	 
		    tscore48.setText(String.valueOf(topscore));

		    restart48=(Button)findViewById(R.id.restart48);
	        restart48.setOnClickListener(new View.OnClickListener() {			
	        	@Override
	        	public void onClick(View v) 
	        	{
	        		 // Restart
					 try {
					      Bundle extras = new Bundle();
					      extras.putInt(TOPSCORE, topscore);
					 
					      Intent intent = new Intent();
					 
					      intent.putExtras(extras);
					  
					      intent.setClass(getApplicationContext(), Gicike48.class);
					      startActivity(intent);
					      Gicike48.this.finish();
					  
					    } catch (Exception e) {
					      e.printStackTrace();
					    }
					 //	
	        	}
	        	})   ;	
	      //Ana menuye donus
		       Button back=(Button)findViewById(R.id.back48);
		        back.setOnClickListener(new View.OnClickListener() {			
		        	@Override
		        	public void onClick(View v) 
		        	{
		        		Intent intent = new Intent();	      	 
		      	      intent.setClass(getApplicationContext(), Ana.class);
		      	      startActivity(intent);
		      	      Gicike48.this.finish();
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
	if(t�k1==4 && a == b1topdegeri){
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        }
		 else{
			 ScoreAl25();
	      }
	}	//f�rsat benzer 1. katman
	else if(t�k1==3 && a == b1topdegeri)
	{
		t�k1=3;
		button1.setBackgroundResource(R.drawable.besyuzmavi);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k1==2 && a == b1topdegeri)
	{
		t�k1=2;
		button1.setBackgroundResource(R.drawable.besyuzmavikatman);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k1==1 && a == b1topdegeri)				
	{
			t�k1=1;
			button1.setBackgroundResource(R.drawable.besyuzmavikatman2);
			score48=score48+40;
			stopscore=score48+topscore+"";
			tscore48.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test48.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
	else 
	{t�k1--;
		score48=score48-80;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
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
		if(t�k2==4 && a == b2topdegeri){
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	Random r=new Random(); //random s�n�f�
	        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
	        String gelensayi = a + "";				        
	        test48.setText(gelensayi);
	      
}else{
	  ScoreAl25();
}
	}
		//f�rsat benzer 1. katman
		else if(t�k2==3 && a == b2topdegeri)
		{
			t�k2=3;
			button2.setBackgroundResource(R.drawable.besyuzmavi);
			score48=score48+40;
			stopscore=score48+topscore+"";
			tscore48.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test48.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
		}
		else if(t�k2==2 && a == b2topdegeri)
		{
			t�k2=2;
			button2.setBackgroundResource(R.drawable.besyuzmavikatman);
			score48=score48+40;
			stopscore=score48+topscore+"";
			tscore48.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test48.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
		}
		else if(t�k2==1 && a == b2topdegeri)				
		{
				t�k2=1;
				button2.setBackgroundResource(R.drawable.besyuzmavikatman2);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
	}
	else {t�k2--;
		score48=score48-80;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
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
		t�k3++;
		if(t�k3==4 && a == b3topdegeri){
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		       
	        }
		 else{
			 ScoreAl25();
	      }
	}	
		//f�rsat benzer 1. katman
		else if(t�k3==3 && a == b3topdegeri)
		{
			t�k3=3;
			button3.setBackgroundResource(R.drawable.besyuzmavi);
			score48=score48+40;
			stopscore=score48+topscore+"";
			tscore48.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test48.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
		}
		else if(t�k3==2 && a == b3topdegeri)
		{
			t�k3=2;
			button3.setBackgroundResource(R.drawable.besyuzmavikatman);
			score48=score48+40;
			stopscore=score48+topscore+"";
			tscore48.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test48.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
		}
		else if(t�k3==1 && a == b3topdegeri)				
		{
				t�k3=1;
				button3.setBackgroundResource(R.drawable.besyuzmavikatman2);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
	}
else   {t�k3--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
			if(t�k4==4 && a == b4topdegeri)
	{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k4==3 && a == b4topdegeri)
			{
				t�k4=3;
				button4.setBackgroundResource(R.drawable.besyuzmavi);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k4==2 && a == b4topdegeri)
			{
				t�k4=2;
				button4.setBackgroundResource(R.drawable.besyuzmavikatman);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k4==1 && a == b4topdegeri)				
			{
					t�k4=1;
					button4.setBackgroundResource(R.drawable.besyuzmavikatman2);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}
else  {t�k4--;
	score48=score48-80;
stopscore=score48+topscore+"";
tscore48.setText(stopscore);
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
	if(t�k5==4 && a == b5topdegeri)
	{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	//f�rsat benzer 1. katman
			else if(t�k5==3 && a == b5topdegeri)
			{
				t�k5=3;
				button5.setBackgroundResource(R.drawable.besyuzmavi);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k5==2 && a == b5topdegeri)
			{
				t�k5=2;
				button5.setBackgroundResource(R.drawable.besyuzmavikatman);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k5==1 && a == b5topdegeri)				
			{
					t�k5=1;
					button5.setBackgroundResource(R.drawable.besyuzmavikatman2);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}
else  {t�k5--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
		t�k6++;
		if(t�k6==4 && a == b6topdegeri)
		{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
		//f�rsat benzer 1. katman
				else if(t�k6==3 && a == b6topdegeri)
				{
					t�k6=3;
					button6.setBackgroundResource(R.drawable.besyuzmavi);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k6==2 && a == b6topdegeri)
				{
					t�k6=2;
					button6.setBackgroundResource(R.drawable.besyuzmavikatman);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k6==1 && a == b6topdegeri)				
				{
						t�k6=1;
						button6.setBackgroundResource(R.drawable.besyuzmavikatman2);
						score48=score48+40;
						stopscore=score48+topscore+"";
						tscore48.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test48.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {t�k6--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
		if(t�k7==4 && a == b7topdegeri)
		{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
		//f�rsat benzer 1. katman
				else if(t�k7==3 && a == b7topdegeri)
				{
					t�k7=3;
					button7.setBackgroundResource(R.drawable.besyuzmavi);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k7==2 && a == b7topdegeri)
				{
					t�k7=2;
					button7.setBackgroundResource(R.drawable.besyuzmavikatman);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k7==1 && a == b7topdegeri)				
				{
						t�k7=1;
						button7.setBackgroundResource(R.drawable.besyuzmavikatman2);
						score48=score48+40;
						stopscore=score48+topscore+"";
						tscore48.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test48.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {t�k7--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
	// 2.katman
		t�k8++;
		if(t�k8==4 && a == b8topdegeri)
		{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
		//f�rsat benzer 1. katman
				else if(t�k8==3 && a == b8topdegeri)
				{
					t�k8=3;
					button8.setBackgroundResource(R.drawable.besyuzmavi);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k8==2 && a == b8topdegeri)
				{
					t�k8=2;
					button8.setBackgroundResource(R.drawable.besyuzmavikatman);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k8==1 && a == b8topdegeri)				
				{
						t�k8=1;
						button8.setBackgroundResource(R.drawable.besyuzmavikatman2);
						score48=score48+40;
						stopscore=score48+topscore+"";
						tscore48.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test48.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {t�k8--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
		if(t�k9==4 && a == b9topdegeri)
		{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
		//f�rsat benzer 1. katman
				else if(t�k9==3 && a == b9topdegeri)
				{
					t�k9=3;
					button9.setBackgroundResource(R.drawable.besyuzmavi);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k9==2 && a == b9topdegeri)
				{
					t�k9=2;
					button9.setBackgroundResource(R.drawable.besyuzmavikatman);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k9==1 && a == b9topdegeri)				
				{
						t�k9=1;
						button9.setBackgroundResource(R.drawable.besyuzmavikatman2);
						score48=score48+40;
						stopscore=score48+topscore+"";
						tscore48.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test48.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {t�k9--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
		t�k10++;
		if(t�k10==4 && a == b10topdegeri)
		{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
		//f�rsat benzer 1. katman
				else if(t�k10==3 && a == b10topdegeri)
				{
					t�k10=3;
					button10.setBackgroundResource(R.drawable.besyuzmavi);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k10==2 && a == b10topdegeri)
				{
					t�k10=2;
					button10.setBackgroundResource(R.drawable.besyuzmavikatman);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k10==1 && a == b10topdegeri)				
				{
						t�k10=1;
						button10.setBackgroundResource(R.drawable.besyuzmavikatman2);
						score48=score48+40;
						stopscore=score48+topscore+"";
						tscore48.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test48.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {t�k10--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
			if(t�k11==4 && a == b11topdegeri)
			{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k11==3 && a == b11topdegeri)
			{
				t�k11=3;
				button11.setBackgroundResource(R.drawable.besyuzmavi);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k11==2 && a == b11topdegeri)
			{
				t�k11=2;
				button11.setBackgroundResource(R.drawable.besyuzmavikatman);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k11==1 && a == b11topdegeri)				
			{
					t�k11=1;
					button11.setBackgroundResource(R.drawable.besyuzmavikatman2);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}
else  {t�k11--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
			t�k12++;
			if(t�k12==4 && a == b12topdegeri)
			{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k12==3 && a == b12topdegeri)
			{
				t�k12=3;
				button12.setBackgroundResource(R.drawable.besyuzmavi);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k12==2 && a == b12topdegeri)
			{
				t�k12=2;
				button12.setBackgroundResource(R.drawable.besyuzmavikatman);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k12==1 && a == b12topdegeri)				
			{
					t�k12=1;
					button12.setBackgroundResource(R.drawable.besyuzmavikatman2);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}
else  {t�k12--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
			if(t�k13==4 && a == b13topdegeri)
			{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k13==3 && a == b13topdegeri)
			{
				t�k13=3;
				button13.setBackgroundResource(R.drawable.besyuzmavi);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k13==2 && a == b13topdegeri)
			{
				t�k13=2;
				button13.setBackgroundResource(R.drawable.besyuzmavikatman);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k13==1 && a == b13topdegeri)				
			{
					t�k13=1;
					button13.setBackgroundResource(R.drawable.besyuzmavikatman2);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}
else  {t�k13--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
			t�k14++;
			if(t�k14==4 && a == b14topdegeri)
			{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k14==3 && a == b14topdegeri)
			{
				t�k14=3;
				button14.setBackgroundResource(R.drawable.besyuzmavi);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k14==2 && a == b14topdegeri)
			{
				t�k14=2;
				button14.setBackgroundResource(R.drawable.besyuzmavikatman);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k14==1 && a == b14topdegeri)				
			{
					t�k14=1;
					button14.setBackgroundResource(R.drawable.besyuzmavikatman2);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}
else  {t�k14--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
			if(t�k15==4 && a == b15topdegeri)
			{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k15==3 && a == b15topdegeri)
			{
				t�k15=3;
				button15.setBackgroundResource(R.drawable.besyuzmavi);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k15==2 && a == b15topdegeri)
			{
				t�k15=2;
				button15.setBackgroundResource(R.drawable.besyuzmavikatman);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k15==1 && a == b15topdegeri)				
			{
					t�k15=1;
					button15.setBackgroundResource(R.drawable.besyuzmavikatman2);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}
else  {t�k15--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
			if(t�k16==4 && a == b16topdegeri)
			{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k16==3 && a == b16topdegeri)
			{
				t�k16=3;
				button16.setBackgroundResource(R.drawable.besyuzmavi);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k16==2 && a == b16topdegeri)
			{
				t�k16=2;
				button16.setBackgroundResource(R.drawable.besyuzmavikatman);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k16==1 && a == b16topdegeri)				
			{
					t�k16=1;
					button16.setBackgroundResource(R.drawable.besyuzmavikatman2);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}
else  {t�k16--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
			t�k17++;
			if(t�k17==4 && a == b17topdegeri)
			{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k17==3 && a == b17topdegeri)
			{
				t�k17=3;
				button17.setBackgroundResource(R.drawable.besyuzmavi);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k17==2 && a == b17topdegeri)
			{
				t�k17=2;
				button17.setBackgroundResource(R.drawable.besyuzmavikatman);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k17==1 && a == b17topdegeri)				
			{
					t�k17=1;
					button17.setBackgroundResource(R.drawable.besyuzmavikatman2);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}
else  {t�k17--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
			if(t�k18==4 && a == b18topdegeri)
			{
				sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k18==3 && a == b18topdegeri)
			{
				t�k18=3;
				button18.setBackgroundResource(R.drawable.besyuzmavi);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k18==2 && a == b18topdegeri)
			{
				t�k18=2;
				button18.setBackgroundResource(R.drawable.besyuzmavikatman);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k18==1 && a == b18topdegeri)				
			{
					t�k18=1;
					button18.setBackgroundResource(R.drawable.besyuzmavikatman2);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}
else  {t�k18--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
			t�k19++;
			if(t�k19==4 && a == b19topdegeri)
			{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else {
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k19==3 && a == b19topdegeri)
			{
				t�k19=3;
				button19.setBackgroundResource(R.drawable.besyuzmavi);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k19==2 && a == b19topdegeri)
			{
				t�k19=2;
				button19.setBackgroundResource(R.drawable.besyuzmavikatman);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k19==1 && a == b19topdegeri)				
			{
					t�k19=1;
					button19.setBackgroundResource(R.drawable.besyuzmavikatman2);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}
else  {t�k19--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
			if(t�k20==4 && a == b20topdegeri)
			{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k20==3 && a == b20topdegeri)
			{
				t�k20=3;
				button20.setBackgroundResource(R.drawable.besyuzmavi);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k20==2 && a == b20topdegeri)
			{
				t�k20=2;
				button20.setBackgroundResource(R.drawable.besyuzmavikatman);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k20==1 && a == b20topdegeri)				
			{
					t�k20=1;
					button20.setBackgroundResource(R.drawable.besyuzmavikatman2);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}
else  {t�k20--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
			t�k21++;
			if(t�k21==4 && a == b21topdegeri)
			{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
			//f�rsat benzer 1. katman
			else if(t�k21==3 && a == b21topdegeri)
			{
				t�k21=3;
				button21.setBackgroundResource(R.drawable.besyuzmavi);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k21==2 && a == b21topdegeri)
			{
				t�k21=2;
				button21.setBackgroundResource(R.drawable.besyuzmavikatman);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
			}
			else if(t�k21==1 && a == b21topdegeri)				
			{
					t�k21=1;
					button21.setBackgroundResource(R.drawable.besyuzmavikatman2);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
		}
else  {t�k21--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
				if(t�k22==4 && a == b22topdegeri)
				{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//f�rsat benzer 1. katman
				else if(t�k22==3 && a == b22topdegeri)
				{
					t�k22=3;
					button22.setBackgroundResource(R.drawable.besyuzmavi);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k22==2 && a == b22topdegeri)
				{
					t�k22=2;
					button22.setBackgroundResource(R.drawable.besyuzmavikatman);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k22==1 && a == b22topdegeri)				
				{
						t�k22=1;
						button22.setBackgroundResource(R.drawable.besyuzmavikatman2);
						score48=score48+40;
						stopscore=score48+topscore+"";
						tscore48.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test48.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {t�k22--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
				t�k23++;
				if(t�k23==4 && a == b23topdegeri)
				{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//f�rsat benzer 1. katman
				else if(t�k23==3 && a == b23topdegeri)
				{
					t�k23=3;
					button23.setBackgroundResource(R.drawable.besyuzmavi);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k23==2 && a == b23topdegeri)
				{
					t�k23=2;
					button23.setBackgroundResource(R.drawable.besyuzmavikatman);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k23==1 && a == b23topdegeri)				
				{
						t�k23=1;
						button23.setBackgroundResource(R.drawable.besyuzmavikatman2);
						score48=score48+40;
						stopscore=score48+topscore+"";
						tscore48.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test48.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {t�k23--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
				if(t�k24==4 && a == b24topdegeri)
				{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//f�rsat benzer 1. katman
				else if(t�k24==3 && a == b24topdegeri)
				{
					t�k24=3;
					button24.setBackgroundResource(R.drawable.besyuzmavi);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k24==2 && a == b24topdegeri)
				{
					t�k24=2;
					button24.setBackgroundResource(R.drawable.besyuzmavikatman);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k24==1 && a == b24topdegeri)				
				{
						t�k24=1;
						button24.setBackgroundResource(R.drawable.besyuzmavikatman2);
						score48=score48+40;
						stopscore=score48+topscore+"";
						tscore48.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test48.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {t�k24--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
				t�k25++;
				if(t�k25==4 && a == b25topdegeri)
				{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//f�rsat benzer 1. katman
				else if(t�k25==3 && a == b25topdegeri)
				{
					t�k25=3;
					button25.setBackgroundResource(R.drawable.besyuzmavi);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k25==2 && a == b25topdegeri)
				{
					t�k25=2;
					button25.setBackgroundResource(R.drawable.besyuzmavikatman);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k25==1 && a == b25topdegeri)				
				{
						t�k25=1;
						button25.setBackgroundResource(R.drawable.besyuzmavikatman2);
						score48=score48+40;
						stopscore=score48+topscore+"";
						tscore48.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test48.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {t�k25--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
				if(t�k26==4 && a == b26topdegeri)
				{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//f�rsat benzer 1. katman
				else if(t�k26==3 && a == b26topdegeri)
				{
					t�k26=3;
					button26.setBackgroundResource(R.drawable.besyuzmavi);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k26==2 && a == b26topdegeri)
				{
					t�k26=2;
					button26.setBackgroundResource(R.drawable.besyuzmavikatman);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k26==1 && a == b26topdegeri)				
				{
						t�k26=1;
						button26.setBackgroundResource(R.drawable.besyuzmavikatman2);
						score48=score48+40;
						stopscore=score48+topscore+"";
						tscore48.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test48.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {t�k26--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
				if(t�k27==4 && a == b27topdegeri)
				{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//f�rsat benzer 1. katman
				else if(t�k27==3 && a == b27topdegeri)
				{
					t�k27=3;
					button27.setBackgroundResource(R.drawable.besyuzmavi);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k27==2 && a == b27topdegeri)
				{
					t�k27=2;
					button27.setBackgroundResource(R.drawable.besyuzmavikatman);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k27==1 && a == b27topdegeri)				
				{
						t�k27=1;
						button27.setBackgroundResource(R.drawable.besyuzmavikatman2);
						score48=score48+40;
						stopscore=score48+topscore+"";
						tscore48.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test48.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {t�k27--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
				t�k28++;
				if(t�k28==4 && a == b28topdegeri)
				{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//f�rsat benzer 1. katman
				else if(t�k28==3 && a == b28topdegeri)
				{
					t�k28=3;
					button28.setBackgroundResource(R.drawable.besyuzmavi);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k28==2 && a == b28topdegeri)
				{
					t�k28=2;
					button28.setBackgroundResource(R.drawable.besyuzmavikatman);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k28==1 && a == b28topdegeri)				
				{
						t�k28=1;
						button28.setBackgroundResource(R.drawable.besyuzmavikatman2);
						score48=score48+40;
						stopscore=score48+topscore+"";
						tscore48.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test48.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {t�k28--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
				if(t�k29==4 && a == b29topdegeri)
				{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//f�rsat benzer 1. katman
				else if(t�k29==3 && a == b29topdegeri)
				{
					t�k29=3;
					button29.setBackgroundResource(R.drawable.besyuzmavi);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k29==2 && a == b29topdegeri)
				{
					t�k29=2;
					button29.setBackgroundResource(R.drawable.besyuzmavikatman);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k29==1 && a == b29topdegeri)				
				{
						t�k29=1;
						button29.setBackgroundResource(R.drawable.besyuzmavikatman2);
						score48=score48+40;
						stopscore=score48+topscore+"";
						tscore48.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test48.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {t�k29--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
				if(t�k30==4 && a == b30topdegeri)
				{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
				//f�rsat benzer 1. katman
				else if(t�k30==3 && a == b30topdegeri)
				{
					t�k30=3;
					button30.setBackgroundResource(R.drawable.besyuzmavi);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k30==2 && a == b30topdegeri)
				{
					t�k30=2;
					button30.setBackgroundResource(R.drawable.besyuzmavikatman);
					score48=score48+40;
					stopscore=score48+topscore+"";
					tscore48.setText(stopscore);
					 if(sayac<42){
				        	Random r=new Random(); //random s�n�f�
					        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
					        String gelensayi = a + "";				        
					        test48.setText(gelensayi);
					      
				        } else{
						 ScoreAl25();
				      }
				}
				else if(t�k30==1 && a == b30topdegeri)				
				{
						t�k30=1;
						button30.setBackgroundResource(R.drawable.besyuzmavikatman2);
						score48=score48+40;
						stopscore=score48+topscore+"";
						tscore48.setText(stopscore);
						 if(sayac<42){
					        	Random r=new Random(); //random s�n�f�
						        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
						        String gelensayi = a + "";				        
						        test48.setText(gelensayi);
						      
					        } else{
							 ScoreAl25();
					      }
			}
else  {t�k30--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
	t�k31++;
	if(t�k31==4 && a == b31topdegeri)
	{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	//f�rsat benzer 1. katman
	else if(t�k31==3 && a == b31topdegeri)
	{
		t�k31=3;
		button31.setBackgroundResource(R.drawable.besyuzmavi);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k31==2 && a == b31topdegeri)
	{
		t�k31=2;
		button31.setBackgroundResource(R.drawable.besyuzmavikatman);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k31==1 && a == b31topdegeri)				
	{
			t�k31=1;
			button31.setBackgroundResource(R.drawable.besyuzmavikatman2);
			score48=score48+40;
			stopscore=score48+topscore+"";
			tscore48.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test48.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
else  {t�k31--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
	t�k32++;
	if(t�k32==4 && a == b32topdegeri)
	{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	//f�rsat benzer 1. katman
	else if(t�k32==3 && a == b32topdegeri)
	{
		t�k32=3;
		button32.setBackgroundResource(R.drawable.besyuzmavi);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k32==2 && a == b32topdegeri)
	{
		t�k32=2;
		button32.setBackgroundResource(R.drawable.besyuzmavikatman);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k32==1 && a == b32topdegeri)				
	{
			t�k32=1;
			button32.setBackgroundResource(R.drawable.besyuzmavikatman2);
			score48=score48+40;
			stopscore=score48+topscore+"";
			tscore48.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test48.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
else  {t�k32--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
	t�k33++;
	if(t�k33==4 && a == b33topdegeri)
	{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	//f�rsat benzer 1. katman
	else if(t�k33==3 && a == b33topdegeri)
	{
		t�k33=3;
		button33.setBackgroundResource(R.drawable.besyuzmavi);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k33==2 && a == b33topdegeri)
	{
		t�k33=2;
		button33.setBackgroundResource(R.drawable.besyuzmavikatman);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k33==1 && a == b33topdegeri)				
	{
			t�k33=1;
			button33.setBackgroundResource(R.drawable.besyuzmavikatman2);
			score48=score48+40;
			stopscore=score48+topscore+"";
			tscore48.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test48.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
else  {t�k33--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
	t�k34++;
	if(t�k34==4 && a == b34topdegeri)
	{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
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
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	//f�rsat benzer 1. katman
	else if(t�k34==3 && a == b34topdegeri)
	{
		t�k34=3;
		button34.setBackgroundResource(R.drawable.besyuzmavi);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k34==2 && a == b34topdegeri)
	{
		t�k34=2;
		button34.setBackgroundResource(R.drawable.besyuzmavikatman);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k34==1 && a == b34topdegeri)				
	{
			t�k34=1;
			button34.setBackgroundResource(R.drawable.besyuzmavikatman2);
			score48=score48+40;
			stopscore=score48+topscore+"";
			tscore48.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test48.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
else  {t�k34--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
	t�k35++;
	if(t�k35==4 && a == b35topdegeri)
	{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
		button35.setVisibility(View.INVISIBLE);		
		

		b36topdegeri--;
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;

		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}
	//f�rsat benzer 1. katman
	else if(t�k35==3 && a == b35topdegeri)
	{
		t�k35=3;
		button35.setBackgroundResource(R.drawable.besyuzmavi);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k35==2 && a == b35topdegeri)
	{
		t�k35=2;
		button35.setBackgroundResource(R.drawable.besyuzmavikatman);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k35==1 && a == b35topdegeri)				
	{
			t�k35=1;
			button35.setBackgroundResource(R.drawable.besyuzmavikatman2);
			score48=score48+40;
			stopscore=score48+topscore+"";
			tscore48.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test48.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
else  {t�k35--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
	// 2.katman
	t�k36++;
	if(t�k36==4 && a == b36topdegeri)
	{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
		button36.setVisibility(View.INVISIBLE);
		b37topdegeri--;
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}//f�rsat benzer 1. katman
	else if(t�k36==3 && a == b36topdegeri)
	{
		t�k36=3;
		button36.setBackgroundResource(R.drawable.besyuzmavi);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k36==2 && a == b36topdegeri)
	{
		t�k36=2;
		button36.setBackgroundResource(R.drawable.besyuzmavikatman);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k36==1 && a == b36topdegeri)				
	{
			t�k36=1;
			button36.setBackgroundResource(R.drawable.besyuzmavikatman2);
			score48=score48+40;
			stopscore=score48+topscore+"";
			tscore48.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test48.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
else  {t�k36--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
	// 2.katman
	t�k37++;
	if(t�k37==4 && a == b37topdegeri)
	{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
		button37.setVisibility(View.INVISIBLE);
		
		b38topdegeri--;
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}//f�rsat benzer 1. katman
	else if(t�k37==3 && a == b37topdegeri)
	{
		t�k37=3;
		button37.setBackgroundResource(R.drawable.besyuzmavi);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k37==2 && a == b37topdegeri)
	{
		t�k37=2;
		button37.setBackgroundResource(R.drawable.besyuzmavikatman);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k37==1 && a == b37topdegeri)				
	{
			t�k37=1;
			button37.setBackgroundResource(R.drawable.besyuzmavikatman2);
			score48=score48+40;
			stopscore=score48+topscore+"";
			tscore48.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test48.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
else  {t�k37--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
	t�k38++;
	if(t�k38==4 && a == b38topdegeri)
	{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
		button38.setVisibility(View.INVISIBLE);
		
		b39topdegeri--;
		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}//f�rsat benzer 1. katman
	else if(t�k38==3 && a == b38topdegeri)
	{
		t�k38=3;
		button38.setBackgroundResource(R.drawable.besyuzmavi);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k38==2 && a == b38topdegeri)
	{
		t�k38=2;
		button38.setBackgroundResource(R.drawable.besyuzmavikatman);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k38==1 && a == b38topdegeri)				
	{
			t�k38=1;
			button38.setBackgroundResource(R.drawable.besyuzmavikatman2);
			score48=score48+40;
			stopscore=score48+topscore+"";
			tscore48.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test48.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
else  {t�k38--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
	// 2.katman
	t�k39++;
	if(t�k39==4 && a == b39topdegeri)
	{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
		button39.setVisibility(View.INVISIBLE);

		b40topdegeri--;
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}//f�rsat benzer 1. katman
	else if(t�k39==3 && a == b39topdegeri)
	{
		t�k39=3;
		button39.setBackgroundResource(R.drawable.besyuzmavi);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k39==2 && a == b39topdegeri)
	{
		t�k39=2;
		button39.setBackgroundResource(R.drawable.besyuzmavikatman);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k39==1 && a == b39topdegeri)				
	{
			t�k39=1;
			button39.setBackgroundResource(R.drawable.besyuzmavikatman2);
			score48=score48+40;
			stopscore=score48+topscore+"";
			tscore48.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test48.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
else  {t�k39--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
	t�k40++;
	if(t�k40==4 && a == b40topdegeri)
	{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
		button40.setVisibility(View.INVISIBLE);
	
		b41topdegeri--;
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}//f�rsat benzer 1. katman
	else if(t�k40==3 && a == b40topdegeri)
	{
		t�k40=3;
		button40.setBackgroundResource(R.drawable.besyuzmavi);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k40==2 && a == b40topdegeri)
	{
		t�k40=2;
		button40.setBackgroundResource(R.drawable.besyuzmavikatman);
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
		      
	        } else{
			 ScoreAl25();
	      }
	}
	else if(t�k40==1 && a == b40topdegeri)				
	{
			t�k40=1;
			button40.setBackgroundResource(R.drawable.besyuzmavikatman2);
			score48=score48+40;
			stopscore=score48+topscore+"";
			tscore48.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test48.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
}
else  {t�k40--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
	// 2.katman
		t�k41++;
		if(t�k41==4 && a == b41topdegeri)
		{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
		button41.setVisibility(View.INVISIBLE);
	
		b42topdegeri--;
		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}//f�rsat benzer 1. katman
		else if(t�k41==3 && a == b41topdegeri)
		{
			t�k41=3;
			button41.setBackgroundResource(R.drawable.besyuzmavi);
			score48=score48+40;
			stopscore=score48+topscore+"";
			tscore48.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test48.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
		}
		else if(t�k41==2 && a == b41topdegeri)
		{
			t�k41=2;
			button41.setBackgroundResource(R.drawable.besyuzmavikatman);
			score48=score48+40;
			stopscore=score48+topscore+"";
			tscore48.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test48.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
		}
		else if(t�k41==1 && a == b41topdegeri)				
		{
				t�k41=1;
				button41.setBackgroundResource(R.drawable.besyuzmavikatman2);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
	}
else  {t�k41--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
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
		t�k42++;
		if(t�k42==4 && a == b42topdegeri)
		{
		sayac++;
		score48=score48+40;
		stopscore=score48+topscore+"";
		tscore48.setText(stopscore);
		
		button42.setVisibility(View.INVISIBLE);

		 if(sayac<42){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test48.setText(gelensayi);
	        }
		 else{
			 ScoreAl25();
	      }
}//f�rsat benzer 1. katman
		else if(t�k42==3 && a == b42topdegeri)
		{
			t�k42=3;
			button42.setBackgroundResource(R.drawable.besyuzmavi);
			score48=score48+40;
			stopscore=score48+topscore+"";
			tscore48.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test48.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
		}
		else if(t�k42==2 && a == b42topdegeri)
		{
			t�k42=2;
			button42.setBackgroundResource(R.drawable.besyuzmavikatman);
			score48=score48+40;
			stopscore=score48+topscore+"";
			tscore48.setText(stopscore);
			 if(sayac<42){
		        	Random r=new Random(); //random s�n�f�
			        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
			        String gelensayi = a + "";				        
			        test48.setText(gelensayi);
			      
		        } else{
				 ScoreAl25();
		      }
		}
		else if(t�k42==1 && a == b42topdegeri)				
		{
				t�k42=1;
				button42.setBackgroundResource(R.drawable.besyuzmavikatman2);
				score48=score48+40;
				stopscore=score48+topscore+"";
				tscore48.setText(stopscore);
				 if(sayac<42){
			        	Random r=new Random(); //random s�n�f�
				        a=r.nextInt(42-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
				        String gelensayi = a + "";				        
				        test48.setText(gelensayi);
				      
			        } else{
					 ScoreAl25();
			      }
	}
else  {t�k42--;
	score48=score48-80;
	stopscore=score48+topscore+"";
	tscore48.setText(stopscore);
	Scoreeksi();
	yanlis.start();
	}	
}
})   ;
	}
	private void Scoreeksi(){
		 // score - ye dusunce	
if(score48+topscore<0)
{
	 // Restart
			 try {
			      Bundle extras = new Bundle();
			      extras.putInt(TOPSCORE, topscore);
			 
			      Intent intent = new Intent();
			 
			      intent.putExtras(extras);
			  
			      intent.setClass(getApplicationContext(), Gicike48.class);
			      startActivity(intent);
			      Gicike48.this.finish();
			  
			    } catch (Exception e) {
			      e.printStackTrace();
			    }
			 //	
}
	}
	private void ScoreAl25() {
		topscore = Integer.parseInt(tscore48.getText().toString().trim());
		// Save the text in SharedPreference
	  	sharedPreference.save(context, topscore,48);
	  	// Save the text in SharedPreference
	    try {
	      Bundle extras = new Bundle();
	      extras.putInt(TOPSCORE, topscore);
	      Intent intent = new Intent();
	 
	      intent.putExtras(extras);
	 
	      intent.setClass(getApplicationContext(), Gicike49.class);
	      startActivity(intent);
	      Gicike48.this.finish();
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
				//s�re bitince
				 l0.setVisibility(View.INVISIBLE);	
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
				 if(a / 1000==225) 
				  	{							  		
					  l1.setVisibility(View.INVISIBLE);					  					  		
				  	}
				  if(a / 1000==200) 
				  	{							  		
					  l2.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==175) 
				  	{							  		
					  l3.setVisibility(View.INVISIBLE);							  					  		
				  	}
				  if(a / 1000==150) 
				  	{							  		
					  l4.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==125) 
				  	{							  		
					  l5.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==100) 
				  	{	
					  l7.setBackgroundResource(R.drawable.besyuzkir);
					  l8.setBackgroundResource(R.drawable.besyuzkir);
					  l9.setBackgroundResource(R.drawable.besyuzkir);		
					  l0.setBackgroundResource(R.drawable.besyuzkir);
					  l6.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==75) 
				  	{						
					  l7.setVisibility(View.INVISIBLE);	
										  					  		
				  	}
				  if(a / 1000==50) 
				  	{		
					  l8.setVisibility(View.INVISIBLE);	
							  					  		
				  	}
				  if(a / 1000==25) 
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