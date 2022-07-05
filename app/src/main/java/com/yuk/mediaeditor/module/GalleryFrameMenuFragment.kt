package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.hookBeforeMethod

object GalleryFrameMenuFragment : HookRegister() {

    override fun init() {
        try {
            val cls = "com.miui.gallery.editor.photo.app.galleryframe.GalleryFrameMenuFragment"
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