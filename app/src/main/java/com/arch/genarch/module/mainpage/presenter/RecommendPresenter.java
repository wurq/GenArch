package com.arch.genarch.module.mainpage.presenter;

import android.view.View;

import com.arch.base.basemodule.presenter.BaseFragmentPresenter;
import com.arch.genarch.R;
import com.arch.genarch.module.mainpage.activity.RecommendFragment;

/**
 * Created by wurongqiu on 2019/2/25.
 */

public class RecommendPresenter extends BaseFragmentPresenter<RecommendFragment> implements View.OnClickListener {
    public RecommendPresenter(RecommendFragment target) {
        super(target);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())  {
            case R.id.button3:
            {
//                rnex1Activity.start(target.getContext());
            }
            break;
        }
    }
}

