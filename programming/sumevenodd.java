/* Sum of ebven digit and odd digit */
import java .util.*;
public class sumevenodd {
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
        even+=p;
        else
        odd+=p;
        n=n/10;
    }
    System.out.println("The  sum of even digits are : "+even);
    System.out.println("The  sum of odd digits are : "+odd);
    }
}
