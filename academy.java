import java.util.*;
import java.lang.*;
class academy{
    public static void main(String[] args){
          Scanner in=new Scanner(System.in);
          int n=in.nextInt();
          int play[]=new int[n];
          for(int i=0;i<n;i++){
             play[i]=in.nextInt();
          }
          int nma=in.nextInt();
          int score[]=new int[nma];
          for(int i=0;i<nma;i++){
          	score[i]=in.nextInt();
          }
          int rank,prev,flag=0;
          for(int scr:score){
          	rank=0;
          	prev=-1;
          	for(int i=0;i<n;i++){
          		if(play[i]<scr){
          			if(scr==prev){
          			System.out.println(rank);
          		}
          		else{
          			System.out.println(++rank);
          		}

          			flag=1;
          			break;
          		}
          		else{
          			if(play[i]==prev){
          				continue;
          			}
          			else{
          				rank+=1;
          			}
          		}
          		prev=play[i];
          	}
          	//System.out.println(rank);
          	if(flag==0){
          	System.out.println(++rank);
          }
          }
    }
	
}