package org.example.task2.controller;

import org.example.task2.entity.Weather;
import org.example.task2.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("city_weather")
public class CityWeatherController {
    private WeatherService weatherService;

    @Autowired
    public CityWeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{code}")
    public Optional<Weather> getUserById(@PathVariable Long code) {
        return weatherService.getCityWeatherByCode(code);
    }

}
