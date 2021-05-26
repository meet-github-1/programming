import java.util.*;
class ranking{
    static void traverse(int dfs[][],Map<String,Integer> map,Map<Integer,String> map1,String out[]){
        int start=map.get("Neil, Gogte.");
        boolean vis[]=new boolean[map.size()];
        int dis[]=new int[map.size()];
        Stack<Integer> s=new Stack<Integer>();
        s.push(start);
        /*for(int i=0;i<dfs.length;i++){
            for(int j=0;j<dfs[0].length;j++){
                System.out.print(dfs[i][j]+" ");
            }
            System.out.println();
        }*/
        //System.out.println(start);
        while(!s.empty()){
            int z=s.peek();
            s.pop();
            if(!vis[z]){
                vis[z]=true;
            }
            for(int i=0;i<dfs[z].length;i++){
                if(!vis[i] && dfs[z][i]==1){
                    s.push(i);
                    dis[i]=dis[z]+1;
                    vis[i]=true;
                    //System.out.println(z+" "+i+" "+Arrays.toString(dis));
                    
                }
            }
        }
        System.out.println(Arrays.toString(dis));
        for(int i=0;i<out.length;i++){
            int ind=map.get(out[i]);
            if(dis[ind]==0){
                System.out.println(out[i]+" "+"-1");
            }
            else{
            System.out.println(out[i]+" "+(dis[ind]));
        }
        }
    }
    static void makearray(int dfs[][],String l1[],Map<String,Integer> map,Map<Integer,String> map1,String out[]){
        //System.out.println(map);
        for(int i=0;i<l1.length;i++){
            String f=l1[i];
            String arr[]=f.split(":");
            String arr1[]=arr[0].split(",");
            for(int j=0;j<arr1.length-2;j=j+2){
                String x=arr1[j].trim()+","+arr1[j+1];
                for(int k=j+2;k<arr1.length;k=k+2){
                    String y=arr1[k].trim()+","+arr1[k+1];
                    dfs[map.get(x)][map.get(y)]=1;
                    dfs[map.get(y)][map.get(x)]=1;
                    
                }
            }
        }
        traverse(dfs,map,map1,out);
        
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String p="",q="";
        int n1,n2;
        Map<String,Integer> map=new HashMap<String,Integer>();
        Map<Integer,String> map1=new HashMap<Integer,String>();
        String ar[]=in.nextLine().split(" ");
        n1=Integer.parseInt(ar[0]);
        n2=Integer.parseInt(ar[1]);
        String l[]=new String[n1];
        int count=0;
        int count1=0;
        String out[]=new String[n2];
        for(int i=0;i<n1;i++){
            String s=in.nextLine();
            l[i]=s;
            String arr[]=s.split(":");
            //System.out.println(Arrays.toString(arr));
            String arr1[]=arr[0].split(",");
            //System.out.println(Arrays.toString(arr1));
            for(int j=0;j<arr1.length;j=j+2){
                arr1[j]=arr1[j].trim();
                String combined=arr1[j]+","+arr1[j+1];
                if(!map.containsKey(combined)){
                    map.put(combined,count++);
                    map1.put(count1++,combined);
                }
                
            }
            
        }
        for(int i=0;i<n2;i++){
            out[i]=in.nextLine();
            
        }
        int authors=map.size();
    int dfs[][]=new int[authors][authors];
    makearray(dfs,l,map,map1,out);
    }
}