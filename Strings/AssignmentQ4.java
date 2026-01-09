package Strings;

public class AssignmentQ4 {

    public static boolean isAnagram(String str1 , String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int freq[] = new int[26];

        for(int i=0 ; i<str1.length() ; i++) {
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }

        for(int i=0 ; i<freq.length ; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        //Question 4: Determine if two strings are anagrams of each other.
        // What are anagrams?
        // If two strings contain the same characters but in a different order, they can be said to be anagrams.
        // Consider race and care.
        // In this case, race’s characters can be rearranged to form care, and care’s characters can be rearranged to form race.

        String str1 = "race";
        String str2 = "care";


        System.out.println(isAnagram(str1, str2));

    }
}
