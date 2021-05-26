import java.util.*;
import java.lang.Math;
class mega{
  static int count=0;
    static void generateNextPalindromeUtil(int num[], int n)  
    { 
        int mid = n / 2;
        int i = mid - 1; 
        int j = (n % 2 == 0) ? mid : mid + 1; 
        boolean leftsmaller = false; 
        while (i >= 0 && num[i] == num[j])  
        { 
            i--; 
            j++; 
        } 
        if (i < 0 || num[i] < num[j])  
        { 
            leftsmaller = true; 
        } 
        while (i >= 0)  
        { 
            num[j++] = num[i--]; 
        } 
        if (leftsmaller)  
        { 
            int carry = 1; 
            if (n % 2 == 1) { 
                num[mid] += 1; 
                carry = num[mid] / 10; 
                num[mid] %= 10; 
            } 
            i = mid - 1; 
            j = (n % 2 == 0 ? mid : mid + 1);
            while (i >= 0 && carry>0)   
            { 
                num[i] = num[i] + carry; 
                carry = num[i] / 10; 
                num[i] %= 10; 
                num[j] = num[i];
                i--; 
                j++; 
            } 
  
        } 
    } 
    static void generateNextPalindrome(int num[], int n)  
    { 
        if (isAll9(num, n)) { 
            return ;
                
        } 
        else { 
            generateNextPalindromeUtil(num, n); 
            return ; 
        } 
    }
    static boolean isAll9(int num[], int n) { 
        for (int i = 0; i < n; i++) 
            if (num[i] != 9) 
                return false; 
        return true; 
    } 
    static int  isAll91(String s){
      int count9=0;
      int len=s.length();
      for(int i=0;i<len;i++){
             if(s.charAt(i)=='9'){
              count9++;
             }

      }
      //System.out.println(count9+" "+len+" "+s);
      if(count9==len){
        return 1;
      }
      System.out.println(s.charAt(0)+" "+s.charAt(len-1));
      if(!(((s.charAt(0)=='9') && (s.charAt(len-1)=='9'))) && (count9==len-2)){
        return 3;
      }
      if(s.charAt(len/2)=='9'){
        return 0;
      }
        return 2;
    }
    static boolean checkpalindrome(long r){
        String s=Long.toString(r);
        StringBuilder re=new StringBuilder(s);
        if(re.reverse().toString().equals(s)){
            return true;
        }
        return false;
        
        
        
    }
    static long moveodd(long num,int add,int ninadd,long h){
      while(true){
              if(num>h){
                return num;
              }
              if(checkpalindrome(num*num)){
                  count++;
          }
              int xy=isAll91(Long.toString(num)); 
              System.out.println(xy+" "+num);
              if(xy==1){
                   if(checkpalindrome(num*num)){
                    count++;
                  }
                  num=num+2;
                   return num;
              }
              else if(xy==3) num=num+11;
              else if(xy==0) num=num+ninadd;
              else num=num+add;
            }
    }
    static long moveeven(long num,int add,int ninadd,long h){
      while(true){
        if(num>h){
                return num;
              }
          if(checkpalindrome(num*num)){
            count++;
          }
          int xy=isAll91(Long.toString(num));
          System.out.println(xy+" "+num);
          if(xy==1){
            if(checkpalindrome(num*num)){
              count++;
            }
            num=num+2;
            return num;
          }
          else if(xy==3) num=num+11;
          else if(xy==0){
            num=num+ninadd;
          }
          else{
            num=num+add;
          }
          //System.out.println(num);
      }
    }
    public static void main(String[] args){
          Scanner in=new Scanner(System.in);
          long sq;
          long l=(long)(Math.sqrt(in.nextLong()));
          long r=(long)(Math.sqrt(in.nextLong()));
          String ar[]=Long.toString(l).split("");
          int arr[]=Arrays.asList(ar).stream().mapToInt(Integer::parseInt).toArray();
          if(!(arr.length==1) && !(checkpalindrome(l))){
          generateNextPalindrome(arr, arr.length);
        }
          String s="";
          for(int i:arr){
            s=s+Integer.toString(i);
          }
          l=Long.parseLong(s);
          int x=0,div=0;
          int prev=0;
          int c=0;
          System.out.println(l+" "+r);
          while(l<=r){
            x=Long.toString(l).length();
            if(x%2!=0){
              div=(int)Math.pow(10,(int)x/2);
              prev=(int)(div/10);
              if(div==1000){
                prev=110;
              }
               l=moveodd(l,div,div+prev,r);
               System.out.println(l+" "+div+" "+div+prev);

            }
            else{
             div=(x/2)-1;
             div=11*((int)Math.pow(10,div));
             prev=(int)(div/10);
             l=moveeven(l,div,prev,r);
            }
            System.out.println(l);
          }
          System.out.println(count);
    }
}