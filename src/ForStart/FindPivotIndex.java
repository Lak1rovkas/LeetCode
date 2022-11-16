package ForStart;

public class FindPivotIndex {
    public int pivotIndex(int[] numbers){

        int resultLeftSide = 0;
        int resultRightSide = 0;

        for(int i = 0; i < numbers.length;i++){
            if(i != 0) {
                for (int indexLeftSide = 0; indexLeftSide < i; indexLeftSide++) {
                    resultLeftSide += numbers[indexLeftSide];
                }
            }
            if(i != numbers.length - 1) {
                for (int indexRightSide = i + 1; indexRightSide < numbers.length; indexRightSide++) {
                    resultRightSide += numbers[indexRightSide];
                }
            }
            if(resultLeftSide == resultRightSide){
                return i;
            }
            else{
                resultLeftSide = 0;
                resultRightSide = 0;
            }
        }
        return -1;
    }
}
