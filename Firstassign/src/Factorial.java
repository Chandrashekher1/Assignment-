// Factorial Program In Java

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.print("Enter number  :");
        int num = sc.nextInt();
        while(num!=1){
            fact = fact*num;
            num--;

        }
        System.out.println("Factorial of given number is  :"  +fact);


    }


}
