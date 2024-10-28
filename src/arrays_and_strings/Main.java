package arrays_and_strings;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        System.out.println("Введите имя пользователя:");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Создайте пароль:");
        String PW = sc.nextLine();
        while (PW.length()<8 || PW.length()>15){
            System.out.println("repeat");
            PW = sc.nextLine();
        }
        System.out.println("wow");
    }
}
