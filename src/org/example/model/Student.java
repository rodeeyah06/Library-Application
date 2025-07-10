package org.example.model;

import org.example.UserRole;

public class Student extends User {
    private int level;

    public Student(String name, UserRole role, int level) {
        super(name, UserRole.Student);
        this.role = role;
    }
}
