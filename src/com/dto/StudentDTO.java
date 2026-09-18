package com.dto;

public class StudentDTO {
    private String Branch;
    private String Cgpa;
    private String gradYear;
    private String activeBacklogs;
    private String Skills;
    public String getBranch() {
        return Branch;
    }
    public void setBranch(String branch) {
        Branch = branch;
    }
    public String getCgpa() {
        return Cgpa;
    }
    public void setCgpa(String cgpa) {
        Cgpa = cgpa;
    }
    public String getGradYear() {
        return gradYear;
    }
    public void setGradYear(String gradYear) {
        this.gradYear = gradYear;
    }
    public String getActiveBacklogs() {
        return activeBacklogs;
    }
    public void setActiveBacklogs(String activeBacklogs) {
        this.activeBacklogs = activeBacklogs;
    }
    public String getSkills() {
        return Skills;
    }
    public void setSkills(String skills) {
        Skills = skills;
    }
    public StudentDTO(String branch, String cgpa, String gradYear, String activeBacklogs, String skills) {
        Branch = branch;
        Cgpa = cgpa;
        this.gradYear = gradYear;
        this.activeBacklogs = activeBacklogs;
        Skills = skills;
    }
    @Override
    public String toString() {
        return "StudentDTO [Branch=" + Branch + ", Cgpa=" + Cgpa + ", gradYear=" + gradYear + ", activeBacklogs="
                + activeBacklogs + ", Skills=" + Skills + "]";
    }


}
