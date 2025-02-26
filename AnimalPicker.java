import java.util.Scanner;

public class AnimalPicker {

    public static void main(String[] args) {
        System.out.println();
        Scanner scan = new Scanner(System.in);

        System.out.println("Which animal would you like to see, a dog or a cat?");
        String choice = scan.nextLine();
        while (!choice.toLowerCase().equals("dog") && !choice.toLowerCase().equals("cat")) {
            System.err.println("invalid option, choose cat or dog.");
            choice = scan.nextLine();
        }

        System.out.println("Printing " + choice + " ASCII art here:");
        System.out.println("I accidently did part 3 as well during part 2");
    }

}