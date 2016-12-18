package com.juhanilammi.conductordemo.controllers;

import com.juhanilammi.conductordemo.presenter.MainPresenter;

/**
 * Created by lammi on 18.12.2016.
 */
public interface MainMvpView {
    MainPresenter createPresenter();
}
