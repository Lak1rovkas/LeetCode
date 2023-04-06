package ForStart;

public class IsSubquence {
    public boolean isSubsequence(String s, String t) {
        int counter = 0;

        if(s.length() == 0) return true;
        if(t.length() == 0) return false;

        for(int i = 0; i < t.length(); i++){
            if(counter == s.length()) return true;
            if(t.charAt(i) == s.charAt(counter)){
                counter++;
            }
        }
        return counter == s.length();
    }
}
