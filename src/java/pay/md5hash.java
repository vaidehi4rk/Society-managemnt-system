package pay;
import java.security.*;
public class md5hash {
    
    private String hashpass="";
    public String getHashPass(String password) throws //cardno,cvv,
        NoSuchAlgorithmException, NoSuchProviderException{

        String plainText = password;
        byte[] salt=getSalt();
        MessageDigest mdAlgorithm = MessageDigest.getInstance("MD5");
        mdAlgorithm.update(salt);
        byte[] digest = mdAlgorithm.digest(plainText.getBytes());
        StringBuffer hexString = new StringBuffer();

        for (int i = 0; i < digest.length; i++) {
            plainText = Integer.toHexString(0xFF & digest[i]);

            if (plainText.length() < 2) {
                plainText = "0" + plainText;
            }

            hexString.append(plainText);
        }
        hashpass = hexString.toString();

        return hashpass;
    }
    
    public byte[] getSalt() throws NoSuchAlgorithmException, NoSuchProviderException
    {
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG", "SUN");
        byte[] salt = new byte[16];
        sr.nextBytes(salt);
        return salt;
    }
}
