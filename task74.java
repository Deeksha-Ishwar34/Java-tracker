public class task74 {
    public static void main(String[] args) {
        String s = "deeksha";
        System.out.println(s);
        StringBuilder sb = new StringBuilder(s);
        char[] s1=s.toCharArray();
        System.out.println(s1[0]);
        sb.setCharAt(0, 't');
        sb.setCharAt(1, 'i');
        System.out.println(sb);
    }
}
