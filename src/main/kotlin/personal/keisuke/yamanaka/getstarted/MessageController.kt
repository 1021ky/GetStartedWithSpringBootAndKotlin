package personal.keisuke.yamanaka.getstarted

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController {
    @GetMapping
    fun listMessages() = listOf(
        Message("1", "Hello!"),
        Message("2", "Bonjour!"),
        Message("3", "Privet!"),
    )

//    @GetMapping("/")
//    fun index(@RequestParam("name") name: String) = "Hello, $name!"

}