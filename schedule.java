import java.util.*;
import java.lang.*;
class schedule{
	static List<String> l=new ArrayList<String>();
	static int find(int r[],int x,int y){
		if(r[0]==x && r[1]==y){
			//System.out.println(x+" "+y);
			return 0;
		}
		if((r[0]>x && r[1]>x) && (r[0]<y && r[1]<y)){
			return 0;
		}
		if((x>r[0] && x<r[1]) && (y>r[0] && y<r[1])){
			return 3;
		}
		if(x>r[0] && x<r[1]){
			return 1;
		}
		if(y>r[0] && y<r[1]){
		return 2;
	    }
	  	return 4;
	}
    static void getsorted(int arr[][],int r1,int r2){
    	String y="";
    	for(int[] r:arr){
    		int opt=find(r,r1,r2);
    		if(opt==1){
    			y="["+Integer.toString(r[0])+", "+Integer.toString(r1)+"]";
                l.add(y);
                //r1=9999999;
    		}
    		else if(opt==2){
    			y="["+Integer.toString(r2)+", "+Integer.toString(r[1])+"]";
    		    l.add(y);
    		    //r2=9999999;
    		}
    		else if(opt==3){
    			y="["+Integer.toString(r[0])+", "+Integer.toString(r1)+"]";
    			l.add(y);
    			y="["+Integer.toString(r2)+", "+Integer.toString(r[1])+"]";
    			l.add(y);
              
    		}
    		else if(opt==4){
    			y="["+Integer.toString(r[0])+", "+Integer.toString(r[1])+"]";
    		    l.add(y);
    		}
    	}
    	}
	public static void main(String[] args){
	     Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         int arr[][]=new int[n][2];
         for(int i=0;i<n;i++){
         	arr[i][0]=in.nextInt();
         	arr[i][1]=in.nextInt();
         }
          int m1=in.nextInt();
          int m2=in.nextInt();
          getsorted(arr,m1,m2);
          System.out.println(l);
	}
}