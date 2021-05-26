import java.util.*;
import java.lang.*;
class itemrooms1{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int it=in.nextInt();
        int rm=in.nextInt();
        Integer its[]=new Integer[it];
        int rms[]=new int[rm];
        for(int i=0;i<it;i++){
            its[i]=in.nextInt();
        }
        for(int j=0;j<rm;j++){
            rms[j]=in.nextInt();
        }
        Arrays.sort(its,Collections.reverseOrder());
        int i=0,j=0;
        int count=0;
        boolean flag;
        while(i<it && j<rm){
            flag=false;
            if(its[i]<=rms[j]){
                its[i]=Integer.MIN_VALUE;
                rms[j]=Integer.MIN_VALUE;
                count++;
                flag=true;
            }
            if(flag){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        i=0;
        j=rm-1;
        //p
        while(i<it && j>=0){
            flag=false;
            if(its[i]==Integer.MIN_VALUE){
                i++;
                continue;
            }
            if(rms[j]==Integer.MIN_VALUE){
                j--;
                continue;
            }
            if(its[i]<=rms[j]){
                count++;
                flag=true;
            }
            if(flag){
                i++;
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println(count);
    }
}