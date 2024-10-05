import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        
        int rev=0;
        
        while(n!=0)
        {
          int rem=  n%10;
          rev = rev*10+rem;
          n=n/10;

        }
        System.out.println("The reversed num is "+rev);
    }
}
