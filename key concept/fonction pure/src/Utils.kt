data class Transaction(val id: Int, val amount: Double, val date: String)

data class TransactionAnalysis(
    val totalDeposits: Double,
    val totalWithdrawals: Double,
    val balance: Double,
    val transactionsPerDate: Map<String, Int>
)