package com.gevernova.annotations.practice.pendingtasks;

import java.lang.reflect.Method;

public class TodoScanner {
    public static void main(String[] args){
        Class<ProjectFeatures> clazz = ProjectFeatures.class;
        for(Method method : clazz.getDeclaredMethods()){
            Todo todo = method.getAnnotation(Todo.class);
            System.out.println("Pending Task: " + todo.task());
            System.out.println("Assigned To: " + todo.assignTo());
            System.out.println("Priority: " + todo.priority());
            System.out.println("Method Name: " + method.getName());
            System.out.println("----------------------------");
        }
    }
}
