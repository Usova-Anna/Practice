package Lesson1;


import java.util.Scanner;

public class plusConcat {

    public static void plus(String elem1, String elem2) {
        String result = elem1.concat(elem2);
        System.out.println(result);
    }

    public static void plus(int elem1, int elem2) {
        int result = elem1 + elem2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        System.out.println("Складываем строки или числа? 1 - строки или строки и числа; 2 - числа ");
        Scanner scan = new Scanner(System.in);
        byte decide = scan.nextByte();
        // scan.close();//Не сработало, пыталась тем же сканером отсканировать строки в
        // if-блоке
        if (decide == 1) {
            System.out.println("Введите первую часть выражения");
            Scanner scan1 = new Scanner(System.in);
            String element1 = scan1.nextLine();
            System.out.println("Введите вторую часть выражения");
            String element2 = scan1.nextLine();
            plus(element1, element2);
        } else if (decide == 2) {
            System.out.println("Введите первое слагаемое");
            Scanner scan1 = new Scanner(System.in);
            int element1 = scan1.nextInt();
            System.out.println("Введите второе слагаемое");
            int element2 = scan1.nextInt();
            plus(element1, element2);
        } else
            System.out.println("Ни рыба ни мясо... запустите меня ещё раз");
    }

}
