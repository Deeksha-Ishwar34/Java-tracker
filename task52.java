public class task52 {
    public static void main(String[] args) {
        int[] arr={44,36,5,76,58};
         int target=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>target){
                target=arr[i];
            }
        }
        System.out.println(target);
    }
}
