package com.yuk.mediaeditor

import com.yuk.mediaeditor.hook.Camera
import com.yuk.mediaeditor.hook.Gallery
import com.yuk.mediaeditor.hook.MediaEditor
import com.yuk.mediaeditor.utils.AppRegister
import com.yuk.mediaeditor.utils.EasyXposedInit

class XposedInit : EasyXposedInit() {

    override val registeredApp: List<AppRegister> = listOf(
        Gallery, // 相册
        MediaEditor, // 小米相册-编辑
        Camera, // 相机
    )

}