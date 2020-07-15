import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();

        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            deque.addFirst(scanner.nextInt());
        }

        for (Integer integer : deque) {
            System.out.println(integer);
        }
    }
}