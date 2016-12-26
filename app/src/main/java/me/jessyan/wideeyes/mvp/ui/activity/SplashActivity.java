package me.jessyan.wideeyes.mvp.ui.activity;

import android.view.LayoutInflater;
import android.view.View;

import common.AppComponent;
import common.WEActivity;
import me.jessyan.wideeyes.R;

public class SplashActivity extends WEActivity{

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {

    }

    @Override
    protected View initView() {
        return LayoutInflater.from(this).inflate(R.layout.activity_splash,null,false);
    }

    @Override
    protected void initData() {

    }
}
