package personal.keisuke.yamanaka.getstarted

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

// In Kotlin, if a class doesn't include any members (properties or functions), you can omit the class body ({}) for good.
@SpringBootApplication
class Application

// entry point
fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
