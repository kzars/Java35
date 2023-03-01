package homeworks;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
 /*     Write an application, that will read two numbers from user
        (of type int) and will print true, if both numbers are the
        same sign (both are positive, or both are negative), or false
        otherwise.

        If at least one of given numbers is equal to 0, your application
        should print false.*/

        Scanner scanner = new Scanner(System.in);

        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        if ((input1 > 0 && input2 > 0) || (input1 < 0 && input2 < 0)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Second solution
        System.out.println((input1 > 0 && input2 > 0) || (input1 < 0 && input2 < 0));


    }
}
