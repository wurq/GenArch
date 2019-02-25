package com.arch.genarch.module.mainpage.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arch.base.basemodule.activity.BaseFragment;
import com.arch.genarch.R;
import com.arch.genarch.module.mainpage.presenter.ClassroomPresenter;

/**
 * Created by wurongqiu on 2019/2/25.
 */

public class ClassroomFragment extends BaseFragment<ClassroomPresenter> {
    private static final String TAG = "ClassroomFragment";
    @Override
    protected void initPresenter() {
        presenter = new ClassroomPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.e(TAG,"onCreateView");
        View view = inflater.inflate(R.layout.fragment_classroom, null);
        return view;
    }
}
