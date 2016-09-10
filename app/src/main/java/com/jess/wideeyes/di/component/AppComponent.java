package com.jess.wideeyes.di.component;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.di.module.AppModule;
import com.jess.arms.di.module.ClientModule;
import com.jess.arms.di.module.ImageModule;
import com.jess.arms.widget.imageloader.ImageLoader;
import com.jess.wideeyes.di.module.CacheModule;
import com.jess.wideeyes.di.module.ServiceModule;
import com.jess.wideeyes.mvp.model.api.cache.CacheManager;
import com.jess.wideeyes.mvp.model.api.service.ServiceManager;

import javax.inject.Singleton;

import dagger.Component;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import okhttp3.OkHttpClient;

/**
 * Created by jess on 8/4/16.
 */
@Singleton
@Component(modules = {AppModule.class, ClientModule.class, ServiceModule.class, ImageModule.class, CacheModule.class})
public interface AppComponent {
    Application Application();

    //服务管理器,retrofitApi
    ServiceManager serviceManager();

    //缓存管理器
    CacheManager cacheManager();

    //Rxjava错误处理管理类
    RxErrorHandler rxErrorHandler();

    OkHttpClient okHttpClient();

    //图片管理器,用于加载图片的管理类,默认使用glide,使用策略模式,可替换框架
    ImageLoader imageLoader();

    //gson
    Gson gson();
}
