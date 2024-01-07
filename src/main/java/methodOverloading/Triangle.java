
package methodOverloading;


public class Triangle extends Shape {
    
    @Override
    public void area(double a, double b)
    {
        System.out.println("area of Triangle is " + .5 * a *b);
    }
}
