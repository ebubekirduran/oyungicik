package com.gicik;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class adinsoyadin extends Activity{
    SharedPreferences preferences; //preferences için bir nesne tan?ml?yorum.
    SharedPreferences.Editor editor; //preferences içerisine bilgi girmek için tan?mlama
    EditText editText;
    EditText editText2;
    Button kaydet;
    //edittext ve butonumun tan?mlamalar?
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adinsoyadin);
        preferences= PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        editor = preferences.edit();
        editText=(EditText) findViewById(R.id.editText);
        editText2=(EditText) findViewById(R.id.editText2);
        String adibilgisi=preferences.getString("adi", "Ad Girin");
//ad bilgisi kay?tl?ysa adibilgisi de?i?kenine yaz?lacak, de?ilse Ad girin stringi aktar?lacak. Yani varsay?lan de?er.
        String soyadiBilgisi= preferences.getString("soyadi", "Soyad girin");
//soyad bilgisi kay?tl?ysa soyadibilgisi de?i?kenine yaz?lacak, de?ilse Soyad girin stringi aktar?lacak. Yani varsay?lan de?er.

        editText.setText(adibilgisi);
//editAdi nesnesine adibilgisini yazd?r?yoruz.
        editText2.setText(soyadiBilgisi);
//editSoyadi nesnesine soyadibilgisini yazd?r?yoruz.
        kaydet=(Button)findViewById(R.id.kaydet);
//de?er atamalar? yap?l?yor.
        kaydet.setOnClickListener(new View.OnClickListener() {
            //butona t?klan?nca kay?t i?lemi yap?lacak.
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                editor.putString("adi", editText.getText().toString());
                editor.putString("soyadi", editText2.getText().toString());
                editor.commit();
                Intent intent2 = new Intent();
                intent2.setClass(getApplicationContext(), anamenu.class);
                startActivity(intent2);
                adinsoyadin.this.finish();
//bilgileri ekle ve kaydet
            }
        });
    }

}