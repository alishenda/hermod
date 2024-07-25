/**
 * Ecrire une fonction de premier ordre qui retourne une lambda permettant de doubler un entier donné.
 */
fun double(): (Int) -> Int {
    return { it * 2 }
}

/**
 * Ecrire une fonction de premier ordre qui retourne une lambda permettant de tripler un entier donné.
 */
fun triple(): (Int) -> Int {
    return { it * 3 }
}

/**
 * En utilisant uniquement la fonction double(), écrire une fonction de premier ordre qui retourne une lambda
 * permettant de quadrupler un entier donné.
 */
fun quadruple(): (Int) -> Int {
    val doubler = double()
    return { doubler(doubler(it)) }
}

/**
 * Implémenter la fonction de premier ordre customReduce() permettant d'appliquer une lambda à une liste d'entier.
 * Par exemple pour faire la somme d'une liste.
 */
fun List<Int>.customReduce(initial: Int, operation: (acc: Int, Int) -> Int): Int {
    var accumulator = initial
    for (element in this) {
        accumulator = operation(accumulator, element)
    }
    return accumulator
}

/**
 * Refaire l'exercice précédant en utilisant une récursion.
 */
fun List<Int>.customReduceRecursion(initial: Int, operation: (acc: Int, Int) -> Int): Int {
    tailrec fun reduceHelper(index: Int, accumulator: Int): Int {
        return if (index == this.size) {
            accumulator
        } else {
            reduceHelper(index + 1, operation(accumulator, this[index]))
        }
    }
    return reduceHelper(0, initial)
}

