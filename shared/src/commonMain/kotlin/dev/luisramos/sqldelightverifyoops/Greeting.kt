package dev.luisramos.sqldelightverifyoops

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}