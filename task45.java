import java.util.ArrayList;
import java.util.Scanner;

public class task45 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = getNum(sc);
      sc.nextLine();
      getTasks(num, sc);
      sc.close();
   }

   public static int getNum(Scanner sc) {
      System.out.println("How many tasks? ");
      return sc.nextInt();
   }

   public static void getTasks(int num, Scanner sc) {
      ArrayList<String> tasks = new ArrayList<>();
      for (int i = 0; i < num; i++) {
         System.out.println("Enter task: ");
         tasks.add(sc.nextLine());

      }
      System.out.println("---TO DO LIST---");
      for (int i = 0; i < num; i++) {
         System.out.println(i + " --> " + tasks.get(i));
      }

   }
}
