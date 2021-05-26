import java.util.*;
import java.lang.Math;
class envelop{
	static void sort2darray(int arr[][]){
		Arrays.sort(arr,new Comparator<int[]>(){
			public int compare(int entry1[],int entry2[]){
                       if(entry1[0]==entry2[0]){
                       	    return entry1[1]-entry2[1];
                       }
                       return entry1[0]-entry2[0];

			}


		});

	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[][]=new int[n][2];
         for(int i=0;i<n;i++){
         	String ar[]=in.next().split(",");
         	arr[i][0]=Integer.parseInt(ar[0]);
         	arr[i][1]=Integer.parseInt(ar[1]);

         }
         sort2darray(arr);
         int max=1,j=0;;
         int arr1[]=new int[n];
         for(int i=0;i<n;i++){
         	arr1[i]=1;
         	j=i-1;
         	while(j>=0){
         		if(arr[i][0]>arr[j][0] && arr[i][1]>arr[j][1]){
         			arr1[i]=Math.max(arr1[i],arr1[j]+1);
         		}
         		j--;
         	}
         	max=Math.max(arr1[i],max);
         	
         }
         System.out.println(max);
	}

}