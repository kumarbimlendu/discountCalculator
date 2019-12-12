package com.bimlendu.discountCalculator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Discounts {

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String getApiHealth() {
        return "healthy";
    }


}
