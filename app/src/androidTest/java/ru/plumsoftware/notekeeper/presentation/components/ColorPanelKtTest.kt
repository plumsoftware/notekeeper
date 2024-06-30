package ru.plumsoftware.notekeeper.presentation.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.test.assertWidthIsEqualTo
import androidx.compose.ui.test.hasClickAction
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test
import ru.plumsoftware.notekeeper.presentation.TestTags
import ru.plumsoftware.notekeeper.presentation.theme.ExtendedTheme
import ru.plumsoftware.notekeeper.presentation.theme.addon.UIAddons

class ColorPanelKtTest {

    @get:Rule
    val rule = createComposeRule()

    @Test
    fun colorPanel_test() {
        rule.setContent {
            MaterialTheme {
                ExtendedTheme {
                    ColorPanel {}
                }
            }
        }

        rule.onNode(
            hasTestTag("${TestTags.colorButtonOnColorPanel} ${2}")
                    and
                    hasClickAction()
        ).performClick()

        rule.onNode(
            hasTestTag("${TestTags.colorButtonOnColorPanel} ${2}")
                    and
                    hasClickAction()
        ).assertWidthIsEqualTo(UIAddons.NoteColors.noteColorSizeSelected.width)
    }
}