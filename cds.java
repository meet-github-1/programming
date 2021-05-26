import java.io.*;
import java.util.*;
class conversion
{
	String fname;
	String fname1;
	Map<String,Character> map=new HashMap<String,Character>();
	conversion(String filename1,String filename2){
         fname=filename1;
		 fname1=filename2;
		 buildmap();
		 transform();
	}
	void buildmap(){
		map.put("GCT",'A');map.put("GCC",'A');map.put("GCA",'A');map.put("GCG",'A');
		map.put("GCN",'A');map.put("CGT",'R');map.put("CGC",'R');map.put("CGA",'R');map.put("CGG",'R');map.put("AGA",'R');map.put("AGG",'R');map.put("CGN",'R');map.put("AGR",'R');
		map.put("AAT",'N');map.put("AAC",'N');map.put("GAT",'D');
		map.put("GAC",'D');map.put("GAY",'D');map.put("TGT",'C');map.put("TGC",'C');
		map.put("CAA",'Q');map.put("CAG",'Q');map.put("CAR",'Q');map.put("GAA",'E');
		map.put("GAG",'E');map.put("GAR",'E');map.put("GGT",'G');map.put("GGC",'G');map.put("GGA",'G');
		map.put("GGG",'G');map.put("GGN",'G');map.put("CAT",'H');map.put("CAC",'H');map.put("CAY",'H');
		map.put("ATT",'I');map.put("ATC",'I');map.put("ATA",'I');map.put("ATH",'I');
		map.put("TTA",'L');map.put("TTG",'L');map.put("CTT",'L');map.put("CTC",'L');map.put("CTA",'L');
		map.put("CTG",'L');map.put("YTR",'L');map.put("CTN",'L');map.put("AAA",'K');map.put("AAG",'K');
		map.put("AAR",'K');map.put("ATG",'M');map.put("TTT",'F');map.put("TTC",'F');
		map.put("ATG",'I');map.put("GTG",'V');
		map.put("TTY",'F');map.put("CCT",'P');map.put("CCC",'P');map.put("CCA",'P');map.put("CCG",'P');
		map.put("CCN",'P');map.put("TCT",'S');map.put("TCC",'S');map.put("TCA",'S');map.put("TCG",'S');
		map.put("AGT",'S');map.put("AGC",'S');map.put("TCN",'S');map.put("AGY",'S');map.put("ACT",'T');
		map.put("ACC",'T');map.put("ACA",'T');map.put("ACG",'T');map.put("ACN",'T');map.put("TGG",'W');
		map.put("TAT",'Y');map.put("TAC",'Y');map.put("TAY",'Y');map.put("GTT",'V');map.put("GTC",'V');
		map.put("GTA",'V');map.put("GTN",'V');
	}
	void transform(){
		try{
        Character c=map.get("GCT");
		FileReader fr=new FileReader(fname);
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
		FileOutputStream fos=new FileOutputStream(fname1);
		String str="";
		//System.out.println("pop");
		while(!s.equals("null")){
			//System.out.println(s);
			int len=s.length();
			for(int i=0;i<len;i=i+1){
				char c1=s.charAt(i);
				if(str.length()==3){
					//System.out.println("pop1");
					//System.out.println(str);
					str=str.toUpperCase();
					char c2=(Character)map.getOrDefault(str,'X');
					//System.out.println("pop1");
					fos.write((byte)c2);
					//System.out.println("pop1");
					str="";

				}
				//System.out.println("pop1");
                if((!Character.isDigit(c1)) && !(c1==' ')){
                    //System.out.println("pop1");
					str=str+c1;
					
				}
				
			}
			s=br.readLine();
			//System.out.println(s);
		}
		}
		catch(Exception ae){
			System.out.println("pop");
			System.out.println(ae.getMessage());
		}
	}

}
class cds{
	public static void main(String[] args){
	conversion c1=new conversion("gene1.txt","proteingene1.txt");
	System.out.println("1");
	}

}
