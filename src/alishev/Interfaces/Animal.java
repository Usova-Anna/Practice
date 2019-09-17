package alishev.Interfaces;

public class Animal implements Info{
    public int id;
    public Animal (int id) {
        this.id= id;
    }
    public void sleep() {
        System.out.println("I'm sleeping");
    }

    public void showInfo() {
        System.out.println("My name id is "+this.id);
    }
}
