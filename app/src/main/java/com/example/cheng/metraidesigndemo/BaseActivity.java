/*
 * BaseActivity    2016-11-03
 * Copyright(c) 2016 Chengguo Co.Ltd. All right reserved.
 *
 */
package com.example.cheng.metraidesigndemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * class description here
 *
 * @author cheng
 * @version 1.0.0
 * @since 2016-11-03
 */
public abstract class BaseActivity extends AppCompatActivity {

    public abstract int getContentViewId();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initAllMembersView(savedInstanceState);
        setContentView(getContentViewId());
        ButterKnife.bind(this);
    }

    protected abstract void initAllMembersView(Bundle savedInstanceState);

}
