package RevisionBasics.Lab;

import java.util.Scanner;

public class ForeignLanguages06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that prints the language that a given country speaks. You can receive only the following combinations:
        // English is spoken in England and USA; Spanish is spoken in Spain, Argentina, and Mexico; for the others, we should print "unknown".

        String country = scanner.nextLine();

        switch (country) {
            case "England":
            case "USA":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }

    }
}
