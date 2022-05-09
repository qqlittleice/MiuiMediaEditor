package com.yuk.mediaeditor.hook

import com.yuk.mediaeditor.module.*
import com.yuk.mediaeditor.utils.AppRegister
import de.robv.android.xposed.callbacks.XC_LoadPackage

object Gallery : AppRegister() {
    override val packageName: String = "com.miui.gallery"

    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam) {
        autoInitHooks(
            lpparam,
            ArtStillEntranceUtils,
            //BeautySupportUtils,
            FilterManager,
            FilterSkyEntranceUtils,
            FrameSelectorView,
            IDPhotoEntranceUtils,
            MagicMattingEntranceUtils,
            Remover2CheckHelper,
            SkyCheckHelper,
            SmartVideoJudgeManager,
            VideoEditorEntranceUtils,
            VideoPostEntranceUtils,
            VlogEntranceUtils,
        )
    }
}