package com.example.fitnessApp.models.DesignPatterns;

import com.example.fitnessApp.models.HealthMetrics;
import com.example.fitnessApp.models.User;

public interface Subject { // subject interface always manages the observers and notify the observers
    void addObserver(GoalObserver observer);
    void removeObserver(GoalObserver observer);
    void notifyObservers(GoalAchivementEvent event);
}
