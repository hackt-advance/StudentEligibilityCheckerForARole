package com.dto;

import java.util.List;
import java.util.Set;
public class ValidatedStudentDTO {
      private String branch;
      private Double cgpa;
      private int gradYear;
      private int activeBacklogs;
      private List<String> skills;
      private Set<String> filteredSkills;
      public String getBranch() {
          return branch;
      }
      public Set<String> getFilteredSkills() {
        return filteredSkills;
    }
      public void setFilteredSkills(Set<String> filteredSkills) {
          this.filteredSkills = filteredSkills;
      }
      public void setBranch(String branch) {
          this.branch = branch;
      }
      public Double getCgpa() {
          return cgpa;
      }
      public void setCgpa(Double cgpa) {
          this.cgpa = cgpa;
      }
      public int getGradYear() {
          return gradYear;
      }
      public void setGradYear(int gradYear) {
          this.gradYear = gradYear;
      }
      public int getActiveBacklogs() {
          return activeBacklogs;
      }
      public void setActiveBacklogs(int activeBacklogs) {
          this.activeBacklogs = activeBacklogs;
      }
      public List<String> getSkills() {
          return skills;
      }
      public void setSkills(List<String> skills) {
          this.skills = skills;
      }
      
      public ValidatedStudentDTO(String branch, Double cgpa, int gradYear, int activeBacklogs, List<String> skills,
            Set<String> filteredSkills) {
        this.branch = branch;
        this.cgpa = cgpa;
        this.gradYear = gradYear;
        this.activeBacklogs = activeBacklogs;
        this.skills = skills;
        this.filteredSkills = filteredSkills;
    }
     
      @Override
      public String toString() {
        return "ValidatedStudentDTO [branch=" + branch + ", cgpa=" + cgpa + ", gradYear=" + gradYear
                + ", activeBacklogs=" + activeBacklogs + ", skills=" + skills + "]";
      }

      


}
