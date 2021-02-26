package com.example.decisionservice.controller;

import com.example.decisionservice.model.Decision;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.decisionservice.service.DecisionService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.ResponseEntity.ok;

@RestController
public class DecisionController {

    private final DecisionService service;

    public DecisionController(final DecisionService service) {
        this.service = service;
    }

    @GetMapping(value="/decision", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Decision> getDecisionStatus(
            final String value
    ){
        return ok(service.getDecisionStatus(value));
    }
}
