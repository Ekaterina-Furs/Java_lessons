

//вывести рандомно назания планет и посчитать, сколько раз они встречаются в списке.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main12 {
    public static void main(String[] args) {
        List<String> uniqName = new ArrayList<>();
        uniqName.add("Марс");
        uniqName.add("Венера");
        uniqName.add("Сатурн");
        uniqName.add("Юпитер");
        uniqName.add("Меркурий");
        uniqName.add("Венера");
        int n = 10;

        List<String> list = generateArrayList(uniqName, n);
        System.out.println(list);

        for (String name: uniqName){
            int frequency = Collections.frequency(list, name);
            System.out.println(name + " встречается " + frequency + " раз");
        }
    }

    private static List<String> generateArrayList(List<String> names, int n) {
        List<String> result = new ArrayList<>(n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int rnd = random.nextInt(names.size());
            result.add(names.get(rnd));
        }
        return result;
    }
}