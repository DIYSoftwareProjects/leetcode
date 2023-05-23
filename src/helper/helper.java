package helper;


import java.util.List;

public class helper {

    public static String convertListOfStringToFlatString(List<List<String>> lists) {
        StringBuilder stringBuilder = new StringBuilder();
        for (List<String> list : lists) {
            stringBuilder.append("[");
            stringBuilder.append(String.join(",", list));
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }
}
