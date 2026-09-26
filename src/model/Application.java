class Application{
    private String applicantName;
    private String jobId;

    public Application(String applicantName, String jobId) {
        this.applicantName = applicantName;
        this.jobId = jobId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getJobId() {
        return jobId;
    }
}