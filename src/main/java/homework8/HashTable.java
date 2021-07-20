package homework8;

public class HashTable {
    private int arrSize;
    private Item[] hashArr;
    private Item nonItem;
    private final int CONST = 5;

    public HashTable(int arrSize) {
        this.arrSize = arrSize;
        this.hashArr = new Item[arrSize];
        this.nonItem = new Item(-1);
    }

    public void display() {
        System.out.println("Начало таблицы");
        for (int i = 0; i < arrSize; i++) {
            if (hashArr[i] != null) {
                System.out.println(hashArr[i].getKey());
            } else {
                System.out.println("***");
            }
        }
        System.out.println("Конец таблицы");
    }

    private int hashFunc(int key) {
        return (key % arrSize);
    }

    public void insert(Item item) {
        int key = item.getKey();
        int hashVal = hashFunc(key);
        while (hashArr[hashVal] != null && hashArr[hashVal].getKey() != -1) {
            ++hashVal;
            if (hashVal == arrSize) {
                return;
            }//без этой строчки произойдет ошибка
            hashVal %= arrSize;
        }
        hashArr[hashVal] = item;
    }

    public Item delete(int key) {
        int hashVal = hashFunc(key);
        while (hashArr[hashVal] != null) {
            if (hashArr[hashVal].getKey() == key) {
                Item temp = hashArr[hashVal];
                hashArr[hashVal] = nonItem;
                return temp;
            }
            ++hashVal;
            if (hashVal == arrSize) {
                return null;
            }
            hashVal %= arrSize;

        }
        return null;
    }

    public Item find(int key) {
        int hashVal = hashFunc(key);
        while (hashArr[hashVal] != null) {
            if (hashArr[hashVal].getKey() == key) {
                return hashArr[hashVal];
            }
            ++hashVal;
            if (hashVal == arrSize) {
                return null;
            }
            hashVal %= arrSize;

        }
        return null;
    }

    private int getPrime(int min) {
        for (int i = min + 1; true; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
    }

    private boolean isPrime(int n) {
        for (int j = 2; (j * j <= n); j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;

    }
}
