public class BoxOrvararg{
   static void go(Byte x,Byte y){
     System.out.println("Byte" +" "+"Byte");
     }
   static void go(byte...x){
     System.out.println("Byte"+" "+"Byte");
     }
    public static void main(String[] args){
         byte b=5;
	 go(b,b);
	 }}
     