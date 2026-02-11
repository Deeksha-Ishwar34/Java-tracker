import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();
        System.out.printf("Multiplication of %d:\n",num);
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d X %d =%d\n",num,i,num*i);
        }
        sc.close();
    }
    
    
}
