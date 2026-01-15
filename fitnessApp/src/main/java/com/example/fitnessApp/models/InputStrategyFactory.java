package com.example.fitnessApp.models;

public class InputStrategyFactory {
    public InputStrategy getInputStrategy(String strategy){
        if(strategy.equals("manual")){
            return new ManualInputStrategy(null);
        }else if(strategy.equals("watch")){
            return new SmartWatchInputStrategy(null);
        }
        else{
            return null;
        }

        // or we can use one map of string and inputStrategy
    }
}
