import java.util.Scanner;
public class task95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:- ");
        int a=sc.nextInt();
        System.out.println("Enter second number:- ");
        int b=sc.nextInt();
        System.out.printf("Sum of %d and %d is:- %d",a,b,a+b);
        sc.close();
    }
}
