package ForStart;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map map = new HashMap();
        for(int i = 0; i < s.length(); i++){
            if(map.put(s.charAt(i), i) != map.put(t.charAt(i) + "", i)){
                return false;
            }
        }
        return true;
    }
}
