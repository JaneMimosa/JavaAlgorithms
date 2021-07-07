package homework4;

import homework3.Link;

public class StackLinkedList<T> {
    private StackLink first;

    public StackLinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(String name, int age) {
        StackLink l = new StackLink(name, age);
        l.next = first;
        first = l;
    }

    public StackLink delete() {
        StackLink temp = first;
        first = first.next;
        return temp;
    }
    public void display() {
        StackLink current = first;
        while(current != null) {
            current.display();
            current = current.next;
        }
    }
}
