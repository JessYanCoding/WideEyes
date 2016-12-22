package me.jess.arms.di.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.jess.arms.base.AppManager;

/**
 * Created by jess on 14/12/2016 13:54
 * Contact with jess.yan.effort@gmail.com
 */
@Module
public class BaseModule {
    private Application mApplication;

    public BaseModule(Application application) {
        this.mApplication = application;
    }

    @Singleton
    @Provides
    public AppManager provideAppManager(){ return new AppManager(mApplication);}
}
