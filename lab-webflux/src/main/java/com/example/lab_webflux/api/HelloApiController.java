package com.example.lab_webflux.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class HelloApiController {

    @GetMapping("/api/hello-reactive")
    public Mono<String> helloReactive() {
        return Mono.delay(Duration.ofMillis(200)).then(Mono.just("Hello Webflux!!"));
    }

}
