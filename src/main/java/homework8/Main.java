package homework8;

import java.util.Random;

public class Main {
    /*Задание 8.1
    Приведите пример использование хеш-таблиц.
    Базы данных
     Задание 8.2
    Приведите примеры ключей и коллизий.
    Ключем могут быть любые данные, коллизии можно увидеть на примере парадокса дня рождений
     Задание 8.3
    Приведите примеры популярных и эффективных хеш-функций.
    Метод Горнера
     */
    public static void main(String[] args) {
        //8.4
        Item aDataItem;
        int aKey;
        int size = 66;

        HashTable hashTable = new HashTable(size);

        Random rand = new Random();
        for (int i = 0; i < 15; i++) {
            aKey = rand.nextInt(999);
            aDataItem = new Item(aKey);
            hashTable.insert(aDataItem);
        }

        hashTable.insert(new Item(999));
        hashTable.insert(new Item(200));

        hashTable.display();

        System.out.println(hashTable.find(999).getKey());

        hashTable.delete(200);

        hashTable.display();

    }
}
