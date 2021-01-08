package pay;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;
 
public class rsa
{
    private BigInteger p;
    private BigInteger q;
    private BigInteger N;
    private BigInteger phi;
    private BigInteger e;
    private BigInteger d;
    private int        bitlength = 32;
    private Random     r;
 
    public rsa()
    {
        r = new Random();
        p = BigInteger.probablePrime(bitlength, r);
        System.out.println("p value"+p);
        
        q = BigInteger.probablePrime(bitlength, r);
        System.out.println("\nq value="+q);
        N = p.multiply(q);
        phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        e = BigInteger.probablePrime(bitlength / 2, r);
        while (phi.gcd(e).compareTo(BigInteger.ONE) > 0 && e.compareTo(phi) < 0)
        {
            e.add(BigInteger.ONE);
        }
        d = e.modInverse(phi);
    }
 
    public rsa(BigInteger e, BigInteger d, BigInteger N)
    {
        this.e = e;
        this.d = d;
        this.N = N;
    }
 
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws IOException
    {
        rsa rsa = new rsa();
        /*DataInputStream in = new DataInputStream(System.in);
        String teststring;*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the plain text:");
        BigInteger message;
        message=sc.nextBigInteger();        
        // encrypt
        BigInteger encrypted = rsa.encrypt(message);
        // decrypt
        BigInteger decrypted = rsa.decrypt(encrypted);
        
        System.out.println("Message: "+message);
        System.out.println("Encrypted message: "+encrypted );
        System.out.println("Decrypted message: " + decrypted);
    }
 
    /*private static String bytesToString(byte[] encrypted)
    {
        String test = "";
        for (byte b : encrypted)
        {
            test += Byte.toString(b);
        }
        return test;
    }*/
 
    // Encrypt message
    public BigInteger encrypt(BigInteger message)
    {
        return (message.modPow(e, N));
    }
 
    // Decrypt message
    public BigInteger decrypt(BigInteger message)
    {
        return (message.modPow(d, N));
    }
}
