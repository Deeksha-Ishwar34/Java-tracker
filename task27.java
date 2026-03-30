import java.util.Scanner;
public class task27 {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Find the greatest number");
            int num1=getNum1(sc);
            int num2=getNum2(sc);
            findGreatnum(num1,num2);
     }
     public static int getNum1(Scanner sc){
    System.out.println("Enter first number: ");
    return sc.nextInt();
    }
    public static int getNum2(Scanner sc){
        System.out.println("Enter Second number: ");
        return sc.nextInt();
    }
    public static void findGreatnum(int num1, int num2){
        if(num1>num2){
            System.out.println(num1 +" is greater");
        }
        else if(num2>num1){
            System.out.println(num2 +" is greater");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
