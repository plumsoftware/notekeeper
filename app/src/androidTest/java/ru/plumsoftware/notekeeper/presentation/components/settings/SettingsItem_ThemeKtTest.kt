package ru.plumsoftware.notekeeper.presentation.components.settings

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.hasClickAction
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test
import ru.plumsoftware.notekeeper.presentation.TestTags
import ru.plumsoftware.notekeeper.presentation.theme.ExtendedTheme
import ru.plumsoftware.notekeeper.presentation.theme.NotekeeperTheme

class SettingsItem_ThemeKtTest {

    @get:Rule
    val rule = createComposeRule()

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Test
    fun settingsItem_Theme() {
        rule.setContent {
            NotekeeperTheme {
                ExtendedTheme {
                    Scaffold {
                        SettingsItem_Theme(isDarkTheme = false)
                    }
                }
            }
        }

        rule.onNode(
            hasTestTag(TestTags.SettingsScreen.dropDownMenuButton_Theme)
                    and
                    hasClickAction()
        ).performClick()

        rule.onNode(
            hasTestTag(TestTags.SettingsScreen.dropDownMenuItem2_Theme)
                    and
                    hasClickAction()
        ).performClick()

        rule.onNode(
            hasTestTag(TestTags.SettingsScreen.dropDownMenuSelectedText_Theme)
        ).assertTextEquals("Тёмная")
    }
}