package com.gicik;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SharedPreference {

	public static final String PREFS_NAME = "AOP_PREFS";
	public static final String PREFS_KEY = "AOP_PREFS_String";
	public static final String PREFS_KEY1 = "AOP1_PREFS_String";
	
	public SharedPreference() {
		super();
	}
	public void save(Context context, int text,int text1) {
		SharedPreferences settings;
		Editor editor;

		settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE); //1
		editor = settings.edit(); //2

		editor.putInt(PREFS_KEY, text); //3
		editor.putInt(PREFS_KEY1, text1); //3
		editor.commit(); //4
	}

	public int getValue(Context context) {
		SharedPreferences settings;
		int text;

		settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
		text = settings.getInt(PREFS_KEY, 0);
		return text;
	}
	public int getValue1(Context context) {
		SharedPreferences settings;
		int text;

		settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
		text = settings.getInt(PREFS_KEY1, 0);
		return text;
	}
	
	public void clearSharedPreference(Context context) {
		SharedPreferences settings;
		Editor editor;

		settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
		editor = settings.edit();

		editor.clear();
		editor.commit();
	}

	public void removeValue(Context context) {
		SharedPreferences settings;
		Editor editor;

		settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
		editor = settings.edit();

		editor.remove(PREFS_KEY);
		editor.commit();
	}	
}
