package practice06;

public class Student extends Person {
    private int klass;

    public Student(String personam, int personage, int studentKlass) {

        super(personam, personage);
        klass = studentKlass;

    }

    public int getKlass() {
        return this.klass;
    }

    public String introduce() {
        return super.introduce() + " I am a Student. I am at Class " + klass + ".";
    }
}
