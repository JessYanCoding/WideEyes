package com.jess.wideeyes.mvp.ui.common;

import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.module.ClientModule;
import com.jess.arms.mvp.BasePresenter;
import com.jess.wideeyes.di.component.DaggerServiceComponent;
import com.jess.wideeyes.di.component.ServiceComponent;
import com.jess.wideeyes.di.module.ImageModule;
import com.jess.wideeyes.di.module.ServiceModule;

/**
 * Created by jess on 8/5/16 13:13
 * contact with jess.yan.effort@gmail.com
 */
public abstract class WEActivity<P extends BasePresenter> extends BaseActivity<P> {
    @Override
    protected void ComponentInject(AppComponent appComponent, ClientModule clientModule) {
        ServiceComponent serviceComponent = DaggerServiceComponent
                .builder()
                .clientModule(clientModule)
                .imageModule(new ImageModule())
                .serviceModule(new ServiceModule())
                .build();
        setupActivityComponent(appComponent, serviceComponent);//让activity依赖注入
    }

    protected abstract void setupActivityComponent(AppComponent appComponent, ServiceComponent serviceComponent);
}
