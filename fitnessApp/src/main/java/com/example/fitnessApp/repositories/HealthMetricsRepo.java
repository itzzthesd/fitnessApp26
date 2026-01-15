package com.example.fitnessApp.repositories;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.fitnessApp.models.HealthMetrics;

@Repository
public interface HealthMetricsRepo extends JpaRepository<HealthMetrics, Long>{
    @Modifying
    @Transactional
    @Query(value = """
        INSERT INTO health_metrics
        (user_id, date, steps, work_out,
         calories_intake, calories_burn, weight)
        VALUES
        (:userId, :date, :steps, :workOut,
         :caloriesIntake, :caloriesBurn, :weight)
        ON DUPLICATE KEY UPDATE
            steps = steps + VALUES(steps),
            work_out = work_out + VALUES(work_out),
            calories_intake = calories_intake + VALUES(calories_intake),
            calories_burn = calories_burn + VALUES(calories_burn),
            weight = VALUES(weight)
        """,
        nativeQuery = true
    )
    void upsertDailyMetrics(
        @Param("userId") Long userId,
        @Param("date") LocalDate date,
        @Param("steps") int steps,
        @Param("workOut") double workOut,
        @Param("caloriesIntake") double caloriesIntake,
        @Param("caloriesBurn") double caloriesBurn,
        @Param("weight") double weight
    );
} 
