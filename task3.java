import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name");
        String name=sc.nextLine();
        System.out.print("Enter your age");
        int age=sc.nextInt();
        System.out.print("Enter your fav num");
        int favnum=sc.nextInt();

        System.out.println("Hello "+name);
        System.out.printf("You are %d years old\n ",age);
        System.out.println("Your fav num double is "+favnum*2);
        sc.close();
    }
}
