package com.example.springcloudfunctiontest

import org.springframework.stereotype.Component
import java.util.function.Function
import javax.annotation.PostConstruct

@Component
class MyTestConsumer : Function<String, String> {
    override fun apply(t: String): String {
        TODO("Not yet implemented")
    }
}