// Take integer inputs till the user enters 0 and print the largest number from all.

import java.sql.SQLOutput;
import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        int L = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers :");
        int num = sc.nextInt();
        while(num!=0){
            if(num>L){
                L = num;}
            System.out.print("Enter numbers : ");
            num = sc.nextInt();
            }
        System.out.println(L);
    }
}
