package homeworks;

import java.util.Arrays;

public class HW10 {
    public static void main(String[] args) {

        int [] myArray = {1,2,3,4,5,6,7,8,9,10,11,12,13};
       // System.out.println("Original array: " + Arrays.toString(myArray));

        for(int i = 0 ; i < myArray.length; i++){

            int temp = myArray[i];
            myArray[i] = myArray[myArray.length-1-i];
            myArray[myArray.length-1-i] = temp;
        }

/*        System.out.println("Reverse array " + Arrays.toString(myArray));
        int right = myArray.length-1;
        for (int left = 0; left < right; left ++, right--) {
            int reverse1 = myArray[left];
            myArray[left] = myArray[right];
            myArray[right] = reverse1;
        }*/
    }
}
