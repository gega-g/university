package people;

public class Student {
    private String name;
    private int studentId;
    private boolean tuitionPaid = false;

    public Student(String name, int studentId, boolean tuitionPaid) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionPaid = tuitionPaid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public boolean isTuitionPaid() {
        return tuitionPaid;
    }

    public void setTuitionPaid(boolean tuitionPaid) {
        this.tuitionPaid = tuitionPaid;
    }
}