import java.util.Arrays;

/*
Дан массив nums = [3,2,5,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
а остальные - равны ему.
 */
public class Main2 {
    public static void main(String[] args) {
        int[] arr = {3,2,5,3};
        int val = 3;
        int[] res = sortByVal(arr, val);
        System.out.println(Arrays.toString(res));
    }

    static int[] sortByVal(int[] arr, int val){
        int[] res = new int[arr.length];
        Arrays.fill(res, val); //получили массив троек
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != val){
                res[j++] = arr[i];
            }
        }
        return res;
    }
}