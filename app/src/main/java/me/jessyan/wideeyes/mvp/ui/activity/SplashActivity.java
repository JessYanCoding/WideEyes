package me.jessyan.wideeyes.mvp.ui.activity;

import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.Text;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;

public class SplashActivity extends BaseActivity {


    @Override
    public void setupActivityComponent(AppComponent appComponent) {

    }

    @Override
    public int initView() {
        return 0;
    }

    @Override
    public void initData() {
        final ComponentContext c = new ComponentContext(this);

        final LithoView lithoView = LithoView.create(
                this /* context */,
                Text.create(c)
                        .text("Hello, World!")
                        .textSizeDip(50)
                        .build());

        setContentView(lithoView);

    }
}
