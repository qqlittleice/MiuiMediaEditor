package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.hookBeforeMethod

object VideoEditorEntranceUtils : HookRegister() {

    override fun init() {
        try {
            val cls =
                if (lpparam.packageName == "com.miui.mediaeditor") "com.miui.gallery.config.VideoEditorEntranceUtils"
                else "com.miui.gallery.vlog.VideoEditorEntranceUtils"
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