/**
 * find number is prime or not
 */
import java .util.*;
public class primenum {
public static void main(String[] args) {
    

    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number :");
    int n = s.nextInt();
    int sum = 0;

 for(int i=2; i<=n; i++)
 {
    if( n %i==0)
    sum++;
    break;
    
 }
 if(sum==0)
 {
    System.out.println("The given number is prime");
 }
 else 
 System.out.println("The given number is  not prime");

}
}