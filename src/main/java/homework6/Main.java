package homework6;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /* 6.1
        упрощение поиска информации/управление иерархией данных */

        // 6.2 - 6.5

        Tree theTree = new Tree();

        theTree.insert(new Person(4, "Ivan", 35));
        theTree.insert(new Person(2, "Ivan1", 78));
        theTree.insert(new Person(3, "Ivan2", 24));
        theTree.insert(new Person(5, "Ivan3", 21));

        theTree.displayTree();

        System.out.println();

        theTree.max().display();
        theTree.min().display();
        theTree.find(3).display();

        theTree.delete(2);

        System.out.println();

        theTree.displayTree();

        // 6.6
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(15);
        }
        long a = System.nanoTime();
        System.out.println(Arrays.toString(array));
        HeapSort heapSort = new HeapSort();
        heapSort.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Time to HeapSort: " + (System.nanoTime() - a));
    }

    /* 6.7
    Они применяются в самосбаланирующихся деревьях поиска. Они используются в контейнерах Set и Map,
    в большинстве реализаций библиотек STL языка C++, class-3-map языка Java,
    в реализациях ассоциативного массива в различных библиотеках и др.
     */
}
