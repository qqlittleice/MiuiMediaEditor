package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.hookBeforeMethod

object MagicMattingEntranceUtils : HookRegister() {

    override fun init() {
        try {
            val cls =
                if (lpparam.packageName == "com.miui.mediaeditor") "com.miui.gallery.editor_common.library.magicmatting.MagicMattingEntranceUtils"
                else "com.miui.gallery.util.MagicMattingEntranceUtils"
            cls.hookBeforeMethod(
                getDefaultClassLoader(), "isAvailable"
            ) {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}