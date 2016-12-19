package com.juhanilammi.conductordemo.model;

import android.content.Context;
import android.content.SharedPreferences;

import com.juhanilammi.conductordemo.ConductorApp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lammi on 18.12.2016.
 */
public class DemoModel {
    private static final String SAVE_STRING = "saved_string";
    private static DemoModel instance;
    private Context context;
    private SharedPreferences sharedPrefs;

    private DemoModel(Context context) {
        this.context = context;
        sharedPrefs = ConductorApp.getContext().getSharedPreferences("conductor_app", Context.MODE_PRIVATE);
    }

    public static DemoModel getInstance() {
        if (instance == null) {
            return instance = new DemoModel(ConductorApp.getContext());
        } else {
            return instance;
        }
    }

    public void saveString(String string) {
        sharedPrefs.edit().putString(SAVE_STRING, string).apply();
    }

    public String getString() {
        return sharedPrefs.getString(SAVE_STRING, "No string given");
    }

    public List<String> getStringAsList(int iterations) {
        List<String> strings = new ArrayList<>();
        String returnableString = sharedPrefs.getString(SAVE_STRING, "No string given");
        for(int i = 0; i<= iterations; i++){
            strings.add(returnableString);
        }
        return strings;
    }
}
