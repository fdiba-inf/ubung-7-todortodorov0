package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {
        if(n == 0){
          return;
        } else{
          if(isPrime(n)){
            System.out.println(n);
          }

          printPrimes(n-1);
        }
    }

    public static boolean isPrime(int n)
        long divider = 2;
        while (divider < n){
          if (n % divider == 0){
            return false;
          }
          divider++;

        }
        return true;
    }
}p