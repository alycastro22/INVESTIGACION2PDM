package hn.edu.ujcv.pdm_2021_p3_investigacion2.shared

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}