package mmga.kotlinpractice


class Person {
    var name: String = ""
        get() = field.toUpperCase()
    var age: Int = 0
        get() = field + 1
}
