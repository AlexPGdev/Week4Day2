package com.example.ironhack.weatherstation.controller;

import com.example.ironhack.weatherstation.model.Weather;
import com.example.ironhack.weatherstation.service.WeatherService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public List<Weather> getWeather() {
        return weatherService.getWeather();
    }

    @GetMapping("/{location}")
    public List<Weather> getWeatherByLocation(@PathVariable("location") String location) {
        return weatherService.getWeatherByLocation(location);
    }

    @GetMapping("filter")
    public List<Weather> getWeatherByDate(@RequestParam("date") String date) {
        return weatherService.getWeatherByDate(LocalDate.parse(date));
    }

}
