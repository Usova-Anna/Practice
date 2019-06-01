package Lesson1;

import java.util.Scanner;

public class BooksFalling {

    public static void main(String[] args) {
        final int TOTALNUMBEROFBOOKS = 365;
        System.out.println("Введите высоту одной книги: ");
        Scanner scan = new Scanner(System.in);// Resource leak: 'scan' is never closed
        double bookHeight = scan.nextInt();
        System.out.println("Введите расстояние между книгами: ");
        double spaceBetweenBooks = scan.nextInt();
        double mestoPopadania = Math.sqrt(Math.pow(bookHeight, 2)
                - Math.pow(spaceBetweenBooks, 2));/*
         * По Пифагору считаем, как высоко попадёт книга на следующую
         */

        boolean upadetLi; // Упадут ли книги.
        String standOrLie; // Для вывода "останется стоять на расстоянии..." или "упадёт на расстоянии..."
        if (mestoPopadania >= (bookHeight / 2)) { // Книга упадёт, если предыдущая попала выше середины (включая
            // середину)
            upadetLi = true;
            standOrLie = " упадёт от первой ";
        } else {
            upadetLi = false;
            standOrLie = " останется стоять ";
        }
        int length;// Вычисляемое расстояние
        bookHeight = (int) bookHeight;// Эти две строки чтобы избежать ошибки Type mismatch: cannot convert from
        // double to int
        spaceBetweenBooks = (int) spaceBetweenBooks;
        if (upadetLi)
            length = (int) (spaceBetweenBooks * (TOTALNUMBEROFBOOKS - 1) + bookHeight);// Почему не работает без "int",
            // ведь мы привели типы выше?
        else
            length = (int) (spaceBetweenBooks * (TOTALNUMBEROFBOOKS - 1));// Если не упадут, вычисляем расстояние где
        // стоит
        // последняя книга, пренебрегая шириной книг
        System.out.println("Последняя книга" + standOrLie + "на расстоянии " + length + " см от первой");
    }

}
