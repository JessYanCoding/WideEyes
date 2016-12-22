package me.jessyan.wideeyes.mvp.ui.activity;

import android.view.LayoutInflater;
import android.view.View;

import me.jessyan.wideeyes.R;
import me.jessyan.wideeyes.di.component.AppComponent;
import me.jessyan.wideeyes.mvp.ui.common.WEActivity;

public class AActivity extends WEActivity {

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
