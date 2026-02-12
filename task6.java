import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt();
        int res=0;
        for(int i=1;i<=n;i++)
        {
            res+=i;
        }
        System.out.println("Result:"+res);
        sc.close();
    }
    
    
}
