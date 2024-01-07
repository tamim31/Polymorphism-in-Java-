
package example1;


public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        One o1=new One();
        //method-overloading(compile-time)
        o1.add(10, 20);
        o1.add(10, 30, 20);
        
        Two t1=new Two();
        //method-overriding(run-time)
        t1.print();
        
    }
    
}
