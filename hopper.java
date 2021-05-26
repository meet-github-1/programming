import java.util.*;
class hopper{
 static boolean ishoppable(int arr[],int ind){
           if(ind+arr[ind]>=arr.length){
           	return true;
           }
           else if(arr[ind]==0){
           	return false;
           }
           else{
            for(int i=1;i<=arr[ind];i++){
                if(ishoppable(arr,ind+i)){
                	return true;

}
             }
         }
             return false;

 }
	 public static void main(String[] args){
	       Scanner in=new Scanner(System.in);
	       String  numar[]=in.nextLine().split(" ");
	       int ar[]=Arrays.asList(numar).stream().mapToInt(Integer::parseInt).toArray();
	       System.out.println(ishoppable(ar,0));


	 }
}