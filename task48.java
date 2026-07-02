import java.util.ArrayList;
import java.util.Scanner;
public class task48 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= getNum(sc);
        sc.nextLine();
        ArrayList<Student> mylist=getDetails(num,sc);
       for(Student s:mylist){
         s.display();
       }
        sc.close();
     }
     public static int getNum(Scanner sc){
        System.out.println("How many Students do u want to add?");
        return sc.nextInt();
     }
     public static ArrayList<Student> getDetails(int num,Scanner sc){
        ArrayList<Student> mylist = new ArrayList<>();
        for(int i=0;i<num;i++){
            System.out.println("Enter name: ");
            String name=sc.nextLine();
            System.out.println("Enter roll no: ");
            int rollNo=sc.nextInt();
            System.out.println("Enter marks: ");
            double marks=sc.nextDouble();
            sc.nextLine();
           mylist.add(new Student(name,rollNo,marks));
        }
        return mylist;
     }
}
class Student {
    String name;
    int rollNo;
    double marks;
    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    void display() {
        System.out.println("Name: " + name +
                           " | Roll No: " + rollNo +
                           " | Marks: " + marks);
    }
}

