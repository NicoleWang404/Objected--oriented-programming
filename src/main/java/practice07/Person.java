package practice07;

public class Person {
    String name;
    int age;

    public Person(String personam, int personage) {
        name = personam;
        age = personage;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }
}
