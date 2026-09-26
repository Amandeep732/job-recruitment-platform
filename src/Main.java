import service.JobService;
import exception.JobNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JobService jobService = new JobService();
        Scanner scanner = new Scanner(System.in);

        String recruiterName = "John Doe";
        String applicantName = "Jane Smith";

        while (true) {
            displayMenu();

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                jobService.postJob(scanner, recruiterName);
            }
            else if (choice == 2) {
                jobService.listAllJobs();
            }
            else if (choice == 0) {
                System.out.println("\nThank you for using Job Recruitment Platform. Goodbye!");
                break;
            }else if (choice == 3) {
                System.out.println("\nApply for jobs");
                try {
                    jobService.applyforJob(scanner, applicantName);
                } catch (JobNotFoundException e) {
                    System.out.println("\n✗ Error: " + e.getMessage());
                }
            }else if (choice == 4) {
                System.out.println("\nView all applicants");
                jobService.viewAllApplicants();
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n===== Job Recruitment Platform =====");
        System.out.println("1. Post a Job");
        System.out.println("2. View All Jobs");
        System.out.println("3. Apply for a Job");
        System.out.println("4. View All Applicants");
        System.out.println("0. Exit");
    }
}
