package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.hookBeforeMethod

object galleryFrameMenuFragment : HookRegister() {

    override fun init() {
        try {
            val cls = "com.miui.gallery.editor.photo.app.galleryframe.GalleryFrameMenuFragment\n"
            cls.hookBeforeMethod(
                getDefaultClassLoader(), "checkAccess"
            ) {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}