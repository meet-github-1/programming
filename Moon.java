import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Moon{

    // Complete the journeyToMoon function below.
    static List<Integer> l;
    static boolean vis[] ;
    static int count=0;
    static void dfs(int n,List<ArrayList<Integer>> l,int st){
          if(vis[st]){
              return ;
          }
          vis[st]=true;
          for(int i:l.get(st)){
              if(!vis[i]){
                  count++;
                  dfs(n,l,i);
              }
          }
          return ;
    }
    static  long journeyToMoon(int n, int[][] astronaut) {
        l=new ArrayList<Integer>();
        vis=new boolean[n];
        ArrayList<Integer> l1;
        List<ArrayList<Integer>> l2=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            l2.add(new ArrayList<Integer>());
        } 
        for(int ar[]:astronaut){
            l2.get(ar[0]).add(ar[1]);
            l2.get(ar[1]).add(ar[0]);
        }
        for(int i=0;i<n;i++){
            count=0;
            if(!vis[i]){
                count++;
            }
            dfs(n,l2,i);
            if(count!=0){
                l.add(count);
            }
        }
        long prev=0;
        long sum=0;
        int len=l.size();
        for(int i=0;i<len;i++){
            int nw =l.get(i);
            prev=prev+(nw*(sum));
            sum+=nw;
        }
        return prev;
        


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] np = scanner.nextLine().split(" ");

        int n = Integer.parseInt(np[0]);

        int p = Integer.parseInt(np[1]);

        int[][] astronaut = new int[p][2];

        for (int i = 0; i < p; i++) {
            String[] astronautRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int astronautItem = Integer.parseInt(astronautRowItems[j]);
                astronaut[i][j] = astronautItem;
            }
        }

        long result = journeyToMoon(n, astronaut);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
