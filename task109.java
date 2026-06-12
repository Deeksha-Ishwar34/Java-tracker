import java.util.Scanner;
public class task109 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2, 4, 1, 5, 3};
        System.out.println("Enter the starting index:- ");
        int indx1=sc.nextInt();
         System.out.println("Enter the ending index:- ");
        int indx2=sc.nextInt();
        sumofnums(arr,indx1,indx2);
    }
    public static void sumofnums(int[] arr,int indx1,int indx2){
        int sum=0;
        for(int i=indx1;i<=indx2;i++){
            arr[i]+=sum;
        }
       
    }
}
