import java.util.*;
class findconsecutivesum{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int st=((int)n/4)-2;
        int ed=(int)n/2;
        int nm,bnm;
        for(int i=st;i<=ed;i++){
            nm=(i*(i+1))/2;
            bnm=((i+4)*(i+4+1))/2;
            //System.out.println(nm+" "+bnm);
            if(bnm-nm==n){
                System.out.println(1);
                System.out.println(i+1);
                System.exit(1);
            }
        }
        System.out.println(0);
    }
}