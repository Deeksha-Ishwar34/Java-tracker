import java.util.HashMap;
public class task72 {
    public static void main(String[] args) {
        int[] arr={8,3,6,8,7};
         HashMap<Integer, Integer> map = new HashMap<>();
         int target=10;
         for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
            int needed=target-arr[i];
            if(map.containsKey(needed)){
                System.out.println(map.get(arr[i]));
                System.out.println(map.get(needed));
                return;
            }
         }

        }
}
