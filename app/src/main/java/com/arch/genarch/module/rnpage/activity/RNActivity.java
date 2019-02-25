package com.arch.genarch.module.rnpage.activity;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;

import com.facebook.react.ReactActivity;

public class RNActivity extends ReactActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_rn);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//    }

    private static final String MAIN_COMPONENT = "ReactNativeDemo";

    /**     * 返回在index.android.js 中注册的组件名
     * @return
     */    @Nullable
    @Override
    protected String getMainComponentName() {
         return MAIN_COMPONENT;
     }

     public static void start(Context context) {
        Intent starter = new Intent(context, RNActivity.class);
//        starter.putExtra();
        context.startActivity(starter);
    }

}
