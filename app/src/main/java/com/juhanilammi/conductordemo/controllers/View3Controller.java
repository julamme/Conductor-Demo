package com.juhanilammi.conductordemo.controllers;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bluelinelabs.conductor.Controller;
import com.juhanilammi.conductordemo.R;
import com.juhanilammi.conductordemo.adapters.DemoAdapter;
import com.juhanilammi.conductordemo.presenter.View3Presenter;

import java.util.List;

/**
 * Created by lammi on 18.12.2016.
 */
public class View3Controller extends Controller implements View3 {
    View3Presenter presenter;
    RecyclerView recyclerView;
    TextView textView;

    public View3Controller() {
        super();
        presenter = createPresenter();
    }

    @NonNull
    @Override
    protected View onCreateView(LayoutInflater inflater, ViewGroup container) {
        View view = inflater.inflate(R.layout.controller_view_3, container, false);
        textView = (TextView) view.findViewById(R.id.inputed_text);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        presenter.loadData();
        return view;
    }

    @Override
    public View3Presenter createPresenter() {
        return new View3Presenter(this);
    }

    @Override
    public void showList(List<String> strings) {
        recyclerView.setAdapter(new DemoAdapter(strings));
    }

    @Override
    public void showString(String s) {
        textView.setText(s);
    }
}
