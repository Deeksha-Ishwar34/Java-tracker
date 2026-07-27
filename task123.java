import java.util.HashMap;
public class task123 {
    public static void main(String[] args) {
        String s="leetcode";
       func(s);
    }
    public static char func(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ele=s.charAt(i);
            if(map.containsKey(ele) && map.get(ele)==1){
               return ele;
            }
        }
        return ' ';   
    }
}
