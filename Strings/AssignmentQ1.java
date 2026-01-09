package Strings;

public class AssignmentQ1 {
    public static int countLowerCaseVowels(String str) {

        // Approach 1: Not so good approach , if using thing just add char vowels[] in function parameters 
        // int count = 0;

        // for(int i=0 ; i<str.length() ; i++) {
        //     for(int j=0 ; j<vowels.length ; j++) {
        //         if (str.charAt(i) == vowels[j]) {
        //             count++;
        //         }
        //     }
        // }

        // return count;

        //Better Approach :
        int count = 0;

        for(int i=0 ; i<str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        //Question1 : Count how many times lowercase vowels occurred in a String entered by the user.
        String str = "Gautam Kuwar"; //Ans:5

        //for Approach 1: not so good approach
        // char vowels[] = {'a' , 'e' , 'i' , 'o' , 'u'};

        // System.out.println(countLowerCaseVowels(str, vowels));

        System.out.println(countLowerCaseVowels(str));
    }
}
