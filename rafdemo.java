import java.io.*;
class rafdemo{
public static void main(String[] args) throws Exception{
  RandomAccessFile r=new RandomAccessFile("abz.txt","rw");
  r.seek(6);
  System.out.println((char)r.read());
  System.out.println(r.getFilePointer());
  String c="z";
  r.write(c.getBytes());
  System.out.println("done");
}
}