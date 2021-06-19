import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    ArrayList arrayForInt;
    ArrayList arrayForString;
    ArrayList arrayForObjects;
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Object> array = new ArrayList<Object>();
        // создаем все переменные
        for (int i = 0; i < 6; i++) {
            array.add(i);
        }
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        ClassVar object1 = new ClassVar("name1");
        ClassVar object2 = new ClassVar("name2");
        ClassVar object3 = new ClassVar("name3");
        ClassVar object4 = new ClassVar("name4");
        ClassVar object5 = new ClassVar("name5");
        array.add(object1);
        array.add(object2);
        array.add(object3);
        array.add(object4);
        array.add(object5);
        // выводим переменные
        System.out.println(array);
        // перебераем их
        long a = System.nanoTime();
        String compare = "m";
        boolean res = false;
        for (Object o: array) {
            if(o.equals(compare)) {
                res = true;
            }
        }
        System.out.println(res);
        System.out.println(System.nanoTime() - a);
    }
}
