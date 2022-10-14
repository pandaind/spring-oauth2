package com.example.demo.authresourceserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api")
public class ResourceController {

    @GetMapping("/names")
    public ResponseEntity<List<String>> getNames(){
        return ResponseEntity.ok(List.of("Hello","World","User"));
    }
}
