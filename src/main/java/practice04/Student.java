package practice04;

public class Student extends Person {
    int klass = 2;

    public Student(String personam, int personage, int studentKlass) {

        super(personam, personage);
        klass = studentKlass;

    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        return super.introduce() + " I am a Student. I am at Class " + klass + ".";
    }
}
