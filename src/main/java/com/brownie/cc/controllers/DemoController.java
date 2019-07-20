package com.brownie.cc.controllers;

import com.brownie.cc.repositories.CCRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

    @Autowired
    CCRepo ccRepo;

    @ResponseBody
    @GetMapping("demo")
    public String demo()
    {
        log.info("Demo method called");
        return "Mandir Yahi Banega!";
    }
}
