
package methodOverloading;


public class Circle extends Shape{
    
    @Override
    public void area(double r)
    {
     
        System.out.println("area of circle is "+ Math.PI* r );
    }
    
}
