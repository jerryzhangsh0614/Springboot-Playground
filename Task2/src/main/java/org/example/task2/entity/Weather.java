package org.example.task2.entity;
import lombok.Data;

@Data
public class Weather {
    private String message;
    private Integer status;
    private String date;
    private String time;

    private CityInfo cityInfo;
    private WeatherData data;
}
