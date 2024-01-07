
package methodOverriding;

public class Main {

    
    public static void main(String[] args) {
        Animal a1;
        a1=new Animal();
        a1.eat();
        a1.sleep(); 
        
        a1=new Cat();
        a1.eat();
        
        a1=new Dog();
        a1.eat();
        
        Animal a2,a3;
        a2=new Cat();
        a3=new Dog();
        
        
        a2.sleep();
        a3.sleep();
        
        
        
        
    }
    
}
