/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class jumpingcatepillar{
    static int getremaining(int jump[],int lf){
        boolean vis[]=new boolean[lf+1];
        int count=0,z;
        for(int jm:jump){
            for(int k=1;k*jm<=lf;k++){
                z=k*jm;
                //System.out.println(vis[z]);
                if(!vis[z]) {
                    count++;
                    vis[z]=true;
                    }
                
            }
        }
        return lf-count;
    }
	public static void main (String[] args)throws IOException{
		//code
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bf.readLine());
		int fin[]=new int[n];
		int x=0;
		while(n-->0){
		    String size[]=bf.readLine().split(" ");
		    int leaves=Integer.parseInt(size[0]);
		    int njumps=Integer.parseInt(size[1]);
		    int jump[]=new int[njumps];
		    String jp[]=bf.readLine().split(" ");
		    for(int i=0;i<njumps;i++){
		        jump[i]=Integer.parseInt(jp[i]);
		    }
		    fin[x]=getremaining(jump,leaves);
		    x++;
		    
		    
		}
		for(int r:fin){
		    System.out.println(r);
		}
	}
}