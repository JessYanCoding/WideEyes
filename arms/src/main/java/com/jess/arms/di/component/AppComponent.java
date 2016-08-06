package com.jess.arms.di.component;

import com.jess.arms.base.BaseApplication;
import com.jess.arms.di.module.AppModule;
import com.jess.arms.di.module.ClientModule;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by jess on 8/4/16.
 */
@Singleton
@Component(modules = {AppModule.class, ClientModule.class})
public interface AppComponent {
    BaseApplication baseApplication();

    Retrofit retrofit();

    OkHttpClient okHttpClient();
}
