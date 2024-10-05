import java.util.Scanner;
public class neonnum 
{
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= s.nextInt();
        int digit = 0;
       int sq=n*n;
       while(sq!=0)
       {
        digit += sq% 10;
       sq= sq/10;
               
       }
       if(digit==n)
       {
        System.out.println("The number is a neon number ");
       }
       else
       System.out.println("The number is not a neon number");
    }
}
