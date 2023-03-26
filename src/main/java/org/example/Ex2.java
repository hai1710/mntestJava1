package org.example;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Sum of values in array: ");
        System.out.println(sumArr(arr));
        int max = maxArr(arr);
        System.out.println("The largest property value in the list is " + arr[max] + " ,at position " + max);
    }
    public static int sumArr(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static int maxArr(int[] arr){
        int max = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
