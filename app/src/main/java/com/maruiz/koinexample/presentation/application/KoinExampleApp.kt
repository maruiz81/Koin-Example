package com.maruiz.koinexample.presentation.application

import android.app.Application
import com.maruiz.koinexample.presentation.di.appModule
import org.koin.android.ext.android.startKoin

class KoinExampleApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(appModule), loadPropertiesFromFile = true)
    }
}