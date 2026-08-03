public class task125 {
    public static void main(String[] args) {
         int[] arr={1,2,3,4,6,8};
         missingnum(arr);
    }
    public static void missingnum(int[] arr){ 
         for(int i=0;i<arr.length-1;i++){
            if(arr[i]+1!=arr[i+1]){
                System.out.println(arr[i]+1);
            }
         }
    }
}
