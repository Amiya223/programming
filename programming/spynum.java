/*Spy number ex- 123.  1*2*3==1+2+3  */
import java.util.Scanner;
public class spynum {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n =s.nextInt();
    int prod=1;
    int sum=0;
    int rev=0;

    while(n!=0)
    {
       int rem = n%10;
       int v = rev*10+rem;
       sum=sum+v;
       prod=prod*v;
        n=n/10;

    }
    if(sum==prod)
    System.out.println("It is a  spy number");
    else
    System.out.println("Not a spy number");
  }  
}
