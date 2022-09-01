package com.services;

import org.modelmapper.ModelMapper;

import com.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CarServiceImpl implements CarService{

    private final CarRepository carRepository;

    private final ModelMapper mapper;
}
