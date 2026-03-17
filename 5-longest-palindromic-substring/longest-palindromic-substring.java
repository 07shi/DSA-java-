class Solution {
    public boolean isPallindrome(String s ) {
        // ........
        int l = 0 ; 
        int e = s.length() - 1 ;
        while (l < e ) {
            if (s.charAt(l) != s.charAt(e)) return false ; 
            l++ ; 
            e-- ;
        }
        return true ; 
    }
    public String longestPalindrome(String s) {
        String ans = "" ; 
        
        if (s == null || s.length() == 0) return "" ; 
        //if (s.length() == 1 ) return s ; 
        for (int i = 0 ; i < s.length() ; i++ ) {
            for (int j = i +1 ; j <= s.length() ; j++ ) {
                String temp = s.substring(i,j) ; 
                if (isPallindrome(temp) && temp.length() > ans.length() ) {
                    ans = temp ; 
                }
            }
        }
        return ans ; 
    }
}