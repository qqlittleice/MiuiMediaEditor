package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.hookBeforeMethod

object SkyCheckHelper : HookRegister() {

    override fun init() {
        try {
            val cls =
                if (lpparam.packageName == "com.miui.mediaeditor") "com.miui.gallery.editor_common.libs.SkyCheckHelper"
                else "com.miui.gallery.editor.photo.app.sky.sdk.SkyCheckHelper"
            cls.hookBeforeMethod(
                getDefaultClassLoader(), "isSkyEnable"
            ) {
                it.result = true
            }
            cls.hookBeforeMethod(
                getDefaultClassLoader(), "isSupportTextYanhua"
            ) {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}