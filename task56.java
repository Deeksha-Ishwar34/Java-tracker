public class task56 {
    public static void main(String[] args) {
        int[] arr={31,5,8,6,4,9};
        int small=arr[0];
        int large=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
            else if (arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println(small);
        System.out.println(large);
    }
}
