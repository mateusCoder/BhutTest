package com.services;

import com.dtos.CarDto;
import com.dtos.CarFormDto;

import java.util.List;

public interface CarService {

    CarDto save(CarFormDto carFormDto);

    List<CarDto> listAll();
}
