package ForStart;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> output = new ArrayList<>();
        output.add(1);
        for(int i = 1; i <= rowIndex; i++){
            ArrayList<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j = 0; j < output.size() - 1; j++){
                curr.add(output.get(j) + output.get(j + 1));
            }
            curr.add(1);
            output = curr;
        }
        return output;
    }
}
