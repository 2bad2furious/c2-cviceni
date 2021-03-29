package cz.educanet.praha;

import java.util.Scanner;

public class PrintedSquare {
    public static String printSquare(int side) {
        int i,j;

        for(i = 1; i <= side; i++){
            for(j = 1; j<= side; j++){
                if (i == 1 || i == side || j == 1 || j == side)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the square's side");
        String result = printSquare(sc.nextInt());
        System.out.println(result);
    }
}
