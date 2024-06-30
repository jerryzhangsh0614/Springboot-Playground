package org.example.task2.repository;

import org.example.task2.entity.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Repository
public class CityWeatherRepository {
    private static final String URL_CITY_PREFIX = "http://t.weather.sojson.com/api/weather/city/";

    @Autowired
    private final RestTemplate restTemplate;

    public CityWeatherRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Optional<Weather> getWeatherByCode(Long Code) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        HttpEntity<String> request = new HttpEntity<>(headers);
        HttpEntity<Weather> response = restTemplate.exchange(URL_CITY_PREFIX + "/" + Code, HttpMethod.GET, request, Weather.class);
        return Optional.ofNullable(response.getBody());
    }
}
