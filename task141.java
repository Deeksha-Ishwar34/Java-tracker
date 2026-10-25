import java.util.Scanner;
public class task141 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=2;
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println(fun(n,a));
        sc.close();
    }
    public static int fun(int n,int a){
        if(n==0){
           return 1;
        }
         return a * fun(n-1,a);    
    }
}
