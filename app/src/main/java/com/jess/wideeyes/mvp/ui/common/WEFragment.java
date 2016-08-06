package com.jess.wideeyes.mvp.ui.common;

import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.module.ClientModule;
import com.jess.arms.mvp.BasePresenter;
import com.jess.wideeyes.di.component.DaggerServiceComponent;
import com.jess.wideeyes.di.component.ServiceComponent;
import com.jess.wideeyes.di.module.ImageModule;
import com.jess.wideeyes.di.module.ServiceModule;

/**
 * Created by jess on 8/5/16 14:11
 * contact with jess.yan.effort@gmail.com
 */
public abstract class WEFragment<P extends BasePresenter> extends BaseFragment<P> {
    @Override
    protected void ComponentInject(AppComponent appComponent, ClientModule clientModule) {
        ServiceComponent serviceComponent = DaggerServiceComponent
                .builder()
                .clientModule(clientModule)
                .imageModule(new ImageModule())
                .serviceModule(new ServiceModule())
                .build();
        setupFragmentComponent(appComponent, serviceComponent);//让fragment依赖注入
    }

    protected abstract void setupFragmentComponent(AppComponent appComponent, ServiceComponent serviceComponent);
}
