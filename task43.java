import java.util.HashMap;
public class task43{
     public static void main(String[] args) {
        HashMap<String,Integer> marks=new HashMap<>();
        marks.put("Deeksha",99);
        marks.put("Ria",55);
        marks.put("Evita",65);
        marks.put("Alaya",73);
        System.out.println(marks.get("Evita"));
     }
}

