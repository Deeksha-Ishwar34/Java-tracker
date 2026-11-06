import java.util.HashMap;

public class task102 {
    public static void main(String[] args) {
        String s="deeksha";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
            
        }
        int max=0;
        for(char ch:map.keySet()){
            if(map.get(ch)>max){
                max=map.get(ch);
                 System.out.println(ch);
            }
        }
        System.out.println(max);
    }
}
