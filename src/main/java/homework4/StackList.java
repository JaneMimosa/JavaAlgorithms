package homework4;

import homework3.LinkedListt;

public class StackList {
    private StackLinkedList list;
    public StackList() {
        list = new StackLinkedList();
    }

    public void push(String name, int age) {
        list.insert(name, age);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public String pop() {
        return list.delete().name;
    }

    public void display() {
        list.display();
    }
}
