import java.util.HashMap;
public class task71 {
    public static void main(String[] args) {
        int[] arr={1, 2, 1, 3, 2, 1};
        HashMap<Integer, Integer> mapp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mapp.put(arr[i],mapp.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(mapp);
}
}
