import java.util.Scanner;
public class task47 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length=sc.nextInt();
        System.out.println("Enter width: ");
        int width=sc.nextInt();
        rectangle rec=new rectangle(length, width);
        rec.areaofrec();
        rec.perimeterofrec();
        sc.close();
     }
}
class rectangle{
      int length;
      int width;
      rectangle(int length,int width){
         this.length=length;
         this.width=width;
      }
      void areaofrec(){
         int area=length*width;
         System.out.println("Area of rectangle "+area);
      }
      void perimeterofrec(){
         int perimeter=2*(length+width);
         System.out.println(" perimeter of rectangle "+ perimeter);
      }
}

