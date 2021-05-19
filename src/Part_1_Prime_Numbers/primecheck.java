package Part_1_Prime_Numbers;
import java.math.BigInteger;
import java.util.Random;

public class primecheck {

	public boolean isPrime_MillerRabin(BigInteger n, Random r) {
	    BigInteger TWO_1 = BigInteger.valueOf(2);
	    BigInteger THREE = BigInteger.valueOf(3);
		BigInteger temp = BigInteger.ZERO;
		if (n.equals(TWO_1))
            return true;
		if (n.equals(THREE))
            return true;
		
		do {
			temp = new BigInteger(n.bitLength()-1, r);
		} while (temp.compareTo(BigInteger.ONE) <= 0);
	
		if (!n.gcd(temp).equals(BigInteger.ONE)) 
		{
			return false; // If the gcd of two numbers is not 1, means that n is not prime.  So, return false
		}
	
		BigInteger base = n.subtract(BigInteger.ONE); //
		BigInteger TWO = new BigInteger("2");
		int k=0;
		
		while ((base.mod(TWO)).equals(BigInteger.ZERO)) {
			base = base.divide(TWO);
			k++;
		}

		BigInteger curValue = temp.modPow(base,n);
	
		if (curValue.equals(BigInteger.ONE))
			return true;
		
		for (int i=0; i<k; i++) {
			if (curValue.equals(n.subtract(BigInteger.ONE)))
				return true;
			else
				curValue = curValue.modPow(TWO, n);
		}
		return false;
	}
    
    public static void main (String[] args)
    {  
        int k;
		
		  if (args.length < 1){
			  System.out.println("No data (Argument) is given"); 
			  System.out.println(args[0]);
			  return;
		  } 
		  else if (args.length == 2) 
			  k = Integer.parseInt(args[1]);
		  
        //System.out.println("Input:  " + args[0]);
        
        BigInteger num = new BigInteger(args[0]);
        
        primecheck primeChk = new primecheck();
        Random rand= new Random();
        if (primeChk.isPrime_MillerRabin(num, rand))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
