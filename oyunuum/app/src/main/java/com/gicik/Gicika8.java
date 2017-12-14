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

public class Gicika8 extends Activity implements FragmentManager.OnBackStackChangedListener {
	TextView l1,l2,l3,l4,l5,l6,l7,l8,l9,l0;
	  private Handler mHandler = new Handler();
	    private boolean mShowingBack = false;

	MediaPlayer yanlis;
	Button restart8,button1,button2,button3,button4,button5,button6,button7,button8,button9;
	TextView test8;
	
	String stopscore;
	//zaman deðiþkenleri
	private CountDownTimer zaman;
	 private final long baslangic = 11 * 1000;
	 private final long bitis = 1 * 1000;
	//
		//sharedpreference database
		private SharedPreference sharedPreference;
		Activity context = this;
	//sharedpreference database
	//ver	
	TextView tscore8;
	 private int topscore = 0;	 
	  //al
	  public static String TOPSCORE  = "topscore";	
	//
	
	int a;
	 int b1topdegeri=1;
	 int b2topdegeri=2;
	 
	 int b4topdegeri=3;

	 int b6topdegeri=4;

	 int b8topdegeri=5;
	 int b9topdegeri=6;
	 
	 int sayac=0; 
	 int sayac8=0;
	 int score8=0;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gicika8);
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
		
		test8=(TextView)findViewById(R.id.test8);
			
		yanlis=MediaPlayer.create(Gicika8.this,R.raw.yanlis);
		
		button1=(Button)findViewById(R.id.H1);
		button2=(Button)findViewById(R.id.H2);
		button3=(Button)findViewById(R.id.H3);
		button4=(Button)findViewById(R.id.H4);
		button5=(Button)findViewById(R.id.H5);
		button6=(Button)findViewById(R.id.H6);
		button7=(Button)findViewById(R.id.H7);
		button8=(Button)findViewById(R.id.H8);
		button9=(Button)findViewById(R.id.H9);
		
//		zaman geri sayým
		  	zaman = new Zamanim(baslangic, bitis);

			//
		
		
		  Random r=new Random(); //random sýnýfý
	        a=r.nextInt(6)+1; // 1-9 arasý sayýlarýn getirimi için 	(4 dahil)	
	        String gelensayi = a + "";				        
	        test8.setText(gelensayi);	
	        
	        
	      //sharedpreferences database
	        tscore8=(TextView)findViewById(R.id.score8);
	    	sharedPreference = new SharedPreference();
			topscore = sharedPreference.getValue(context);							        
	        tscore8.setText(String.valueOf(topscore));	    
	        //sharedpreferences database
			
	        restart8=(Button)findViewById(R.id.restart8);
	        restart8.setOnClickListener(new View.OnClickListener() {			
	        	@Override
	        	public void onClick(View v) 
	        	{
	        		 // Restart
					 try {
					      Bundle extras = new Bundle();
					      extras.putInt(TOPSCORE, topscore);
					 
					      Intent intent = new Intent();
					 
					      intent.putExtras(extras);
					  
					      intent.setClass(getApplicationContext(), Gicika8.class);
					      startActivity(intent);
					      Gicika8.this.finish();
					  
					    } catch (Exception e) {
					      e.printStackTrace();
					    }
					 //	
	        	}
	        	})   ;	
	      //Ana menuye donus
		       Button back=(Button)findViewById(R.id.back8);
		        back.setOnClickListener(new View.OnClickListener() {			
		        	@Override
		        	public void onClick(View v) 
		        	{
		        		Intent intent = new Intent();	      	 
		      	      intent.setClass(getApplicationContext(), Ana.class);
		      	      startActivity(intent);
		      	      Gicika8.this.finish();
		        	}});
button1.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) {
	button3.setVisibility(View.INVISIBLE);
	button5.setVisibility(View.VISIBLE);
	button7.setVisibility(View.VISIBLE);
	sayac8++;
	if(sayac8==1){
		 zaman.start();
	 }
	if(a == b1topdegeri)
	{
		sayac++;
		score8=score8+10;
		 stopscore=score8+topscore+"";
			tscore8.setText(stopscore);
			
		button1.setVisibility(View.INVISIBLE);
		b2topdegeri--;
		b4topdegeri--;	
		b6topdegeri--;
		b8topdegeri--;
		b9topdegeri--;
		 if(sayac<6){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(6-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test8.setText(gelensayi);
		      
	        }
		 else{
			 ScoreAl8();
	      }
	}
	else 
	{
		score8=score8-20;
		 stopscore=score8+topscore+"";
			tscore8.setText(stopscore);
			Scoreeksi();
		yanlis.start();
		}				
}
})   ;
button2.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	button3.setVisibility(View.VISIBLE);
	button5.setVisibility(View.VISIBLE);
	button7.setVisibility(View.VISIBLE);
	sayac8++;
	if(sayac8==1){
		 zaman.start();
	 }
	if(a == b2topdegeri)
	{
		sayac++;
		score8=score8+10;
		 stopscore=score8+topscore+"";
			tscore8.setText(stopscore);
			
		button2.setVisibility(View.INVISIBLE);
		b4topdegeri--;	
		b6topdegeri--;
		b8topdegeri--;
		b9topdegeri--;							
      if(sayac<6){
      	Random r=new Random(); //random sýnýfý
	        a=r.nextInt(6-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
	        String gelensayi = a + "";				        
	        test8.setText(gelensayi);
	      
      }else{
    	  ScoreAl8();
      }
	}				
	else {
		score8=score8-20;
		 stopscore=score8+topscore+"";
			tscore8.setText(stopscore);
			Scoreeksi();
		yanlis.start();
		}			
}
})   ;


button3.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) {	
	
	button3.setVisibility(View.INVISIBLE);
	button5.setVisibility(View.VISIBLE);
	button7.setVisibility(View.VISIBLE);		
		
}
})   ;


button4.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	button3.setVisibility(View.INVISIBLE);
	button5.setVisibility(View.INVISIBLE);
	button7.setVisibility(View.INVISIBLE);
	sayac8++;
	if(sayac8==1){
		 zaman.start();
	 }
	if(a == b4topdegeri)
	{
		sayac++;
		score8=score8+10;
		 stopscore=score8+topscore+"";
			tscore8.setText(stopscore);
		
		button4.setVisibility(View.INVISIBLE);			
		b6topdegeri--;
		b8topdegeri--;
		b9topdegeri--;
		 if(sayac<6){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(6-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 	
		        String gelensayi = a + "";				        
		        test8.setText(gelensayi);
	        }
		 else{
			 ScoreAl8();
	      }
}
	
else  {
	score8=score8-20;
	 stopscore=score8+topscore+"";
		tscore8.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button5.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	
	button3.setVisibility(View.VISIBLE);
	button5.setVisibility(View.INVISIBLE);
	button7.setVisibility(View.VISIBLE);					
}
})   ;
button6.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	button3.setVisibility(View.INVISIBLE);
	button5.setVisibility(View.INVISIBLE);
	button7.setVisibility(View.INVISIBLE);
	sayac8++;
	if(sayac8==1){
		 zaman.start();
	 }
	if(a == b6topdegeri)
	{
		sayac++;
		score8=score8+10;
		 stopscore=score8+topscore+"";
			tscore8.setText(stopscore);
					
		button6.setVisibility(View.INVISIBLE);				
		b8topdegeri--;
		b9topdegeri--;
		 if(sayac<6){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(6-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test8.setText(gelensayi);
	        }
		 else{
			 ScoreAl8();
	      }
}
	
else  {
	score8=score8-20;
	 stopscore=score8+topscore+"";
		tscore8.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button7.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	
	button3.setVisibility(View.VISIBLE);
	button5.setVisibility(View.VISIBLE);
	button7.setVisibility(View.INVISIBLE);	
}
})   ;
button8.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	button3.setVisibility(View.VISIBLE);
	button5.setVisibility(View.VISIBLE);
	button7.setVisibility(View.VISIBLE);
	sayac8++;
	if(sayac8==1){
		 zaman.start();
	 }
	if(a == b8topdegeri)
	{
		sayac++;
		score8=score8+10;
		 stopscore=score8+topscore+"";
			tscore8.setText(stopscore);
			
		button8.setVisibility(View.INVISIBLE);			

		b9topdegeri--;
		 if(sayac<6){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(6-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test8.setText(gelensayi);
	        }
		 else{
			 ScoreAl8();
	      }
}
	
else  {
	score8=score8-20;
	 stopscore=score8+topscore+"";
		tscore8.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;
button9.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {	
	button3.setVisibility(View.VISIBLE);
	button5.setVisibility(View.VISIBLE);
	button7.setVisibility(View.INVISIBLE);
	sayac8++;
	if(sayac8==1){
		 zaman.start();
	 }
	if(a == b9topdegeri)
	{
		sayac++;
		score8=score8+10;
		 stopscore=score8+topscore+"";
			tscore8.setText(stopscore);
			
		button9.setVisibility(View.INVISIBLE);			
		 if(sayac<6){
	        	Random r=new Random(); //random sýnýfý
		        a=r.nextInt(6-sayac)+1; // 1-4 arasý sayýlarýn getirimi için 
		        String gelensayi = a + "";				        
		        test8.setText(gelensayi);
	        }
		 else{
			 ScoreAl8();
	      }
}
	
else  {
	score8=score8-20;
	 stopscore=score8+topscore+"";
		tscore8.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
})   ;
	}
	private void Scoreeksi(){
		 // score - ye dusunce	
      if(score8+topscore<0)
      {
      	 // Restart
			 try {
			      Bundle extras = new Bundle();
			      extras.putInt(TOPSCORE, topscore);
			 
			      Intent intent = new Intent();
			 
			      intent.putExtras(extras);
			  
			      intent.setClass(getApplicationContext(), Gicika8.class);
			      startActivity(intent);
			      Gicika8.this.finish();
			  
			    } catch (Exception e) {
			      e.printStackTrace();
			    }
			 //	
      }
	}
	private void ScoreAl8() {
		topscore = Integer.parseInt(tscore8.getText().toString().trim());
		// Save the text in SharedPreference
	  	sharedPreference.save(context, topscore,8);
	  	// Save the text in SharedPreference
	    try {
	      Bundle extras = new Bundle();
	      extras.putInt(TOPSCORE, topscore);
	      Intent intent = new Intent();
	 
	      intent.putExtras(extras);
	 
	      intent.setClass(getApplicationContext(), Gicika9.class);
	      startActivity(intent);
	      Gicika8.this.finish();
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
				 FrameLayout container8=(FrameLayout)findViewById(R.id.container);
				 container8.setBackgroundResource(R.drawable.lose);	
				 button1.setVisibility(View.INVISIBLE);
				 button2.setVisibility(View.INVISIBLE);
				 button3.setVisibility(View.INVISIBLE);
				 button4.setVisibility(View.INVISIBLE);
				 button5.setVisibility(View.INVISIBLE);
				 button6.setVisibility(View.INVISIBLE);
				 button7.setVisibility(View.INVISIBLE);
				 button8.setVisibility(View.INVISIBLE);
				 button9.setVisibility(View.INVISIBLE);
				
				 //
			 }
			 @Override
			 public void onTick(long a) {
				  if(a / 1000==9) 
				  	{							  		
					  l1.setVisibility(View.INVISIBLE);					  					  		
				  	}
				  if(a / 1000==8) 
				  	{							  		
					  l2.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==7) 
				  	{							  		
					  l3.setVisibility(View.INVISIBLE);							  					  		
				  	}
				  if(a / 1000==6) 
				  	{							  		
					  l4.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==5) 
				  	{							  		
					  l5.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==4) 
				  	{	
					  l7.setBackgroundResource(R.drawable.besyuzkir);
					  l8.setBackgroundResource(R.drawable.besyuzkir);
					  l9.setBackgroundResource(R.drawable.besyuzkir);		
					  l0.setBackgroundResource(R.drawable.besyuzkir);
					  l6.setVisibility(View.INVISIBLE);								  					  		
				  	}
				  if(a / 1000==3) 
				  	{						
					  l7.setVisibility(View.INVISIBLE);	
										  					  		
				  	}
				  if(a / 1000==2) 
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
		            return inflater.inflate(R.layout.gicika8anim, container, false);
		        }
		    }
		}




