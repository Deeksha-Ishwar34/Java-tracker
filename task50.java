import java.util.Scanner;
public class task50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] myarray=getMarks(sc);
        getAvg(myarray);
        getHighest(myarray);
        getLowest(myarray);
    }
    public static int[] getMarks(Scanner sc){
        System.out.println("Enter number of students: ");
        int n=sc.nextInt();
        int[] marks=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter student %d 's marks",i);
            marks[i]=sc.nextInt();
        }
        return marks;
    }
    public static void getAvg(int[] myarray){
        double sum=0.0;
        for(int i=0;i<myarray.length;i++){
            sum=sum+myarray[i];
        }
        double avg;
        avg=sum/myarray.length;
        System.out.println("Average: "+avg);
    }
    public static void getHighest(int[] array){
        int high=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>high){
                high=array[i];
            }
        }
        System.out.println("Highest marks= "+high);
    }
    public static void getLowest(int[] array){
        int low=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<low){
                low=array[i];
            }
        }
        System.out.println("Lowest marks:"+ low);
    }
}
