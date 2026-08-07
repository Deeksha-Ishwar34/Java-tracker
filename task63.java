public class task63 {
    public static void main(String[] args) {
        int[] arr={5,6,3,8,1,9};
         int target=9;
        if(arr.length==0){
            System.out.println("Array is empty");
        }
        else{
            int result= checking(arr,target);
            System.out.println(result);
        }   
    }
    public static int checking(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
         return -1;
    }
}
