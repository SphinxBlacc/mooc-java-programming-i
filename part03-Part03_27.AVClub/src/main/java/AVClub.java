
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(" ");
            
            for (String i : pieces) {
                if (i.contains("av")) {
                    System.out.println(i);
                }
            }
            if (input.equals("")) {
                break;
            }
        }
    }
}
