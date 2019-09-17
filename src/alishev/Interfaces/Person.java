package alishev.Interfaces;

public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
    public void showInfo() {
        System.out.println("My name is "+this.name);
    }
}
