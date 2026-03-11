package people;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Lecturer {
    private String name;
    private BigDecimal salary;
    private LocalDate hireDate;
    private String department;

    public Lecturer(String name, BigDecimal salary, LocalDate hireDate, String department) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}