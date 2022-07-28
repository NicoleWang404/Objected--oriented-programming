package practice11;

import java.util.LinkedList;

public class Teacher extends Person {
    private Klass classes;   //两个构造器 ；classes 属性类就是list？
    LinkedList<Klass> classesList = new LinkedList<>();

    public Teacher(int id, String name, int age, LinkedList classesList) {
        super(id, name, age);
        this.classesList = classesList;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList getClasses() {
        return classesList;
    }

    @Override
    public String introduce() {
        if (classesList.size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + " I am a Teacher. I teach Class " + classesList.get();//遍历
    }

    public boolean isTeaching(Student student) {
        if (classesList.contains(student.getKlass())) {
            return true;
        }
        return false;
    }

    public String introduceWith(Student student) {
        if (isTeaching(student) == true) {
            return super.introduce() + " I am a Teacher." + " I teach " + student.getName() + ".";
        }
        return super.introduce() + " I am a Teacher." + " I don't teach " + student.getName() + ".";
    }

    public void teacherResponse(Student student, Teacher teacher) {
        if (classesList.contains(student.getKlass())) {
            System.out.println("I am "+ teacher.getName() + ". I know "+ student.getName() + " has joined Class " +student.getKlass().toString()+ " .");
        }
    }
}
