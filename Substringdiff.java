import java.util.*;
import java.lang.*;
class Substringdiff{
    public static int countSubstrings(String S, String T) {
        var T_chars = T.toCharArray();
        var trie    = new Trie();
        
        for (int i = 0; i < T_chars.length; i++)
            trie.insert(T_chars, i);
        
        int ans     = 0;
        var S_chars = S.toCharArray();
        
        for (int i = 0; i < S_chars.length; i++)
            ans += trie.search(S_chars, i, 1);
        
        return ans;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String t=in.next();
        System.out.println(countSubstrings(s,t));
    }
}

class Trie {
    Map<Character, Trie> map   = new HashMap<>();
    int                  count = 0;
    
    public void insert(char[] arr, int pos) {
        System.out.println(new String(arr));
        this.count++;
        
        if (arr.length == pos)
            return;
        
        if (!map.containsKey(arr[pos]))
            map.put(arr[pos], new Trie());
        
        map.get(arr[pos]).insert(arr, pos + 1);
    }
    
    // aba
    // abac
    
    public int search(char[] arr, int pos, int attempts) {
        if (arr.length == pos)
            return attempts == 0 ? this.count : 0;
        
        int ans = 0;
        
        if (attempts == 0)
            ans = this.count;
        
        int noSkip = 0;
        if (map.containsKey(arr[pos])) {
            noSkip = map.get(arr[pos]).search(arr, pos + 1, attempts);
        }
        
        int skip = 0;
        if (attempts != 0) {
            for (var e : map.entrySet()) {
                if (e.getKey() != arr[pos]) {
                    skip += e.getValue().search(arr, pos + 1, 0);
                }
            }
        }
        
        return ans + skip + noSkip;
    }
}