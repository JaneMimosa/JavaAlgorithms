package homework6;

public class Node {
    public Person person;
    public Node leftChild;
    public Node rightChild;

    public void display () {
        System.out.println(person.id + " = Name " + person.name + " Age " + person.age);
    }
}
