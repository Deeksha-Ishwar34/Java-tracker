import java.util.ArrayList;
import java.util.Scanner;

public class task45 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = getNum(sc);
      sc.nextLine();
      ArrayList<String> mylist = getTasks(num, sc);
      updateTask(sc, mylist);
     
      sc.close();
   }

   public static int getNum(Scanner sc) {
      System.out.println("How many tasks? ");
      return sc.nextInt();
   }

   public static ArrayList<String> getTasks(int num, Scanner sc) {
      ArrayList<String> tasks = new ArrayList<>();
      for (int i = 0; i < num; i++) {
         System.out.println("Enter task: ");
         tasks.add(sc.nextLine());
      }
      System.out.println("---TO DO LIST---");
      for (int i = 0; i < num; i++) {
         System.out.println(i + " --> " + tasks.get(i));
      }
      return tasks;

   }

   public static void updateTask(Scanner sc, ArrayList<String> tasks) {
      System.out.println("Enter index to update: ");
      int index = sc.nextInt();
      sc.nextLine();
      System.out.println("Enter new task: ");
      String task = sc.nextLine();
      tasks.set(index, task);
      System.out.println("Task updated successfully");
      System.out.println("---TO DO LIST---");
      for (int i = 0; i < tasks.size(); i++) {
         System.out.println(i + " --> " + tasks.get(i));
      }
   }

}
