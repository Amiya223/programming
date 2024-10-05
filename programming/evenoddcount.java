/*Count the even numbers and odd numbers present in a number */
import java .util.*;
public class evenoddcount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    System.out.println("Enter a number :");
    int n = s.nextInt();
    int even = 0;
    int odd=0;

    while (n!=0) 
    {
        int p=  n%10;
        if(p%2==0)
        even++;
        else
        odd++;
        n=n/10;
    }
    System.out.println("The even digits are : "+even);
    System.out.println("The odd digits are : "+odd);
    }
}
