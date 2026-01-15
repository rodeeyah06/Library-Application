package org.example.model;

import org.example.UserRole;

public class Teacher extends User {

    public Teacher(String name) {
        super(name, UserRole.Teacher);
    }
}
