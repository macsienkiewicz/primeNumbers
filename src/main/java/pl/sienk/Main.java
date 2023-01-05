package pl.sienk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number (higher or equal 0 and less than 2147483629): ");
        int number = scan.nextInt();
        System.out.println("Next prime number is: " + Algorithm.findNextPrime(number));
    }
}