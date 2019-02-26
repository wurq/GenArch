package com.arch.genarch.module.mainpage.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arch.base.basemodule.activity.BaseFragment;
import com.arch.genarch.R;
import com.arch.genarch.module.mainpage.presenter.RecommendPresenter;

/**
 * Created by wurongqiu on 2019/2/25.
 */

public class RecommendFragment  extends BaseFragment<RecommendPresenter> {
    private static final String TAG = "RecommendFragment";
    @Override
    protected void initPresenter() {
        presenter = new RecommendPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e(TAG,"onCreateView");
        View view = inflater.inflate(R.layout.fragment_recommend, null);

        view.findViewById(R.id.rn01).setOnClickListener(presenter);
        view.findViewById(R.id.rn02).setOnClickListener(presenter);
        return view;
    }
}
