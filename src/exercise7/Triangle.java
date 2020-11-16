package exercise7;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= i; j++){
            if(i==j){
            System.out.print(j);
            }
            else{
              System.out.print(j + " ");
            }
          }
          System.out.println();
        }

        for (int k = n-1; k >= 1 ; k--){
          for(int g = 1; g<=k; g++){
            if(k==g){
            System.out.print(g);
            }
            else{
              System.out.print(g+ " ");
            }
          }
          System.out.println();
        } 

    }
}