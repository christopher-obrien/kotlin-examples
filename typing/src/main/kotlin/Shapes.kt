package types

abstract class Polygon {
    abstract fun area(): Int
}

open class Rectangle(val height: Int, val width: Int) : Polygon() {
    override fun area(): Int {
        return height * width
    }

    open fun perimeter(): Int {
        return height * 2 + width * 2
    }
}

class Square(length: Int) : Rectangle(length, length) {

    final override fun perimeter(): Int {
        return  height * 4
    }

    fun smallerSquares(numberOfSquares: Int = 4): Array<Square> {
        if(numberOfSquares in arrayOf(2, 3, 5))
            throw IllegalArgumentException()
        return arrayOf(Square(height), Square(height), Square(height), Square(height))
    }
}