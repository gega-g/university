import courses.Course;
import infrastructure.*;
import people.Lecturer;
import people.SecurityGuard;
import people.Student;
import services.EnrollmentService;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        UniversityInfo.displayStats();

        Lecturer drSmith = new Lecturer("Dr. Smith", new BigDecimal("3500.50"),
                LocalDate.of(2018, 9, 1), "Computer Science");
        SecurityGuard guardBob = new SecurityGuard("Bob", new BigDecimal("1200.00"));

        Student john = new Student("John Doe", 101, false);
        Student alice = new Student("Alice Smith", 102, true);

        Course javaCourse = new Course("Intro to Java", 2, 0, null);

        EnrollmentService service = new EnrollmentService();

        service.enrollStudent(john, javaCourse);

        System.out.println("John pays the tuition...");
        john.setTuitionPaid(true);
        service.enrollStudent(john, javaCourse);

        service.enrollStudent(alice, javaCourse);

        Building mainBuilding = new Building("Main Campus");
        Library centralLib = new Library("BTU Library", 1500);
        Auditory scienceHall = new Auditory("Science Hall", 305);
        Laboratory roboticsLab = new Laboratory("Robotics Lab", "Sensors and Robots");

        Building[] buildings = {mainBuilding, new Building(centralLib.getName()), new Building(scienceHall.getName())};
        Lecturer[] lecturers = {drSmith};
        SecurityGuard[] guards = {guardBob};

        University btu = new University("BTU - Tbilisi", buildings, lecturers, guards);

        System.out.println("\n--- University Report ---");
        System.out.println("University Name: " + btu.getUniName());
        System.out.println("Head Lecturer: " + btu.getLecturers()[0].getName() + " from " + drSmith.getDepartment());
        System.out.println("Total Buildings in System: " + btu.getBuildings().length);

        System.out.println("Laboratory Equipment: " + roboticsLab.getEquipmentType());
        System.out.println("Library Book Count: " + centralLib.getBookCount());

        System.out.println("Course Title: " + javaCourse.getTitle() + " | Enrolled: "
                + javaCourse.getEnrolledCount() + "/" + javaCourse.getCapacity());
    }
}