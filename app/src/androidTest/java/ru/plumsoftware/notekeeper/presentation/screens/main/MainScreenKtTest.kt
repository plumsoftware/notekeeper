package ru.plumsoftware.notekeeper.presentation.screens.main

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.ui.test.hasClickAction
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test
import ru.plumsoftware.notekeeper.presentation.TestTags
import ru.plumsoftware.notekeeper.presentation.theme.ExtendedTheme
import ru.plumsoftware.notekeeper.presentation.theme.NotekeeperTheme

class MainScreenKtTest {

    @get:Rule
    val rule = createComposeRule()

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Test
    fun mainScreenShowDrawerTest() {
        rule.setContent {
            NotekeeperTheme {
                ExtendedTheme {
                    Scaffold {
                        MainScreen()
                    }
                }
            }
        }

        rule.onNode(
            hasTestTag(TestTags.MainScreen.openLeftDrawerIconButton)
                    and
                    hasClickAction()
        ).performClick()

        rule.onNode(
            hasTestTag(TestTags.MainScreen.mainScreenDrawerBackBox)
        ).assertExists("Такого элемента не существует")

        rule.onNode(
            hasTestTag(TestTags.MainScreen.mainScreenDrawer)
        ).assertExists()

        rule.onNode(
            hasTestTag(TestTags.MainScreen.mainScreenDrawerBackBox)
                    and
                    hasClickAction()
        ).performClick().assertDoesNotExist()

        rule.onNode(
            hasTestTag(TestTags.MainScreen.mainScreenDrawer)
        ).assertDoesNotExist()
    }

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Test
    fun mainScreenShowSecondRowTest() {
        rule.setContent {
            NotekeeperTheme {
                ExtendedTheme {
                    Scaffold {
                        MainScreen()
                    }
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
        ).assertExists("Такого элемента не существует")
    }
}