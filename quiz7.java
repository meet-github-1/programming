class Test

{

  public static void main(String [] args) {

    StringBuffer sb1 = new StringBuffer("kmit");

    StringBuffer sb2 = new StringBuffer("Ngit");

      StringBuffer sb3 = sb1=new StringBuffer("Ngit");


 

    System.out.println("sb1 = " + sb1);

    System.out.println("sb2 = " + sb2);

      System.out.println("sb2 = " + sb3);

  }

}