package com.example.fitnessApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fitnessApp.models.HealthMetrics;

@Repository
public interface HealthMetricsRepo extends JpaRepository<HealthMetrics, Long>{
    
} 
