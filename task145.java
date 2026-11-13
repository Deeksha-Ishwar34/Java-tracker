class Parent{
    Parent(){
        System.out.println("Parent class");
    }
    Parent(int x){
        System.out.println(x);
    }
} 
class child extends Parent{
    child(){
         super(10);
        System.out.println("child class");
    }
}
public class task145{
    public static void main (String[] args){
    child c=new child();
}
}    

