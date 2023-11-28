
/*
создать список типа ArrayList
поместить в него строки и целые числа.
Пройти по списку и  удалить целые числа.
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main10 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add(10); //0
        list.add("11");
        list.add("Привет");
        list.add(10.65);
        list.add(-5);
        list.add(null);
        list.add(true);

        removeV2(list);

        System.out.println(list);
    }
    static void remove(List list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer){
                list.remove(i);
                i--;
            }
        }
    }

    static void removeV2(List list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object item = iterator.next();
            if (item instanceof Integer){
                iterator.remove();
            }
        }
    }
}