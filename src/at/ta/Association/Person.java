package at.ta.Association;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void printPersonInfo() {
        System.out.println(getFirstName() + " " + getLastName());
        System.out.println("Age: " + getAge());
    }
}