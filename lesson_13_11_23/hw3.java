//Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /) над двумя числами и возвращать результат. 
//В классе должен быть метод calculate, который принимает оператор и значения аргументов и возвращает результат вычислений.
//При неверно переданном операторе, программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".

class Calculator {
    public int calculate(char op, int a, int b) {
        // Введите свое решение ниже
        int res;

        switch (op) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
            default:
                System.out.println("Некорректный оператор: " + op);
                return 0;
        }

        return res;
    }

    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 35;
            op = '/';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}