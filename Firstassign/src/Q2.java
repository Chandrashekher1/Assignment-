// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle value : ");
        float p = sc.nextFloat();
        System.out.print("Enter the time : ");
        int t = sc.nextInt();
        System.out.print("Enter the Rate vale :");
        float r = sc.nextFloat();
        float SI = (p*r*t)/1000;
        System.out.print("Simple interest :" +SI);
    }
}

