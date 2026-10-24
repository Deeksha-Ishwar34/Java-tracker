import java.util.Scanner;
public class task140 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println(fun(num));
        sc.close();
    }
    public static int fun(int n){
        if(n==0){
           return 1;
        }
         return n * fun(n-1);    
    }
}
