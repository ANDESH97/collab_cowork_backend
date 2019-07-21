package com.brownie.cc.services;

import com.brownie.cc.entity.C2C;

import java.util.List;

public interface DemoService {

    void addCafeInfo(String name, String url, Double latitude, Double longitude);

    List<C2C> getAllCafes();
}
