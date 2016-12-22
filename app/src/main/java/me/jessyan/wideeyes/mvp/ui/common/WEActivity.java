package me.jessyan.wideeyes.mvp.ui.common;

import me.jess.arms.base.BaseActivity;
import me.jess.arms.mvp.BasePresenter;
import me.jessyan.wideeyes.app.WEApplication;
import me.jessyan.wideeyes.di.component.AppComponent;

/**
 * Created by jess on 8/5/16 13:13
 * contact with jess.yan.effort@gmail.com
 */
public abstract class WEActivity<P extends BasePresenter> extends BaseActivity<P> {
    protected WEApplication mWeApplication;
    @Override
    protected void ComponentInject() {
        mWeApplication = (WEApplication) getApplication();
        setupActivityComponent(mWeApplication.getAppComponent());
    }
    //提供AppComponent(提供所有的单例对象)给子类，进行Component依赖
    protected abstract void setupActivityComponent(AppComponent appComponent);

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.mWeApplication = null;
    }
}
