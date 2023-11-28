import java.util.Arrays;
import java.util.ArrayList;

class Answer {
  public static void analyzeNumbers(Integer[] arr) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
    list.sort(Integer::compareTo);
    System.out.println(list);

    int min = arr[0];
    int max = arr[arr.length - 1];

    System.out.println("Minimum is " + min);
    System.out.println("Maximum is " + max);

    int result = 0;
    for (Integer n : arr) {
      result += n;
    }
    System.out.println("Average is " + result / arr.length);
  }

  public static void main(String[] args) {
    Integer[] arr = {};

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      arr = new Integer[] { 10, 2, 6, 5, 1, 3, 8, 6, 9 };
    } else {
      arr = Arrays.stream(args[0].split(", "))
          .map(Integer::parseInt)
          .toArray(Integer[]::new);
    }

    Answer ans = new Answer();
    ans.analyzeNumbers(arr);
  }
}
