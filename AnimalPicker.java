import java.util.Scanner;

public class AnimalPicker {

    public static void main(String[] args) {
        System.out.println();
        Scanner scan = new Scanner(System.in);

        System.out.println("Which animal would you like to see, a dog or a cat?");
        String choice = scan.nextLine();

        System.out.println("Printing " + choice + " ASCII art here:");
    }

}