package Part_1_Prime_Numbers;
import java.util.Random;
import java.math.BigInteger;

public class primegen
{
    public static BigInteger gen (int nbits)
    {
        primecheck pc = new primecheck();
        while (true){ 
        	
          Random rnd = new Random();
          BigInteger x = new BigInteger(nbits, rnd);
          
          if(x.bitLength()== nbits){ 
        	  Random rand_1= new Random();
	          if (pc.isPrime_MillerRabin(x, rand_1)){  
	            return x;
	          }
          }
        }
    }
    public static void main (String[] args)
    {
        if (args.length != 1){
          System.out.println("Usage: primegen <nbits>");
          return;
        }

        int nbits = Integer.parseInt(args[0]);
        BigInteger x = gen(nbits);    
        System.out.println(x);
    }
}