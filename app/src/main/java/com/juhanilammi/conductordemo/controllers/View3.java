package com.juhanilammi.conductordemo.controllers;

import com.juhanilammi.conductordemo.presenter.View3Presenter;

import java.util.List;

/**
 * Created by lammi on 18.12.2016.
 */
public interface View3 {

    View3Presenter createPresenter();

    void showList(List<String> strings);

    void showString(String s);
}
