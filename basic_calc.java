import java.util.Scanner;
public class basic_calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter first number :");
        int num1=sc.nextInt();
        System.out.println("Enter second number :");
        int num2=sc.nextInt();
        System.out.println("Enter the operators[+,-,*,/] :");
        char op=sc.next().charAt(0);
        if(op=='+')
        {
            int add=num1+num2;
            System.out.printf("%d + %d = %d",num1,num2,add);
        }
        else if(op=='-'){
            int sub=num1-num2;
            System.out.printf("%d - %d = %d",num1,num2,sub);
        }
        else if(op=='*'){
            int mul=num1*num2;
            System.out.printf("%d * %d = %d",num1,num2,mul);
        }
        else if(op=='/'){
            int div=num1/num2;
            System.out.printf("%d / %d = %d",num1,num2,div);
        }
         sc.close();
    }
   
}
