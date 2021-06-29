package homework4;

public class Obj {
    String name;
    int age;

    public Obj(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name + " | Age: " + this.age);
    }
}
