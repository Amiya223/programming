/*count the digit of a number */
import java .util.*;
public class countdigit {
    public static void main(String [] args)
    {
         Scanner a = new Scanner(System.in);
         System.out.println("Enter a number : ");
         int v = a.nextInt();
         int sum = 0;
         while (v!=0) {
            v=v/10;
            sum++;
         }

         System.out.println("The number of digits are "+sum);
    }
}
