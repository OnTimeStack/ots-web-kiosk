package com.ontimestack.webkiosk.components

import androidx.compose.foundation.border
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

/** High-contrast focus ring shared by remote-navigable OTS controls. */
@Composable
fun Modifier.otsFocusHighlight(
    shape: Shape = MaterialTheme.shapes.medium
): Modifier {
    var focused by remember { mutableStateOf(false) }
    return this
        .onFocusChanged { focused = it.hasFocus }
        .border(
            width = if (focused) 3.dp else 1.dp,
            color = if (focused) MaterialTheme.colorScheme.secondary else Color.Transparent,
            shape = shape
        )
}
