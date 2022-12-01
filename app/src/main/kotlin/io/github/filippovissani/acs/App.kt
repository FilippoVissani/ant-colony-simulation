package io.github.filippovissani.acs

/**
 *
 */
class App {
    /**
     *
     */
    val greeting: String
        get() {
            return "Hello World!"
        }
}

/**
 *
 */
fun main() {
    println(App().greeting)
}
