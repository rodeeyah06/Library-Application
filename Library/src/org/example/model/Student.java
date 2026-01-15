package org.example.model;

import org.example.UserRole;

public class Student extends User {
    private int level ; // I love ayo forever;

    public Student(String name, UserRole role, int level) {
        super(name, UserRole.Student);
        this.role = role;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
