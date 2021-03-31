package cz.educanet.praha;

import java.util.Scanner;

public class SumFromZeroTill {
    public static int sumFromZeroTill(int max){
        int sum = 0;
        int i = 1;
        while (i <= max){
            sum += i;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        System.out.println(sumFromZeroTill(sc.nextInt()));
    }
}
