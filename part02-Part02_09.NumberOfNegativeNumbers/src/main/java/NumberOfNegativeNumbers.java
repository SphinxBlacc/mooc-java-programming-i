
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int j = Integer.valueOf(scanner.nextLine());
            
            if (j == 0) {
                break;
            } else if (j < 0) {
                i = i + 1;
            } else {
                continue;
            }
        }
        
        System.out.println("Number of negative numbers: " + i);
    }
}
