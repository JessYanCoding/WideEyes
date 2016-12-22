package me.jess.arms.di.module;

import android.app.Application;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.jess.arms.base.AppManager;

/**
 * Created by jess on 8/4/16.
 */
@Module
public class AppModule {
    private Application mApplication;
    private AppManager mAppManager;

    public AppModule(Application application, AppManager appManager) {
        this.mApplication = application;
        this.mAppManager = appManager;
    }

    @Singleton
    @Provides
    public Application provideApplication() {
        return mApplication;
    }

    @Singleton
    @Provides
    public Gson provideGson(){return new Gson();}

    @Singleton
    @Provides
    public AppManager provideAppManager(){return mAppManager;}
}
