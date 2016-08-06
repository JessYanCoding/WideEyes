package com.jess.wideeyes.app;

import com.jess.arms.base.BaseApplication;
import com.jess.wideeyes.mvp.model.api.Api;

/**
 * Created by jess on 8/5/16 11:07
 * contact with jess.yan.effort@gmail.com
 */
public class WEApplication extends BaseApplication {
    @Override
    public String getBaseUrl() {
        return Api.APP_DOMAIN;
    }
}
