package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.ktx.hookBeforeMethod

class VlogEntranceUtils {

    fun init() {
        try {
            "com.miui.gallery.config.VlogEntranceUtils".hookBeforeMethod("isAvailable") {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}