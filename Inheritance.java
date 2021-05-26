/*Inheriting Methods
Rules for inheritance:
1. private members of the parent class cannot be inherited
2. Constructor, Initializers cannot be inherited
3. super -> members of the base class
4. this -> current class
 
 
Rules for overriding:
1. overriding method should have the same signature
2. return type should match or the return type of the overiding method should be a subclass of the return type of
the overridden method ---> law of co variance
3. Access modifier cannot be restricted
4.***************Exception*******************
 
 
Redeclaring private methods
 
 
Static Hiding in Methods
 
Final Methods
Inheritance In Variables
---> it is not possible , it will not give compilation issues , but print the value based on the reference type
 
*/
class Parent
{
    int i = 0;
    int m1(int x , int y)
    {
        System.out.println("Parent m1 called");
        return x+y;
    }
}
class child extends Parent
{
    int result ;
    int i = 100;
    int m2(int x , int y )
    {
        return x*y;
    }
     int m1(int x , int y)
    {
        System.out.println("Child m1 called");
        return x+y+20;
    }
}
class GrandChild extends child
{
    int m1(int h , int y)
    {
        return 100+h+y;
    }
}
class Inheritance
{
    public static void main(String [] args)
    {
        /*In Runtime polymorphism, method invocation is decided based on the object the reference variable
        is pointing to at the runtime*/
        Parent p = new Parent();
        p.m1(2,3);
        child c = new child();
        c.m1(2,3);
        child c1 = new GrandChild();
        c1.m1(90,10);
        Parent p2 = new child();
        p2.m1(6,7);
        Parent p3 = new GrandChild();
        p3.m1(200,2);
    }
}