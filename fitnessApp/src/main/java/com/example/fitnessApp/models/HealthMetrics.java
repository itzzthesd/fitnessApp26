package com.example.fitnessApp.models;



import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(
    name = "health_metrics",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_id", "date"})
    }
)
public class HealthMetrics {
    // this class stores the daily aggreagated metrics 
    //public long userId;
    public  int steps ;
    public  double workOut ;
    public double caloriesIntake ;
    public double caloriesBurn;
    public double weight;
    public LocalDate date;
    public User user;

    
    public long getUser(){
        return this.user.id;
    }
    
}
