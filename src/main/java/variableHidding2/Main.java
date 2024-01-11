
package variableHidding2;


class Parent {
    int age  = 38;
}

class Child extends Parent {
    int age = 14;
}

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        System.out.println("Parent age is " + p.age); // 38
        System.out.println("child age is "+ c.age); // 14
    }
}
