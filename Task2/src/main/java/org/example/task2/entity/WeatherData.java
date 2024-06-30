package org.example.task2.entity;

import lombok.Data;

import java.util.List;

@Data
public class WeatherData {
    private String shidu;
    private Integer pm25;
    private Integer pm10;
    private String quality;
    private String wendu;
    private String ganmao;

    private List<Forecast> forecast;
    private Yesterday yesterday;
}
