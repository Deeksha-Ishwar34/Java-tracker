import java.util.Scanner;
public class task21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=getNumber(sc);
        int num2=getNumber(sc);
        int sum=add(num1,num2);
        System.out.println("The Sum:- "+sum);
        boolean even=isEven(sum);
        if(even){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is not Even");
        }
         sc.close();
    }
    public static int getNumber(Scanner sc){
        System.out.println("Enter a number:- ");
        return sc.nextInt();
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static boolean isEven(int y){
        return y % 2==0;
    }
}