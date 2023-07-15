package template.application.androidapp.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import template.application.androidapp.GreetPresenter

val androidModule = module {
    singleOf(::GreetPresenter)
}