package com.juhanilammi.conductordemo.controllers;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.RouterTransaction;
import com.juhanilammi.conductordemo.R;
import com.juhanilammi.conductordemo.presenter.MainPresenter;

/**
 * Created by lammi on 18.12.2016.
 */
public class MainController extends Controller implements MainMvpView, View.OnClickListener {
    View.OnClickListener mListener;
    MainPresenter presenter;

    public MainController(){
        super();
        presenter = createPresenter();
    }
    @NonNull
    @Override
    protected View onCreateView(LayoutInflater inflater, ViewGroup container) {

        View view = inflater.inflate(R.layout.controller_main, container, false);
        Button view1Button = (Button) view.findViewById(R.id.view_1_button);
        view1Button.setOnClickListener(this);
        Button view2Button = (Button) view.findViewById(R.id.view_2_button);
        view2Button.setOnClickListener(this);
        Button view3Button = (Button) view.findViewById(R.id.view_3_button);
        view3Button.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.view_1_button:
                getRouter().pushController(RouterTransaction.with(new View1Controller()));
                break;
            case R.id.view_2_button:
                getRouter().pushController(RouterTransaction.with(new View2Controller()));
                break;
            case R.id.view_3_button:
                getRouter().pushController(RouterTransaction.with(new View3Controller()));
                break;
        }
    }

    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter(this);
    }
}
