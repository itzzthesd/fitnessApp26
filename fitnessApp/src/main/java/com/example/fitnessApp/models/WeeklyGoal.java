package com.example.fitnessApp.models;

import org.springframework.format.annotation.DateTimeFormat;

public class WeeklyGoal implements Goals{
    public  int steps ;
    public  double workOut ;
    public double caloriesIntake ;
    public double caloriesBurn;
    public double weight;
    public DateTimeFormat startingTime;
    @Override
    public boolean isAchieved(HealthMetrics healthMetrics) {
        return false;
    }
    
}
