import java.util.*;
import java.util.Scanner;

public class questionthree {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Enter the size of array:" );
       int size = input.nextInt();
       System.out.println("Enter the power to raise each number to: ");
       int power = input.nextInt();
       input.close();

       int[] array = toPower(size, power);
       System.out.println(Arrays.toString(array));
       
   }
    public static int[] toPower(int size, int power) {
        int array[] = new int[size];
        
        for(int i = 0; i < size; i++) {
            array[i] = (int)Math.pow(i, power);
        }
        return array;
    }
        


}
