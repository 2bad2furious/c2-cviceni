package cz.educanet.praha;

import java.util.Scanner;

public class number {

    public static int calculate(Scanner scanner) {
        int num = 0;
        int x = 0;
        while(scanner.hasNextInt()){
            x = x + scanner.nextInt();
        }        
        return x;
    }

    public static void main(String[] args) {
        System.out.println(calculate(new Scanner(System.in)));
    }
}
