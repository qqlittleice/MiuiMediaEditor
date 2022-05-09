package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.github.kyuubiran.ezxhelper.utils.findField
import com.github.kyuubiran.ezxhelper.utils.putObject
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.hookBeforeMethod

object FilterManager : HookRegister() {

    override fun init() {
        try {
            "com.miui.gallery.editor.photo.core.imports.filter.FilterManager".hookBeforeMethod(
                getDefaultClassLoader(), "getFilterCategory"
            ) {
                val field =
                    findField("android.os.Build") { type == String::class.java && name == "DEVICE" }
                putObject(field, "wayne")
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}