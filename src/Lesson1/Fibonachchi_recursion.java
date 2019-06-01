package Lesson1;
import java.util.Scanner;
public class Fibonachchi_recursion {


    public static void fibonacci(int n) {
        if (n == 0)
            System.out.println("0");
        else if (n == 1)
            System.out.println("1");
        else
            System.out.println("+"+fibonacci(n-1)+""+fibonacci(n-2));
    }


    public static void main(String[] args) {
        System.out.println("Введите n для вычисления ряда Фибоначчи до этого числа: ");
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
       fibonacci(n);
    }
}