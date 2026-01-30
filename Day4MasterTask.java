import java.util.Scanner;

public class Day4MasterTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking name (String)
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Taking age (int)
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Taking favourite number (int)
        System.out.print("Enter your favourite number: ");
        int favNumber = sc.nextInt();

        // Calculations
        int birthYear = 2026 - age;
        int doubledFav = favNumber * 2;

        // Output
        System.out.println("\nHello " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("You were born in " + birthYear + ".");
        System.out.println("Your favourite number doubled is " + doubledFav + ".");

        sc.close();
    }
}

