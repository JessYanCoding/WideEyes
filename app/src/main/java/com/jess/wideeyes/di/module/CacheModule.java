package com.jess.wideeyes.di.module;


import com.jess.wideeyes.mvp.model.api.cache.CommonCache;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.rx_cache.internal.RxCache;

/**
 * Created by zhiyicx on 2016/3/30.
 */
@Module
public class CacheModule {

    @Singleton
    @Provides
    CommonCache provideCommonService(RxCache rxCache) {
        return rxCache.using(CommonCache.class);
    }


}
