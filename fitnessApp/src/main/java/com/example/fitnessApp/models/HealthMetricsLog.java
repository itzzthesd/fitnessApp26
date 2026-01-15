package com.example.fitnessApp.models;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HealthMetricsLog {
    // this class stores the all the insertion history
    public  int steps ;
    public  double workOut ;
    public double caloriesIntake ;
    public double caloriesBurn;
    public double weight;
    public LocalDate date;
    public User user;
    public InputStrategy inputStrategy;
}
