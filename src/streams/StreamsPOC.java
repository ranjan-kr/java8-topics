package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPOC {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");

        //Filter operation
        System.out.println(strList.stream()
                .filter(String::isEmpty)
                .count());

        //Count operation
        System.out.println(strList.stream()
                .filter(x -> x.length()> 3)
                .count());

        //Map operation
        System.out.println(strList.stream()
                .filter(str -> !str.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.joining(", ")));
    }
}
