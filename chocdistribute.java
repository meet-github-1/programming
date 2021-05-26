import java.util.*;
class chocdistribute{
    public int chocolate(int[] grade) {
        //write your code here
        int n=grade.length;
        int dis[]=new int[n];
        Arrays.fill(dis,1);
        for(int i=1;i<n;i++){
            dis[i]=(grade[i]>grade[i-1])?dis[i-1]+1:dis[i];
        }
        for(int i=n-2;i>=0;i--){
            if(grade[i]>grade[i+1]){
                dis[i]=dis[i]>dis[i+1]+1?dis[i]:dis[i+1]+1;
            }
        }
        return(Arrays.stream(dis).sum());
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println(chocolate(Arrays.asList(in.nextLine().split(" ")).stream().mapToInt(Integer::parseInt).toArrays()));
    }
}