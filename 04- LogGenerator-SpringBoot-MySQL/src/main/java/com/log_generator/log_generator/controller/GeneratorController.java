package com.log_generator.log_generator.controller;

import com.log_generator.log_generator.entity.Generator;
import com.log_generator.log_generator.service.GeneratorService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class GeneratorController {
    private final GeneratorService generatorService;

    public GeneratorController(GeneratorService generatorService) {
        this.generatorService = generatorService;
    }

    @GetMapping("/generators")
    public ResponseEntity<Page<Generator>> Generators(){
        return ResponseEntity.status(HttpStatus.OK).body(generatorService.getAllGenerator());
    }

}
