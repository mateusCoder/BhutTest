package com.services;

import com.controllers.CarClient;
import com.documents.Log;
import com.dtos.CarDto;
import com.dtos.CarFormDto;
import com.dtos.LogDto;
import com.repositories.LogRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CarServiceImpl implements CarService{

    private final CarClient carClient;

    private final LogRepository logRepository;

    private final ModelMapper mapper;

    @Override
    public CarDto save(CarFormDto carFormDto) {
        CarDto car = carClient.save(carFormDto);

        LogDto logDto = new LogDto(LocalDate.now(),  car.get_id());
        Log log = mapper.map(logDto, Log.class);
        logRepository.save(log);

        return car;
    }

    @Override
    public List<CarDto> listAll() {
        return carClient.listAll();
    }
}
