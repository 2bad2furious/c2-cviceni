package cz.educanet.praha;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Utils {

    public static String asString(Object[] data) {
        return Arrays.stream(data).map(Object::toString).collect(Collectors.joining("\n"));
    }

    public static Scanner createScanner(Object... data) {
        return new Scanner(new ByteArrayInputStream(asString(data).getBytes()));
    }
}
