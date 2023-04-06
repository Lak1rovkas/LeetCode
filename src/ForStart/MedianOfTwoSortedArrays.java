package ForStart;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] finalArray = new int[nums1.length + nums2.length];

        boolean trigger = true;

        int index = 0;
        int temporaryValue;

        double resultIfOddNumberOfElementsInArray;

        for(int i = 0; i < finalArray.length; i++){
            if(i < nums1.length){
                finalArray[i] = nums1[i];
            }
            else{
                finalArray[i] = nums2[index];
                index++;
            }
        }


        while(trigger){
            trigger = false;
            for(int i = 0; i < finalArray.length - 1; i++){
                if(finalArray[i] > finalArray[i + 1]){
                    temporaryValue = finalArray[i];
                    finalArray[i] = finalArray[i + 1];
                    finalArray[i + 1] = temporaryValue;
                    trigger = true;
                }
            }

        }

        if(finalArray.length % 2 == 1){
            index = finalArray.length / 2;
        }
        else{
            index = (finalArray.length - 1) / 2;
            resultIfOddNumberOfElementsInArray = (double) (finalArray[index] + finalArray[(index + 1)]) / 2;
            return resultIfOddNumberOfElementsInArray;
        }

        return (double) finalArray[index];
    }
}
