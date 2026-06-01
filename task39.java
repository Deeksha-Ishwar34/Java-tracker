import java.util.Scanner;
public class task39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = getSize(sc);
        int[] nums = getNums(sc, size);
        searching(nums);
        sc.close();
    }

    public static int getSize(Scanner sc) {
        System.out.println("Enter the size:-");
        return sc.nextInt();
    }

    public static int[] getNums(Scanner sc, int size) {
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter element " + (i + 1));
            nums[i] = sc.nextInt();
        }
        return nums;
    }

    public static void searching(int[] nums){
        boolean found=false;
        int search=88;
        for(int num:nums){
            if(num==search){
                found=true;
            }
        }
        if(found){
            System.out.println("element found");
        }
        else{
            System.out.println("element not found");
        }
     }
}

