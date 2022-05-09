package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.github.kyuubiran.ezxhelper.utils.hookAllConstructorAfter
import com.yuk.mediaeditor.utils.ktx.findClass
import com.yuk.mediaeditor.utils.ktx.hookBeforeMethod
import com.yuk.mediaeditor.utils.ktx.setObjectField

class FrameSelectorView {

    fun init() {
        try {
            "com.miui.gallery.magic.widget.frame.FrameSelectorView".findClass().hookAllConstructorAfter {
                it.thisObject.setObjectField("MAX_TIME", 30000)
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}