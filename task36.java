import java.util.Scanner;
public class task36 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many colors do u want to enter? ");
        int n=sc.nextInt();
        sc.nextLine();
        String[] colors=new String[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter Color %d",(i+1));
            colors[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++){
              System.out.println(colors[i]);
        }
        sc.close();
     }
}


