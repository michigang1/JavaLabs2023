package michigang1.lab2.models;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private final List<Student> students;

    public Journal() {
        this.students = new ArrayList<>();
    }

    public void addRecord(Student student) {
        students.add(student);
    }

    public List<Student> getRecords() {
        return students;
    }
}