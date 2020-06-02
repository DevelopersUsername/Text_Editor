import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

    static void changeList(List<String> list) {
        AtomicInteger maxLong = new AtomicInteger();
        AtomicReference<String> longestString = new AtomicReference<>("");

        list.forEach(str -> {
            if (str.length() > maxLong.get()) {
                maxLong.set(str.length());
                longestString.set(str);
            }
        });

        list.replaceAll(e -> longestString.get());
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}