package com.gevernova.annotations.repeatable;

import java.lang.annotation.*;

@Repeatable(BugReports.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BugReport {
    String description();
    String reportedBy() default "Unknown";
    String severity() default "Low";
}
