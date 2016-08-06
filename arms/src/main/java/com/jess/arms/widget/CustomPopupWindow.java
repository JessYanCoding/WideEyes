package com.jess.arms.widget;

import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;


public class CustomPopupWindow extends PopupWindow {
    private View mContentView;
    private View mParentView;
    private boolean isShow;

    private CustomPopupWindow(View contentView, View parentView) {
        this.mContentView = contentView;
        this.mParentView = parentView;
        setWidth(LayoutParams.MATCH_PARENT);
        setHeight(LayoutParams.MATCH_PARENT);
        setFocusable(true);
        setOutsideTouchable(true);
        //必须添加方法，否则setOutsideTouchable(true);无法起作用
//		setBackgroundDrawable(new ColorDrawable(0x00000000)); 
//        setAnimationStyle(R.style.filter_window_animstyle);
        setBackgroundDrawable(new ColorDrawable(0xb0000000));
        setContentView(contentView);

        showAtLocation(parentView, Gravity.CENTER | Gravity.CENTER_HORIZONTAL, 0, 0);

        update();
    }

    private CustomPopupWindow(View contentView, boolean isShow) {
        this.mContentView = contentView;
        setWidth(LayoutParams.MATCH_PARENT);
        setHeight(LayoutParams.MATCH_PARENT);
        setFocusable(true);
        setOutsideTouchable(true);
        //必须添加方法，否则setOutsideTouchable(true);无法起作用
//		setBackgroundDrawable(new ColorDrawable(0x00000000));
//        setAnimationStyle(R.style.filter_window_animstyle);
        setBackgroundDrawable(new ColorDrawable(0xb0000000));
        setContentView(contentView);

        if (isShow) {
            showAtLocation(contentView, Gravity.CENTER | Gravity.CENTER_HORIZONTAL, 0, 0);
            update();
        }

    }


    private CustomPopupWindow(View contentView) {
        this.mContentView = contentView;
        setWidth(LayoutParams.WRAP_CONTENT);
        setHeight(LayoutParams.WRAP_CONTENT);
        setFocusable(true);
        setOutsideTouchable(false);
        //必须添加该放弃方法，否则setOutsideTouchable(true);无法起作用
        setBackgroundDrawable(new ColorDrawable(0x00000000));
//        setAnimationStyle(R.style.filter_window_animstyle);
        setContentView(contentView);

        showAtLocation(contentView, Gravity.CENTER | Gravity.CENTER_HORIZONTAL, 0, 0);
        update();

    }

    public void show() {
        if (mParentView == null) {
            showAtLocation(mContentView, Gravity.CENTER | Gravity.CENTER_HORIZONTAL, 0, 0);
        } else {
            showAtLocation(mParentView, Gravity.CENTER | Gravity.CENTER_HORIZONTAL, 0, 0);
        }
        isShow = true;
    }



    @Override
    public void dismiss() {
        super.dismiss();
        isShow = false;
    }

    public void setIsShow(boolean show) {
        this.isShow = show;
    }

    public boolean isShow() {
        return isShow;
    }

    public interface CustomPopupWindowListener {
        public void initPopupView(View contentView);
    }

    public static CustomPopupWindow newInstance(View contentView
            , View parentView
            , CustomPopupWindowListener listener
            , Boolean isShow) {

        if (isShow != null && null == parentView) {
            listener.initPopupView(contentView);
            return new CustomPopupWindow(contentView, isShow);
        } else if (null == parentView) {
            listener.initPopupView(contentView);
            return new CustomPopupWindow(contentView);
        } else {
            listener.initPopupView(contentView);
            return new CustomPopupWindow(contentView, parentView);
        }

    }

    public static void dismissPop(PopupWindow pop) {
        if (pop != null && pop.isShowing()) {
            pop.dismiss();
        }

    }
}
