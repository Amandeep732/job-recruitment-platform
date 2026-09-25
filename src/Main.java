import service.JobService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JobService jobService = new JobService();
        Scanner scanner = new Scanner(System.in);

        String recruiterName = "John Doe";

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
        System.out.println("0. Exit");
    }
}
