package com.example.ironhack.weatherstation.model;

import java.time.LocalDate;

public class Weather {
    private String location;
    private double temperature;
    private LocalDate date;

    public Weather(String location, double temperature, LocalDate date) {
        setLocation(location);
        setTemperature(temperature);
        setDate(date);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
