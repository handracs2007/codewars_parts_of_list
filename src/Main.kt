// https://www.codewars.com/kata/56f3a1e899b386da78000732/train/kotlin

fun partlist(arr: Array<String>): Array<Array<String>> {
    val result = mutableListOf<Array<String>>()

    for (i in 0 until arr.size - 1) {
        val leftArray = arr.toList().subList(0, i + 1)
        val rightArray = arr.toList().subList(i + 1, arr.size)

        val stringList = mutableListOf<String>()
        stringList.add(leftArray.joinToString(separator = " "))
        stringList.add(rightArray.joinToString(separator = " "))

        result.add(stringList.toTypedArray())
    }

    return result.toTypedArray()
}

fun main() {
    println(partlist(arrayOf("cdIw", "tzIy", "xDu", "rThG")).toList())
    println(partlist(arrayOf("I", "wish", "I", "hadn't", "come")).toList())
}