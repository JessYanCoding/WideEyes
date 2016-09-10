package com.jess.wideeyes.mvp.ui.activity;

import android.view.LayoutInflater;
import android.view.View;

import com.jess.wideeyes.R;
import com.jess.wideeyes.di.component.AppComponent;
import com.jess.wideeyes.mvp.ui.common.WEActivity;

public class SplashActivity extends WEActivity {

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
