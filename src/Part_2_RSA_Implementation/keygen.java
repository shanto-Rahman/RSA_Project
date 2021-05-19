package Part_2_RSA_Implementation;

import java.util.Random;
import java.math.BigInteger;
public class keygen {
	  public static BigInteger coprime(BigInteger m) {
	      int length = m.bitLength()-1;
	      BigInteger e = new BigInteger(length/2, new Random());
	      while (!(m.gcd(e)).equals(BigInteger.ONE)) {
	      	 e = new BigInteger(length, new Random());
	      }
	      return e;
	   }
	  public static void main (String[] args){
	      if (args.length < 2) {
	         System.out.println("Usage: keygen <prime 1> <prime 2>");
	         return;
	      }

	      BigInteger p  = new BigInteger(args[0]);
	      BigInteger q  = new BigInteger(args[1]);

	      BigInteger n  = p.multiply(q);

	      BigInteger phiN  = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));

	      BigInteger e  = coprime(phiN);
	      while (e.compareTo(phiN) != -1){
	          e = coprime(phiN);
	      }

	      BigInteger d  = e.modInverse(phiN);

	      System.out.println("Public key:  ("+n + ", " +e + ")");
	      System.out.println("Private key: ("+n + ", " +d + ")");
	  }
	}


