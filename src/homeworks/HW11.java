package homeworks;

import java.util.Scanner;

public class HW11 {
    public static void main(String[] args) {
        //Personal code

        Scanner scanner = new Scanner(System.in);
        char again = 'y';

        while (again == 'y'){

            String test = scanner.nextLine();

            System.out.println("You are in the while loop");

            System.out.println("Do you want to run again?");
            again = scanner.next().charAt(0);
            //Fixing problem
            scanner.nextLine();
        }


    }
}
