public class task74 {
    public static void main(String[] args) {
        String s = "deeksha";
        System.out.println(s);
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(0, 'r');
        sb.setCharAt(1, 'i');
        System.out.println(sb);
    }
}
