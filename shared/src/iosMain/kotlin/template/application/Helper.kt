package template.application

import appModule
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin

class GreetingHelper : KoinComponent {
    private val greeting: Greeting by inject()
    fun greet(): String = greeting.greeting()
}
//usage example:
//
// struct ContentView: View {
//        // Create helper instance
//    let greet = GreetingHelper().greet()
//
//    var body: some View {
//        Text(greet)
//    }
//}
//ps кажется что можно без хелпера, но так рекомендует коин у себя



fun initKoin() {
    startKoin {
        modules(appModule())
    }
}
