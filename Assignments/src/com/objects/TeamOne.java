package com.objects;

public class TeamOne  extends Project{
    String techStack;

    public TeamOne(String projectName, int durationinMonths, String domain, String projectManager, String techStack) {
        super(projectName, durationinMonths, domain, projectManager);
        this.techStack = techStack;
    }

    String[] showTechStack(){
        String []tech={"jdk", "Maven"};
        return tech;
    }

    }

