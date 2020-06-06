import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = Integer.parseInt(scanner.nextLine());
        int A = Integer.parseInt(scanner.nextLine());
        int B = Integer.parseInt(scanner.nextLine());

        System.out.println((H - B - 1) / (A - B) + 1);
    }
}