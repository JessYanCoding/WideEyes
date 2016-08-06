package com.jess.arms.di.module;

import com.jess.arms.base.BaseApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jess on 8/4/16.
 */
@Module
public class AppModule {
    private BaseApplication mApplication;

    public AppModule(BaseApplication application) {
        this.mApplication = application;
    }

    @Singleton
    @Provides
    public BaseApplication provideApplication() {
        return mApplication;
    }
}
