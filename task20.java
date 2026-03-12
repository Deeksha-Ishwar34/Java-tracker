import java.util.Scanner;
public class task20 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Menu");
     System.out.println("1.Pizza\n2.Burger\n3.Coke");
     System.out.println("What item whould you like to buy? ");
     String item=sc.nextLine();
     System.out.println("What is the pice for each? ");
     int price=sc.nextInt();
     System.out.println("How many would you like? ");
     int num=sc.nextInt();
     System.out.printf("You have bought %d %s \n",num,item);
     System.out.printf("Your total is %dRs",price*num);
    sc.close();    
}
}
