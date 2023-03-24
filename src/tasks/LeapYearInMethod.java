package tasks;

import java.util.Scanner;

public class LeapYearInMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any year");
        int year = scanner.nextInt();

        determinLeapYear(year);
        System.out.println(determinLeapYearString(year));
    }

    public static void determinLeapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }

    public static String determinLeapYearString(int year){
        String answer;
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            answer = "Leap year";
        } else {
            answer = "Not a leap year";
        }
        return answer;
    }


}
