package com.example.fitnessApp.models.DesignPatterns;

public class EmailNotificationObserver implements GoalObserver{

    @Override
    public void onGoalAchived(GoalAchivementEvent event) {
        System.out.println("Whatsapp : congratulations!" + event.getUser() + ", you have achived the goals " + event.getGoals() );
    }
    
}
