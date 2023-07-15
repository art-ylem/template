package template.application.androidapp

import template.application.Greeting

class GreetPresenter(val greeting: Greeting) {
    fun print() = greeting.greeting()
}