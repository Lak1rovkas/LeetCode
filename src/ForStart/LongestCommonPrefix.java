package ForStart;

public class LongestCommonPrefix {
    public String longestCommonPrefixMethod(String[] strs) {
        String prefix = strs[0];

        int finalCounter = prefix.length();

        if(strs.length == 1 || prefix.isEmpty()){
            return prefix;
        }

        for(int i = 1; i < strs.length; i++){
            int counter = 0;
            for(int j = 0; j < finalCounter && j < strs[i].length(); j++){
                if(strs[i].charAt(j) == prefix.charAt(j)){
                    counter++;
                }
                else if(strs[i].charAt(j) != prefix.charAt(j)){
                    if(counter <= finalCounter){
                        finalCounter = counter;
                    }
                }
                if(counter == 0){
                    return "";
                }
            }
            if(counter <= finalCounter){
                finalCounter = counter;
            }
        }

        return strs[0].substring(0, finalCounter);
    }
}
