package Part_2_RSA_Implementation;

import java.math.BigInteger;

public class encrypt {
	 
	  public static void main (String[] args){
	    if (args.length != 3){
	      System.out.println("Arguments are not given. Please set 3 arguments properly");
	      return;
	    }
	    BigInteger n = new BigInteger(args[0]);
	    BigInteger e = new BigInteger(args[1]);
	    BigInteger m = new BigInteger(args[2]);

	    BigInteger c = m.modPow(e, n);
	    System.out.println(c);
	  }
}

