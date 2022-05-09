package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.github.kyuubiran.ezxhelper.utils.hookAllConstructorAfter
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.findClass
import com.yuk.mediaeditor.utils.setObjectField

object FrameSelectorView : HookRegister() {

    override fun init() {
        try {
            "com.miui.gallery.magic.widget.frame.FrameSelectorView".findClass(getDefaultClassLoader())
                .hookAllConstructorAfter {
                    it.thisObject.setObjectField("MAX_TIME", 30000)
                }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}