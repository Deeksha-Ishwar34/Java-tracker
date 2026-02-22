import java.util.HashMap;
import java.util.Scanner;
public class task43{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> marks=new HashMap<>();
        marks.put("Deeksha",99);
        marks.put("Ria",55);
        marks.put("Evita",65);
        marks.put("Alaina",73);
        System.out.println(marks.get("Evita"));
        sc.close();
     }
}

