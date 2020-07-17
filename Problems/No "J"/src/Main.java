import java.util.*;

public class Main {

    public static void processIterator(String[] array) {
        List<String> list = new ArrayList<>(Arrays.asList(array));
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("J")) {
                iterator.remove();
            }
        }

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous().substring(1));
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processIterator(scanner.nextLine().split(" "));
    }
}