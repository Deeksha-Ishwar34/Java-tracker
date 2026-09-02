import java.util.Scanner;

public class task77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:- ");
        String s = sc.nextLine();
        reverseCheck(s);
        sc.close();
    }
    public static void reverseCheck(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println("It is not a Palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("It is a Palindrome");
    }
}
