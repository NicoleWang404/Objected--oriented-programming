package practice06;


public class Teacher extends Person {
    private int klass;

    public Teacher(String personam, int personage) {
        super(personam, personage);
    }

    public Teacher(String personam, int personage, Integer teacherKlass) {
        super(personam, personage);
        klass = teacherKlass;


    }

    public int getKlass() {
        return this.klass;
    }


    public String introduce() {
        if (klass ==2) {
            return super.introduce() + " I am a Teacher. I teach Class " + this.klass + ".";
        } else {
            return super.introduce() + " I am a Teacher. I teach No Class.";


        }

    }
}


