import java.util.Scanner;
public class task40 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int size = getSize(sc);
         int[] nums = getNums(sc, size);
         int search=get_user_search_num(sc);
         findLargestSmallest(nums);
         sum(nums);
         even_count(nums);
         numfound(search,nums);
         sc.close();
     }
      public static int getSize(Scanner sc) {
        System.out.println("Enter size: ");
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
     public static int get_user_search_num(Scanner sc) {
        System.out.println("Enter number to search: ");
        return sc.nextInt();
    }
    public static void findLargestSmallest(int[] nums){
        int max=nums[0];
         int min=nums[0];
         for(int num:nums){
            if(num>max){
                max=num;
            }
            else{
                min=num;
            }
         }
         System.out.println("Largest: "+max);
         System.out.println("Smallest: "+min);
    }
    public static void sum(int[] nums){
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        System.out.println("Sum: "+sum);
    }
    public static void even_count(int[] nums){
        int even=0;
        for(int num:nums){
            if(num%2==0){
                even++;
            }
        }
        System.out.println("Even count "+even);
    }
    public static void numfound(int search,int[] nums){
       boolean found=false;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==search){
            found=true;
             System.out.println("Number found at index: "+i);
        }
       }
       if(!found){
        System.out.println("Number not found");
       }
    }

}

