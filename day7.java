import java.util.Scanner;
public class day7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your age");
        int age=sc.nextInt();
        System.out.println("Enter marks obtained");
        int marks=sc.nextInt();
        sc.close();
        double perc=(marks/500.0)*100;
        System.out.println("--------- STUDENT REPORT ---------");
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.printf("Marks :%d/500\n",marks);
        System.out.println("Percentage :%"+perc);
        System.out.println("----------------------------------");

    }
}
