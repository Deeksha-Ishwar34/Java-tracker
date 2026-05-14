public class task99 {
   public static void main(String[] args) {
     String s="A man, a plan, a canal: Panama";
    s = s.replaceAll("[^A-Za-z0-9]", "");
    s=s.toLowerCase();
     int l=0;
     int r=s.length()-1;
     while (l<r) {
       if(s.charAt(l)!=s.charAt(r)){
        System.out.println("not a palindrome");
        return;
       }
       l++;
       r--;
   } 
   System.out.println("Palindrome");
}
}