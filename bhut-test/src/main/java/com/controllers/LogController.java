package com.controllers;

import com.dtos.LogDto;
import com.services.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class LogController {

    private final LogService logService;

    @GetMapping("/logs")
    public ResponseEntity<List<LogDto>> listAll(){
        return ResponseEntity.ok(logService.listAll());
    }

}
