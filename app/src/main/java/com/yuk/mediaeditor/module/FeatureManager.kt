package com.yuk.mediaeditor.module

import android.content.Context
import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.hookBeforeMethod
import de.robv.android.xposed.XposedBridge

object FeatureManager : HookRegister() {

    override fun init() {
        try {
            "com.xiaomi.scanner.settings.FeatureManager".hookBeforeMethod(
                getDefaultClassLoader(),
                "isAddFormRecognitionFunction", Context::class.java
            ) {
                it.result = true
                XposedBridge.log("isAddFormRecognitionFunction Hooked")
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}