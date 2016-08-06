package com.jess.wideeyes.di.module;

import com.jess.wideeyes.mvp.model.api.service.CommonService;
import com.jess.wideeyes.mvp.model.api.service.ServiceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by zhiyicx on 2016/3/30.
 */
@Module
public class ServiceModule {

    @Singleton
    @Provides
    CommonService provideCommonService(Retrofit retrofit) {
        return retrofit.create(CommonService.class);
    }


    @Singleton
    @Provides
    ServiceManager provideServiceManager(CommonService commonService) {
        return new ServiceManager(commonService);
    }


}
