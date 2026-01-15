package com.example.fitnessApp.models;

import org.springframework.format.annotation.DateTimeFormat;


public class MonthlyGoals implements Goals {
    public  int steps ;
    public  double workOut ;
    public double caloriesIntake ;
    public double caloriesBurn;
    public double weight;
    public DateTimeFormat startingDate;
    @Override
    public boolean isAchieved(HealthMetrics healthMetrics) {
       return false;
    }
}
