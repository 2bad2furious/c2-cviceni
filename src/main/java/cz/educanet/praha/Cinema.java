package cz.educanet.praha;

import java.util.Scanner;

public class Cinema {

    public static int freeSpaces(String[] namesOnSeat, Scanner sc) {
        return 0;
    }

    public static void main(String[] args) {
        int freeSpaces = freeSpaces(new String[]{null, null, "2bad2furious", null, null, "monarezio"}, new Scanner(System.in));
        System.out.println("Free spaces: " + freeSpaces);
    }
}
