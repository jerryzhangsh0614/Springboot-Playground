package org.example.task2.entity;

import lombok.Data;

@Data
public class Forecast {
    private String date;
    private String high;
    private String low;
    private String ymd;
    private String week;
    private String sunrise;
    private String sunset;
    private Integer aqi;
    private String fx;
    private String fl;
    private String type;
    private String notice;
}
