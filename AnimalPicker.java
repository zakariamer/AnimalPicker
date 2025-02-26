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
        
        if (choice.equals("dog")){
            System.out.println("  __      _\r\n" + //
                                "o'')}____//\r\n" + //
                                " `_/      )\r\n" + //
                                " (_(_/-(_/\r\n" + //
                                "");
        } else {
            System.out.println("|\\---/|\r\n" + //
                                "| o_o |\r\n" + //
                                " \\_^_/");
        }
    }

}