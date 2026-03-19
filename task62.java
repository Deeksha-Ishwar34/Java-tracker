public class task62 {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9};
       
        checking(arr);
    }
    public static void checking(int[] arr){
        boolean sorted=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                sorted=true;
        }
            else{
                sorted=false;
                break;
            }
        }
        System.out.println(sorted);
    }
}
