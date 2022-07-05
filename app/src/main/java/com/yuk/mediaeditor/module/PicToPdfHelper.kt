package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.hookBeforeMethod

object PicToPdfHelper : HookRegister() {

    override fun init() {
        try {
            val cls =
                if (lpparam.packageName == "com.miui.mediaeditor") return
                else "com.miui.gallery.request.PicToPdfHelper"
            cls.hookBeforeMethod(
                getDefaultClassLoader(), "showSingleFilterSky"
            ) {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}