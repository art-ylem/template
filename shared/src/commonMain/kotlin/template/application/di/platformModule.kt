package template.application.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import template.application.Platform

val platformModule = module {
    singleOf(::Platform)
}