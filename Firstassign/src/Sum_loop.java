// Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.Scanner;
public class Sum_loop {
    public static void main(String[] args) {

        int  sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int num =sc.nextInt();
        while(num!=0){
            sum = sum+num;
            System.out.print("Enter numbers :");
            num = sc.nextInt();
        }
    System.out.print("Sum of all numbers :" +sum);

    }
}