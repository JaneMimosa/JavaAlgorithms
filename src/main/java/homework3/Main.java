package homework3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] mArray = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            mArray[i] = rand.nextInt(15);
        }
        // 3.1
        long a = System.nanoTime();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int o : mArray) {
            arrayList.add(o);
        }
        System.out.println("Time to convert Array to ArrayList: " + (System.nanoTime() - a));

        // 3.2
        a = System.nanoTime();
        System.out.println(arrayList);
        arrayList.add(3, 5);
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println(arrayList.get(4));
        System.out.println("Time to use ArrayList methods: " + (System.nanoTime() - a));

        // 3.3
        LinkedListt<String> list = new LinkedListt<>(); // двойная т чтобы не конфликтовало с утилитой
        list.insert("Cat");
        list.insert("Dog");
        list.display();
        System.out.println("\n" + list.find("Dog"));

        // 3.4
        LinkedList linkedList = new LinkedList(arrayList);
        linkedList.addFirst(7);
        System.out.println(linkedList.getLast());
        linkedList.removeLast();
        System.out.println(linkedList.pollFirst());
        if (linkedList.contains(6)) {
            System.out.println("Contains 6");
        }
        // 3.5
        a = System.nanoTime();
        Iterator<Integer> iter = linkedList.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
            iter.remove();
        }
        // больше методов у меня не отображается
        System.out.println("Time to use Iterator: " + (System.nanoTime() - a));
    }
}
