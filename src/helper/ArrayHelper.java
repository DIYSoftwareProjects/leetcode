package helper;

import java.util.Arrays;
import java.util.List;

public class ArrayHelper {
    public static String convertListOfStringToFlatString(List<List<String>> lists) {
        StringBuilder stringBuilder = new StringBuilder();
        for (List<String> list : lists) {
            stringBuilder.append("[");
            stringBuilder.append(String.join(",", list));
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }

    public static String convertArrayOfIntegerToFlatString(int[] ints) {
        List<Integer> list = Arrays.stream(ints).boxed().toList();
        return String.join(",", String.valueOf(list));
    }
}
