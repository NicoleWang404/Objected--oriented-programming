package practice07;

public class Teacher extends Person {
    Klass teacherKlass;

    public Teacher(String personam, int personage) {
        super(personam, personage);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name,age);
         teacherKlass = klass;

    }

    public Klass getKlass() {
        return this.teacherKlass;
    }


    public String introduce() {

        if (getKlass() == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + " I am a Teacher. I teach Class " + this.getKlass().getNumber() + ".";
        }

    }
}
