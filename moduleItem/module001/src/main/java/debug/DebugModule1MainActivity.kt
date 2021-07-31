package debug

import android.os.Bundle
import com.ivor.module001.R
import com.ivor.modulebase.BaseActivity

class DebugModule1MainActivity :BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_001_main_debug)
    }
}