import java.util.*;
class spir{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int c=in.nextInt();
        int arr[][]=new int[n][c];
        for(int i=0;i<n;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=in.nextInt();
                
            }
        }
        int j=0,k=-1,i=0;
        boolean row=true,coldown=true,rowleft=true;
        int prev1=-1,prev2=-1;
        int rh=c,ch=n-1,count=1;
		int fin[]=new int[n*c];
        while(i<n*c){
            if(row){
                if(rowleft){
                    k++;
					fin[i]=arr[j][k];
                    if(count==rh){
						count=0;
                        row=false;
        
                    }
                }
                else{
                    k--;
					fin[i]=arr[j][k];
                    if(count==rh-1){
						count=0;
                        row=false;
                        rh=rh-2;
                    }
                }
            
            }
            else{
                if(coldown){
                    j++;
				   fin[i]=arr[j][k];
                    if(count==ch){
						count=0;
                        row=true;
                        coldown=false;
                        rowleft=false;
                        
                    }
                }
                else{
                    j--;
					fin[i]=arr[j][k];
                    if(count==ch-1){
						count=0;
                        row=true;
                        coldown=true;
                        rowleft=true;
                        ch=ch-2;
                        
                    }
                }
                    
                }
				i++;
				count++;
                
            }
            int count1=0;
		for(int z:fin){
                if(count1%c==0 && count1!=0){
                    System.out.println();
                }
                System.out.print(z+" ");
                count1++;
            }
                    
    }
}


