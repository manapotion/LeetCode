public class Solution {
    public static boolean wordBreak(String s, Set<String> dict) {
        boolean[] t = new boolean[s.length()+1];
        t[0] = true;
        for( int i=0; i<s.length(); i++ ) {
            if( !t[i] ) continue;
            for( String a: dict ) {
                int len = a.length();
                int end = i + len;
                if( end>s.length() || t[end] ) continue;
                if( s.substring( i, end ).equals(a) )
                    t[end] = true;
            }
        }
        return t[s.length()];
    }
}

