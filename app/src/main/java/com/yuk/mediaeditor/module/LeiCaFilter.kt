package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.hookBeforeMethod

object LeiCaFilter : HookRegister() {

    override fun init() {
        try {
            "com.xiaomi.leica.LeiCaFilter".hookBeforeMethod(
                getDefaultClassLoader(), "isSupport", String::class.java
            ) {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}