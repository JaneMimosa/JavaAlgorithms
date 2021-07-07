package homework5;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 5.1
        // Метод Гаусса

        // 5.2
        int n = 100;
        countdown(n);

        // 5.3
        System.out.println(factorial(5));

        // 5.4
        long a = System.nanoTime();
        System.out.println(factorial(5));
        System.out.println(System.nanoTime() - a);
        a = System.nanoTime();
        System.out.println(fact(5));
        System.out.println(System.nanoTime() - a);

        // 5.5
        int[] mArray = new int[15];
        Random rand = new Random();
        for (int i = 0; i < 15; i++) {
            mArray[i] = rand.nextInt(15);
        }
        a = System.nanoTime();
        System.out.println(recBinaryFind(5, 0, mArray.length, mArray));
        System.out.println(System.nanoTime() - a);

        // 5.6
        a = System.nanoTime();
        sortMerge(mArray);
        System.out.println(System.nanoTime() - a);
        a = System.nanoTime();
        Arrays.sort(mArray);
        System.out.println(System.nanoTime() - a);
    }

    public static int countdown(int n) {
        System.out.println(n);
        if (n == 1) {   // выводит из рекурсии
            return 1;
        }
        return countdown(n - 1);
    }

    //стек вызова с рекурсией
    public static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }

    public static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static int recBinaryFind(int searchKey, int low, int high, int[] arr) {
        if (low > high) {
            return arr.length;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == searchKey) {
            return mid;
        } else if (arr[mid] < searchKey) {
            return recBinaryFind(searchKey, low + 1, high, arr);
        } else {
            return recBinaryFind(searchKey, low, high - 1, arr);
        }
    }

    private static int[] sortMerge(int[] arr) {
        int len = arr.length;
        if (len < 2) {
            return arr;
        }
        int middle = len / 2;
        return merge(sortMerge(Arrays.copyOfRange(arr, 0, middle)), sortMerge(Arrays.copyOfRange(arr, middle, len)));
    }

    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = a[aIndex] < b[bIndex] ? a[aIndex++] : b[bIndex++];
            if (aIndex == a.length) {
                System.arraycopy(b, bIndex, result, ++i, b.length - bIndex);
                break;
            }
            if (bIndex == b.length) {
                System.arraycopy(a, aIndex, result, ++i, a.length - aIndex);
                break;

            }
        }
        return result;
    }
}
