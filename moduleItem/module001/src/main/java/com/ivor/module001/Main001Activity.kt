package com.ivor.module001

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.ivor.modulebase.constant.Constant

@Route(path = Constant.MODULE001_ACTIVITY_MAIN)
class Main001Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_001_main)
    }
}