package Program

import annotations.Fancy

@Fancy("Andry")
class MyApplication(val name:String, val version: Int ) {
    fun info(): String = "Application $name-$version"
}