package com.jess.wideeyes.di.component;

import android.app.Application;

import com.jess.arms.di.module.AppModule;
import com.jess.arms.di.module.ClientModule;
import com.jess.arms.di.module.ImageModule;
import com.jess.arms.widget.imageloader.ImageLoader;
import com.jess.wideeyes.di.module.ServiceModule;
import com.jess.wideeyes.mvp.model.api.service.ServiceManager;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;

/**
 * Created by jess on 8/4/16.
 */
@Singleton
@Component(modules = {AppModule.class, ClientModule.class, ServiceModule.class, ImageModule.class})
public interface AppComponent {
    Application Application();

    ServiceManager serviceManager();

    OkHttpClient okHttpClient();

    ImageLoader imageLoader();
}
