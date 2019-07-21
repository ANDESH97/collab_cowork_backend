package com.brownie.cc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="c2c")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class C2C implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c2c_id")
    private long c2cId;

    @Column(name= "c2c_name")
    private String c2cName;

    @Column(name= "description")
    private String description;

    @Column(name= "latitude", precision = 10, scale = 6)
    private Double latitude;

    @Column(name= "longitude", precision = 10, scale = 6)
    private Double longitude;

    @Column(name="phone")
    private long phone;

    @Column(name = "total_seats")
    private int seatsTotal;

    @Column(name = "available_seats")
    private int seatsAvailable;

    @Column(name = "wifi")
    private boolean wifi;

    @Column(name = "printer")
    private boolean printer;

    @Column(name = "image_url")
    private String imageUrl;
}
