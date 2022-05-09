package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.ktx.hookBeforeMethod

class IDPhotoEntranceUtils {

    fun init() {
        try {
            "com.miui.gallery.config.IDPhotoEntranceUtils".hookBeforeMethod("isAvailable") {
                it.result = true
            }
            "com.miui.gallery.config.IDPhotoEntranceUtils".hookBeforeMethod("getIdType") {
                it.result = 2
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}