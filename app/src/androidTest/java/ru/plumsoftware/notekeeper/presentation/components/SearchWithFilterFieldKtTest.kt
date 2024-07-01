package ru.plumsoftware.notekeeper.presentation.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.test.assertIsFocused
import androidx.compose.ui.test.assertWidthIsAtLeast
import androidx.compose.ui.test.hasClickAction
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.performClick
import androidx.compose.ui.unit.dp
import org.junit.Rule

import org.junit.Test
import ru.plumsoftware.notekeeper.presentation.TestTags

class SearchWithFilterFieldKtTest {

    @get:Rule
    val rule = createComposeRule()

    @Test
    fun searchWithFilterField_test_width() {
        rule.setContent {
            MaterialTheme {
                SearchWithFilterField(text = "Заметки на 3 дня вперёд") {

                }
            }
        }

        rule.onNode(
            hasTestTag(TestTags.searchButton1)
            and
            hasClickAction()
        ).performClick()

        rule.onNode(
            hasTestTag(TestTags.searchFieldOnMainScreen)
        ).assertWidthIsAtLeast(100.dp)
    }

    @Test
    fun searchWithFilterField_test_focus() {
        rule.setContent {
            MaterialTheme {
                SearchWithFilterField(text = "Заметки на 3 дня вперёд") {

                }
            }
        }

        rule.onNode(
            hasTestTag(TestTags.searchButton1)
                    and
                    hasClickAction()
        ).performClick()

        rule.onNode(
            hasTestTag(TestTags.searchFieldOnMainScreen)
        ).assertIsFocused()
    }
}