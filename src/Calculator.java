import java.util.Scanner;

public class Calculator {
    public double powerint(int num1, int num2) {
        return Math.pow(num1, num2);
    }
    /* Method Overloading (multiple methods of a same name in a class) it increases the readability of code
      It is done by 2 ways :-   1) By changing no. of arguments.
                                2) By changing the datatype of variables in a method.
     method overloading is not possible by changing the return type of method only because of ambiguity. as Java can't determine which method needs to be called
     We can have multiple main methods in a class by method overloading but JVM calls only main which have string array as arguments only
     if subclass has the same method in a parent class, it is known as Overriding.
     It is used for Runtime polymorphism.
     Method must have same name and parameter as a parent class and must be IS a relationship(Inheritance)
     super keyword in java is a reference Variable used to refer immediate parent class object.
    */
    public double powerint(double num1, double num2) {
        return Math.pow(num1, num2);
    }

}
class term{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        double num1=  obj.nextDouble();
        double num2= obj.nextDouble();
        Calculator obj1= new Calculator();
        double c= obj1.powerint((int) num1, (int) num2);
        System.out.println(c);
        Calculator obj2= new Calculator();
        double d= obj2.powerint(num1,num2);
        System.out.println(d);
    }
}
