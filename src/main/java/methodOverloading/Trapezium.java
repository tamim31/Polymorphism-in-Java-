
package methodOverloading;


public class Trapezium extends Shape {

    @Override
    public void area(double a,double b,double h)
    {
        double area;
        area=.5 *(a+b)* h;
        System.out.println("area of Trapezium is " + area);
    }
}
