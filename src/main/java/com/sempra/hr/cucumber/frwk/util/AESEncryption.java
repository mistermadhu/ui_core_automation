package com.sempra.hr.cucumber.frwk.util;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class does AES encryption and decryption of confidential data
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class AESEncryption {
 
    /**
     * 1. Generate a plain text for encryption
     * 2. Get a secret key (printed in hexadecimal form). In actual use this must 
     * by encrypted and kept safe. The same key is required for decryption.
     * 3. 
     */
	private final static Logger logger = LoggerFactory.getLogger(AESEncryption.class);
      /**
     * gets the AES encryption key in Hex format.Store the key in HSM or locker
     * @return
     * @throws Exception 
     */
    public static String getSecretEncryptionKey() throws Exception{
        KeyGenerator generator = KeyGenerator.getInstance("AES");
        generator.init(128); // The AES key size in number of bits
        SecretKey secretKey = generator.generateKey();
        return bytesToHex(secretKey.getEncoded());
    }
    
    /**
     * Encrypts plainText in AES using the secret key in hex format
     * @param plainText
     * @param hexKeyStr 
     * @return
     * @throws Exception 
     */
    public static String encryptText(String plainText,String hexKeyStr) throws Exception{
		// AES defaults to AES/ECB/PKCS5Padding in Java 7
    	SecretKey secretKey = new SecretKeySpec(hexToByteArray(hexKeyStr), "AES");
        Cipher aesCipher = Cipher.getInstance("AES");
        aesCipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] byteCipherText = aesCipher.doFinal(plainText.getBytes());
        return DatatypeConverter.printHexBinary(byteCipherText);
    }
    
    /**
     * Decrypts encrypted data in Hex format using the hex key used for encryption.
     * @param byteCipherText
     * @param hexKeyStr
     * @return
     * @throws Exception 
     */
    public static String decryptText(String cipherTextInHex, String hexKeyStr) {
	   try
	   {
    	byte[] byteCipherText=hexToByteArray(cipherTextInHex);
    	SecretKey secretKey = new SecretKeySpec(hexToByteArray(hexKeyStr), "AES");
        Cipher aesCipher = Cipher.getInstance("AES");
        aesCipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] bytePlainText = aesCipher.doFinal(byteCipherText);
        return new String(bytePlainText);
	   }
	  catch(Exception exp)
	   {
		  logger.info("Exception while decrypting text :"+exp);
		  return null;
	   }
    }
    
    /**
     * Convert a binary byte array into readable hex form
     * @param hash
     * @return 
     */
    private static String  bytesToHex(byte[] hash) {
        return DatatypeConverter.printHexBinary(hash);
    }
    
    /**
     * Convert hex  into  binary byte array
     * @param hash
     * @return 
     */
    private static byte[]   hexToByteArray(String hexKey) {
    	byte[] b = new byte[hexKey.length() / 2];
        for (int i = 0; i < b.length; i++) {
            int index = i * 2;
            int v = Integer.parseInt(hexKey.substring(index, index + 2), 16);
            b[i] = (byte) v;
        }
        return b;
    }
    
    
    public static void main(String[] args) throws Exception {
        String plainTextPassword = "717CCED269EB1D984F953ECA444840634814CADB4FCDAB7FCB6AC2C17EDC4691";
        //SecretKey secretKey=getSecretEncryptionKey();
        String encryptedTextInHex = encryptText(plainTextPassword, FrameworkConstants.HEXX);
        String decryptedTextInHex = decryptText("49BC901F154770AE8B2B510F5158CD68", FrameworkConstants.HEXX);
        
        System.out.println("Original Text:" + plainTextPassword);
        System.out.println("AES Key (Hex Form):"+FrameworkConstants.HEXX);//bytesToHex(secreetKey.getEncoded()));
        System.out.println("Encrypted Text (Hex Form):"+encryptedTextInHex);
        System.out.println("Descrypted Text:"+decryptedTextInHex);
        
        
        
    }
    
}