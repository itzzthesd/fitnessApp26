package com.example.fitnessApp.models.DesignPatterns;

import com.example.fitnessApp.models.Goals;
import com.example.fitnessApp.models.User;

public class GoalAchivementEvent {
    private User user;
    private Goals goal;

    GoalAchivementEvent(User user, Goals goals){
        this.goal = goals;
        this.user = user;
    }

    public User getUser(){
        return this.user;
    }

    public Goals getGoals(){
        return this.goal;
    }
}
