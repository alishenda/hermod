import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.nio.charset.Charset
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size > 1) {
        println("Usage: hermod [script]")
        exitProcess(64)
    } else if (args.size == 1) {
        runFile(args[0])
    } else {
        runPrompt()
    }
}

fun runPrompt() {
    println("Welcome in Hermod language. Messenger of the gods.")
    InputStreamReader(System.`in`, Charset.defaultCharset())
        .use { reader ->
            val bufferedReader = BufferedReader(reader)
            while (true) {
                print("> ")
                val line: String = bufferedReader.readLine() ?: break
                run(line)
            }
        }
}

fun runFile(path: String) {
    val bytes = File(path).inputStream().use {
        it.readAllBytes()
    }

    run(String(bytes, Charset.defaultCharset()))
}

fun run(source: String) {
    println(source)
}