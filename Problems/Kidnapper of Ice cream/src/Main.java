import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> wordList = new LinkedList<>(Arrays.asList(scanner.nextLine().split("")));
        LinkedList<String> noteList = new LinkedList<>(Arrays.asList(scanner.nextLine().split("")));

        AtomicBoolean canNote = new AtomicBoolean(true);
        noteList.forEach(elem -> {
            if (wordList.contains(elem)) {
                wordList.remove(elem);
            } else {
                canNote.set(false);
            }
        });

        System.out.println(canNote.get() ? "You get money" : "You are busted");
    }
}