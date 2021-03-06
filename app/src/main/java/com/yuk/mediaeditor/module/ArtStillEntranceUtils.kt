package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.hookBeforeMethod

object ArtStillEntranceUtils : HookRegister() {

    override fun init() {
        try {
            val cls =
                if (lpparam.packageName == "com.miui.mediaeditor") "com.miui.gallery.editor_common.library.artstill.ArtStillEntranceUtils"
                else "com.miui.gallery.util.ArtStillEntranceUtils"
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