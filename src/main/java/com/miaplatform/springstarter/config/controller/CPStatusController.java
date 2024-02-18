package com.miaplatform.springstarter.config.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CPStatusController {

    @GetMapping("/-/ready")
    public ResponseEntity<String> ready() {
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/-/healthz")
    public ResponseEntity<String> healthz() {
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/-/check-up")
    public ResponseEntity<String> checkUp() {
        return ResponseEntity.ok("ok");
    }
}

