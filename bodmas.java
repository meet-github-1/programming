import java.util.*;
import java.lang.*;
class bodmas{
    static boolean checknumeric(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch(NumberFormatException nm){
            return false;
        }
    }
    static  List<Integer> findans(String s){
        //System.out.println(s);
        List<Integer> l=new ArrayList<Integer>();
        if(checknumeric(s)){
            l.add(Integer.parseInt(s));
            //System.out.println(l);
            return l;
        }
        else{
            List<Integer> l1;
            List<Integer> l2;
            for(int i=0;i<s.length();i++){
                switch(s.charAt(i)){
                    case '+':
                        l1=findans(s.substring(0,i));
                        l2=findans(s.substring(i+1));
                        for(int i1:l1){
                            for(int j1:l2){
                                l.add(i1+j1);
                            }
                        }
                        break;
                    case '-':
                        l1=findans(s.substring(0,i));
                        l2=findans(s.substring(i+1));
                        for(int i1:l1){
                            for(int j1:l2){
                                l.add(i1-j1);
                            }
                        }
                        break;
                    case '*':
                        l1=findans(s.substring(0,i));
                        l2=findans(s.substring(i+1));
                        for(int i1:l1){
                            for(int j1:l2){
                                l.add(i1*j1);
                            }
                        }
                }
                
            }
            return l;
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int ln=s.length();
        List<Integer> l1=findans(s);
        Collections.sort(l1);
        System.out.println(l1);
    }
}