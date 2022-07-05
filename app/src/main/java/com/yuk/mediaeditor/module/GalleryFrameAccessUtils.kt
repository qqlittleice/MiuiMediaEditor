package com.yuk.mediaeditor.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.mediaeditor.utils.HookRegister
import com.yuk.mediaeditor.utils.hookBeforeMethod

object GalleryFrameAccessUtils : HookRegister() {

    override fun init() {
        try {
            val cls =
                "com.miui.gallery.editor.photo.core.imports.galleryframe.GalleryFrameAccessUtils"
            cls.hookBeforeMethod(
                getDefaultClassLoader(), "isSupport"
            ) {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}