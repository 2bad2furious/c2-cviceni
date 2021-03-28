package cz.educanet.praha;

import java.util.Scanner;

public class PrintedSquare {
    public static String printSquare(int side) {
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the square's side");
        String result = printSquare(sc.nextInt());
        System.out.println(result);
    }
}
