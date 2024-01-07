
package methodOverloading;


public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Shape s1;
        s1= new Shape();
        s1.area();
        
        s1=new Circle();
         s1.area(5.0);
         
         s1=new Rectangle();
         s1.area(3.0, 4.0);
         
         s1= new Triangle();
         s1.area(3.0, 4.0);
         
         s1=new Trapezium();
         s1.area(3.0, 5.0, 4.0);
    }
    
}
