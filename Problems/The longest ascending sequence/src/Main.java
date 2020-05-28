import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentSequence = 0;
        int maxSequence = 0;
        int elem = scanner.nextInt();

        while (scanner.hasNext()) {
            int currentElem = scanner.nextInt();
            if (elem < currentElem) {
                currentSequence++;
            } else {
                maxSequence = Math.max(currentSequence, maxSequence);
                currentSequence = 1;
            }
            elem = currentElem;
        }
        System.out.println(Math.max(currentSequence, maxSequence));
    }
}