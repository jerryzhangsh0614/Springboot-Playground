package org.example.task2.entity.City;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CityCode {
        @JsonProperty("city_code")
        private String cityCode;

        @JsonProperty("city_name")
        private String cityName;
}
