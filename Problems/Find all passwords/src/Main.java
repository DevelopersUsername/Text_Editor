import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("(password\\W*)([a-z\\d]*)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            do {
                System.out.println(matcher.group(2));
            } while (matcher.find());
        } else {
            System.out.println("No passwords found.");
        }
    }
}