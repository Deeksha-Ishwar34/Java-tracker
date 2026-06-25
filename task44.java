import java.util.HashMap;
import java.util.Scanner;
public class task44 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> marks=new HashMap<>();
        marks.put("Deeksha",99);
        marks.put("Ria",55);
        marks.put("Evita",65);
        marks.put("Alaina",73);
        System.out.println("Student's names List");
        System.out.println(marks.keySet());
        System.out.println("Student's marks List");
        System.out.println(marks.values());
        System.out.println(marks.entrySet());
        sc.close();
     }
}

