package org.example.task2.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.example.task2.entity.City.CityCode;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CityCodeService {
    private final Map<String, String> cityCodeMap = new HashMap<>();

    @PostConstruct
    public void init() {
        ObjectMapper mapper = new ObjectMapper();
        ClassPathResource resource = new ClassPathResource("citycode-2019-08-23.json");

        try (InputStream inputStream = resource.getInputStream()) {
            List<CityCode> cityCodes = mapper.readValue(inputStream, new TypeReference<List<CityCode>>() {});
//            System.out.println(cityCodes);
            for (CityCode cityCode : cityCodes) {
                cityCodeMap.put(cityCode.getCityName(), cityCode.getCityCode());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<String, String> getCityCodeMap() {
        return cityCodeMap;
    }

    public Map<String, String> getAllCityCodes() {
        return cityCodeMap;
    }

}
