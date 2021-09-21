package com.example.demothymleaf.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Car {
    int id;
    String manufactory;
    String model;
    String img;
    long price;
    long sale;
}
