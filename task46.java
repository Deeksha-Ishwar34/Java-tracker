public class task46 {
     public static void main(String[] args) {
        mobile m1=new mobile("Vivo",12000);
         mobile m2=new mobile("Oppo",15000);
         m1.display();
         m2.display();
     }   
}
class mobile{
    String brand;
    int price;
    mobile(String brand,int price){
        this.brand=brand;
        this.price=price;
    }
    void display(){
        System.out.println("Mobile brand "+brand+"price "+price);
    }
}

