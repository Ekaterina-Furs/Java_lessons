//Вычислить n-ое треугольного число(сумма чисел от 1 до n).

class Answer {
    public int countNTriangle(int n){
    int count = 0;
        for(int i = 1; i <= n; i++) {
            count += i;
        }
        return count;
    }

    public static void main(String[] args) { 
      int n = 0;
      
      if (args.length == 0) {
        n = 5;
      }
      else{
        n = Integer.parseInt(args[0]);
      }     
      
        // Вывод результата на экран
      Answer ans = new Answer(); 
      int itresume_res = ans.countNTriangle(n);     
      System.out.println(itresume_res);
    }
}
 


    