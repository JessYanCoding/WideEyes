package me.jessyan.mvparms.demo.mvp.ui.adapter;

import android.view.View;

import java.util.List;

import com.jess.arms.base.BaseHolder;
import com.jess.arms.base.DefaultAdapter;
import me.jessyan.mvparms.demo.mvp.model.entity.User;
import me.jessyan.mvparms.demo.mvp.ui.holder.UserItemHolder;
import me.jessyan.wideeyes.R;

/**
 * Created by jess on 9/4/16 12:57
 * Contact with jess.yan.effort@gmail.com
 */
public class UserAdapter extends DefaultAdapter<User> {
    public UserAdapter(List<User> infos) {
        super(infos);
    }

    @Override
    public BaseHolder<User> getHolder(View v) {
        return new UserItemHolder(v);
    }

    @Override
    public int getLayoutId() {
        return R.layout.recycle_list;
    }
}
