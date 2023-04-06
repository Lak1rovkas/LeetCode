package ForStart;


public class FindPivotIndex {
    public int pivotIndex(int [] nums) {
        int resultBeforePivotIndex = 0;
        int resultAfterPivotIndex = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                resultBeforePivotIndex += nums[j];
            }
            for(int k = nums.length - 1; k > i; k--){
                resultAfterPivotIndex += nums[k];
            }
            if(resultBeforePivotIndex == resultAfterPivotIndex){
                return i;
            }
            else {
                resultBeforePivotIndex = 0;
                resultAfterPivotIndex = 0;
            }
        }
        return -1;
    }
}
