package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.hookBeforeMethod

object MovieConfig : HookRegister() {

    override fun init() {
        try {
            val cls = "com.miui.gallery.config.MovieConfig"
            cls.hookBeforeMethod(
                getDefaultClassLoader(), "isMimeTypeSupport", String::class.java
            ) {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}