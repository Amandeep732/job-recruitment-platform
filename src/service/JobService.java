package service;

import model.Job;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JobService {
    private List<Job> jobs;

    public JobService() {
        this.jobs = new ArrayList<>();
    }

    public void postJob(Scanner scanner, String recruiterName) {
        System.out.println("\n--- Post a New Job ---");

        System.out.print("Enter job title: ");
        String title = scanner.nextLine();

        System.out.print("Enter job description: ");
        String description = scanner.nextLine();

        System.out.print("Enter required skills (comma-separated): ");
        String skillsInput = scanner.nextLine();
        List<String> requiredSkills = Arrays.asList(skillsInput.split(","));

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        Job job = new Job(title, description, requiredSkills, salary, recruiterName);
        jobs.add(job);

        System.out.println("\n✓ Job posted successfully!");
        System.out.println("Job ID: " + job.getJobId());
        System.out.println("Title: " + job.getTitle());
        System.out.println("Salary: $" + job.getSalary());
    }

    public void listAllJobs() {
        System.out.println("\n--- All Available Jobs ---");

        if (jobs.isEmpty()) {
            System.out.println("No jobs available.");
            return;
        }

        for (Job job : jobs) {
            System.out.println("\nJob ID: " + job.getJobId());
            System.out.println("Title: " + job.getTitle());
            System.out.println("Description: " + job.getDescription());
            System.out.println("Required Skills: " + job.getRequiredSkills());
            System.out.println("Salary: $" + job.getSalary());
            System.out.println("Status: " + job.getStatus());
            System.out.println("Posted by: " + job.getPostedBy());
        }
    }

    public void applyforJob(Scanner scanner, String applicantName){
        // Implementation for applying to jobs
         if(jobs.isEmpty()){
            System.out.println("No jobs available to apply.");
            return;
         }

        System.out.println("\n--- Apply for a Job ---");
        System.out.print("Enter the Job ID you want to apply for: ");
        String jobId = scanner.nextLine();  


        if (jobId == null || jobId.isEmpty()) {
            System.out.println("Invalid Job ID. Please try again.");
            return;
        }

        System.out.println("\n✓ Application submitted successfully!");
        System.out.println("Applicant Name: " + applicantName);       
        System.out.println("Applied for Job ID: " + jobId);
        


    }
}
