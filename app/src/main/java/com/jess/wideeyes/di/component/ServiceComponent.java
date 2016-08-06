package com.jess.wideeyes.di.component;

import com.jess.arms.di.module.ClientModule;
import com.jess.arms.widget.imageloader.ImageLoader;
import com.jess.wideeyes.di.module.ImageModule;
import com.jess.wideeyes.di.module.ServiceModule;
import com.jess.wideeyes.mvp.model.api.service.ServiceManager;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jess on 8/5/16 13:05
 * contact with jess.yan.effort@gmail.com
 */
@Singleton
@Component(modules = {ServiceModule.class, ClientModule.class , ImageModule.class})
public interface ServiceComponent {
    ServiceManager serviceManager();
    ImageLoader imageLoader();
}
