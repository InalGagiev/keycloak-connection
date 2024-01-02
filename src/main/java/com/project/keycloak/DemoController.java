package com.project.keycloak;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {
    @GetMapping
    public ResponseEntity<?> hello(){
        return ResponseEntity.ok("вы успешно попали на страницу");
    }

    @GetMapping("/hello-2")
    public String hello2() {
        return "hello admin";
    }
}
