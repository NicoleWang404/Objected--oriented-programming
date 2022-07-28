package practice02;

public class Person {
    String name ="Tom";
    int age =21;

    public Person(String personam, int personage) {
//初始化属性值
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

