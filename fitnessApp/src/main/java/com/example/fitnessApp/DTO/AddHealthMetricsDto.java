package com.example.fitnessApp.DTO;

import java.sql.Time;

import org.springframework.format.annotation.DateTimeFormat;

import com.example.fitnessApp.models.InputStrategy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddHealthMetricsDto {
    public int steps ;
    public double workOut ;
    public double caloriesIntake ;
    public double caloriesBurn;
    public double weight;
    public double time;
    public String inputStrategy;
    public long userId;
}
