public class Prime 
{
    public static void main(String[] args) 
    {
        int count = 0;
        int num = 2;
        
        System.out.println("The first ten prime numbers are:");
        while (count < 10) 
        {
            boolean isPrime = true;
            
            for (int i = 2; i <= Math.sqrt(num); i++) 
            {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) 
            {
                System.out.println(num + " ");
                count++;
            }
            num++;
        }
    }
}
