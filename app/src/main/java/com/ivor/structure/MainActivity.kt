package com.ivor.structure

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter
import com.ivor.modulebase.constant.Constant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.app_test).setOnClickListener {
            ARouter.getInstance().build(Constant.MODULE001_ACTIVITY_MAIN).navigation()
            Log.d("tbq", "========>")
        }

    }
}