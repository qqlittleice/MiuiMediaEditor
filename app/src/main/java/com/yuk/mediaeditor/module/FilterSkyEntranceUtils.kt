package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.ktx.hookBeforeMethod

class FilterSkyEntranceUtils {

    fun init() {
        try {
            "com.miui.gallery.editor_common.library.photoeditor.FilterSkyEntranceUtils".hookBeforeMethod("showSingleFilterSky") {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}