package com.controllers;

import com.dtos.CarDto;
import com.dtos.CarFormDto;
import com.services.CarServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class CarController {

    private final CarServiceImpl carService;



    @GetMapping("/listCars")
    public ResponseEntity<List<CarDto>> listAll(){
        return ResponseEntity.ok(carService.listAll());
    }

    @PostMapping("/createCar")
    public ResponseEntity<CarDto> save(@RequestBody CarFormDto carFormDto){

        return ResponseEntity.ok(carService.save(carFormDto));
    }
}
