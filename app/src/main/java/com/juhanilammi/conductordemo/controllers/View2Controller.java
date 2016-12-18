package com.juhanilammi.conductordemo.controllers;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;
import com.juhanilammi.conductordemo.R;

/**
 * Created by lammi on 18.12.2016.
 */
public class View2Controller extends Controller {
    @NonNull
    @Override
    protected View onCreateView(LayoutInflater inflater, ViewGroup container) {
        View view = inflater.inflate(R.layout.controller_view_2, container, false);
        return view;
    }
}
