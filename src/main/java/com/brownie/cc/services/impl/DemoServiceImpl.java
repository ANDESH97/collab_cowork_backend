package com.brownie.cc.services.impl;

import com.brownie.cc.entity.C2C;
import com.brownie.cc.repositories.CCRepo;
import com.brownie.cc.services.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private CCRepo ccRepo;

    @Override
    public void addCafeInfo(String name, String url, Double latitude, Double longitude) {
        C2C newC2c = new C2C();

        newC2c.setC2cName(name);
        newC2c.setDescription("This is an amazing Cafe to work from.");
        newC2c.setPhone(Long.parseLong("9818029000"));
        newC2c.setSeatsTotal(20);
        newC2c.setSeatsAvailable(20);
        newC2c.setWifi(true);
        newC2c.setPrinter(true);
        newC2c.setImageUrl(url);
        newC2c.setLatitude(latitude);
        newC2c.setLongitude(longitude);

        ccRepo.save(newC2c);
    }

    @Override
    public List<C2C> getAllCafes() {
        return (List<C2C>)ccRepo.findAll();
    }
}
