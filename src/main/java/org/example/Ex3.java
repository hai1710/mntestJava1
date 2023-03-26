package org.example;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int size;
        int arr[];
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("The size does not exceed 20.");
            }
        } while (size > 20);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            System.out.println("the element " + (i+1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Value of array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
