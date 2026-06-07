import java.util.Scanner;
public class task37 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = getN(sc);
      String[] colors = getColors(n, sc);
      display(colors, n);
      sc.close();
   }

   public static int getN(Scanner sc) {
      System.out.println("How many colors do you want to enter? ");
      return sc.nextInt();

   }
   public static String[] getColors(int n, Scanner sc) {
      String[] colors = new String[n];
      sc.nextLine();
      for (int i = 0; i < n; i++) {
         System.out.printf("Enter Color %d", (i + 1));
         colors[i] = sc.nextLine();
      }
      return colors;
   }
   public static void display(String[] colors, int n) {
      System.out.println("Colors you entered ");
      for (int i=0; i<n; i++) {
         System.out.println(colors[i]);
      }
   }
}
