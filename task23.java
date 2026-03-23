import java.util.Scanner;
public class task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_class=getTotalClass(sc);
        int class_attended=getClassAttended(sc);
        double attendance=getAttendance(class_attended,total_class);
        String status=getStatus(attendance);
        System.out.printf("Attendance:%.2f\nStatus:%s",attendance,status);
        sc.close();
    }
    public static int getTotalClass(Scanner sc){
        System.out.println("Enter Total Classes Held: ");
        return sc.nextInt();
    }
    public static int getClassAttended(Scanner sc){
        System.out.println("Enter classes attended:");
        return sc.nextInt();
    }
    public static double getAttendance(int a,int b){
        return (a*100.0)/b;
    }
    public static String getStatus(double attendance){
        if(attendance>=75){
            return "Allowed";
        }
        else{
            return "Not allowed";
        }
    }
}
