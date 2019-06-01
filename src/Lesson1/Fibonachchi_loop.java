package Lesson1;

import java.util.Scanner;

public class Fibonachchi_loop {

    public static void main(String[] args) {
        System.out.print("Введите число n, до которого считаем ряд Фибоначчи: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print("0+1+1");
        int k = 1;
        for (int i = 2; i <= n; i = i + k) {
            if (n == 2) {
                System.out.print("+2");
                break;
            }

            k = i - k;
            System.out.print("+" + i);

        }

    }

}
