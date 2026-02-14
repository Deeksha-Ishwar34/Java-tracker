import java.util.Scanner;
public class task39 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int size=getSize(sc);
         int[] nums=getNums(sc,size);
         searching(nums);
        sc.close();
     }
     
}

