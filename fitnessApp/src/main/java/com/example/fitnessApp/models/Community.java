package com.example.fitnessApp.models;

import java.util.HashMap;
import java.util.List;


public class Community {
    public int id;
    public String name;
    public String description;
    public HashMap<Integer, User> userRank;
    public int membercount;
    public List<User> admins;
}
