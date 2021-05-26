import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class maxarea {

    // Complete the largestRectangle function below.
    static long largestRectangle(int[] h) {
        Map<Integer,List<Integer>> mp=new TreeMap<Integer,List<Integer>>();
        int len=h.length;
        long mxi=0;
        for(int i=0;i<len;i++){
            List<Integer> l=mp.get(h[i]);
            if(l==null){

                l=new ArrayList<Integer>();
                l.add(i);
                mp.put(h[i],l);
            }
            else{
                l.add(i);
            }
        }
        //System.out.println(mp.get(h[0]));
        Set<Integer> sr=mp.keySet();
        for(int e:sr){
            for(int i:mp.get(e)){
                int end=len-1;
                int start=0;
                boolean p=true;
                for(int br:sr){
                    if(br==e){
                        break;
                    }
                    for(int j:mp.get(br)){
                        if(j<end && j>i){
                            end=j-1;
                        }
                        if(j>=start && j<i){
                            start=j+1;

                        }
                    }

                }
                //System.out.println(e+" "+start+" "+end);
               long rxi=((end+1)-start)*e;
                if(rxi>mxi){
                    mxi=rxi;
                }
                


            }

        }
        return mxi;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();

        int[] h = new int[n];

        //String[] hItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int hItem = scanner.nextInt();
            h[i] = hItem;
        }

        long result = largestRectangle(h);
        System.out.println(result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        //scanner.close();
    }
}
