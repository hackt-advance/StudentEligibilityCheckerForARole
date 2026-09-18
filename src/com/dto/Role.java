package com.dto;
import java.util.List;

public class Role {
    private String rlId;
    private String rlTitle;
    private List<String> allowedBranches;
    private double minCgpa;
    private List<Integer> allowedGradYear;
    private int maxBacklogs;
    private List<String> requiredSkills;
    public String getRlId() {
        return rlId;
    }
    public void setRlId(String rlId) {
        this.rlId = rlId;
    }
    public String getRlTitle() {
        return rlTitle;
    }
    public void setRlTitle(String rlTitle) {
        this.rlTitle = rlTitle;
    }
    public List<String> getAllowedBranches() {
        return allowedBranches;
    }
    public void setAllowedBranches(List<String> allowedBranches) {
        this.allowedBranches = allowedBranches;
    }
    public double getMinCgpa() {
        return minCgpa;
    }
    public void setMinCgpa(int minCgpa) {
        this.minCgpa = minCgpa;
    }
    public List<Integer> getAllowedGradYear() {
        return allowedGradYear;
    }
    public void setAllowedGradYear(List<Integer> allowedGradYear) {
        this.allowedGradYear = allowedGradYear;
    }
    public int getMaxBacklogs() {
        return maxBacklogs;
    }
    public void setMaxBacklogs(int maxBacklogs) {
        this.maxBacklogs = maxBacklogs;
    }
    public List<String> getRequiredSkills() {
        return requiredSkills;
    }
    public void setRequiredSkills(List<String> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }
    public Role(String rlId, String rlTitle, List<String> allowedBranches, double minCgpa,
            List<Integer> allowedGradYear, int maxBacklogs, List<String> requiredSkills) {
        this.rlId = rlId;
        this.rlTitle = rlTitle;
        this.allowedBranches = allowedBranches;
        this.minCgpa = minCgpa;
        this.allowedGradYear = allowedGradYear;
        this.maxBacklogs = maxBacklogs;
        this.requiredSkills = requiredSkills;
    }

    


}
