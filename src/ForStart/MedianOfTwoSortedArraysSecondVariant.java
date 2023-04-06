package ForStart;

public class MedianOfTwoSortedArraysSecondVariant {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] finalArray = new int[nums1.length + nums2.length];

        int i = nums1.length - 1;
        int j = nums2.length - 1;
        int lastIndexOfFinalArray = nums1.length + nums2.length - 1;

        double resultIfOddNumberOfElementsInArray;

        while(lastIndexOfFinalArray >= 0){
            if(i < 0){
                int temp = nums2[j];
                finalArray[lastIndexOfFinalArray] = temp;
                j--;
            }
            else if(j < 0){
                int temp = nums1[i];
                finalArray[lastIndexOfFinalArray] = temp;
                i--;
            }
            else if(nums1[i] > nums2[j]){
                finalArray[lastIndexOfFinalArray] = nums1[i];
                i--;
            }
            else{
                finalArray[lastIndexOfFinalArray] = nums2[j];
                j--;
            }
            lastIndexOfFinalArray--;
        }

        if(finalArray.length % 2 == 0){
            int index = (finalArray.length - 1) / 2;
            resultIfOddNumberOfElementsInArray = (double) (finalArray[index] + finalArray[(index + 1)]) / 2;
            return resultIfOddNumberOfElementsInArray;
        }

        return (double) finalArray[finalArray.length / 2];
    }
}
