package Homework3;

import java.util.Scanner;

public class Task2 {
    public static void result(int n) {
        Scanner inputValue = new Scanner(System.in);
        int[] arr = new int[n];
        double avarage;
        int sum=0;
        int multiplication=1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = inputValue.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            multiplication=multiplication*arr[i];
        }

        int maxValue=0;
        int minValue=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> maxValue){
                maxValue=arr[i];
            }

            if(arr[i] < minValue){
                minValue=arr[i];
            }
        }

        System.out.println("Output: ");
        System.out.println("Sum: " + sum);
        System.out.println("Multiplication: " + multiplication);
        avarage= (double) sum/n;
        System.out.println("Avarage: " + avarage);
        System.out.println("Max integer: " + maxValue);
        System.out.println("Min integer: " + minValue);
    }
    public static void main(String[] args) {
        System.out.println("Enter 3 value:");
        result(3);
        System.out.println("Enter 5 value:");
        result(5);
    }
}