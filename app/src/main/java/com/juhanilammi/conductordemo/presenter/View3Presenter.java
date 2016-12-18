package com.juhanilammi.conductordemo.presenter;

import com.juhanilammi.conductordemo.controllers.View3;
import com.juhanilammi.conductordemo.model.DemoModel;

import java.util.List;

/**
 * Created by lammi on 18.12.2016.
 */
public class View3Presenter extends BasePresenter {
    View3 view;
    public View3Presenter(View3 view){
        this.view = view;
    }

    public void loadData() {
        List<String> strings = DemoModel.getInstance().getStringAsList(5);
        if(!strings.isEmpty()){
            view.showList(strings);
            view.showString(strings.get(0));
        }
    }
}
