import java.util.HashMap;
public class task100 {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,2,1};
        freq(arr);
    }
    public static void freq(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
           if(map.containsKey(a)){
            map.put(a, map.get(a) + 1);
           }
           else{
             map.put(a, 1);
           }
        }
        System.out.println(map);
    }
}
