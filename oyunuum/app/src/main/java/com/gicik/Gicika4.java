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

public class Gicika4 extends Activity implements FragmentManager.OnBackStackChangedListener {
	TextView l1,l2,l3,l4,l5,l6,l7,l8,l9,l0;
    private Handler mHandler = new Handler();
    private boolean mShowingBack = false;

	MediaPlayer yanlis;
	Button restart4,button1,button2,button3,button4,button5,button6;
	TextView test4;
	String stopscore;
	//zaman degkenleri
	private CountDownTimer zaman;
	 private final long baslangic = 11 * 1000;
	 private final long bitis = 1 * 1000;
	//
		//sharedpreference database
		private SharedPreference sharedPreference;
		Activity context = this;
	//sharedpreference database
	 //score degiikenleri
	TextView tscore4;	
	 private int topscore = 0;	 
	  public static String TOPSCORE  = "topscore";	
	  //
	  
	int a;
	 int b1topdegeri=1;
	 int b2topdegeri=2;
	 int b5topdegeri=3;
	 int b6topdegeri=4;
	 
	 int sayac=0;
	 int sayac4=0;
	 int score4=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gicika4);
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
	
		test4=(TextView)findViewById(R.id.test4);
			
		yanlis=MediaPlayer.create(Gicika4.this,R.raw.yanlis);
		
		button1=(Button)findViewById(R.id.D1);
		button2=(Button)findViewById(R.id.D2);
		button3=(Button)findViewById(R.id.D3);
		button4=(Button)findViewById(R.id.D4);
		button5=(Button)findViewById(R.id.D5);
		button6=(Button)findViewById(R.id.D6);
				
		button3.setVisibility(View.INVISIBLE);
		button4.setVisibility(View.INVISIBLE);
		
		//	zaman geri sayim
	  	zaman = new Zamanim(baslangic, bitis);
	  	
	  	
		//
	
		  Random r=new Random(); //random sinifi
	        a=r.nextInt(4)+1; // 1-6 arasi sailarin getirimi icin 	(4 dahil)
	        String gelensayi = a + "";				        
	        test4.setText(gelensayi);	
	        
	        
	        //sharedpreferences database
	    	sharedPreference = new SharedPreference();
			topscore = sharedPreference.getValue(context);						
	        tscore4=(TextView)findViewById(R.id.score4);
	        tscore4.setText(String.valueOf(topscore));	    
	        //sharedpreferences database 
	    
	        restart4=(Button)findViewById(R.id.restart4);
	        restart4.setOnClickListener(new View.OnClickListener() {			
	        	@Override
	        	public void onClick(View v) 
	        	{
	        		 // Restart
					 try {
					      Bundle extras = new Bundle();
					      extras.putInt(TOPSCORE, topscore);
					 
					      Intent intent = new Intent();
					 
					      intent.putExtras(extras);
					  
					      intent.setClass(getApplicationContext(), Gicika4.class);
					      startActivity(intent);
					      Gicika4.this.finish();
					  
					    } catch (Exception e) {
					      e.printStackTrace();
					    }
					 //	
	        	}
	        	})   ;
	      //Ana menuye donus
		       Button back=(Button)findViewById(R.id.back4);
		        back.setOnClickListener(new View.OnClickListener() {			
		        	@Override
		        	public void onClick(View v) 
		        	{
		        		Intent intent = new Intent();	      	 
		      	      intent.setClass(getApplicationContext(), Ana.class);
		      	      startActivity(intent);
		      	      Gicika4.this.finish();
		        	}});
button1.setOnClickListener(new View.OnClickListener() {			
@Override
public void onClick(View v) {
	sayac4++;
	if(sayac4==1){
		 zaman.start();
	 }
	if(a == b1topdegeri)
	{
		sayac++;
		score4=score4+10;
        stopscore=score4+topscore+"";
		tscore4.setText(stopscore);
		
		button1.setVisibility(View.INVISIBLE);
		b2topdegeri--;
		b5topdegeri--;	
		b6topdegeri--;
		 if(sayac<4){
	        	Random r=new Random(); //random sinifi
		        a=r.nextInt(4-sayac)+1; // 1-6 arasi sayilarin getirimi icin
		        String gelensayi = a + "";				        
		        test4.setText(gelensayi);			      
	        }		 
			 else{
		 
	        	ScoreAl4();	        	
	        }
		
	}
	else 
	{
		score4=score4-20;
		 stopscore=score4+topscore+"";
			tscore4.setText(stopscore);
			Scoreeksi();
		yanlis.start();
		}				
}
})   ;
button2.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac4++;
	if(sayac4==1){
		 zaman.start();
	 }
	if(a == b2topdegeri)
	{
		sayac++;
		score4=score4+10;
		 stopscore=score4+topscore+"";
			tscore4.setText(stopscore);
			
		button2.setVisibility(View.INVISIBLE);
	
		b5topdegeri--;	
		b6topdegeri--;
      if(sayac<4){
      	Random r=new Random(); //random sinifi
	        a=r.nextInt(4-sayac)+1; // 1-4 arasi sayilarin getirimi icin
	        String gelensayi = a + "";				        
	        test4.setText(gelensayi);	
	      
      }
      else{
    	  ScoreAl4();      	
      		}
      }				
	else {
		score4=score4-20;
		 stopscore=score4+topscore+"";
			tscore4.setText(stopscore);
			Scoreeksi();
		yanlis.start();
		}			

}})   ;


button5.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac4++;
	if(sayac4==1){
		 zaman.start();
	 }
	if(a == b5topdegeri)
	{
		sayac++;
		score4=score4+10;
		 stopscore=score4+topscore+"";
			tscore4.setText(stopscore);
		button5.setVisibility(View.INVISIBLE);
		b6topdegeri--;
		 if(sayac<4){
	        	Random r=new Random(); //random sinifi
		        a=r.nextInt(4-sayac)+1; // 1-4 arasi sayilarin getirimi icin
		        String gelensayi = a + "";				        
		        test4.setText(gelensayi);	
	        }		
		 else{
			 ScoreAl4();	        		        
		 }
	 }
	
else  {
	score4=score4-20;
	 stopscore=score4+topscore+"";
		tscore4.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
});

button6.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View v) {
	sayac4++;
	if(sayac4==1){
		 zaman.start();
	 }
	if(a == b6topdegeri)
	{
		sayac++;
		score4=score4+10;
		 stopscore=score4+topscore+"";
			tscore4.setText(stopscore);
		button6.setVisibility(View.INVISIBLE);
		 if(sayac<4){
	        	Random r=new Random(); //random sinifi
		        a=r.nextInt(4-sayac)+1; // 1-4 arasi sayilarin getirimi icn
		        String gelensayi = a + "";				        
		        test4.setText(gelensayi);	
	        }		
		 else{
			 ScoreAl4();	        		        
		 }
	 }
	
else  {
	score4=score4-20;
	 stopscore=score4+topscore+"";
		tscore4.setText(stopscore);
		Scoreeksi();
	yanlis.start();
	}	
}
});
}
	private void Scoreeksi(){
		 // score - ye dusunce	
      if(score4+topscore<0)
      {
      	 // Restart
			 try {
			      Bundle extras = new Bundle();
			      extras.putInt(TOPSCORE, topscore);
			 
			      Intent intent = new Intent();
			 
			      intent.putExtras(extras);
			  
			      intent.setClass(getApplicationContext(), Gicika4.class);
			      startActivity(intent);
			      Gicika4.this.finish();
			  
			    } catch (Exception e) {
			      e.printStackTrace();
			    }
			 //	
      }
	}
	private void ScoreAl4() {
		topscore = Integer.parseInt(tscore4.getText().toString().trim());
		// Save the text in SharedPreference
	  	sharedPreference.save(context, topscore,4);
	  	// Save the text in SharedPreference
	    try {	 
	      Bundle extras = new Bundle();
	      extras.putInt(TOPSCORE, topscore);

	      Intent intent = new Intent();
	 
	      intent.putExtras(extras);
	 
	      intent.setClass(getApplicationContext(), Gicika5.class);
	      startActivity(intent);
	      Gicika4.this.finish();
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
				 FrameLayout container4=(FrameLayout)findViewById(R.id.container);
				 container4.setBackgroundResource(R.drawable.lose);	
				 button1.setVisibility(View.INVISIBLE);
				 button2.setVisibility(View.INVISIBLE);
				 button3.setVisibility(View.INVISIBLE);
				 button4.setVisibility(View.INVISIBLE);
				 button5.setVisibility(View.INVISIBLE);
				 button6.setVisibility(View.INVISIBLE);
				
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
		            return inflater.inflate(R.layout.gicika4anim, container, false);
		        }
		    }
		}


	