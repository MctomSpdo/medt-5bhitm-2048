package at.htl.leonding.game2048

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import at.htl.leonding.game2048.ui.theme.Game1024Background
import at.htl.leonding.game2048.ui.theme.Game128Background
import at.htl.leonding.game2048.ui.theme.Game16Background
import at.htl.leonding.game2048.ui.theme.Game2048Background
import at.htl.leonding.game2048.ui.theme.Game256Background
import at.htl.leonding.game2048.ui.theme.Game2Background
import at.htl.leonding.game2048.ui.theme.Game2Color
import at.htl.leonding.game2048.ui.theme.Game32Background
import at.htl.leonding.game2048.ui.theme.Game4Background
import at.htl.leonding.game2048.ui.theme.Game4Color
import at.htl.leonding.game2048.ui.theme.Game512Background
import at.htl.leonding.game2048.ui.theme.Game64Background
import at.htl.leonding.game2048.ui.theme.Game8Background
import at.htl.leonding.game2048.ui.theme.Game8Color
import at.htl.leonding.game2048.ui.theme.GameBackground
import at.htl.leonding.game2048.ui.theme.GameCellBackground

@Composable
fun GameCell(number: Int) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .border(2.5.dp, color = GameBackground, RectangleShape)
            .size(80.dp)
            .background(setColorOfCell(number))

    ) {
        if(number != 0) {
            Text(
                text = number.toString(),
                fontSize = setFontSize(number),
                color = setFontColor(number)
            )
        }
    }
}

fun setFontSize(number: Int): TextUnit {
    return if (number >= 100) {
        28.sp
    } else {
        36.sp
    }
}

fun setColorOfCell(number: Int): Color {
    return when (number) {
        2 -> Game2Background
        4 -> Game4Background
        8 -> Game8Background
        16 -> Game16Background
        32 -> Game32Background
        64 -> Game64Background
        128 -> Game128Background
        256 -> Game256Background
        512 -> Game512Background
        1024 -> Game1024Background
        2048 -> Game2048Background
        else -> GameCellBackground
    }
}

fun setFontColor(number: Int): Color {
    return when (number) {
        2 -> Game2Color
        4 -> Game4Color
        else -> Game8Color

    }
}