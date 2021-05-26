import java.util.*;
public class dirindfriend{
     public static void fun(int arr[],int trep,int rep,int len){
        for(int i=0;i<len;i++){
            if(arr[i]==trep){
                arr[i]=rep;
            }
        }
    }
    public static int findCircleNum(int[][] M) {
        int len=M[0].length;
        int dec[]=new int[len];
        for(int i=0;i<len;i++){
            dec[i]=i;
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(M[i][j]==1){
                    fun(dec,dec[j],dec[i],len);
                }
            }
        }
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<len;i++){
            set.add(dec[i]);
        }
        return(set.size());
        
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int m[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m[i][j]=in.nextInt();
            }
        }
        System.out.println(findCircleNum(m));

    }
}