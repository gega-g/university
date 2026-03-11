package courses;

import people.Student;
public class Course {
    private String title;
    private int capacity;
    private int enrolledCount;
    private Student[] enrolledStudents;

    public Course(String title, int capacity, int enrolledCount, Student[] enrolledStudents) {
        this.title = title;
        this.capacity = capacity;
        this.enrolledCount = enrolledCount;
        this.enrolledStudents = new Student[capacity];
    }

    public void addStudent(Student student) {
        if (enrolledCount < capacity) {
            this.enrolledStudents[enrolledCount] = student;
            this.enrolledCount++;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getEnrolledCount() {
        return enrolledCount;
    }

    public void setEnrolledCount(int enrolledCount) {
        this.enrolledCount = enrolledCount;
    }

    public Student[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(Student[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}