package com.gicik;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Gicika1 extends Activity  implements FragmentManager.OnBackStackChangedListener {
	//zaman degiskenleri
	//zaman degiskenleri
			private CountDownTimer zaman;
			 private final long baslangic =8 * 1000;
			 private final long bitis = 1 * 1000;
			//
    private Handler mHandler = new Handler();
    private boolean mShowingBack = false;
	Button a1;	
 	String stopscore;
 	
 	//sharedpreference database
 		private SharedPreference sharedPreference;
 		Activity context = this;
 	//sharedpreference database
	
 	//al
	TextView tscore1;
	private int topscore=0;
 	public static String TOPSCORE  = "topscore";	
	//	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gicika1);	
//animasyon		
            mShowingBack = (getFragmentManager().getBackStackEntryCount() > 0);        
        getFragmentManager().addOnBackStackChangedListener(this);       
//
		a1=(Button)findViewById(R.id.A1);
		tscore1=(TextView)findViewById(R.id.score1);
		
		stopscore=topscore+"";
		tscore1.setText(stopscore);
		
		//sharedpreference database
		sharedPreference = new SharedPreference();
		//sharedpreference database
		zaman = new Zamanim(baslangic, bitis);
	 	 zaman.start();
		a1.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View v) {
				topscore=topscore+100;
				stopscore=topscore+"";
				tscore1.setText(stopscore);
		  		
				ScoreAl1();
				
		      }
			
		});
	}
	private void ScoreAl1() {
		
		topscore = Integer.parseInt(tscore1.getText().toString().trim());
		// Save the text in SharedPreference
	  	sharedPreference.save(context, topscore,1);
	  	// Save the text in SharedPreference
	    try {
	 	Bundle extras = new Bundle();
	      extras.putInt(TOPSCORE, topscore);
	      Intent intent = new Intent();
	 
	      intent.putExtras(extras);	 
      intent.setClass(getApplicationContext(), Gicika2.class); //d36 da kaldik
      startActivity(intent);
      Gicika1.this.finish();
    } catch (Exception e) {
      e.printStackTrace();
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
	            return inflater.inflate(R.layout.gicika1anim, container, false);
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
				
			 }
			 @Override
			 public void onTick(long a) {
				 if(a / 1000==6) 
				  	{							  		
					 a1.setBackgroundResource(R.drawable.besyuzgri);					  					  		
				  	}
				 if(a / 1000==5) 
				  	{							  		
					 a1.setBackgroundResource(R.drawable.besyuzsari);					  					  		
				  	}
				 if(a / 1000==4) 
				  	{							  		
					 a1.setBackgroundResource(R.drawable.besyuzyesil);					  					  		
				  	}
				 if(a / 1000==3) 
				  	{							  		
					 a1.setBackgroundResource(R.drawable.besyuzmavi);					  					  		
				  	}
				 if(a / 1000==2) 
				  	{							  		
					 a1.setBackgroundResource(R.drawable.besyuzmor);					  					  		
				  	}
				 if(a / 1000==1) 
				  	{							  		
					 a1.setBackgroundResource(R.drawable.besyuzturuncu);					  					  		
				  	}
			
			 }
		 	}  
	}