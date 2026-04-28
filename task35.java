import java.util.Scanner;
public class task35 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 3 fav colours");
        String[] colors=new String[3];
        colors[0]=sc.nextLine();
        colors[1]=sc.nextLine();
        colors[2]=sc.nextLine();
        for(int i =0;i<colors.length;i++){
            System.out.println("Your Fav colors are: ");
            System.out.println(colors[i]);
        }
      sc.close(); 
     }
}
