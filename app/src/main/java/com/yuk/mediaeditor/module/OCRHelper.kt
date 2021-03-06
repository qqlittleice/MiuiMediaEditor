package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.hookBeforeMethod

object OCRHelper : HookRegister() {

    override fun init() {
        try {
            val cls = "com.miui.gallery.ui.photoPage.ocr.OCRHelper"
            cls.hookBeforeMethod(
                getDefaultClassLoader(), "isSupportLocalOCR"
            ) {
                it.result = true
            }
            cls.hookBeforeMethod(
                getDefaultClassLoader(), "isSupportOCR"
            ) {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}