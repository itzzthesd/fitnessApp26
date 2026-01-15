package com.example.fitnessApp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fitnessApp.DTO.AddHealthMetricsDto;
import com.example.fitnessApp.models.HealthMetrics;
import com.example.fitnessApp.models.HealthMetricsCommand;
import com.example.fitnessApp.services.HealthMetricsService;

@RestController
@RequestMapping("/health-metrics")
public class healthMetricsController {
    
    public HealthMetricsService healthMetricsService;

    healthMetricsController(HealthMetricsService healthMetricsService){
        this.healthMetricsService = healthMetricsService;
    }

    @PostMapping
    public void insertHealthMetrics(AddHealthMetricsDto addHealthMetricsDto){
        HealthMetricsCommand metrics = new HealthMetricsCommand();
        metrics.setSteps(addHealthMetricsDto.getSteps());
        metrics.setCaloriesBurn(addHealthMetricsDto.getCaloriesBurn());
        metrics.setCaloriesIntake(addHealthMetricsDto.getCaloriesIntake());
        metrics.setUserId(addHealthMetricsDto.getUserId());

        healthMetricsService.insertHealthMetrics(metrics, addHealthMetricsDto.getInputStrategy());
    }
}
