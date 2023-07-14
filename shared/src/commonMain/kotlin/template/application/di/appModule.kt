import template.application.di.platformModule

fun appModule() = listOf(commonModule, platformModule)


//TODO("add to android application")
//startKoin {
//    androidContext(this@MainApplication)
//    androidLogger()
//    modules(appModule() + androidModule)
//}


//TODO("add to iosApp.swift")
//@main
//struct iOSApp: App {
//
//    init() {
//        HelperKt.doInitKoin()
//    }
//
//    var body: some Scene {
//        WindowGroup {
//            ContentView()
//        }
//    }
//}