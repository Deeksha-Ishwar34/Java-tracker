import java.util.Scanner;
public class task38{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=getSize(sc);
        int[] nums=getNums(sc,size);
        getMax_min(nums);
        sc.close();
     }
     public static int getSize(Scanner sc){
        System.out.println("Enter size: ");
        return sc.nextInt();
     }
     public static int[] getNums(Scanner sc,int size){
        int[] nums=new int[size];
        for(int i=0;i<nums.length;i++){
            System.out.println("Enter element:- "+(i+1));
            nums[i]=sc.nextInt();
        }
        return nums;
     }
     public static void getMax_min(int[] nums){
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
           
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
     }
}

