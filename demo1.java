class parent {
  public void m1()  {
    System.out.println("parent m1 called");
    }
}
 
class child1 extends parent {
  public void m1()  {
    System.out.println("child1 m1 called");
    }  
}
 
class child2 extends parent {
  public void m1() {
    System.out.println("child2 m1 called");
    }
  public void m2() {
    System.out.println("child2 m2 called");
    }
}
 
class demo1{
  public static void main(String[] args) {
    parent pobj = new parent();
    pobj.m1();//compile ???
 
    child2 cobj = new child2(); // replace parent with Object and test
    cobj.m1();
 
    pobj = cobj;//base class reference pointing to derived class object
 
    cobj = new child2();//
    cobj.m1();
    cobj.m2();
  }
}