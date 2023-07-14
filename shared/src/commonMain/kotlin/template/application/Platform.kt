package template.application

expect val platform: String

class Greeting {
    fun greeting() = "Hello, $platform!"
}