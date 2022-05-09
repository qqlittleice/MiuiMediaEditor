package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.hookBeforeMethod

object BeautySupportUtils : HookRegister() {

    override fun init() {
        try {
            "com.miui.gallery.editor.photo.core.imports.beautyface.BeautySupportUtils".hookBeforeMethod(
                getDefaultClassLoader(), "isSupportBeauty"
            ) {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}