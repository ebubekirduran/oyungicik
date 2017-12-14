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

public class Gicikb14 extends Activity  implements FragmentManager.OnBackStackChangedListener {
	TextView l1,l2,l3,l4,l5,l6,l7,l8,l9,l0;
	  private Handler mHandler = new Handler();
	    private boolean mShowingBack = false;
	MediaPlayer yanlis;
	Button restart14,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12;
	TextView test14;	
	String stopscore;
	//zaman de�i�kenleri
	private CountDownTimer zaman;
	 private final long baslangic = 16 * 1000;
	 private final long bitis = 1 * 1000;
	//
	//sharedpreference database
			private SharedPreference sharedPreference;
			Activity context = this;
		//sharedpreference database
	//ver	
	TextView tscore14;
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
	 
	 int sayac=0; 
	 int sayac14=0;
	 int score14=0;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gicikb14);
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
		
		test14=(TextView)findViewById(R.id.test14);
			
		yanlis=MediaPlayer.create(Gicikb14.this,R.raw.yanlis);
		
		button1=(Button)findViewById(R.id.N1);
		button2=(Button)findViewById(R.id.N2);
		button3=(Button)findViewById(R.id.N3);
		button4=(Button)findViewById(R.id.N4);
		button5=(Button)findViewById(R.id.N5);
		button6=(Button)findViewById(R.id.N6);
		button7=(Button)findViewById(R.id.N7);
		button8=(Button)findViewById(R.id.N8);
		button9=(Button)findViewById(R.id.N9);
		button10=(Button)findViewById(R.id.N10);
		button11=(Button)findViewById(R.id.N11);
		button12=(Button)findViewById(R.id.N12);
		
//		zaman geri say
		  	zaman = new Zamanim(baslangic, bitis);

			//
		
		
		  Random r=new Random(); //random s
	        a=r.nextInt(12)+1; // 1-9 arasn 	(4 dahil)
	        String gelensayi = a + "";				        
	        test14.setText(gelensayi);	
	        
	        
	        tscore14=(TextView)findViewById(R.id.score14);
	        sharedPreference = new SharedPreference();
			topscore = sharedPreference.getValue(context);	
	        tscore14.setText(String.valueOf(topscore));
			
	        restart14=(Button)findViewById(R.id.restart14);
	        restart14.setOnClickListener(new View.OnClickListener() {			
	        	@Override
	        	public void onClick(View v) 
	        	{
	        		 // Restart
					 try {
					      Bundle extras = new Bundle();
					      extras.putInt(TOPSCORE, topscore);
					 
					      Intent intent = new Intent();
					 
					      intent.putExtras(extras);
					  
					      intent.setClass(getApplicationContext(), Gicikb14.class);
					      startActivity(intent);
					      Gicikb14.this.finish();
					  
					    } catch (Exception e) {
					      e.printStackTrace();
					    }
					 //	
	        	}
	        	})   ;	
	      //Ana menuye donus
		       Button back=(Button)findViewById(R.id.back14);
		        back.setOnClickListener(new View.OnClickListener() {			
		        	@Override
		        	public void onClick(View v) 
		        	{
		        		Intent intent = new Intent();	      	 
		      	      intent.setClass(getApplicationContext(), Ana.class);
		      	      startActivity(intent);
		      	      Gicikb14.this.finish();
		        	}});
button1.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) 
{
	sayac14++;
	if(sayac14==1){
		 zaman.start();
	 }
	if(a == b1topdegeri)
	{
		sayac++;
		score14=score14+20;
		 stopscore=score14+topscore+"";
			tscore14.setText(stopscore);
			
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
		 if(sayac<12){
	        	Random r=new Random(); //random s
		        a=r.nextInt(12-sayac)+1; // 1-4 aras
		        String gelensayi = a + "";				        
		        test14.setText(gelensayi);
		      
	        }
		 else{
			 ScoreAl11();
	      }
	}
	else 
	{
		score14=score14-40;
		 stopscore=score14+topscore+"";
			tscore14.setText(stopscore);
			Scoreeksi();
		yanlis.start();
		}				
}
})   ;
button2.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac14++;
	if(sayac14==1){
		 zaman.start();
	 }	
	// F�rsat Buttonu
	tk2++;
	if(tk2>=2){
			button2.setVisibility(View.INVISIBLE);
				score14=score14+20;
				stopscore=score14+topscore+"";
				tscore14.setText(stopscore);
				b2topdegeri=-1;
			}
	//
	else if(a == b2topdegeri)
	{
		tk2=1; //----------------------------------------------- gerekli
		sayac++;
		score14=score14+10;
		 stopscore=score14+topscore+"";
			tscore14.setText(stopscore);
			
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
      if(sayac<12){
      	Random r=new Random(); //random s
	        a=r.nextInt(12-sayac)+1; // 1-4 arasn
	        String gelensayi = a + "";				        
	        test14.setText(gelensayi);
	      
      }else{
    	  ScoreAl11();
      }
	}				
	else {
		tk2--; //----------------------------------------------- gerekli
		score14=score14-20;
		 stopscore=score14+topscore+"";
			tscore14.setText(stopscore);
			Scoreeksi();
		yanlis.start();
		}			
}
})   ;


button3.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) {		
	sayac14++;
	if(sayac14==1){
		 zaman.start();
	 }	
	if(a == b3topdegeri)
	{
		
		sayac++;
		score14=score14+20;
		 stopscore=score14+topscore+"";
			tscore14.setText(stopscore);
			
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
		 if(sayac<12){
	        	Random r=new Random(); //random s
		        a=r.nextInt(12-sayac)+1; // 1-4 aras
		        String gelensayi = a + "";				        
		        test14.setText(gelensayi);
		       
	        }
		 else{
			 ScoreAl11();
	      }
	}				
else   {
	
	score14=score14-40;
	 stopscore=score14+topscore+"";
		tscore14.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;


button4.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac14++;
	if(sayac14==1){
		 zaman.start();
	 }
	// F�rsat Buttonu
	tk4++;
	if(tk4>=2){
			button4.setVisibility(View.INVISIBLE);
				score14=score14-100;
				stopscore=score14+topscore+"";
				tscore14.setText(stopscore);
				b4topdegeri=-1;
			}
	//
	else if(a == b4topdegeri)
	{
		tk4=1; //----------------------------------------------- gerekli
		sayac++;
		score14=score14+20;
		 stopscore=score14+topscore+"";
			tscore14.setText(stopscore);
		
		button4.setVisibility(View.INVISIBLE);	
		b5topdegeri--;
		b6topdegeri--;
		b7topdegeri--;
		b8topdegeri--;
		b9topdegeri--;
		b10topdegeri--;
		b11topdegeri--;
		b12topdegeri--;
		 if(sayac<12){
	        	Random r=new Random(); //random s
		        a=r.nextInt(12-sayac)+1; // 1-4 aras say�in
		        String gelensayi = a + "";				        
		        test14.setText(gelensayi);
	        }
		 else{
			 ScoreAl11();
	      }
}
	
else  {
	tk4--; //----------------------------------------------- gerekli
	score14=score14-40;
	 stopscore=score14+topscore+"";
		tscore14.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button5.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac14++;
	if(sayac14==1){
		 zaman.start();
	 }
	if(a == b5topdegeri)
	{
		sayac++;
		score14=score14+10;
		 stopscore=score14+topscore+"";
			tscore14.setText(stopscore);
			
		button5.setVisibility(View.INVISIBLE);
		b6topdegeri--;
		b7topdegeri--;
		b8topdegeri--;
		b9topdegeri--;
		b10topdegeri--;
		b11topdegeri--;
		b12topdegeri--;
		 if(sayac<12){
	        	Random r=new Random(); //rand
		        a=r.nextInt(12-sayac)+1; // 1-4 arain
		        String gelensayi = a + "";				        
		        test14.setText(gelensayi);
		      
	        }
		 else{
			 ScoreAl11();
	      }
	}
	else 
	{
		score14=score14-20;
		 stopscore=score14+topscore+"";
			tscore14.setText(stopscore);
			Scoreeksi();
		yanlis.start();
		}				
}
})   ;

button6.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac14++;
	if(sayac14==1){
		 zaman.start();
	 }
	if(a == b6topdegeri)
	{
		sayac++;
		score14=score14+20;
		 stopscore=score14+topscore+"";
			tscore14.setText(stopscore);
					
		button6.setVisibility(View.INVISIBLE);				
		b7topdegeri--;
		b8topdegeri--;
		b9topdegeri--;
		b10topdegeri--;
		b11topdegeri--;
		b12topdegeri--;
		 if(sayac<12){
	        	Random r=new Random(); //random s
		        a=r.nextInt(12-sayac)+1; // 1-4 arasn
		        String gelensayi = a + "";				        
		        test14.setText(gelensayi);
	        }
		 else{
			 ScoreAl11();
	      }
}
	
else  {
	score14=score14-40;
	 stopscore=score14+topscore+"";
		tscore14.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button7.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac14++;
	if(sayac14==1){
		 zaman.start();
	 }
	
	if(a == b7topdegeri)
	{	
		
		sayac++;
		score14=score14+20;
		 stopscore=score14+topscore+"";
			tscore14.setText(stopscore);
			
		button7.setVisibility(View.INVISIBLE);	
		b8topdegeri--;
		b9topdegeri--;
		b10topdegeri--;
		b11topdegeri--;
		b12topdegeri--;
		 if(sayac<12){
	        	Random r=new Random(); //random s
		        a=r.nextInt(12-sayac)+1; // 1-4 arasin
		        String gelensayi = a + "";				        
		        test14.setText(gelensayi);
	        }
		 else{
			 ScoreAl11();
	      }
}
	
else  {
	
	score14=score14-40;
	 stopscore=score14+topscore+"";
		tscore14.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button8.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac14++;
	if(sayac14==1){
		 zaman.start();
	 }
	if(a == b8topdegeri)
	{
		sayac++;
		score14=score14+10;
		 stopscore=score14+topscore+"";
			tscore14.setText(stopscore);
			
		button8.setVisibility(View.INVISIBLE);
		b9topdegeri--;
		b10topdegeri--;
		b11topdegeri--;
		b12topdegeri--;
		 if(sayac<12){
	        	Random r=new Random(); //random s
		        a=r.nextInt(12-sayac)+1; // 1-4 ara
		        String gelensayi = a + "";				        
		        test14.setText(gelensayi);
		      
	        }
		 else{
			 ScoreAl11();
	      }
	}
	else 
	{
		score14=score14-20;
		 stopscore=score14+topscore+"";
			tscore14.setText(stopscore);
			Scoreeksi();
		yanlis.start();
		}				
}
})   ;
button9.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac14++;
	if(sayac14==1){
		 zaman.start();
	 }
	// F�rsat Buttonu
				tk9++;
				if(tk9>=2){
						button9.setVisibility(View.INVISIBLE);
							score14=score14-100;
							stopscore=score14+topscore+"";
							tscore14.setText(stopscore);
							b9topdegeri=-1;
						}
				//
				else if(a == b9topdegeri)
	{
		tk9=1; //----------------------------------------------- gerekli
		sayac++;
		score14=score14+20;
		 stopscore=score14+topscore+"";
			tscore14.setText(stopscore);
			
		button9.setVisibility(View.INVISIBLE);
		b10topdegeri--;
		b11topdegeri--;
		b12topdegeri--;
		 if(sayac<12){
	        	Random r=new Random(); //random
		        a=r.nextInt(12-sayac)+1; // 1-4 ar
		        String gelensayi = a + "";				        
		        test14.setText(gelensayi);
	        }
		 else{
			 ScoreAl11();
	      }
}
	
else  {
	tk9--; //----------------------------------------------- gerekli
	score14=score14-40;
	 stopscore=score14+topscore+"";
		tscore14.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button10.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac14++;
	if(sayac14==1){
		 zaman.start();
	 }
	if(a == b10topdegeri)
	{
		
		sayac++;
		score14=score14+20;
		 stopscore=score14+topscore+"";
			tscore14.setText(stopscore);
			
		button10.setVisibility(View.INVISIBLE);
		b11topdegeri--;
		b12topdegeri--;
		 if(sayac<12){
	        	Random r=new Random(); //random
		        a=r.nextInt(12-sayac)+1; // 1-4 arasn
		        String gelensayi = a + "";				        
		        test14.setText(gelensayi);
	        }
		 else{
			 ScoreAl11();
	      }
}
	
else  {
	score14=score14-40;
	 stopscore=score14+topscore+"";
		tscore14.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button11.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac14++;
	if(sayac14==1){
		 zaman.start();
	 }
	// Frsat Buttonu
		tk11++;
		if(tk11>=2){
				button11.setVisibility(View.INVISIBLE);
					score14=score14+20;
					stopscore=score14+topscore+"";
					tscore14.setText(stopscore);
					b11topdegeri=-1;
				}
		//
		else if(a == b11topdegeri)
	{
		
		tk11=1; //----------------------------------------------- gerekli
		sayac++;
		score14=score14+10;
		 stopscore=score14+topscore+"";
			tscore14.setText(stopscore);
			
		button11.setVisibility(View.INVISIBLE);
		b12topdegeri--;
		 if(sayac<12){
	        	Random r=new Random(); //random s
		        a=r.nextInt(12-sayac)+1; // 1-4 aras
		        String gelensayi = a + "";				        
		        test14.setText(gelensayi);
	        }
		 else{
			 ScoreAl11();
	      }
}
	
else  {
	tk11--; //----------------------------------------------- gerekli
	score14=score14-20;
	 stopscore=score14+topscore+"";
		tscore14.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button12.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac14++;
	if(sayac14==1){
		 zaman.start();
	 }
	if(a == b12topdegeri)
	{
		sayac++;
		score14=score14+20;
		 stopscore=score14+topscore+"";
			tscore14.setText(stopscore);		
		button12.setVisibility(View.INVISIBLE);
		 if(sayac<12){
	        	Random r=new Random(); //random
		        a=r.nextInt(12-sayac)+1; // 1-4 aras
		        String gelensayi = a + "";				        
		        test14.setText(gelensayi);
	        }
		 else{
			 ScoreAl11();
	      }
}
	
else  {
	score14=score14-40;
	 stopscore=score14+topscore+"";
		tscore14.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;
	}
	private void Scoreeksi(){
		 // score - ye dusunce	
     if(score14+topscore<0)
     {
     	 // Restart
			 try {
			      Bundle extras = new Bundle();
			      extras.putInt(TOPSCORE, topscore);
			 
			      Intent intent = new Intent();
			 
			      intent.putExtras(extras);
			  
			      intent.setClass(getApplicationContext(), Gicikb14.class);
			      startActivity(intent);
			      Gicikb14.this.finish();
			  
			    } catch (Exception e) {
			      e.printStackTrace();
			    }
			 //	
     }
	}
	private void ScoreAl11() {
		topscore = Integer.parseInt(tscore14.getText().toString().trim());
		// Save the text in SharedPreference
	  	sharedPreference.save(context, topscore,14);
	  	// Save the text in SharedPreference
	    try {
	      Bundle extras = new Bundle();
	      extras.putInt(TOPSCORE, topscore);
	      Intent intent = new Intent();
	 
	      intent.putExtras(extras);
	 
	      intent.setClass(getApplicationContext(), Gicikb15.class);
	      startActivity(intent);
	      Gicikb14.this.finish();
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
				 FrameLayout container14=(FrameLayout)findViewById(R.id.container);
				 container14.setBackgroundResource(R.drawable.lose);	
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
				 //
			 }
			 @Override
			 public void onTick(long a) {
//				1 san
			  	if(a / 1000==10) // 10. sanyede olanlar
			  	{				  		
			  		if(tk4==1){
			  		button4.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button4.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==8){ //9. san
			  		if(tk4>=1){
			  		button4.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 s
			  	if(a / 1000==5) // 10. sanyede olanlar
			  	{				  		
			  		if(tk9==1){
			  		button9.setBackgroundResource(R.drawable.besyuzkirmizi);	
				  	button9.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==3){ //9. sanyede olanlar
			  		if(tk9>=1){
			  		button9.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 san
			  	if(a / 1000==7) // 10. sanyede olanlar
			  	{				  		
			  		if(tk2==1){
			  		button2.setBackgroundResource(R.drawable.besyuzsari);	
				  	button2.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==6){ //9. sanyede olanlar
			  		if(tk2>=1){
			  		button2.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanyelk 11. frsat butonu
			  	if(a / 1000==4) // 10. sanyede olanlar
			  	{				  		
			  		if(tk11==1){
			  		button11.setBackgroundResource(R.drawable.besyuzsari);	
				  	button11.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==3){ //9. sanyede olanlar
			  		if(tk11>=1){
			  		button11.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
			  	
			  	 if(a / 1000==14) 
				  	{							  		
					  l1.setVisibility(View.INVISIBLE);					  					  		
				  	}
				  if(a / 1000==12) 
				  	{							  		
					  l2.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==11) 
				  	{							  		
					  l3.setVisibility(View.INVISIBLE);							  					  		
				  	}
				  if(a / 1000==9) 
				  	{							  		
					  l4.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==8) 
				  	{							  		
					  l5.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==6) 
				  	{	
					  l7.setBackgroundResource(R.drawable.besyuzkir);
					  l8.setBackgroundResource(R.drawable.besyuzkir);
					  l9.setBackgroundResource(R.drawable.besyuzkir);		
					  l0.setBackgroundResource(R.drawable.besyuzkir);
					  l6.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==5) 
				  	{						
					  l7.setVisibility(View.INVISIBLE);	
										  					  		
				  	}
				  if(a / 1000==3) 
				  	{		
					  l8.setVisibility(View.INVISIBLE);	
							  					  		
				  	}
				  if(a / 1000==1) 
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