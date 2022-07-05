package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.hookBeforeMethod

object FilterUtils : HookRegister() {

    override fun init() {
        try {
            val cls = "com.miui.gallery.vlog.filter.FilterUtils"
            cls.hookBeforeMethod(
                getDefaultClassLoader(), "isSupportGalleryFilter"
            ) {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}