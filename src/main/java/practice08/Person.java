package practice08;

public class Person {
    String name;
    int id;
    int age;

    public Person(int personId, String personName, int personAge) {
        name = personName;
        age = personAge;
    }


    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }
}
