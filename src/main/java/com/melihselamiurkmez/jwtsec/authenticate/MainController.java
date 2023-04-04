package com.melihselamiurkmez.jwtsec.authenticate;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/main")
@RequiredArgsConstructor
public class MainController {

    @GetMapping
    public ResponseEntity<String> index(){
        return ResponseEntity.ok("Hello from secured endpoint!");
    }
}
