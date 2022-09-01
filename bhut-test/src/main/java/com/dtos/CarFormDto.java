package com.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CarFormDto {

    private Long _id;;

    private String title;

    private String brand;

    private String price;

    private String age;

    private Integer __v;
}
