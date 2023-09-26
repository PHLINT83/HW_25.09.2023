import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = kb.nextInt();
        System.out.println("Факториал числа " + num + "!" + " = " + factorial(num));
        System.out.println("Введите основание степени: ");
        int a = kb.nextInt();
        System.out.println("Введите показатель степени: ");
        int b = kb.nextInt();
        System.out.println("Число " + a + " в " + b + " степени" + " = " + power(a, b));
        System.out.println("Введите предел ряда Фибоначчи: ");
        int numF = kb.nextInt();
        numF++;
        int prev = 0;
        int next = 1;
        int[] fib = new int[numF];
        fib[0] = 0;
        fib[1] = 1;
        System.out.print("Ряд Фибоначчи для числа " + (numF -1) + " = " + Arrays.toString(fibonacci(prev, next, numF -2, fib)));
    }

    static long factorial(int a) {
        if (a <= 1) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }

    static int power(int x, int y) {
        if (y == 1) {
            return x;
        } else {
            return x * power(x, y - 1);
        }
    }

    static int[] fibonacci(int prev, int next, int num, int[] result){
        if (num > 0){
            int sum = prev + next;
            prev = next;
            next = sum;
            result[result.length - num] = sum;
            num--;
            fibonacci(prev, next, num, result);
        }
        return result;
    }
}