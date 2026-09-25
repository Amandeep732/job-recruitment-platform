package model;

public class Recruiter extends User {
    private String name;
    private String phone;
    private String company;
    private String department;

    public Recruiter(String userId, String email, String password, String name, String phone, String company, String department) {
        super(userId, email, password);
        this.name = name;
        this.phone = phone;
        this.company = company;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
