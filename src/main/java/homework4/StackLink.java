package homework4;

public class StackLink {
    public String name;
    public int age;

    public StackLink next;

    public StackLink(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void display()
    {
        System.out.println("Name: " + this.name + ", age: " + this.age);
    }
}
