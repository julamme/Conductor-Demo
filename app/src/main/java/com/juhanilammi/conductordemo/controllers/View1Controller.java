package com.juhanilammi.conductordemo.controllers;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.bluelinelabs.conductor.Controller;
import com.juhanilammi.conductordemo.R;
import com.juhanilammi.conductordemo.presenter.View1Presenter;

/**
 * Created by lammi on 18.12.2016.
 */
public class View1Controller extends Controller implements View1 {
    View1Presenter presenter;
    EditText inputField;

    public View1Controller() {
        super();
        presenter = createPresenter();
    }

    @NonNull
    @Override
    protected View onCreateView(LayoutInflater inflater, ViewGroup container) {
        View view = inflater.inflate(R.layout.controller_view_1, container, false);
        inputField = (EditText) view.findViewById(R.id.inputText);
        return view;
    }

    public void save(View view) {
        if (!inputField.getText().toString().isEmpty()){
            presenter.saveData(inputField.getText().toString());
        }
    }

    @Override
    public View1Presenter createPresenter() {
        return new View1Presenter(this);
    }

    @Override
    public void closeView() {
        getRouter().popCurrentController();
    }
}
