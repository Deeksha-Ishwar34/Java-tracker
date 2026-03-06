import java.util.Scanner;
public class task17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=7;
        int user_num;
        do{
            System.out.println("Guess a number:- ");
             user_num=sc.nextInt();
        }while(num!=user_num);
        sc.close();
    }
}
