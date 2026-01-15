package com.example.fitnessApp.models;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HealthMetricsCommand {
    // this is only to transfer the metrics from CONTROLLER -> SERVICE
    public  int steps ;
    public  double workOut ;
    public double caloriesIntake ;
    public double caloriesBurn;
    public double weight;
    public LocalDate date;
    public long userId;

    public HealthMetrics creaHealthMetrics(){
        HealthMetrics metrics = new HealthMetrics();
        metrics.setCaloriesBurn(this.caloriesBurn);
        metrics.setCaloriesIntake(this.caloriesIntake);
        metrics.setSteps(this.steps);
        metrics.setWorkOut(this.workOut);
        return metrics;
    }

    public HealthMetricsLog creaHealthMetricsLogs(){
        HealthMetricsLog metrics = new HealthMetricsLog();
        metrics.setCaloriesBurn(this.caloriesBurn);
        metrics.setCaloriesIntake(this.caloriesIntake);
        metrics.setSteps(this.steps);
        metrics.setWorkOut(this.workOut);
        return metrics;
    }
}
