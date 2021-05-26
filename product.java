import java.util.*;
class product{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        String str[]=s.nextLine().split(" ");
        int arr[]=new int[str.length];
        for(int i=0;i<str.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        int n=arr.length;
        int pro[]=new int[n];
        Arrays.fill(pro,1);
        int temp=1;
        for(int i=0;i<n;i++){
            pro[i]=temp;
            temp=temp*arr[i];
        }
        temp=1;
        for(int i=n-1;i>=0;i--){
            pro[i]=pro[i]*temp;
            temp=temp*arr[i];
        }
        for(int i=0;i<n;i++)
            System.out.print(pro[i]+" ");
    }
}