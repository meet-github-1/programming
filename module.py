/*Write a Java Program to swap two numbers using bitwise operators 
Input 
2 3
output
3 2
*/
import java.util.*;
class Test{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int i=in.nextInt();
        int j=in.nextInt();
        int k=i;
        i=i|j;
        j=k|i
        System.out.println(i+" "+j);
        
    }
}
