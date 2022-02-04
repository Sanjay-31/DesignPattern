package com.StrategicDesignPattern.demo.Strategy;

public class Employee {
    private String Name;
    private Post post;

    public Employee(String Name, Post post)
    {
        this.Name=Name;
        this.post = post;
    }
    public String getJobDescription()
    {
        return post.JobDescription();
    }
    public int MinExperience()
    {
        return post.MinExperience();
    }
    public void PromoteTo(Post post)
    {
        this.post = post;
    }
}
