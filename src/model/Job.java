package model;

import java.util.List;

public class Job {
    private static int jobCounter = 1;
    private String jobId;
    private String title;
    private String description;
    private List<String> requiredSkills;
    private double salary;
    private String status;
    private String postedBy;

    public Job(String title, String description, List<String> requiredSkills, double salary, String postedBy) {
        this.jobId = "JOB_" + jobCounter++;
        this.title = title;
        this.description = description;
        this.requiredSkills = requiredSkills;
        this.salary = salary;
        this.status = "Open";
        this.postedBy = postedBy;
    }

    public String getJobId() {
        return jobId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(List<String> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }
}
