package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.ktx.hookBeforeMethod

class Remover2CheckHelper {

    fun init() {
        try {
            "com.miui.gallery.editor_common.library.remover.Remover2CheckHelper".hookBeforeMethod("isRemover2Support") {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}