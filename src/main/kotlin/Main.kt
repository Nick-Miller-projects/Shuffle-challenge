fun main(args: Array<String>) {
    if (args.size == 3) {
        val word1 = args[0]
        val word2 = args[1]
        val shuffle = args[2]

        if (isLegitimateShuffle(word1, word2, shuffle)) {
            println("CORRECT")
        } else {
            println("INCORRECT")
        }
    } else {
        println("input two words and a shuffle <word1> <word2> <shuffle>")
    }
}

fun isLegitimateShuffle(word1: String, word2: String, shuffle: String): Boolean {
    // word one pointer
    var x = 0
    // word two pointer
    var y = 0

    // iterate over the two main words. If a letter is found to match, move to the next letter
    // if the character doesn't match word one or two, then it doesn't match
    for (char in shuffle) {
        when {
            x < word1.length && char == word1[x] -> x++
            y < word2.length && char == word2[y] -> y++
            else -> return false
        }
    }

    // Check if the shuffle is equal to the sum of the positions of word 1 and 2
    return shuffle.length == x + y
}