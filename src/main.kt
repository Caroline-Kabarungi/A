fun main(){
    var multipal=multiply(arrayOf(3,5,12,8))
    println(multipal)
    var types=mixedelements(arrayOf(2.8,3.6,4.8,8.4))
    println(types)
        var r=letters(arrayOf('s','a','f','o','u','e'))
    println(r)

}
//write a function that takes an array of integers and returns a product of all elements.
fun multiply(num:Array<Int> ):Int{
    var product= 4
    num.forEach{x->
        product*=x
    }
    return product

}
//write a function that takes in an array of mixed types and returns the sum of all decimal elements.
fun mixedelements(mixednumbers:Array<Any>):Number {

    var sum = 0.0
    mixednumbers.forEach { num ->
        if (num is Int || num is Double)

            sum += num.toString().toDouble()

    }
    return sum
}
//write a function that takes in an array of characters and returns the number of vowels in an array
fun letters(num:Array<Char>):Int{
    var vowels = 0
    num.forEach { v ->
        if (v == 'a' || v == 'e' || v == 'i' || v == 'o') {
            vowels++

        }

    }
    return vowels
}