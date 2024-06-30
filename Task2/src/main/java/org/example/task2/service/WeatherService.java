package org.example.task2.service;

import org.example.task2.entity.Weather;
import org.example.task2.repository.CityWeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WeatherService {
    private CityWeatherRepository cityWeatherRepository;

    @Autowired
    public WeatherService(CityWeatherRepository cityWeatherRepository) {
        this.cityWeatherRepository = cityWeatherRepository;
    }

    public Optional<Weather> getCityWeatherByCode(Long code) {

        return cityWeatherRepository.getWeatherByCode(code);
    }

}
