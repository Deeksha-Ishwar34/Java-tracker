class Circle{
        double radius;
        void area(){
             System.out.printf("Area:-%.2f\n",radius*radius*3.14);
        }
        void circum(){
            System.out.printf("Circum:-%.2f\n",2*3.14*radius);
        }
    }
public class task133 {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.radius=4;
        c.area();
        c.circum();
    }
}
