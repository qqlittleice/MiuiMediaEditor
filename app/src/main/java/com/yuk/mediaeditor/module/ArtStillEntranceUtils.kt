package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.ktx.hookBeforeMethod

class ArtStillEntranceUtils {

    fun init() {
        try {
            "com.miui.gallery.editor_common.library.artstill.ArtStillEntranceUtils".hookBeforeMethod("isAvailable") {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}