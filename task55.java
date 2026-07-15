public class task55 {
    public static void main(String[] args) {
        int[] arr={5,1,8,2,6};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>first){
                second=first;
                 first=num;
            }
            else if(num>second && num!=first){
                second=num;
            }
        }
        System.out.println(second);


    }
}
