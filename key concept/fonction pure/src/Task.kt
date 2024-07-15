/**
 * Créez une fonction pure qui prend une liste de strings et renvoie une nouvelle liste.
 * La liste retournée doit contenir uniquement les strings qui commencent par une lettre spécifique et chaque élément
 * doit être converti en majuscules.
 */
fun filterAndCapitalize(strings: List<String>, letter: Char): List<String> {
    return strings.filter { it.startsWith(letter, ignoreCase = true) }
        .map { it.uppercase() }
}

/**
 * Écrivez une fonction pure en Kotlin qui prend une liste de nombres et renvoie un résultat agrégé.
 * La fonction doit calculer la somme des carrés des nombres pairs uniquement.
 */
fun sumOfSquaresOfEven(numbers: List<Int>): Int {
    return numbers.filter { it % 2 == 0 }.sumOf { it * it }
}

/**
 * Écrivez une fonction pure en Kotlin qui analyse une liste de transactions bancaires.
 * Chaque transaction est représentée par une classe Transaction qui contient un id de type Int,
 * un montant de type Double (positif pour les dépôts, négatif pour les retraits), et une date de type String.
 */

fun analyzeTransactions(transactions: List<Transaction>): TransactionAnalysis {
    val totalDeposits = transactions.asSequence()
        .filter { it.amount > 0 }
        .sumOf { it.amount }

    val totalWithdrawals = transactions.asSequence()
        .filter { it.amount < 0 }
        .sumOf { Math.abs(it.amount) }

    val balance = totalDeposits - totalWithdrawals

    val transactionsPerDate = transactions.groupBy { it.date }
        .mapValues { it.value.size }

    return TransactionAnalysis(totalDeposits, totalWithdrawals, balance, transactionsPerDate)
}


