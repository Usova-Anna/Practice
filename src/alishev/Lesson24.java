package alishev;

public class Lesson24 {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 42);
        System.out.println(h1); //выводится переопределённый toString из класса Human

    }
    }

    class Human {
    private String name;
    private int age;

    public Human (String name, int age) {
        this.name =name;
        this.age=age;
    }
    @Override
    public String toString() {
        return age+", "+name;
    }
    }

