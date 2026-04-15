import java.util.Scanner;

public class task31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            display(sc);
            System.out.println("Enter choice");
            int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                findSquare(sc);
                break;
            case 2:
                Checknum(sc);
                break;
            case 3:
                PrintNnumbers(sc);
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid input");
        }
        sc.close();
    }}

    public static void findSquare(Scanner sc) {
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int res = num * num;
        System.out.println("Square o a number:- " + res);
    }

    public static void Checknum(Scanner sc) {
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number s negative");
        }
    }

    public static void PrintNnumbers(Scanner sc) {
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }

    public static void display(Scanner sc) {
        System.out.println("1. Find Square\n2.Check Positive or Negative\n3. Print first N natural numbers\n4. Exit\n");
    }

}
