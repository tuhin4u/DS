package myjava8.module2;

/**
 * Created by U6042192 on 15-Jul-17.
 */
public class Person {
    private int age;
    private String name;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "Name = " + name +" Gender = " + gender +" Age = " + age ;
    }
}

