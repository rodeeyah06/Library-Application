package org.example.Service;

import org.example.UserRole;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.User;

public class Main {
    public static void main(String[] args) {
        LibraryWithPriority library = new LibraryWithPriority();
        LibraryWithoutPriority library1 = new LibraryWithoutPriority();
        library1.addBook("Mathematics",1);
        library.addBook("Mathematics",2);



        Student s1 = new Student("Rodeeyah", UserRole.Student,400);
        Student s2 = new Student("Ayo", UserRole.Student,200);
        Teacher t = new Teacher("Mr matin");


//With Priority
        library.requestBook(s1,"Mathematics");
       library.requestBook(s2,"Mathematics");
        library.requestBook(t,"Mathematics");

        //Without Priority
        library1.requestBook(s1,"Mathematics");
        library1.requestBook(s2,"Mathematics");
        library1.requestBook(t,"Mathematics");


      System.out.println(library.serveNextRequest());
      System.out.println(library.serveNextRequest());
      System.out.println(library.serveNextRequest());

        System.out.println(library1.serveNextRequest());
        System.out.println(library1.serveNextRequest());
        System.out.println(library1.serveNextRequest());

    }



}
