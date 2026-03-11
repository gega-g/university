package services;

import courses.Course;
import people.Student;

public class EnrollmentService {
    public void enrollStudent(Student student, Course course) {
        System.out.println("\nProcessing Enrollment for: " + student.getName());

        if (!student.isTuitionPaid()) {
            System.out.println("Error: Enrollment denied. Please pay tuition first.");
            return;
        }

        if (course.getEnrolledCount() >= course.getCapacity()) {
            System.out.println("Error: Course '" + course.getTitle() + "' is full.");
            return;
        }

        course.addStudent(student);
        System.out.println("Success! Enrolled in " + course.getTitle());
        System.out.println("Student ID: " + student.getStudentId() + " confirmed.");
    }
}