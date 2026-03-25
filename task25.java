import java.util.Scanner;
public class task25 {
         public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int user_num=getnum(sc);
            checknum(user_num);
            sc.close();
           
         }  
         public static int getnum(Scanner sc){
            System.out.println("Enter a number ");
           return sc.nextInt();
         }
          public static void checknum(int a){
            if(a==0){
                System.out.println("You entered zero");
            }
            else if(a>0){
                System.out.println("You entered a positive number");
            }
            else{
                System.out.println("You entered a negative number");
            }
         }
}
