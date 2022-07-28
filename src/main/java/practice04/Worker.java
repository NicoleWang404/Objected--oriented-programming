package practice04;

public class Worker extends Person{
    public Worker(String personam, int personage) {
        super(personam, personage);
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }


    public String introduce() {
        return super.introduce() + " I am a Worker. I have a job.";
    }

}
