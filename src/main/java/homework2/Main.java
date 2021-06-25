package homework2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 2.1
        int[] mArray;
        int[] mArrayCopy;
        mArray = new int[10];

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            mArray[i] = rand.nextInt(15);
        }
        long a = System.nanoTime();
        mArrayCopy = Arrays.copyOf(mArray, mArray.length);
        System.out.println("Array: " + Arrays.toString(mArray));
        System.out.println("Copy of Array: " + Arrays.toString(mArrayCopy));
        System.out.println("Are arrays equals? " + Arrays.equals(mArray, mArrayCopy));
        System.out.println("Time to check Arrays methods: " + (System.nanoTime() - a));

        // 2.2
        int elementToSearch = rand.nextInt(15);
        lineSearch(mArray, elementToSearch);
        binarySearch(mArrayCopy, elementToSearch);

        // 2.3
        int[] array = new int[400];
        for (int i = 0; i < 400; i++) {
            array[i] = rand.nextInt(15);
        }
        a = System.nanoTime();
        int[] aOne = Arrays.copyOf(array, array.length);
        Arrays.sort(aOne);
        System.out.println("Time to sort array with method sort: " + (System.nanoTime() - a));

        // 2.4
        int[] aTwo = Arrays.copyOf(array, array.length);
        bubbleSort(aTwo);

        //2.5
        int[] aThree = Arrays.copyOf(array, array.length);
        minSort(aThree);

        //2.6
        int[] aFour = Arrays.copyOf(array, array.length);
        insertSort(aFour);
    }


    public static void lineSearch(int[] mArray, int elementToSearch) {
        long a = System.nanoTime();
        for (int i = 0; i < mArray.length; i++) {
            if (mArray[i] == elementToSearch) {
                System.out.println("Success: " + i);
            }
        }
        System.out.println("Time for lineSearch: " + (System.nanoTime() - a));
    }

    private static void binarySearch(int[] mArray, int elementToSearch) {
        long a = System.nanoTime();
        Arrays.sort(mArray);
        int firstIndex = 0;
        int lastIndex = mArray.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (mArray[middleIndex] == elementToSearch) {
                System.out.println("Success: " + middleIndex);
                break;
            } else if (mArray[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            } else if (mArray[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        System.out.println("Time for binarySearch: " + (System.nanoTime() - a));
    }

    public static void bubbleSort(int[] array) {
        long a = System.nanoTime();
        int buff;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    sorted = false;
                    buff = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buff;
                }
            }
        }
        System.out.println("Time to sort array with method bubbleSort: " + (System.nanoTime() - a));
    }

    private static void minSort(int[] array) {
        long a = System.nanoTime();
        int min;
        int buff;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
                buff = array[i];
                array[i] = array[min];
                array[min] = buff;
            }
        }
        System.out.println("Time to sort array with method minSort: " + (System.nanoTime() - a));
    }

    private static void insertSort(int[] array) {
        long a = System.nanoTime();
        int buff;
        int in;
        for (int i = 1; i < array.length; i++) {
            buff = array[i];
            in = i;
            while (in > 0 && array[in - 1] >= buff) {
                array[in] = array[in - 1];
                in--;
            }
            array[in] = buff;
        }
        System.out.println("Time to sort array with method minSort: " + (System.nanoTime() - a));
    }
}
