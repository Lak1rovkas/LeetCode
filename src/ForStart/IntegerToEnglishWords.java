package ForStart;

import java.util.HashMap;
import java.util.TreeMap;

public class IntegerToEnglishWords {

    private static final TreeMap<Integer, String> map = new TreeMap<>();

    static{
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(15, "fifteen");
        map.put(16, "sixteen");
        map.put(17, "seventeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
        map.put(20, "twenty");
        map.put(30, "thirty");
        map.put(40, "forty");
        map.put(50, "fifty");
        map.put(60, "sixty");
        map.put(70, "seventy");
        map.put(80, "eighty");
        map.put(90, "ninety");
        map.put(100, "hundred");
        map.put(1000, "thousand");
        map.put(1000000, "million");
    }

    public static String intToEnglishWords(int num){

        int number;
        int millionCounter;
        int thousandCounter;

        for(millionCounter = 0; num > 1000000;){
            millionCounter++;
            number = map.floorKey(num);
            if(number == num){
                return map.get(millionCounter) + map.get(num);
            }
            return map.get(millionCounter) + map.get(number) + intToEnglishWords(num - 1000000);
        }

        for(int i = 0; num >= 1000;){
            i++;
            number = map.floorKey(num);
            if(number == num){
                return map.get(i) + map.get(num);
            }
            if(num - 1000 < 999){
                return map.get(i) + map.get(number);
            }
            num -= 1000;
        }

        for (int i = 0; num >= 100;){
            i++;
            number = map.floorKey(num);
            if(number == num){
                return map.get(i) + map.get(num);
            }
            if(num - 100 < 99){
                return map.get(i) + map.get(number);
            }
            num -= 100;
        }

        for(int i = 0; num > 10;){
            i++;
            number = map.floorKey(num);
            if(number == num){
                return map.get(i) + map.get(num);
            }
            if(num - 10 < 9){
                return map.get(i) + map.get(number);
            }
            num -= 10;
        }
        return "Error";
    }
}
