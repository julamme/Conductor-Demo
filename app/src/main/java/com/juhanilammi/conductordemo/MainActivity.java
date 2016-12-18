package com.juhanilammi.conductordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Conductor;
import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;
import com.juhanilammi.conductordemo.controllers.MainController;
import com.juhanilammi.conductordemo.controllers.View1Controller;
import com.juhanilammi.conductordemo.controllers.View2Controller;
import com.juhanilammi.conductordemo.controllers.View3Controller;

public class MainActivity extends AppCompatActivity  {

    private Router router;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.container);
        router = Conductor.attachRouter(this, viewGroup, savedInstanceState);
        if (!router.hasRootController()) {
            router.setRoot(RouterTransaction.with(new MainController()));
        }
    }

    @Override
    public void onBackPressed() {
        if (!router.handleBack()) {
            super.onBackPressed();
        }
    }
}
