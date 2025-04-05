package com.example.ironhack.weatherstation.service;

import com.example.ironhack.weatherstation.model.Weather;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class WeatherService {

    private List<Weather> weatherList;

    @PostConstruct
    private void init() {
        weatherList = List.of(
                new Weather("Berlin", 5.0, LocalDate.now()),
                new Weather("London", 10.0, LocalDate.now()),
                new Weather("Paris", 12.0, LocalDate.now()),
                new Weather("New York", 15.0, LocalDate.now()),
                new Weather("Tokyo", 20.0, LocalDate.now()),
                new Weather("Sydney", 22.0, LocalDate.now()),
                new Weather("Beijing", 25.0, LocalDate.now()),
                new Weather("Seoul", 30.0, LocalDate.now())
        );
        System.out.println("WeatherService initialized");
    }

    public List<Weather> getWeather() {
        return weatherList;
    }

    public List<Weather> getWeatherByLocation(String location) {
        List<Weather> filteredWeather = new ArrayList<>();
        for(Weather weather : weatherList) {
            if(weather.getLocation().equalsIgnoreCase(location)) {
                filteredWeather.add(weather);
            }
        }
        return filteredWeather;
    }

    public List<Weather> getWeatherByDate(LocalDate date) {
        List<Weather> filteredWeather = new ArrayList<>();
        for(Weather weather : weatherList) {
            if(weather.getDate().equals(date)) {
                filteredWeather.add(weather);
            }
        }
        return filteredWeather;
    }

}
