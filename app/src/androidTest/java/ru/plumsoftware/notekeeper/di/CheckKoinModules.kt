package ru.plumsoftware.notekeeper.di

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.test.KoinTest
import org.koin.test.inject
import ru.plumsoftware.notekeeper.presentation.screens.main.MainViewModel
import kotlin.test.assertNotNull

class CheckKoinModules : KoinTest {

    @Before
    fun start() {
        startKoin {
            modules(appViewModelModule)
        }
    }

    @After
    fun shutDown() {
        stopKoin()
    }

    @Test
    fun checkAllModules() {
        val mainViewModel by inject<MainViewModel>()
        assertNotNull(mainViewModel)
    }
}