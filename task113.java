public class task113 {
    public static void main(String[] args) {
          int[] arr={23,2,4,6,7};
          int k=6;
          System.out.println(SubArrSum(arr,k));
    }
     public static boolean SubArrSum(int[] arr,int k){
         for(int i=0;i<arr.length-1;i++){
            int sum=0;
             for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum % k==0 && j-i+1>=2){
                    return true;
                }
             }
         }
        return false;
}
}
