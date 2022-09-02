package com.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogDto {

    private String id;

    private LocalDate dateHour;

    private String carId;

    public LogDto(LocalDate dateHour, String carId) {
        this.dateHour = dateHour;
        this.carId = carId;
    }
}
