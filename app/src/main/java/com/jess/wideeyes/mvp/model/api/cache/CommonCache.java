package com.jess.wideeyes.mvp.model.api.cache;

import com.jess.wideeyes.mvp.model.entity.FindDetailEntity;
import com.jess.wideeyes.mvp.model.entity.FindMoreEntity;
import com.jess.wideeyes.mvp.model.entity.HomePicEntity;
import com.jess.wideeyes.mvp.model.entity.HotStrategyEntity;

import java.util.concurrent.TimeUnit;

import io.rx_cache.DynamicKey;
import io.rx_cache.EvictProvider;
import io.rx_cache.LifeCache;
import io.rx_cache.Reply;
import rx.Observable;

/**
 * Created by jess on 8/30/16 13:53
 * Contact with jess.yan.effort@gmail.com
 */
public interface CommonCache {

    @LifeCache(duration = 2, timeUnit = TimeUnit.MINUTES)
    Observable<Reply<HomePicEntity>> getDailyList(Observable<HomePicEntity> service, DynamicKey publishTime, EvictProvider provider);

    @LifeCache(duration = 2, timeUnit = TimeUnit.MINUTES)
    Observable<Reply<FindMoreEntity>> getFindMore(Observable<FindMoreEntity> service, DynamicKey id, EvictProvider provider);


    @LifeCache(duration = 2, timeUnit = TimeUnit.MINUTES)
    Observable<Reply<HotStrategyEntity>> getHotStrategy(Observable<HotStrategyEntity> service, DynamicKey id, EvictProvider provider);


    @LifeCache(duration = 2, timeUnit = TimeUnit.MINUTES)
    Observable<Reply<FindDetailEntity>> getFindDetail(Observable<FindDetailEntity> service, DynamicKey id, EvictProvider provider);
}
