import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import template.application.Greeting

val commonModule = module {
    singleOf(::Greeting)
}