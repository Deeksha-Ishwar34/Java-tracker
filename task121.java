import java.util.Arrays;
public class task121 {
    public static void main(String[] args) {
        char[] arr={'h','e','e','l','l','o'};
        reverse(arr);
    }
    public static void reverse(char[] arr){
        char[] temp=new char[arr.length];
        for(int i=0;i<arr.length;i++){
                temp[arr.length-1-i ]=arr[i];    
        }
        System.out.println(Arrays.toString(temp));
    }
}
