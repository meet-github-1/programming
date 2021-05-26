import java.util.*;
class Solution{
    public static String intToRoman(int num) {
        int arr[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String arr1[]={"I","IV","V","X","XL","L","XC","C","CD","D","CM","M"};
        int i=12;
        String s="";
        while(num!=0){
            int div=num/arr[i];
            num=num%arr[i];
            while(div!=0){
                s=s+arr1[i];
                div--;
            }
            i--;
        }
        return s;
    }
    public static void main(String[] args){
          Scanner in=new Scanner(System.in);
         int num=in.nextInt();
         System.out.println(intToRoman(num));
    }
}