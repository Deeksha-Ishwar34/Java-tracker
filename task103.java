public class task103 {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,0,1,0,1};
        int k=3;
        int count=0;
        int maxcount=0;
        for(int i=0;i<k;i++){
            if(arr[i]==1){
                count++;
            }
        }
        maxcount=count;
        for(int i=k;i<arr.length;i++){
            if(arr[i-k]==1){
                count--;
            }
            if(arr[i]==1){
                count++;
            }
            maxcount=Math.max(maxcount,count);
        }
        System.out.println(maxcount);
    }
}
