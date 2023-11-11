//Input a number and print all the factors of that number

import java.util.Scanner;
public class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            if(n%i==0){  // if n is divisible by i
                // i is the factor of n
                System.out.print( i +" ");
            }
        }

    }
}
