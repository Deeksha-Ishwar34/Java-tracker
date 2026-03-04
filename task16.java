import java.util.Scanner;
public class task16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
       do{
            System.out.println("Enter  number greater than 0:- ");
             num=sc.nextInt();
       } while(num<0);
       sc.close();
        


    }
}
