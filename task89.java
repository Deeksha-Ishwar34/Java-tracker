public class task89 {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(RemovePalindrome(s));
    }

    public static boolean RemovePalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return isPalindrome(s,l+1, r) || isPalindrome(s, l, r - 1);
            }
        }
        return true;
    }

    public static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}