package com.juhanilammi.conductordemo.presenter;

import com.juhanilammi.conductordemo.controllers.MainController;
import com.juhanilammi.conductordemo.controllers.MainMvpView;

/**
 * Created by lammi on 18.12.2016.
 */
public class MainPresenter extends BasePresenter {
    private MainMvpView mView;
    public MainPresenter(MainMvpView view) {
        mView = view;
    }
}
