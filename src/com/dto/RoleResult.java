package com.dto;

import java.util.List;

public class RoleResult {
    private Role role;
    private boolean isEligible;
    private List<String> failures;
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    public boolean isEligible() {
        return isEligible;
    }
    public void setEligible(boolean isEligible) {
        this.isEligible = isEligible;
    }
    public List<String> getFailures() {
        return failures;
    }
    public void setFailures(List<String> failures) {
        this.failures = failures;
    }
    public RoleResult(Role role, boolean isEligible, List<String> failures) {
        this.role = role;
        this.isEligible = isEligible;
        this.failures = failures;
    }

    
}
