// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter term : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        for(int i = 1; i<=n; i++){
            System.out.print(a+ " ");
            c = a+b;
            a = b;
            b = c;
        }
    }
}
