package ForStart;

public class IntegerToEnglishWordsVariantTwo {

    public static String intToEnglishWords(int num){
        String[] beforeTen = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] beforeTwenty = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] beforeHundred = new String[] {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        String result;

        if (num <= 0)
            return "Wrong number. Try again with number from 1 to 999999999999";

        else if(num < 10)
            return result = beforeTen[num].trim();

        else if (num < 20)
            return result = beforeTwenty[num - 10].trim();

        else if (num < 100)
            return result = beforeHundred[num / 10] + " " + intToEnglishWords(num % 10).trim();

        else if(num < 1000)
           return result = intToEnglishWords(num / 100) + " Hundred " + intToEnglishWords(num % 100).trim();

        else if (num < 1000000)
            return result = intToEnglishWords(num / 1000) + " Thousand " + intToEnglishWords(num % 1000).trim();

        else if (num < 1000000000)
            return result = intToEnglishWords(num / 1000000) + " Million " + intToEnglishWords(num % 1000000).trim();

        else
            return result = intToEnglishWords(num / 1000000000) + " Billion " + intToEnglishWords(num % 1000000000).trim();

    }
}
