import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>(List.of(scanner.nextLine().split("\\s+")));

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Collections.swap(list, scanner.nextInt(), scanner.nextInt());
        }

        list.forEach(elem -> System.out.printf("%s ", elem));
    }
}