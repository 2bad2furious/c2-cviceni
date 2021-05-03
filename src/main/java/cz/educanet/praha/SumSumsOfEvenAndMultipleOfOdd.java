package cz.educanet.praha;

import java.util.Scanner;

public class SumSumsOfEvenAndMultipleOfOdd {

    public static int sumSumsOfEvenAndMultipleOfOdd(Scanner scanner) {
        int s = 0;
        int l = 1;
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            if (n%2 == 0){
                s = s + n;
            }else {
               l = l * n;
            }
        }
        return s + l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number separated by a new line");
        System.out.println(sumSumsOfEvenAndMultipleOfOdd(sc));
    }
}
