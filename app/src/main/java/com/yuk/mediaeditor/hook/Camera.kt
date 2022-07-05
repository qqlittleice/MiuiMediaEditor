package com.yuk.mediaeditor.hook

import com.yuk.mediaeditor.module.LEICA
import com.yuk.mediaeditor.utils.AppRegister
import de.robv.android.xposed.callbacks.XC_LoadPackage

object Camera : AppRegister() {
    override val packageName: String = "com.android.camera"

    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam) {
        autoInitHooks(
            lpparam,
            LEICA, // Only for 4.3.004660.0
        )
    }
}