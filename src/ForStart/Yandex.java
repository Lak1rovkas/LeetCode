package ForStart;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Yandex{
    public void main() throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberOfMembers = scanner.nextInt();
        int sumOfDayAndMonthBirthday = 0;


        String[] members = new String[numberOfMembers];
        String[] partsOfDataMembers = new String[0];

        String englishLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result;


        HashSet<Character> hashSet = new HashSet<>();

        for(int i = 0; i < numberOfMembers; i++){
            members[i] = br.readLine();
            partsOfDataMembers = members[i].split(",");
        }

        for(int i = 0; i < members.length; i++){
            int j = 0;
            while(j < 3){
                for(int index = 0; index < partsOfDataMembers[i].length(); index++){
                    hashSet.add(partsOfDataMembers[j].charAt(index));
                }
                j++;
            }
            for(j = 3; j < 5; j++){
                if(partsOfDataMembers[j].length() == 1){
                    sumOfDayAndMonthBirthday += Integer.parseInt(partsOfDataMembers[j]);
                }
                else{
                    sumOfDayAndMonthBirthday = sumOfDayAndMonthBirthday + partsOfDataMembers[j].charAt(0) - '0' + partsOfDataMembers[j].charAt(1) - '0';
                }
            }
        }
        result = Integer.toHexString(hashSet.size() + sumOfDayAndMonthBirthday * 64 + ((englishLetters.indexOf(members[0].charAt(0)) + 1) * 256));
        System.out.println(result.length() >= 4 ? result.substring(result.length() - 3) : result);
    }
}
