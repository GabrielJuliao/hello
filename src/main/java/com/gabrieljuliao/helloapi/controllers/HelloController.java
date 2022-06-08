package com.gabrieljuliao.helloapi.controllers;

import com.gabrieljuliao.helloapi.model.HttpMethod;
import com.gabrieljuliao.helloapi.services.HelloService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public ResponseEntity<?> getHello() {
        return new ResponseEntity<>(helloService.hello(HttpMethod.GET), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> postHello() {
        return new ResponseEntity<>(helloService.hello(HttpMethod.POST), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> putHello() {
        return new ResponseEntity<>(helloService.hello(HttpMethod.PUT), HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<?> patchHello() {
        return new ResponseEntity<>(helloService.hello(HttpMethod.PATCH), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteHello() {
        return new ResponseEntity<>(helloService.hello(HttpMethod.DELETE), HttpStatus.OK);
    }
}
