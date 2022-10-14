package com.example.demo.authclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.security.Principal;

import static org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction.oauth2AuthorizedClient;

@RestController("/api")
public class HelloController {
    private final WebClient webClient;

    @Autowired
    public HelloController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello(Principal principal) {
        return ResponseEntity.ok("Welcome "+ principal.getName());
    }

    @GetMapping("/names")
    public ResponseEntity getNames(
            @RegisteredOAuth2AuthorizedClient("api-client-authorization-code") OAuth2AuthorizedClient client
    ){
        return this.webClient
                .get()
                .uri("http://127.0.0.1:8081/api/names")
                .attributes(oauth2AuthorizedClient(client))
                .retrieve()
                .bodyToMono(ResponseEntity.class)
                .block();
    }
}
