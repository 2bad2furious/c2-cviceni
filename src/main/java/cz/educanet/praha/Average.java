package cz.educanet.praha;

import java.util.Scanner;

public class Average {

    public static double average(Scanner scanner) {
        double sum = 0;
        double average = 0;
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
              sum += n;
              average = average + sum/n;
              }
            }

        return average;
    }

    public static void main(String[] args) {
        System.out.println(average(new Scanner(System.in)));
    }
}
