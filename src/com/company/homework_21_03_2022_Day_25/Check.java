package com.company.homework_21_03_2022_Day_25;

import java.util.*;

public class Check {
    /**
     * Task 1
     *
     * @param array
     * @return
     */
    public static boolean chechDuplicate(int[] array) {
        Set set = new HashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                return true;
            } else set.add(array[i]);

        }
        return false;
    }

    /**
     * Task 2
     *
     * @param array
     */
    public static void onlyOnceInArray(int[] array) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    /**
     * Task 3
     *
     * @param string
     * @return
     */
    public static int countsOfDuplicateCharacters(String string) {

        int count = 0;
        Character character[] = new Character[string.length()];
        for (int i = 0; i < string.length(); i++) {
            character[i] = string.charAt(i);
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < character.length; i++) {
            if (map.containsKey(character[i])) {
                map.put(character[i], map.get(character[i]) + 1);
            } else map.put(character[i], 1);
        }
        for (int i = 0; i < character.length; i++) {
            System.out.println(character[i] + " ");
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " is duplicate " + entry.getValue() + " times");
            }
        }
        System.out.println("Count of duplicate elements is ");

        return count;
    }

    /**
     * Task 4
     *
     * @param string
     */
    public static void nonReapetedElement(String string) {
        int count = 0;
        Character character[] = new Character[string.length()];
        for (int i = 0; i < string.length(); i++) {
            character[i] = string.charAt(i);
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < character.length; i++) {
            if (map.containsKey(character[i])) {
                map.put(character[i], map.get(character[i]) + 1);
            } else map.put(character[i], 1);
        }
        for (int i = 0; i < character.length; i++) {
            System.out.print(character[i] + " ");
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("\nFirst non-reapeted element is " + entry.getKey());
                break;
            }
        }
    }

    /**
     * 15
     *
     * @param
     */
/*
    public static void lengthOfTheLongestSubstringWithoutRepeatingCharacters(String string) {
        int count = 0;
        int k = 0;
        Set<Character> set = new HashSet<>();
        Character character2[];
        Character character[] = new Character[string.length()];
        for (int i = 0; i < string.length(); i++) {
            character[i] = string.charAt(i);
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < character.length; i++) {
            if (map.containsKey(character[i])) {
                map.put(character[i], map.get(character[i]) + 1);
            } else map.put(character[i], 1);
        }
        for (int i = 0; i < character.length; i++) {
            System.out.print(character[i] + " ");
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                count++;
                if (!set.contains(entry.getKey())){
                    set.add(entry.getKey());
                }
            }

        }

        System.out.println(map);
        System.out.println("\nlength of the longest substring without repeating characters " + map.size());

        System.out.println(set);

    }*/
/*
    public static void lengthOfTheLongestSubstringWithoutRepeatingCharacters(String string) {
        Set<Character> set=new HashSet<>();
        Set<Character> set2=new HashSet<>();

        int k=string.length();
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i)+" ");
        }
        System.out.println();
        int count=0;

        for (int i = 0; i < string.length(); i++) {
            if (!set.contains(string.charAt(i))){
                set.add(string.charAt(i));

            }
            else {
                    for (int j = 0; j <i ; j++) {
                        set2.add(string.charAt(j));
                    }

            }

            //i=0;
        } System.out.println(set);
        System.out.println(set2);

    }
*/

    public static void lengthOfTheLongestSubstringWithoutRepeatingCharacters(String s) {
    String s1 = "";
    for (int i = 0; i < s.length(); i++) {
        Set<Character> set = new HashSet<>();
        int j = i;
        for (; j< s.length(); j++) {
            char c = s.charAt(j);
            if (set.contains(c)) {
                break;
            } else {
                set.add(c);
            }
        }
        System.out.println(set);
        if (s1.length() < j - i + 1) {
            s1 = s.substring(i, j);
        }
    }

    System.out.println(s1.length());
}
}
