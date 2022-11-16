package ForStart;

public class RomanToInt {

    int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    public int romanToInt(String s) {

        int romanNumberLength = s.length();
        int intNumber = 0;

        int[] romanNumberInInt = new int[romanNumberLength];

        char[] romanNumber = new char[romanNumberLength];

        for(int i = 0; i < s.length(); i++){
            romanNumber[i] = s.charAt(i);
        }

        for(int i = 0; i < s.length(); i++){
            romanNumberInInt[i] = value(s.charAt(i));
        }

        for (int i = 0; i < romanNumberInInt.length; i++){
            if(i + 1 < romanNumberInInt.length){

                if (romanNumberInInt[i] == 1 &&(romanNumberInInt[i + 1] == 5 || romanNumberInInt[i + 1] == 10)){
                    intNumber = intNumber - romanNumberInInt[i];
                }
                else if (romanNumberInInt[i] == 10 &&(romanNumberInInt[i + 1] == 50 || romanNumberInInt[i + 1] == 100)){
                    intNumber = intNumber - romanNumberInInt[i];
                }
                else if (romanNumberInInt[i] == 100 &&(romanNumberInInt[i + 1] == 500 || romanNumberInInt[i + 1] == 1000)){
                    intNumber = intNumber - romanNumberInInt[i];
                }
                else{
                    intNumber = romanNumberInInt[i] + intNumber;
                }
            }
            if (i + 1 == romanNumberInInt.length){
                intNumber = romanNumberInInt[i] + intNumber;
            }
        }
        return intNumber;
    }
}
