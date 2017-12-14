package com.gicik;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Ana extends Activity {

	Button bolum1,bolum2,bolum3,bolum4,bolum5,bolum6,bolum7,bolum8,bolum9,bolum10,
	bolum11,bolum12,bolum13,bolum14,bolum15,bolum16,bolum17,bolum18,bolum19,bolum20,
	bolum21,bolum22,bolum23,bolum24,bolum25,bolum26,bolum27,bolum28,bolum29,bolum30,
	bolum31,bolum32,bolum33,bolum34,bolum35,bolum36,bolum37,bolum38,bolum39,bolum40,
	bolum41,bolum42,bolum43,bolum44,bolum45,bolum46,bolum47,bolum48,bolum49,bolum50;
	private static final int DIALOG_SAVE_CONFIRM = 0;
	//sharedpreference database
		private SharedPreference sharedPreference;
		Activity context = this;
	servismanager Servismanager;
	//sharedpreference database	
	 
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ana);
		Servismanager=new servismanager();
		 ActionBar actionBar = getActionBar();
	        actionBar.setHomeButtonEnabled(true);	    

		bolum1=(Button)findViewById(R.id.Bolum1);bolum2=(Button)findViewById(R.id.Bolum2);
		bolum3=(Button)findViewById(R.id.Bolum3);bolum4=(Button)findViewById(R.id.Bolum4);
		bolum5=(Button)findViewById(R.id.Bolum5);bolum6=(Button)findViewById(R.id.Bolum6);
		bolum7=(Button)findViewById(R.id.Bolum7);bolum8=(Button)findViewById(R.id.Bolum8);
		bolum9=(Button)findViewById(R.id.Bolum9);bolum10=(Button)findViewById(R.id.Bolum10);
		bolum11=(Button)findViewById(R.id.Bolum11);bolum12=(Button)findViewById(R.id.Bolum12);
		bolum13=(Button)findViewById(R.id.Bolum13);bolum14=(Button)findViewById(R.id.Bolum14);
		bolum15=(Button)findViewById(R.id.Bolum15);bolum16=(Button)findViewById(R.id.Bolum16);
		bolum17=(Button)findViewById(R.id.Bolum17);bolum18=(Button)findViewById(R.id.Bolum18);
		bolum19=(Button)findViewById(R.id.Bolum19);bolum20=(Button)findViewById(R.id.Bolum20);
		bolum21=(Button)findViewById(R.id.Bolum21);bolum22=(Button)findViewById(R.id.Bolum22);
		bolum23=(Button)findViewById(R.id.Bolum23);bolum24=(Button)findViewById(R.id.Bolum24);
		bolum25=(Button)findViewById(R.id.Bolum25);bolum26=(Button)findViewById(R.id.Bolum26);
		bolum27=(Button)findViewById(R.id.Bolum27);bolum28=(Button)findViewById(R.id.Bolum28);
		bolum29=(Button)findViewById(R.id.Bolum29);bolum30=(Button)findViewById(R.id.Bolum30);
		bolum31=(Button)findViewById(R.id.Bolum31);bolum32=(Button)findViewById(R.id.Bolum32);
		bolum33=(Button)findViewById(R.id.Bolum33);bolum34=(Button)findViewById(R.id.Bolum34);
		bolum35=(Button)findViewById(R.id.Bolum35);bolum36=(Button)findViewById(R.id.Bolum36);
		bolum37=(Button)findViewById(R.id.Bolum37);bolum38=(Button)findViewById(R.id.Bolum38);
		bolum39=(Button)findViewById(R.id.Bolum39);bolum40=(Button)findViewById(R.id.Bolum40);
		bolum41=(Button)findViewById(R.id.Bolum41);bolum42=(Button)findViewById(R.id.Bolum42);
		bolum43=(Button)findViewById(R.id.Bolum43);bolum44=(Button)findViewById(R.id.Bolum44);
		bolum45=(Button)findViewById(R.id.Bolum45);bolum46=(Button)findViewById(R.id.Bolum46);
		bolum47=(Button)findViewById(R.id.Bolum47);bolum48=(Button)findViewById(R.id.Bolum48);
		bolum49=(Button)findViewById(R.id.Bolum49);bolum50=(Button)findViewById(R.id.Bolum50);
		sharedPreference = new SharedPreference();
		if(sharedPreference.getValue1(context)>=1){
			bolum1.setBackgroundResource(R.drawable.besyuzyesil);
			bolum2.setBackgroundResource(R.drawable.besyuzsari);		
			bolum2.setEnabled(true);
			bolum1.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=2){
			bolum2.setBackgroundResource(R.drawable.besyuzyesil);
			bolum3.setBackgroundResource(R.drawable.besyuzsari);
			bolum3.setEnabled(true);
			bolum2.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=3){
			bolum3.setBackgroundResource(R.drawable.besyuzyesil);
			bolum4.setBackgroundResource(R.drawable.besyuzsari);
			bolum4.setEnabled(true);
			bolum3.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=4){
			bolum4.setBackgroundResource(R.drawable.besyuzyesil);
			bolum5.setBackgroundResource(R.drawable.besyuzsari);
			bolum5.setEnabled(true);
			bolum4.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=5){
			bolum5.setBackgroundResource(R.drawable.besyuzyesil);
			bolum6.setBackgroundResource(R.drawable.besyuzsari);
			bolum6.setEnabled(true);
			bolum5.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=6){
			bolum6.setBackgroundResource(R.drawable.besyuzyesil);
			bolum7.setBackgroundResource(R.drawable.besyuzsari);
			bolum7.setEnabled(true);
			bolum6.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=7){
			bolum7.setBackgroundResource(R.drawable.besyuzyesil);
			bolum8.setBackgroundResource(R.drawable.besyuzsari);
			bolum8.setEnabled(true);
			bolum7.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=8){
			bolum8.setBackgroundResource(R.drawable.besyuzyesil);
			bolum9.setBackgroundResource(R.drawable.besyuzsari);
			bolum9.setEnabled(true);
			bolum8.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=9){
			bolum9.setBackgroundResource(R.drawable.besyuzyesil);
			bolum10.setBackgroundResource(R.drawable.besyuzsari);
			bolum10.setEnabled(true);
			bolum9.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=10){
			bolum10.setBackgroundResource(R.drawable.besyuzyesil);
			bolum11.setBackgroundResource(R.drawable.besyuzsari);
			bolum11.setEnabled(true);
			bolum10.setEnabled(false);
		}	
		
		
		if(sharedPreference.getValue1(context)>=11){
			bolum11.setBackgroundResource(R.drawable.besyuzyesil);
			bolum12.setBackgroundResource(R.drawable.besyuzsari);
			bolum12.setEnabled(true);
			bolum11.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=12){
			bolum12.setBackgroundResource(R.drawable.besyuzyesil);
			bolum13.setBackgroundResource(R.drawable.besyuzsari);
			bolum13.setEnabled(true);
			bolum12.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=13){
			bolum13.setBackgroundResource(R.drawable.besyuzyesil);
			bolum14.setBackgroundResource(R.drawable.besyuzsari);
			bolum14.setEnabled(true);
			bolum13.setEnabled(false);
			
		}
		if(sharedPreference.getValue1(context)>=14){
			bolum14.setBackgroundResource(R.drawable.besyuzyesil);
			bolum15.setBackgroundResource(R.drawable.besyuzsari);
			bolum15.setEnabled(true);
			bolum14.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=15){
			bolum15.setBackgroundResource(R.drawable.besyuzyesil);
			bolum16.setBackgroundResource(R.drawable.besyuzsari);
			bolum16.setEnabled(true);
			bolum15.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=16){
			bolum16.setBackgroundResource(R.drawable.besyuzyesil);
			bolum17.setBackgroundResource(R.drawable.besyuzsari);
			bolum17.setEnabled(true);
			bolum16.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=17){
			bolum17.setBackgroundResource(R.drawable.besyuzyesil);
			bolum18.setBackgroundResource(R.drawable.besyuzsari);
			bolum18.setEnabled(true);
			bolum17.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=18){
			bolum18.setBackgroundResource(R.drawable.besyuzyesil);
			bolum19.setBackgroundResource(R.drawable.besyuzsari);
			bolum19.setEnabled(true);
			bolum18.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=19){
			bolum19.setBackgroundResource(R.drawable.besyuzyesil);
			bolum20.setBackgroundResource(R.drawable.besyuzsari);
			bolum20.setEnabled(true);
			bolum19.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=20){
			bolum20.setBackgroundResource(R.drawable.besyuzyesil);
			bolum21.setBackgroundResource(R.drawable.besyuzsari);
			bolum21.setEnabled(true);
			bolum20.setEnabled(false);
		}
		
		
		if(sharedPreference.getValue1(context)>=21){
			bolum21.setBackgroundResource(R.drawable.besyuzyesil);
			bolum22.setBackgroundResource(R.drawable.besyuzsari);
			bolum22.setEnabled(true);
			bolum21.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=22){
			bolum22.setBackgroundResource(R.drawable.besyuzyesil);
			bolum23.setBackgroundResource(R.drawable.besyuzsari);
			bolum23.setEnabled(true);
			bolum22.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=23){
			bolum23.setBackgroundResource(R.drawable.besyuzyesil);
			bolum24.setBackgroundResource(R.drawable.besyuzsari);
			bolum24.setEnabled(true);
			bolum23.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=24){
			bolum24.setBackgroundResource(R.drawable.besyuzyesil);
			bolum25.setBackgroundResource(R.drawable.besyuzsari);
			bolum25.setEnabled(true);
			bolum24.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=25){
			bolum25.setBackgroundResource(R.drawable.besyuzyesil);
			bolum26.setBackgroundResource(R.drawable.besyuzsari);
			bolum26.setEnabled(true);
			bolum25.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=26){
			bolum26.setBackgroundResource(R.drawable.besyuzyesil);
			bolum27.setBackgroundResource(R.drawable.besyuzsari);
			bolum27.setEnabled(true);
			bolum26.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=27){
			bolum27.setBackgroundResource(R.drawable.besyuzyesil);
			bolum28.setBackgroundResource(R.drawable.besyuzsari);
			bolum28.setEnabled(true);
			bolum27.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=28){
			bolum28.setBackgroundResource(R.drawable.besyuzyesil);
			bolum29.setBackgroundResource(R.drawable.besyuzsari);
			bolum29.setEnabled(true);
			bolum28.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=29){
			bolum29.setBackgroundResource(R.drawable.besyuzyesil);
			bolum30.setBackgroundResource(R.drawable.besyuzsari);
			bolum30.setEnabled(true);
			bolum29.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=30){
			bolum30.setBackgroundResource(R.drawable.besyuzyesil);
			bolum31.setBackgroundResource(R.drawable.besyuzsari);
			bolum31.setEnabled(true);
			bolum30.setEnabled(false);
		}
		
		if(sharedPreference.getValue1(context)>=31){
			bolum31.setBackgroundResource(R.drawable.besyuzyesil);
			bolum32.setBackgroundResource(R.drawable.besyuzsari);
			bolum32.setEnabled(true);
			bolum31.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=32){
			bolum32.setBackgroundResource(R.drawable.besyuzyesil);
			bolum33.setBackgroundResource(R.drawable.besyuzsari);
			bolum33.setEnabled(true);
			bolum32.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=33){
			bolum33.setBackgroundResource(R.drawable.besyuzyesil);
			bolum34.setBackgroundResource(R.drawable.besyuzsari);
			bolum34.setEnabled(true);
			bolum33.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=34){
			bolum34.setBackgroundResource(R.drawable.besyuzyesil);
			bolum35.setBackgroundResource(R.drawable.besyuzsari);
			bolum35.setEnabled(true);
			bolum34.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=35){
			bolum35.setBackgroundResource(R.drawable.besyuzyesil);
			bolum36.setBackgroundResource(R.drawable.besyuzsari);
			bolum36.setEnabled(true);
			bolum35.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=36){
			bolum36.setBackgroundResource(R.drawable.besyuzyesil);
			bolum37.setBackgroundResource(R.drawable.besyuzsari);
			bolum37.setEnabled(true);
			bolum36.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=37){
			bolum37.setBackgroundResource(R.drawable.besyuzyesil);
			bolum38.setBackgroundResource(R.drawable.besyuzsari);
			bolum38.setEnabled(true);
			bolum37.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=38){
			bolum38.setBackgroundResource(R.drawable.besyuzyesil);
			bolum39.setBackgroundResource(R.drawable.besyuzsari);
			bolum39.setEnabled(true);
			bolum38.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=39){
			bolum39.setBackgroundResource(R.drawable.besyuzyesil);
			bolum40.setBackgroundResource(R.drawable.besyuzsari);
			bolum40.setEnabled(true);
			bolum39.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=40){
			bolum40.setBackgroundResource(R.drawable.besyuzyesil);
			bolum41.setBackgroundResource(R.drawable.besyuzsari);
			bolum41.setEnabled(true);
			bolum40.setEnabled(false);
		}
		
		if(sharedPreference.getValue1(context)>=41){
			bolum41.setBackgroundResource(R.drawable.besyuzyesil);
			bolum42.setBackgroundResource(R.drawable.besyuzsari);
			bolum42.setEnabled(true);
			bolum41.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=42){
			bolum42.setBackgroundResource(R.drawable.besyuzyesil);
			bolum43.setBackgroundResource(R.drawable.besyuzsari);
			bolum43.setEnabled(true);
			bolum42.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=43){
			bolum43.setBackgroundResource(R.drawable.besyuzyesil);
			bolum44.setBackgroundResource(R.drawable.besyuzsari);
			bolum44.setEnabled(true);
			bolum43.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=44){
			bolum44.setBackgroundResource(R.drawable.besyuzyesil);
			bolum45.setBackgroundResource(R.drawable.besyuzsari);
			bolum45.setEnabled(true);
			bolum44.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=45){
			bolum45.setBackgroundResource(R.drawable.besyuzyesil);
			bolum46.setBackgroundResource(R.drawable.besyuzsari);
			bolum46.setEnabled(true);
			bolum45.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=46){
			bolum46.setBackgroundResource(R.drawable.besyuzyesil);
			bolum47.setBackgroundResource(R.drawable.besyuzsari);
			bolum47.setEnabled(true);
			bolum46.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=47){
			bolum47.setBackgroundResource(R.drawable.besyuzyesil);
			bolum48.setBackgroundResource(R.drawable.besyuzsari);
			bolum48.setEnabled(true);
			bolum47.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=48){
			bolum48.setBackgroundResource(R.drawable.besyuzyesil);
			bolum49.setBackgroundResource(R.drawable.besyuzsari);
			bolum49.setEnabled(true);
			bolum48.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=49){
			bolum49.setBackgroundResource(R.drawable.besyuzyesil);
			bolum50.setBackgroundResource(R.drawable.besyuzsari);
			bolum50.setEnabled(true);
			bolum49.setEnabled(false);
		}
		if(sharedPreference.getValue1(context)>=50){
			bolum50.setBackgroundResource(R.drawable.besyuzyesil);
			bolum50.setEnabled(false);
		}
		        
bolum1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();				
	      	      intent.setClass(getApplicationContext(), Gicika1.class);
	      	      startActivity(intent);
	      	      Ana.this.finish();
			}
		});
bolum2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {	   
		        Intent intent = new Intent();
	      	      intent.setClass(getApplicationContext(), Gicika2.class);
	      	      startActivity(intent);
	      	      Ana.this.finish();
			}
		});
bolum3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
		        Intent intent = new Intent();
	      	      intent.setClass(getApplicationContext(), Gicika3.class);
	      	      startActivity(intent);
	      	      Ana.this.finish();
			}
		});
bolum4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
        Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicika4.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum5.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicika5.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum6.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicika6.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum7.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicika7.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum8.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicika8.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum9.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicika9.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum10.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
        Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikb10.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum11.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikb11.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum12.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikb12.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum13.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikb13.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum14.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikb14.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum15.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikb15.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum16.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikb16.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum17.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikb17.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum18.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikb18.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum19.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikb19.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum20.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikc20.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum21.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikc21.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum22.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikc22.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum23.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikc23.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum24.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikc24.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum25.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikc25.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum26.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikc26.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum27.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikc27.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum28.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikc28.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum29.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikc29.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum30.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikd30.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum31.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikd31.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum32.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikd32.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum33.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikd33.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum34.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikd34.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum35.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikd35.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum36.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikd36.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum37.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikd37.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum38.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikd38.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum39.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikd39.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum40.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicike40.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum41.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicike41.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum42.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicike42.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum43.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicike43.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum44.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicike44.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum45.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicike45.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum46.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicike46.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum47.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicike47.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum48.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicike48.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum49.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicike49.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});
bolum50.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent();
  	      intent.setClass(getApplicationContext(), Gicikf50.class);
  	      startActivity(intent);
  	      Ana.this.finish();
	}
});

}
	 @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        MenuInflater inflater = getMenuInflater();
	        inflater.inflate(R.menu.option_menu, menu);
	        return true;
	    }
	  @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	    	
	    	switch (item.getItemId()) {		    	
		    	case R.id.reset:
		    		showDialog(DIALOG_SAVE_CONFIRM);		    		
	                return true;
	            case R.id.degerlendir:
	            	Intent internetteAra =new Intent(Intent.ACTION_VIEW);				
					internetteAra.setData(Uri.parse("https://play.google.com/store")); // uygulamamizin linkini verelim..
					startActivity(internetteAra);
	                return true;
		    	default:
		    		return super.onOptionsItemSelected(item);
	    	}
	    	
	    }
	  @Override
		protected Dialog onCreateDialog(int id){
					
			Dialog dialog;
			switch(id){
			case DIALOG_SAVE_CONFIRM:
				dialog=getSaveConfirmDialog();  //getChooseItemDialog() yaparsak liste secimi saclariz
				break;
				default:
					dialog=null;
			}
			return dialog;
		}
	  private Dialog getSaveConfirmDialog(){
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			
			builder.setMessage("Delete your score ?");
			builder.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface dialog, int id) {
					sharedPreference = new SharedPreference();
		    		sharedPreference.clearSharedPreference(context);	
		    		 Intent intent = new Intent();				  
				      intent.setClass(getApplicationContext(), Ana.class);
				      startActivity(intent);
				      Ana.this.finish();
					dialog.cancel();		
				}
			});	
			builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int id) {
				
				dialog.cancel();		
			}
		});



		  builder.setCancelable(false);
			return builder.create();
		}
	public void CallWebservis1(View view){
		Thread thread=new Thread(new Runnable() {
			@Override
			public void run() {
				Servismanager.skorlarimiz("bölüm","skor","ad","soyad"	);
			}
		});
		thread.start();
	}
}	

