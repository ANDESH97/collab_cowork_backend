package com.brownie.cc.controllers;

import com.brownie.cc.entity.C2C;
import com.brownie.cc.repositories.CCRepo;
import com.brownie.cc.services.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class DemoController {

    @Autowired
    CCRepo ccRepo;

    @Autowired
    DemoService demoService;

    @ResponseBody
    @GetMapping("demo")
    public String demo()
    {
        log.info("Demo method called");
        return "Mandir Yahi Banega!";
    }

    @ResponseBody
    @PostMapping("addInfo")
    public String addCafeInfo(@RequestParam("name") String name, @RequestParam("url") String url)
    {
        demoService.addCafeInfo(name,url,12.934142, 77.616229);

        return "Success";
    }

    @ResponseBody
    @GetMapping("getAllC2Cs")
    public List<C2C> getAllC2Cs()
    {
        List<C2C> c2cList = demoService.getAllCafes();
        return c2cList;
    }
}
