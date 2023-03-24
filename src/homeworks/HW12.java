package homeworks;

import java.util.Scanner;

public class HW12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.
        System.out.println("Enter a name");
        String input = scanner.nextLine().toLowerCase().trim().replaceAll(" ","");
        boolean isPalindrome = true;

        //2.
        for(int i = 0; i < input.length() / 2; i++){
            if(input.charAt(i) != input.charAt(input.length() - i - 1)){
                isPalindrome = false;
                break;
            }
        }
        //3.
        if (isPalindrome){
            System.out.printf("Your input %s is a palindrome \n", input);
        } else {
            System.out.printf("Your input %s is not a palindrome \n", input);
        }

    }
}
