public class task105 {
    public static void main(String[] args) {
        String s="abciiidef";
        int k=3;
        max(s,k);
    }
    public static void max(String s,int k){
        int maxsum=0;
        int winsum=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                winsum++;
            }
        }
       
    }
    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}
