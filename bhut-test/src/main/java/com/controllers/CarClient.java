package com.controllers;

import com.dtos.CarDto;
import com.dtos.CarFormDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(url = "http://api-test.bhut.com.br:3000/api/cars", name = "cars-api")
public interface CarClient {

    @GetMapping
    List<CarDto> listAll();

    @PostMapping
    CarDto save(@RequestBody CarFormDto carFormDto);

    @GetMapping("/{id}")
    CarDto listOne(@PathVariable String id);
}
