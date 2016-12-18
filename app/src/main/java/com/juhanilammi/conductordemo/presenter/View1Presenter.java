package com.juhanilammi.conductordemo.presenter;

import com.juhanilammi.conductordemo.controllers.View1;
import com.juhanilammi.conductordemo.model.DemoModel;

/**
 * Created by lammi on 18.12.2016.
 */
public class View1Presenter {
    View1 view;
    public View1Presenter(View1 view){
        this.view = view;
    }

    public void saveData(String s) {
        DemoModel.getInstance().saveString(s);
        view.closeView();
    }
}
