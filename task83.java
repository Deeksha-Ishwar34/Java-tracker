public class task83 {
    public static void main(String[] args) {
        String a="madam";
        System.out.println(CheckPalindrome(a));
    }
    public static boolean CheckPalindrome(String a){
        a=a.toLowerCase();
        char[] str=a.toCharArray();
        int left=0;
        int right=str.length-1;
        while(left<right){
            if(str[left]!=str[right]){
                return false;
            }
             left++;
                right--;
        }
        return true;
    }
}
