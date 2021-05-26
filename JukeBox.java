class JukeBox{
Song playList [];
public static void main(String[] args)throws IOException{
   File f=new File("songs.csv")
   FileReader fr=new FileReader(f);
   BufferedReader br=new BufferReader(fr);
   String s=br.readLine();
   int count=0;
   while(s!=null){
     String[] ss=s.split(",")
     Song s=new Song(ss[1],ss[2],ss[4],ss[3]);
     playList[count]=s;
     count++;
     s=br.readLine();
   }
}