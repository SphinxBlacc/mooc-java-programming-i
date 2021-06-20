
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(" ");
            
            for (String i : pieces) {
                System.out.println(i);
            }
            if (input.equals("")) {
                break;
            }
        }
    }
}
