public class task131 {
    public static void main(String[] args) {
         int[] arr={2,3,1,2,4,3};
         int t=7;
        numsub(arr,t);
    }
     public static void numsub(int[] arr,int t){
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
              int sum=0;
              for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>=t){
                    ans=Math.min(ans,j-i+1);
                }
              }   
        }
         System.out.println(ans);
     }
}
