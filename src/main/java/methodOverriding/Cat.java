
package methodOverriding;

public class Cat extends Animal{
    @Override
    public void eat()
    {
        System.out.println("Cat.eat()");
    }
    public void sleep()
    {
        System.out.println("Cat.sleep()");
    }
}
