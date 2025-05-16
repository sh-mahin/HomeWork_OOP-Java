package ERdiagram;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Mahin", "Software Engineering");
        Instructor instructor = new Instructor(101, "Dr. Rahman", "CSE", "Professor");
        Course course = new Course(501, "OOP topics", "Object Oriented Programming", "3", "None");

        CourseOffering offering = new CourseOffering(student, instructor, course,
                new Date(), 1, 302, 2025, "SP");

        System.out.println("Course: " + offering.getCourse().getTitle());
        System.out.println("Instructor: " + offering.getInstructor().getName());
        System.out.println("Student: " + offering.getStudent().getName());
    }
}
