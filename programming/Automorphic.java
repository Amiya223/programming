import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt(); // Declare n as an int
        int count = 0;
        int num = n;
        while (n != 0) {
            int a = n % 10; 
            n = n / 10;
            count++;      
        }
        long sq = (long) Math.pow(num, 2); // Cast to long to avoid precision loss
        long mod = sq % (long) Math.pow(10, count); // Cast to long to avoid precision loss
        
        if (mod == num)
            System.out.println("Automorphic");     
        else
            System.out.println("Not Automorphic");
    }
}

