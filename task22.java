import java.util.Scanner;
public class task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=getName(sc);
        int marks_obtained=getMarks(sc);
        int total_marks=getTotalMarks(sc);
        double perc=getPerc(marks_obtained,total_marks);
        String grade=getGrade(perc);
        System.out.println("------ REPORT ------");
        System.out.printf("Name:%s \nPercentage:%.2f\nGrade:%s",name,perc,grade);
        System.out.println("--------------------");
        sc.close();
    }
    public static String getName(Scanner sc){
        System.out.println("Enter name:");
        return sc.nextLine();
    }
    public static int getMarks(Scanner sc){
        System.out.println("Enter marks obtained");
        return sc.nextInt();
    }
    public static int getTotalMarks(Scanner sc){
        System.out.println("Enter total marks ");
        return sc.nextInt();
    }
    public static double getPerc(int a,int b){
        return a*100.0/b;
    }
    public static String getGrade(double perc){
        if(perc>=90){
            return "Your Grade A";
        }
        else if(perc>=80){
            return "Your Grade B";
        }
         else if(perc>=70){
            return "Your Grade C";
        }
        else{
            return "You Failed";
        }
    }
    }

