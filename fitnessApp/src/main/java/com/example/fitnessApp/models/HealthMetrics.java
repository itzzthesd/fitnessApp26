package com.example.fitnessApp.models;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HealthMetrics {
    
    public  int steps ;
    public  double workOut ;
    public double caloriesIntake ;
    public double caloriesBurn;
    public double weight;
    public DateTimeFormat date;
    public User user;
}
