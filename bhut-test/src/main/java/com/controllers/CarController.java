package com.controllers;

import com.documents.Car;
import com.dtos.CarDto;
import com.dtos.CarFormDto;
import com.services.CarServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarServiceImpl carService;

    private final CarClient carClient;

    @GetMapping
    public ResponseEntity<List<CarDto>> listAll(){
        return ResponseEntity.ok(carClient.listAll());
    }

    @PostMapping
    public ResponseEntity<Car> save(@RequestBody CarFormDto carFormDto){
        return ResponseEntity.ok(carClient.save(carFormDto));
    }


}
