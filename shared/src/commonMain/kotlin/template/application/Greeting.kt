package template.application

class Greeting(private val platform: Platform) {

    fun greeting(): String {
        return "hi ${platform.name}!"
    }
}