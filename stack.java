import java.util.*;
import java.lang.*;
import java.io.*;
class stack{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Stack<Integer> s=new Stack<Integer>();
        int n=-1;
        int el=0;
        int del=0;
        int min=99999;
        while(n!=0){
            n=in.nextInt();
            switch(n){
                case 1:
                    el=in.nextInt();
                    if(el<min){
                        s.push(min);
                        min=el;
                    }
                    s.push(el);
                   break;
                case 2:
                    del=s.pop();
                    if(del==min){
                        min=s.pop();
                        
                    }
                    break;
                case 3:
                    System.out.println(s.peek());
                    break;
                case 4:
                    System.out.println(min);
                    break;
            }
        }
    }
}