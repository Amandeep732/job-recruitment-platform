package model;

 public class Application{
    private String applicantName;
    private String jobId;
    private String status;

    public Application(String applicantName, String jobId) {
        this.applicantName = applicantName;
        this.jobId = jobId;
        this.status = "Pending"; // Default status
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getJobId() {
        return jobId;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}