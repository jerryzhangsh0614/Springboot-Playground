package org.example.task2.controller;

import org.example.task2.entity.Weather;
import org.example.task2.service.CityCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/citycode")
public class CityCodeController {
    private final CityCodeService cityCodeService;

    @Autowired
    public CityCodeController(CityCodeService cityCodeService) {
        this.cityCodeService = cityCodeService;
    }

    @GetMapping()
    public Map<String, String> getAllCityCodes() {
        return cityCodeService.getAllCityCodes();
    }

}
