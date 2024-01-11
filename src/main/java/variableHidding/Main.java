
package variableHidding;


public class Main {
  public static void main(String[] args) {
    Person p = new Teacher();
      System.out.println("person class jonno "+p.name);
    // This will print "John Doe" because p is of type Person, even though Teacher defines its own "name" variable.

    Teacher t = new Teacher();
      System.out.println("teacher class jonno "+t.name);
    // This will print "Ms. Smith" because t is of type Teacher.
  }
}
