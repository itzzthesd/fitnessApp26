package com.example.fitnessApp.models.DesignPatterns;

import java.util.List;

import com.example.fitnessApp.models.Goals;
import com.example.fitnessApp.models.HealthMetrics;
import com.example.fitnessApp.models.User;

// SUBJECT notifies the OBSERVERS via event
public class GoalEvaluationService implements Subject{ // service is the implementation of subject

    private List<GoalObserver> observers;

    @Override
    public void addObserver(GoalObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(GoalObserver observer) {
        // null
    }

    public void evaluategoals(User user, HealthMetrics healthMetrics){ // this health metrics should be passed from the controller
        List<Goals> goals = user.getGoals();
        for(Goals goal: goals){
            if(goal.isAchieved(healthMetrics)){
                notifyObservers(new GoalAchivementEvent(user, goal)); 
            }
        }
    }

    @Override
    public void notifyObservers(GoalAchivementEvent event) {
       
        for(GoalObserver observer: observers){
            observer.notify();
        }  
    }
}
