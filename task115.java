import java.util.HashMap;
public class task115 {
    public static void main(String[] args) {
        int[] arr={2, 3, 5, 4, 5, 3};
        findOddOne(arr);
    }
    public static void findOddOne(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                 map.put(arr[i],1);
            }
        }
       for(int num:map.keySet()){
        if(map.get(num)==1){
            System.out.println(num);
        }
       }
    }
}
