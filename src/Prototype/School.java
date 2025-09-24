package Prototype;

import java.util.ArrayList;
import java.util.List;

public class School implements Cloneable {
    private String name;
    List<Student> students = new ArrayList<Student>();

    public School(String name) {
        this.name = name;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    public void loadStudents() {
        for (int i = 0; i < 10; i++) {
            Student student = new Student((Integer.toString(i)));
            getStudents().add(student);
        }
    }

// Shallow cloning method
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    // Deep cloning method
    @Override
    protected School clone() throws CloneNotSupportedException {
        School newSchool = new School(name);
        for (Student student : students) {
            newSchool.addStudent(student);
        }

        return newSchool;
    }

    @Override
    public String toString() {
        return "name = " + name + ", students = " + students;
    }
}
