package com.yuk.mediaeditor

import com.yuk.mediaeditor.hook.Gallery
import com.yuk.mediaeditor.hook.MediaEditor
import com.yuk.mediaeditor.utils.AppRegister
import com.yuk.mediaeditor.utils.EasyXposedInit
import de.robv.android.xposed.IXposedHookZygoteInit
import de.robv.android.xposed.callbacks.XC_LoadPackage

class XposedInit : EasyXposedInit() {

    override val registeredApp: List<AppRegister> = listOf(
        Gallery, // 相册
        MediaEditor, // 小米相册-编辑
    )

    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam?) {
        super.handleLoadPackage(lpparam)
    }

    override fun initZygote(startupParam: IXposedHookZygoteInit.StartupParam?) {
        super.initZygote(startupParam)
    }

}