// Input currency in rupees and output in USD

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter currency in rupees : ");
        int Ir = sc.nextInt();
        float USD = Ir / 83;
        System.out.print("Rupees in dollars : " +USD);

    }
}
