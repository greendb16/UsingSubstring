
import java.util.Scanner;

public class UsingSubstring {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a word: ");
            String word = key.nextLine();
            System.out.println("Enter a number to index: ");
            int index = key.nextInt();
            key.nextLine();

            if (index > (word.length())) {
                System.out.println("Index is larger than length. Try again ");
                continue;
            }else {
                System.out.println("The length of " + word + " is: " + word.length());
                System.out.println("The substring from 0 to " + index + " is : " + word.substring(0, index));
                System.out.println("Would you like to try again? (Yes/No)");
                String answer = key.nextLine();

                if (answer.equalsIgnoreCase("Yes")) {
                    continue;
                } else {

                    break;
                }
            }


        }
    }
}
