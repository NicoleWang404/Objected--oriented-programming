package practice07;

public class Student extends Person {
    Klass studentKlass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        studentKlass = klass;

    }

    public String getName() {
        return this.name;
    }

    public Klass getKlass() {
       // Klass Klass = studentKlass;

        return studentKlass;
    }

    public String introduce() {

       return super.introduce() + " I am a Student. I am at "+ studentKlass.getDisplayName() + ".";

    }
}
