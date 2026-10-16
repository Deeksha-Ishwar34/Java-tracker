import java.util.Scanner;
public class task95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter your choice:- ");
        int choice=sc.nextInt();
        System.out.println("Enter first number:- ");
        int a=sc.nextInt();
        System.out.println("Enter second number:- ");
        int b=sc.nextInt();
        if(choice==1){
            System.out.printf("Sum of %d and %d is:- %d",a,b,a+b);
        }
        else if(choice==2){
            System.out.printf("Answer:- %d",a-b);
        }
        else if(choice==3){
            System.out.printf("Answer:- %d",a*b);
        }
        else{
            System.out.printf("Answer:- %d",a/b);
        }
        sc.close();
    }
}
