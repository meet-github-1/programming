import java.io.*;
class FileDemo{
  public static void main(String[] args)throws Exception{
	  //File f=new File("genesis/kmit");
	  //File f1=new File("genesis/kmit/abc.txt");
	  File f2=new File("C:\\Users\\SARDAR MANMEET SINGH\\Downloads\\ball_image.jpeg");
	  File f3=new File("copy of ball_image.jpeg");
	  FileInputStream fs=new FileInputStream(f2);
	  FileOutputStream fos=new FileOutputStream(f3);
	  int b=fs.read();
	  while(b!=-1){
		  fos.write((byte)b);
		  b=fs.read();
	  }
	  System.out.println(f2.length());
	  System.out.println(f3.length());
	  //f.mkdirs();
	  //f1.createNewFile();
	  //System.out.println(f.exists());
	  //f.createNewFile();
	  //f1.setReadable(false);
	  //f1.setWritable(false);06:09
	  //System.out.println(f2.length());
	  //System.out.println(f1.getUsableSpace());
	  //System.out.println(f.exists());
	   //System.out.println(f1.getAbsolutePath());
	    //System.out.println(f1.getPath());


  }
}
     