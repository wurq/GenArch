package com.arch.genarch.module.mainpage.presenter;

import android.view.View;

import com.arch.base.basemodule.presenter.BaseFragmentPresenter;
import com.arch.genarch.R;
import com.arch.genarch.module.mainpage.activity.RecommendFragment;
import com.arch.genarch.module.rn02page.activity.RN02Activity;
import com.arch.genarch.module.rnpage.activity.RNActivity;

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
            case R.id.rn01:
            {
                RNActivity.start(target.getContext());
            }
            break;
            case R.id.rn02:
            {
                RN02Activity.start(target.getContext());
            }
            break;
            default:
                break;
        }
    }
}

