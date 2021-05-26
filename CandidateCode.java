/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s1=in.next();
        String s2=in.next();
        String arr1[]=s1.split(" ");
        String arr2[]=s2.split(" ");
        System.out.println("manmeet");
            int num1=Integer.parseInt(arr1[0]);
            int num2=Integer.parseInt(arr2[0]);
            int min=(int)num1/num2;
        for(int i=2;i<s1.length();i=i+2){
            num1=Integer.parseInt(arr1[i]);
            num2=Integer.parseInt(arr2[i]);
            int div=(int)(num1/num2);
            if(min<div){
                min=div;}
                System.out.println("manmeet");

           System.out.println("manmeet"); 
        }
        System.out.println(min);

   }
}
