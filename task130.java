public class task130 {
    public static void main(String[] args) {
         int[] arr={2,2,2,2,5,5,5,8};
         int k=3;
         int t=4;
        numsub(arr,k,t);
    }
     public static void numsub(int[] arr,int k,int t){
        int count=0;
        for(int i=0;i<=arr.length-k;i++){
             int sum=0;
              for(int j=i;j<i+k;j++){
                sum+=arr[j];
              }
                double avg=(double)sum/k;
              if(avg>=t){
                    count++;
                }
        }
         System.out.println(count);
       
     }
}
