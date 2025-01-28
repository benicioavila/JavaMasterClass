package com.br.master.generics;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends Player> {
    private String teamName;
    private List<T> teamMembers = new ArrayList();

    private int totalWins = 0;

    private int totalLosses = 0;

    private int totalTies = 0;

    public Team (String teamName){

    }

    public void addTeam(T t){
        if(!teamMembers.contains(t)){
            teamMembers.add(t);
        }
    }

}
