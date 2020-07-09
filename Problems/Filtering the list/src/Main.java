import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");
        List<String> list = new LinkedList<>();

        for (int i = 0; i < inputArray.length; i++) {
            if (i%2 != 0) {
                list.add(inputArray[i]);
            }
        }
        Collections.reverse(list);
        list.forEach(elem -> System.out.printf("%s ", elem));
    }
}