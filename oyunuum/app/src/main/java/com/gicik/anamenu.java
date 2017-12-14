

package com.gicik;

        import android.annotation.SuppressLint;
        import android.app.ActionBar;
        import android.app.Activity;
        import android.app.AlertDialog;
        import android.app.Dialog;
        import android.content.Context;
        import android.content.DialogInterface;
        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuInflater;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;

public class anamenu extends Activity {
    Button oyna, nasil, cikis;


    private SharedPreference sharedPreference;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anamenu);





        oyna=(Button)findViewById(R.id.oyna);
        nasil=(Button)findViewById(R.id.nasil);
        cikis=(Button)findViewById(R.id.cikis);

        oyna.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Ana.class);
                startActivity(intent);
                anamenu.this.finish();
                //servicemanager.skorlarimiz("10","25","bekir","duran");
            }

        });
        nasil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), nasil.class);
                startActivity(intent);
                anamenu.this.finish();

            }
        });  cikis.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                finish();
                System.exit(0);
            }




        });
    }}