package org.example;

import java.util.Scanner;

public class Ex1 {
    public static boolean checkPrime(int a) {
        boolean check = true;
        if (a < 2) {
            check = false;
        } else {
            for (int j = 2; j < a; j++) {
                if (a % j == 0) {
                    check = false;
                }
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("prime: ");
        for (int i = 2; i <= n; i++) {
            if (checkPrime(i) == true){
                System.out.println(i);
            }
        }
    }
}
