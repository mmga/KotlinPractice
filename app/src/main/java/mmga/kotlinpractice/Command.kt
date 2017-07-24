package mmga.kotlinpractice

public interface Command<T> {
    fun execute(): T
}