package com.gevernova.annotations.repeatable;

public class IssueTracker {
    @BugReport(description = "NullPointerException on login", reportedBy = "Disha", severity = "High")
    @BugReport(description = "UI not responsive on mobile", reportedBy = "Ahad", severity = "Medium")
    public void loginFeature() {
        System.out.println("Executing login feature...");
    }
}
