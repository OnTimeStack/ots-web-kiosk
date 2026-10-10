package com.ontimestack.webkiosk.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.ontimestack.webkiosk.MainActivity
import com.ontimestack.webkiosk.data.KioskSettingsFactory

@Composable
fun MainScreen(activity: MainActivity, interactive: Boolean, modifier: Modifier) {
    val context = LocalContext.current
    val settings = remember { KioskSettingsFactory.get(context) }
    WebViewComponent(
        url = settings.homePageUrl,
        activity = activity,
        interactive = interactive,
        modifier = modifier
    )
}
