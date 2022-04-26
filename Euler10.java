public class Euler10 {
    public static void main(String [] args)
    {

        Euler10 E = new Euler10();
         
        
        long Sum = 0;
         
        
        int counter = 1;
         
        
        while (counter < 2000000) {
             
           
            if (E.isPrime(counter)) {
                Sum += counter;
            }
            
            counter += 2;
        }
        
        System.out.println(Sum + 2); 
    }
 
    public boolean isPrime(int n)
        {
        if (n == 1){
            return false;
        }
        int k = (int) Math.sqrt(n);
            for (int i = 2; i <= k; i++)
            {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
 
}