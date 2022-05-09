package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.hookBeforeMethod

object IDPhotoEntranceUtils : HookRegister() {

    override fun init() {
        try {
            val cls =
                if (lpparam.packageName == "com.miui.mediaeditor") "com.miui.gallery.config.IDPhotoEntranceUtils"
                else "com.miui.gallery.util.IDPhotoEntranceUtils"
            cls.hookBeforeMethod(
                getDefaultClassLoader(),
                "isAvailable"
            ) {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}