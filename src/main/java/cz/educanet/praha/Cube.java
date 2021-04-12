package cz.educanet.praha;

import java.util.Scanner;

public class Cube {
    public static int sumOfAreasAndVolumes(Scanner scanner) {
        int volume = 0;
        int surface = 0;
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            volume = volume+n*n*n;
            surface =surface+6*n*n;

        }

        return volume + surface;
    }

    public static void main(String[] args) {
        System.out.println(sumOfAreasAndVolumes(new Scanner(System.in)));
    }
}
