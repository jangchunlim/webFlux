package com.inyl.bootapi.controller;

import com.inyl.bootapi.model.HelloWorld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public Mono<HelloWorld> hello(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setTitle("hello");
        helloWorld.setMessage("hi");
        return Mono.just(helloWorld);
    }
}
