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

public class Gicikb13 extends Activity  implements FragmentManager.OnBackStackChangedListener {
	TextView l1,l2,l3,l4,l5,l6,l7,l8,l9,l0;
	  private Handler mHandler = new Handler();
	    private boolean mShowingBack = false;
	MediaPlayer yanlis;
	Button restart13,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12;
	TextView test13;
	
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
	TextView tscore13;
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
	 int sayac13=0;
	 int score13=0;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gicikb13);
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
		
		test13=(TextView)findViewById(R.id.test13);
			
		yanlis=MediaPlayer.create(Gicikb13.this,R.raw.yanlis);
		
		button1=(Button)findViewById(R.id.M1);
		button2=(Button)findViewById(R.id.M2);
		button3=(Button)findViewById(R.id.M3);
		button4=(Button)findViewById(R.id.M4);
		button5=(Button)findViewById(R.id.M5);
		button6=(Button)findViewById(R.id.M6);
		button7=(Button)findViewById(R.id.M7);
		button8=(Button)findViewById(R.id.M8);
		button9=(Button)findViewById(R.id.M9);
		button10=(Button)findViewById(R.id.M10);
		button11=(Button)findViewById(R.id.M11);
		button12=(Button)findViewById(R.id.M12);
		
//		zaman geri saym
		  	zaman = new Zamanim(baslangic, bitis);

			//
		
		
		  Random r=new Random(); //random sn
	        a=r.nextInt(12)+1; // 1-9 aras saylarn getirimi iin 	(4 dahil)
	        String gelensayi = a + "";				        
	        test13.setText(gelensayi);	
	        
	        
	        tscore13=(TextView)findViewById(R.id.score13);
	        sharedPreference = new SharedPreference();
			topscore = sharedPreference.getValue(context);	
	        tscore13.setText(String.valueOf(topscore));
		// score - ye dusunce	
	        if(topscore<0)
	        {
	        	 // Restart
				 try {
				      Bundle extras = new Bundle();
				      extras.putInt(TOPSCORE, topscore);
				 
				      Intent intent = new Intent();
				 
				      intent.putExtras(extras);
				  
				      intent.setClass(getApplicationContext(), Gicikb13.class);
				      startActivity(intent);
				      Gicikb13.this.finish();
				  
				    } catch (Exception e) {
				      e.printStackTrace();
				    }
				 //	
	        }
	        restart13=(Button)findViewById(R.id.restart13);
	        restart13.setOnClickListener(new View.OnClickListener() {			
	        	@Override
	        	public void onClick(View v) 
	        	{
	        		 // Restart
					 try {
					      Bundle extras = new Bundle();
					      extras.putInt(TOPSCORE, topscore);
					 
					      Intent intent = new Intent();
					 
					      intent.putExtras(extras);
					  
					      intent.setClass(getApplicationContext(), Gicikb13.class);
					      startActivity(intent);
					      Gicikb13.this.finish();
					  
					    } catch (Exception e) {
					      e.printStackTrace();
					    }
					 //	
	        	}
	        	})   ;	
	      //Ana menuye donus
		       Button back=(Button)findViewById(R.id.back13);
		        back.setOnClickListener(new View.OnClickListener() {			
		        	@Override
		        	public void onClick(View v) 
		        	{
		        		Intent intent = new Intent();	      	 
		      	      intent.setClass(getApplicationContext(), Ana.class);
		      	      startActivity(intent);
		      	      Gicikb13.this.finish();
		        	}});
button1.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) 
{
	sayac13++;
	if(sayac13==1){
		 zaman.start();
	 }
	if(a == b1topdegeri)
	{
		sayac++;
		score13=score13+10;
		 stopscore=score13+topscore+"";
			tscore13.setText(stopscore);
			
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
	        	Random r=new Random(); //random snf
		        a=r.nextInt(12-sayac)+1; // 1-4 aras saylarn getirimi in
		        String gelensayi = a + "";				        
		        test13.setText(gelensayi);
		      
	        }
		 else{
			 ScoreAl11();
	      }
	}
	else 
	{
		score13=score13-20;
		 stopscore=score13+topscore+"";
			tscore13.setText(stopscore);
			Scoreeksi();
		yanlis.start();
		}				
}
})   ;
button2.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac13++;
	if(sayac13==1){
		 zaman.start();
	 }	
	
	if(a == b2topdegeri)
	{
		sayac++;
		score13=score13+20;
		 stopscore=score13+topscore+"";
			tscore13.setText(stopscore);
			
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
      	Random r=new Random(); //random snf
	        a=r.nextInt(12-sayac)+1; // 1-4 aras saylarn getirimi iin
	        String gelensayi = a + "";				        
	        test13.setText(gelensayi);
	      
      }else{
    	  ScoreAl11();
      }
	}				
	else {
		score13=score13-40;
		 stopscore=score13+topscore+"";
			tscore13.setText(stopscore);
			Scoreeksi();
		yanlis.start();
		}			
}
})   ;


button3.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) {		
	sayac13++;
	if(sayac13==1){
		 zaman.start();
	 }	
	if(a == b3topdegeri)
	{
		
		sayac++;
		score13=score13+10;
		 stopscore=score13+topscore+"";
			tscore13.setText(stopscore);
			
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
	        	Random r=new Random(); //random snf
		        a=r.nextInt(12-sayac)+1; // 1-4 aras saylarn getirimi iin
		        String gelensayi = a + "";				        
		        test13.setText(gelensayi);
		       
	        }
		 else{
			 ScoreAl11();
	      }
	}				
else   {
	
	score13=score13-20;
	 stopscore=score13+topscore+"";
		tscore13.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;


button4.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac13++;
	if(sayac13==1){
		 zaman.start();
	 }
	if(a == b4topdegeri)
	{
		sayac++;
		score13=score13+10;
		 stopscore=score13+topscore+"";
			tscore13.setText(stopscore);
		
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
	        	Random r=new Random(); //random sn
		        a=r.nextInt(12-sayac)+1; // 1-4 aras saylarn getirimi iin
		        String gelensayi = a + "";				        
		        test13.setText(gelensayi);
	        }
		 else{
			 ScoreAl11();
	      }
}
	
else  {
	score13=score13-20;
	 stopscore=score13+topscore+"";
		tscore13.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button5.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac13++;
	if(sayac13==1){
		 zaman.start();
	 }
	// F�rsat Buttonu
			tk5++;
			if(tk5>=2){
					button5.setVisibility(View.INVISIBLE);
						score13=score13+20;
						stopscore=score13+topscore+"";
						tscore13.setText(stopscore);
						b5topdegeri=-1;
					}
			//
			else if(a == b5topdegeri)
	{
		tk5=1; //----------------------------------------------- gerekli
		sayac++;
		score13=score13+10;
		 stopscore=score13+topscore+"";
			tscore13.setText(stopscore);
			
		button5.setVisibility(View.INVISIBLE);
		b6topdegeri--;
		b7topdegeri--;
		b8topdegeri--;
		b9topdegeri--;
		b10topdegeri--;
		b11topdegeri--;
		b12topdegeri--;
		 if(sayac<12){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(12-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 	
		        String gelensayi = a + "";				        
		        test13.setText(gelensayi);
		      
	        }
		 else{
			 ScoreAl11();
	      }
	}
	else 
	{
		tk5--;// ---------------------------------------------------gerekli
		score13=score13-20;
		 stopscore=score13+topscore+"";
			tscore13.setText(stopscore);
			Scoreeksi();
		yanlis.start();
		}				
}
})   ;

button6.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac13++;
	if(sayac13==1){
		 zaman.start();
	 }
	// F�rsat Buttonu
				tk6++;
				if(tk6>=2){
						button6.setVisibility(View.INVISIBLE);
						
							stopscore=score13+topscore+"";
							tscore13.setText(stopscore);
							b6topdegeri=-1;
						}
				//
				else if(a == b6topdegeri)
	{
		tk6=1; //----------------------------------------------- gerekli
		sayac++;
		score13=score13+20;
		 stopscore=score13+topscore+"";
			tscore13.setText(stopscore);
					
		button6.setVisibility(View.INVISIBLE);				
		b7topdegeri--;
		b8topdegeri--;
		b9topdegeri--;
		b10topdegeri--;
		b11topdegeri--;
		b12topdegeri--;
		 if(sayac<12){
	        	Random r=new Random(); //random snf
		        a=r.nextInt(12-sayac)+1; // 1-4 aras saylarn getirimi iin
		        String gelensayi = a + "";				        
		        test13.setText(gelensayi);
	        }
		 else{
			 ScoreAl11();
	      }
}
	
else  {
	tk6--; //----------------------------------------------- gerekli
	score13=score13-40;
	 stopscore=score13+topscore+"";
		tscore13.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button7.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac13++;
	if(sayac13==1){
		 zaman.start();
	 }
	// Frsat Buttonu
	tk7++;
	if(tk7>=2){
			button7.setVisibility(View.INVISIBLE);				
				stopscore=score13+topscore+"";
				tscore13.setText(stopscore);
				b7topdegeri=-1;
			}
	//
	
	else if(a == b7topdegeri)
	{	
		tk7=1; //----------------------------------------------- gerekli
		sayac++;
		score13=score13+20;
		 stopscore=score13+topscore+"";
			tscore13.setText(stopscore);
			
		button7.setVisibility(View.INVISIBLE);	
		b8topdegeri--;
		b9topdegeri--;
		b10topdegeri--;
		b11topdegeri--;
		b12topdegeri--;
		 if(sayac<12){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(12-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test13.setText(gelensayi);
	        }
		 else{
			 ScoreAl11();
	      }
}
	
else  {
	tk7--; //----------------------------------------------- gerekli
	score13=score13-40;
	 stopscore=score13+topscore+"";
		tscore13.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button8.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac13++;
	if(sayac13==1){
		 zaman.start();
	 }
	// Frsat Buttonu
				tk8++;
				if(tk8>=2){
						button8.setVisibility(View.INVISIBLE);
							score13=score13+20;
							stopscore=score13+topscore+"";
							tscore13.setText(stopscore);
							b8topdegeri=-1;
						}
				//
				else if(a == b8topdegeri)
	{
		tk8=1;// ---------------------------------------------------gerekli
		sayac++;
		score13=score13+10;
		 stopscore=score13+topscore+"";
			tscore13.setText(stopscore);
			
		button8.setVisibility(View.INVISIBLE);
		b9topdegeri--;
		b10topdegeri--;
		b11topdegeri--;
		b12topdegeri--;
		 if(sayac<12){
	        	Random r=new Random(); //random snf
		        a=r.nextInt(12-sayac)+1; // 1-4 aras saylarn getirimi iin
		        String gelensayi = a + "";				        
		        test13.setText(gelensayi);
		      
	        }
		 else{
			 ScoreAl11();
	      }
	}
	else 
	{
		tk8--;// ---------------------------------------------------gerekli
		score13=score13-20;
		 stopscore=score13+topscore+"";
			tscore13.setText(stopscore);
			Scoreeksi();
		yanlis.start();
		}				
}
})   ;
button9.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac13++;
	if(sayac13==1){
		 zaman.start();
	 }
	if(a == b9topdegeri)
	{
		sayac++;
		score13=score13+10;
		 stopscore=score13+topscore+"";
			tscore13.setText(stopscore);
			
		button9.setVisibility(View.INVISIBLE);
		b10topdegeri--;
		b11topdegeri--;
		b12topdegeri--;
		 if(sayac<12){
	        	Random r=new Random(); //random s�n�f�
		        a=r.nextInt(12-sayac)+1; // 1-4 aras� say�lar�n getirimi i�in 
		        String gelensayi = a + "";				        
		        test13.setText(gelensayi);
	        }
		 else{
			 ScoreAl11();
	      }
}
	
else  {
	score13=score13-20;
	 stopscore=score13+topscore+"";
		tscore13.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button10.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac13++;
	if(sayac13==1){
		 zaman.start();
	 }
	if(a == b10topdegeri)
	{
		
		sayac++;
		score13=score13+10;
		 stopscore=score13+topscore+"";
			tscore13.setText(stopscore);
			
		button10.setVisibility(View.INVISIBLE);
		b11topdegeri--;
		b12topdegeri--;
		 if(sayac<12){
	        	Random r=new Random(); //random snf
		        a=r.nextInt(12-sayac)+1; // 1-4 aras saylarn getirimi iin
		        String gelensayi = a + "";				        
		        test13.setText(gelensayi);
	        }
		 else{
			 ScoreAl11();
	      }
}
	
else  {
	score13=score13-20;
	 stopscore=score13+topscore+"";
		tscore13.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button11.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac13++;
	if(sayac13==1){
		 zaman.start();
	 }
	if(a == b11topdegeri)
	{
		sayac++;
		score13=score13+20;
		 stopscore=score13+topscore+"";
			tscore13.setText(stopscore);
			
		button11.setVisibility(View.INVISIBLE);
		b12topdegeri--;
		 if(sayac<12){
	        	Random r=new Random(); //random snf
		        a=r.nextInt(12-sayac)+1; // 1-4 aras saylarn getirimi iin
		        String gelensayi = a + "";				        
		        test13.setText(gelensayi);
	        }
		 else{
			 ScoreAl11();
	      }
}
	
else  {
	score13=score13-40;
	 stopscore=score13+topscore+"";
		tscore13.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button12.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	sayac13++;
	if(sayac13==1){
		 zaman.start();
	 }
	if(a == b12topdegeri)
	{
		sayac++;
		score13=score13+10;
		 stopscore=score13+topscore+"";
			tscore13.setText(stopscore);		
		button12.setVisibility(View.INVISIBLE);
		 if(sayac<12){
	        	Random r=new Random(); //random snf
		        a=r.nextInt(12-sayac)+1; // 1-4 aras sayarn getirimi iin
		        String gelensayi = a + "";				        
		        test13.setText(gelensayi);
	        }
		 else{
			 ScoreAl11();
	      }
}
	
else  {
	score13=score13-20;
	 stopscore=score13+topscore+"";
		tscore13.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;
	}
	private void Scoreeksi(){
		 // score - ye dusunce	
     if(score13+topscore<0)
     {
     	 // Restart
			 try {
				 
			      Bundle extras = new Bundle();
			      extras.putInt(TOPSCORE, topscore);
			 
			      Intent intent = new Intent();
			 
			      intent.putExtras(extras);
			  
			      intent.setClass(getApplicationContext(), Gicikb13.class);
			      startActivity(intent);
			      Gicikb13.this.finish();
			  
			    } catch (Exception e) {
			      e.printStackTrace();
			    }
			 //	
     }
	}
	private void ScoreAl11() {
		topscore = Integer.parseInt(tscore13.getText().toString().trim());
		// Save the text in SharedPreference
	  	sharedPreference.save(context, topscore,13);
	  	// Save the text in SharedPreference
	    try {
	      Bundle extras = new Bundle();
	      extras.putInt(TOPSCORE, topscore);
	      Intent intent = new Intent();
	 
	      intent.putExtras(extras);
	 
	      intent.setClass(getApplicationContext(), Gicikb14.class);
	      startActivity(intent);
	      Gicikb13.this.finish();
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
				//sre bitince
				 FrameLayout container13=(FrameLayout)findViewById(R.id.container);
				 container13.setBackgroundResource(R.drawable.lose);	
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
//				1 sanyelk 5. frsat butonu
			  	if(a / 1000==10) // 10. sanyede olanlar
			  	{				  		
			  		if(tk5==1){
			  		button5.setBackgroundResource(R.drawable.besyuzsari);	
				  	button5.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==9){ //9. sanyede olanlar
			  		if(tk5>=1){
			  		button5.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanyelk 8. frsat butonu
			  	if(a / 1000==5) // 10. sanyede olanlar
			  	{				  		
			  		if(tk8==1){
			  		button8.setBackgroundResource(R.drawable.besyuzsari);	
				  	button8.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==4){ //9. sanyede olanlar
			  		if(tk8>=1){
			  		button8.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanyelk 6. frsat butonu
			  	if(a / 1000==9) // 10. sanyede olanlar
			  	{				  		
			  		if(tk6==1){
			  		button6.setBackgroundResource(R.drawable.besyuzgri);	
				  	button6.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==8){ //9. sanyede olanlar
			  		if(tk6>=1){
			  		button6.setVisibility(View.INVISIBLE);
			  		}			  		
			 	}
//
//				1 sanyelk 7. frsat butonu
			  	if(a / 1000==6) // 10. san�yede olanlar
			  	{				  		
			  		if(tk7==1){
			  		button7.setBackgroundResource(R.drawable.besyuzgri);	
				  	button7.setVisibility(View.VISIBLE);
			  		}			  		
			  	}
			  	if(a/1000==5){ //9. sanyede olanlar
			  		if(tk7>=1){
			  		button7.setVisibility(View.INVISIBLE);
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

