package ForStart;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String a = x + "";

        int counter = 0;
        int index = 0;

        char[] arrayOfXNumber = a.toCharArray();
        char[] reverseArrayOfXNumber = new char[arrayOfXNumber.length];

        for(int i = reverseArrayOfXNumber.length - 1; i >= 0; i--, index++){
            reverseArrayOfXNumber[i] = arrayOfXNumber[index];
        }

        for(int i = 0; i < arrayOfXNumber.length; i++){
            if(arrayOfXNumber[i] == reverseArrayOfXNumber[i]){
                counter++;
            }
        }
        return counter == arrayOfXNumber.length;
    }
}
