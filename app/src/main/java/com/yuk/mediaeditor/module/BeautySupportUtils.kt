package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.ktx.hookBeforeMethod

class BeautySupportUtils {

    fun init() {
        try {
            "com.miui.gallery.editor.photo.core.imports.beautyface.BeautySupportUtils".hookBeforeMethod("isSupportBeauty") {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}