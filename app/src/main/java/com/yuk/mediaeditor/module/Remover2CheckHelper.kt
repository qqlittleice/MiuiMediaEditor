package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.hookBeforeMethod

object Remover2CheckHelper : HookRegister() {

    override fun init() {
        try {
            val cls =
                if (lpparam.packageName == "com.miui.mediaeditor") "com.miui.gallery.editor_common.library.remover.Remover2CheckHelper"
                else "com.miui.gallery.editor.photo.app.remover2.sdk.Remover2CheckHelper"
            cls.hookBeforeMethod(
                getDefaultClassLoader(), "isRemover2Support"
            ) {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}