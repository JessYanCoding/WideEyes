package com.jess.arms.base;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.component.DaggerAppComponent;
import com.jess.arms.di.module.AppModule;
import com.jess.arms.di.module.ClientModule;

import java.util.LinkedList;

/**
 * 本项目由
 * mvp
 * +dagger2
 * +retrofit
 * +rxjava
 * +androideventbus
 * +butterknife组成
 */
public abstract class BaseApplication extends Application {
    static private BaseApplication mApplication;
    public LinkedList<BaseActivity> mActivityList;
    private AppComponent mAppComponent;
    private ClientModule mClientModule;


    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
        this.mClientModule = new ClientModule(getBaseUrl());
        mAppComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .clientModule(mClientModule)
                .build();
    }

    public abstract String getBaseUrl();


    public LinkedList<BaseActivity> getActivityList() {
        if (mActivityList == null) {
            mActivityList = new LinkedList<BaseActivity>();
        }
        return mActivityList;
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    public ClientModule getClientModule() {
        return mClientModule;
    }

    /**
     * 返回上下文
     *
     * @return
     */
    public static Context getContext() {
        return mApplication;
    }


    /**
     * 退出所有activity
     */
    public static void killAll() {
        Intent intent = new Intent(BaseActivity.ACTION_RECEIVER_ACTIVITY);
        intent.putExtra("type", "killAll");
        getContext().sendBroadcast(intent);
    }

}
