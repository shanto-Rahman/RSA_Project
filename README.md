# RSA_Project

PART-01: In this part, there are two schemes available and those are primecheck and primegen.

A. Primecheck
To check a number is prime or not, I use Miller–Rabin primality test.

B. Primegen
In this phase, I take an integer as input which will represent how many number of bit needs to be generated.
To generate a new prime number, I create an instance of a Random class which will be used to make a new
prime with the given input bit size.



PART-02: There are three schemes in this part and those are keygen, encrypt and decrypt. In this
section, now I will discuss about the public and private key generation techniques.

A. Keygen
Step 1: At first, two prime numbers will be taken as argument.
Step 2: In this step, I will calculate the value of n by the multiplication of p and q.
Step 3: Later, I computed the value of phi by multiplying (p-1) and (q-1).
Step 4: I calculated coprime, e in such a way that gcd(e, phi) = 1 and 1<e<phi.
Step 5: Modular multiplicative inverse, d will be calculated in this stage and d will be generated in a way
so that e.d = 1
Setp 6: Finally, I will print the public key using n and e. Meanwhile, private key will be generated using n
and d

B. Encrypt
In this step, I will encrypt a message using n and e which are obtained from keygen class. To create a
chipertext, here I will use a built-in modpow function from the built-in BigInteger class.

C. Decrypt
In this phase, I will decrypt a ciphertext into a plaintext. Hence, n, e and c will be given as input to the
function. To implement decryption, I used modpow function which is built-in BigInteger class.
