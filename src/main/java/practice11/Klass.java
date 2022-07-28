package practice11;

import java.util.LinkedList;

public class Klass {
    private int number;
    private Student leader;
    private String displayName;

    LinkedList<Student> studentList = new LinkedList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void assignLeader(Student leader) {
        if (studentList.contains(leader)) {
            this.leader = leader;
        }
        System.out.println("It is not one of us.");
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void appendMember(Student student) {
        studentList.add(student);
    }

    public boolean isIn(Student student) {
        if (studentList.contains(student)) {
            return true;
        }
        return false;
    }
}

