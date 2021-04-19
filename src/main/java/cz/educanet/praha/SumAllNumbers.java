package cz.educanet.praha;

import java.util.Scanner;

public class SumAllNumbers {

    public static int calculate(Scanner scanner) {
        int r = 0;

        while(scanner.hasNext()){
            int n = scanner.nextInt();
            r = r + n;
        }

        return r;
    }

    public static void main(String[] args) {
        System.out.println(calculate(new Scanner(System.in)));
    }
}
