package com.brownie.cc.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class C2Cafe {

    private String name;
    private String description;
    private Double latitude;
    private Double longitude;
    private Double phone;
    private int seatsTotal;
    private int seatsAvailable;
    private boolean wifi;
    private boolean printer;
}

/*
    create table c2c(
        cafe_id INT NOT NULL AUTO INCREMENT,
        cafe_name varchar(100),
    description varchar(100),
            ;*/
