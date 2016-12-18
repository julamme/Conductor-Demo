package com.juhanilammi.conductordemo.controllers;

import com.juhanilammi.conductordemo.presenter.View1Presenter;

/**
 * Created by lammi on 18.12.2016.
 */
public interface View1 {
    View1Presenter createPresenter();

    void closeView();
}
