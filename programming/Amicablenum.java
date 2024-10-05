import java.util.Scanner;
public class Amicablenum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        int num=n;
        int sum=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            sum += i;

        }
        if(sum==num)
        System.out.println("THe number is an amicable number");
        else
        System.out.println("The number is not an amicable number");
    }
}
