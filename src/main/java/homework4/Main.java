package homework4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //4.1
        long a = System.nanoTime();
        Stack<Obj> stack = new Stack<>();
        stack.push(new Obj("Artem", 20));
        stack.push(new Obj("Nikita", 24));
        stack.push(new Obj("Max", 21));
        stack.peek().display();
        while (!stack.isEmpty()) {
            stack.pop().display();
        }
        System.out.println("Stack time: " + (System.nanoTime() - a));

        //4.2
        a = System.nanoTime();
        QueueM queueM = new QueueM(3);
        queueM.insert(20);
        queueM.insert(30);
        queueM.insert(50);
        while (!queueM.isEmpty()) {
            System.out.println(queueM.peek());
            queueM.remove();
        }
        System.out.println("Queue time: " + (System.nanoTime() - a));

        //4.3
        a = System.nanoTime();
        Deque<Obj> deque = new ArrayDeque<>();
        deque.add(new Obj("Artem", 20));
        deque.addFirst(new Obj("Nikita", 24));
        deque.addLast(new Obj("Max", 21));
        deque.pollFirst().display();
        deque.peekLast().display();
        System.out.println("Deque time: " + (System.nanoTime() - a));

        //4.4
        a = System.nanoTime();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(9);
        priorityQueue.add(1);
        priorityQueue.add(11);
        priorityQueue.add(6);
        priorityQueue.add(0);
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
        System.out.println("Priority Queue time: " + (System.nanoTime() - a));

        //4.5
        a = System.nanoTime();
        StackList stackL = new StackList();
        stackL.push("Artem", 20);
        stackL.push("Nikita", 24);
        stackL.push("Max", 21);
        while (!stackL.isEmpty()) {
            System.out.println("Element " + stackL.pop() + " deleted");
        }
        System.out.println("Stack LinkedList time: " + (System.nanoTime() - a));

        a = System.nanoTime();
        Queue<Obj> queueL = new LinkedList<>();
        queueL.add(new Obj("Artem", 20));
        queueL.add(new Obj("Nikita", 24));
        queueL.offer(new Obj("Max", 21));
        while (!queueL.isEmpty()) {
            queueL.peek().display();
            queueL.poll();
        }
        System.out.println("Queue LinkedList time: " + (System.nanoTime() - a));
    }
}
