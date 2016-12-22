package me.jessyan.wideeyes.mvp.ui.common;

import com.squareup.leakcanary.RefWatcher;

import me.jess.arms.base.BaseFragment;
import me.jess.arms.mvp.BasePresenter;
import me.jessyan.wideeyes.app.WEApplication;
import me.jessyan.wideeyes.di.component.AppComponent;

/**
 * Created by jess on 8/5/16 14:11
 * contact with jess.yan.effort@gmail.com
 */
public abstract class WEFragment<P extends BasePresenter> extends BaseFragment<P> {
    protected WEApplication mWeApplication;

    @Override
    protected void ComponentInject() {
        mWeApplication = (WEApplication) mActivity.getApplication();
        setupFragmentComponent(mWeApplication.getAppComponent());
    }

    //提供AppComponent(提供所有的单例对象)给子类，进行Component依赖
    protected abstract void setupFragmentComponent(AppComponent appComponent);

    @Override
    public void onDestroy() {
        super.onDestroy();
        RefWatcher watcher = me.jessyan.mvparms.demo.app.WEApplication.getRefWatcher(getActivity());//使用leakCanary检测fragment的内存泄漏
        if (watcher != null) {
            watcher.watch(this);
        }
        this.mWeApplication = null;
    }
}
