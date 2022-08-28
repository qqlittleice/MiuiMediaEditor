package com.yuk.mediaeditor.hook

import com.yuk.mediaeditor.module.FeatureManager
import com.yuk.mediaeditor.utils.AppRegister
import de.robv.android.xposed.callbacks.XC_LoadPackage

object Scanner : AppRegister() {
    override val packageName: String = "com.xiaomi.scanner"

    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam) {
        autoInitHooks(
            lpparam,
            FeatureManager
        )
    }
}