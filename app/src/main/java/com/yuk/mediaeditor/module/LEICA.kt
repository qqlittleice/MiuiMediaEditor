package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.hookBeforeMethod

object LEICA : HookRegister() {

    override fun init() {
        try {
            "OooO0O0.OooO0Oo.OooO00o.OooO00o".hookBeforeMethod(
                getDefaultClassLoader(), "o00OOoo"
            ) {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}