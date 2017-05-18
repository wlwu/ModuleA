package com.cdsf.yzy.modulea;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by wuwenliang on 2017/5/18.
 */
@Route(path="module/moduleA")
public class ModuleAActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulea_show_layout);
    }
}
