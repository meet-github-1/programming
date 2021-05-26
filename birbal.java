import java.util.*;
class birbal{
    static Set<String> l1=new HashSet<String>();
       static String swap(String s,int i,int j){
             char arr[]=s.toCharArray();
              char temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              return String.valueOf(arr);
                     }
       static void per(String s,int l,int h){
        if(l==h){
            l1.add(s);
        }
        else{
           for(int i=l;i<=h;i++){
                s=swap(s,l,i);
                per(s,l+1,h);
                s=swap(s,l,i);

           }
           }


       }
	static boolean getindex(String trav,int arr[][],int n){
		int gol=0;
		for(int i=0;i<n;i++){
			gol=gol+(arr[Integer.parseInt(String.valueOf(trav.charAt(i)))][0]-arr[Integer.parseInt(String.valueOf(trav.charAt(i)))][1]);
			if(gol<0){
				return false;
			}


		}
			return true;

	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[][]=new int[n][2];
		String getper="";
		for(int i=0;i<n;i++){
			arr[i][0]=in.nextInt();
			arr[i][1]=in.nextInt();
			getper=getper+i;
		}
		per(getper,0,n-1);
		for(String s:l1){
			if(getindex(s,arr,n)){
				System.out.println(s.charAt(0));
				System.exit(1);
			}
		}
		System.out.println("-1");

	}
}