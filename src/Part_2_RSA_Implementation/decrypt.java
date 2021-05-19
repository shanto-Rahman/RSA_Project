package Part_2_RSA_Implementation;

import java.math.BigInteger;

public class decrypt {
	  public static void main (String[] args){
	    if (args.length != 3){
	      System.out.println("Arguments are not given. Please set 3 arguments properly");
	      return;
	    }
	    BigInteger n = new BigInteger(args[0]);
	    BigInteger e = new BigInteger(args[1]);
	    BigInteger c = new BigInteger(args[2]);

	    BigInteger m = c.modPow(e, n); 
	    System.out.println(m);
	  }
}


