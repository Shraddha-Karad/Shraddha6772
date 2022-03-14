package Collection;

import java.util.HashMap;
import java.util.Map;

public class CountLetterFrequency {

    public static void main(String[] args) {
        System.out.println(map("abacacdea"));
    }

    public static Map<Character, Integer> map(String phrase){
        Map<Character, Integer> frqMap = new HashMap<>(); 
        for(int i=0; i<phrase.length(); i++){
            frqMap.merge(phrase.charAt(i), 1, Integer::sum);
        }
        return frqMap;
    }
}