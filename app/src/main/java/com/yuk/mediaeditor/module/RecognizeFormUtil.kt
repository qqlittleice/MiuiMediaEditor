package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.hookBeforeMethod

object RecognizeFormUtil : HookRegister() {

    override fun init() {
        try {
            val cls = "com.miui.gallery.util.RecognizeFormUtil"
            cls.hookBeforeMethod(
                getDefaultClassLoader(), "isAvailable"
            ) {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}