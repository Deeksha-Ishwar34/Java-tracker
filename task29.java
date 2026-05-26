import java.util.Scanner;
public class task29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = getAge(sc);
        String eligibility = checkEligibility(age);
        System.out.println(eligibility);
        sc.close();
    }
    public static int getAge(Scanner sc) {
        System.out.println("Enter your age:- ");
        return sc.nextInt();
    }
    public static String checkEligibility(int age) {
        if (age >= 18) {
            return "Eligible to vote ";
        } else {
            return "Not Eligible to vote ";
        }
    }

}
