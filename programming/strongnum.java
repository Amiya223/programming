import java.util.Scanner;

public class strongnum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        int num = n;
        int sum=0;
        
        
        while(n!=0)
        {
            int fact=1;
           int rem=n%10;     
        for(int i=1; i<=rem;i++)
         {
        
            fact =  fact*i;        
          }
        sum=sum+fact;
        n=n/10;
        }
        
        if(sum==num){
        
        
        System.out.println("Strong number");
        }
        else{
        System.out.println("Not a strong number");
        }
    }
}
