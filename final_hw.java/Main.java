

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;


public class Main {
  public static void main(String[] args) { // cоздаём множество ноутбуков
    Set<Laptop> laptops = new HashSet<>();
    laptops.add(new Laptop("Asus", 4, 128, "Windows 11", "серый"));
    laptops.add(new Laptop("Dell", 4, 500, "Windows 10", "белый"));
    laptops.add(new Laptop("Lenovo", 8, 128, "Windows 11", "чёрный"));
    laptops.add(new Laptop("Lenovo", 8, 256, "Windows 11", "серый"));
    laptops.add(new Laptop("HP", 4, 500, "Windows 10", "серый"));

    Scanner scanner = new Scanner(System.in);
    
    Map<Integer, Object> choiceFilter = new HashMap<>();

    System.out.println("Введите номер критерия:");
    System.out.println("1 – объем оперативной памяти (GB)");
    System.out.println("2 – объем жесткого диска");
    System.out.println("3 – операционная система");
    System.out.println("4 –  цвет");

    int choiceNumber = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Введите минимальное значение для данного критерия:");
    Object choiceValue = null;

    switch (choiceNumber) {
      case 1:
        int ram = scanner.nextInt();
        scanner.nextLine();
        choiceValue = ram;
        break;
      case 2:
        int hdd = scanner.nextInt();
        scanner.nextLine();
        choiceValue = hdd;
        break;
      case 3:
        String os = scanner.nextLine();
        choiceValue = os;
        break;
      case 4:
        String color = scanner.nextLine();
        choiceValue = color;
        break;
      default:
        System.out.println("Такого критерия не существует.");
        return;
    }

    choiceFilter.put(choiceNumber, choiceValue);

    Set<Laptop> filteredLaptops = filterLaptops(laptops, choiceFilter); //вывод
    System.out.println("Результат:");
    for (Laptop laptop : filteredLaptops) {
      System.out.println(laptop.getName() + ", " +
          laptop.getRam() + " GB RAM" +
          laptop.getHdd() + " GB HDD" +
          laptop.getOs() + ", " +
          laptop.getColor());
    }
  }


  public static Set<Laptop> filterLaptops(Set<Laptop> laptops, Map<Integer, Object> choiceFilter) { //фильтрация
    Set<Laptop> filteredLaptops = new HashSet<>();
    for (Laptop laptop : laptops) {

        boolean rightCriteria = true;
          for (Map.Entry<Integer, Object> choice : choiceFilter.entrySet());
              int choiceNumber = choice.getKey();
              Object choiceValue = choice.getValue();

              switch (choiceNumber) {
                case 1:
                  int ram = (int) choiceValue;
                  if (laptop.getRam() < ram) {
                    rightCriteria = false;
                  }
                  break;
                case 2:
                  int hdd = (int) choiceValue;
                  if (laptop.getHdd() < hdd) {
                    rightCriteria = false;
                  }
                  break;
                case 3:
                  String os = (String) choiceValue;
                  if (!laptop.getOs().equalsIgnoreCase(os))  {
                    rightCriteria = false;
                  }
                  break;
                case 4:
                  String color = (String) choiceValue;
                  if (!laptop.getColor().equalsIgnoreCase(color))  {
                    rightCriteria = false;
                  }
                  break;
                default:
                  System.out.println("Такого критерия нет.");
                  return filteredLaptops;
              }
           if(rightCriteria) {
           System.out.println(laptop);
           }  
    }
  }
}
  

