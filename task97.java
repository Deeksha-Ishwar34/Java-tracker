import java.util.Scanner;
public class task97 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:- ");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        System.out.println("after reversing your name:- "+sb.reverse());
        sc.close();
    }
}
