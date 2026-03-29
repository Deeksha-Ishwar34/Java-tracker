import java.util.Scanner;
public class task26 {
          public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            op_list();
            int choice=getChoice(sc);
            int num1=getNum1(sc);
            int num2=getNum2(sc);
            int calc=calculation(choice,num1,num2);
            System.out.println("Answer:-"+calc);
            sc.close();
}
public static void op_list(){
    System.out.println("---------------");
    System.out.println("1.Addition");
    System.out.println("2.Subtraction");
    System.out.println("3.Multiplication");
}
public static int getNum1(Scanner sc){
    System.out.println("Enter first number:- ");
    return sc.nextInt();
}
public static int getNum2(Scanner sc){
    System.out.println("Enter Second number: ");
    return sc.nextInt();
}
public static int getChoice(Scanner sc){
    System.out.println("Enter your choice");
    return sc.nextInt();
 }
 public static int calculation(int choice,int num1,int num2){
   if(choice==1){
     return num1 + num2;
   }
   else if(choice==2){
        return num1 - num2;
   }
   else{
      return num1*num2;
   }
    
 }
}

