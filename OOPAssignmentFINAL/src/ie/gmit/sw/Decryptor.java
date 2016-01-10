package ie.gmit.sw;

import java.io.IOException;
import java.util.Scanner;

public class Decryptor {
	
	/**
	 * 
	 * Decryptor class used to decrypt Encrypted message while specifying amount of rails used.
	 * Used when known how many rails were used while encrypting the  message.
	 * Spaces can be used in encrypted message(if message contains any).
	 */

	public static void main(String[] args) throws IOException {


		RailFence rf = new RailFence();
		Scanner scn = new Scanner(System.in);
		int depth;

		String  cypherText, cypherText2, encryptedText, decryptedText;

		
		
		/*		
		System.out.println("Enter plain text:");
		plainText = scn.nextLine();

		System.out.println("Enter depth for Encryption:");
		depth = scn.nextInt();

		cypherText = rf.encrypt(plainText, depth);
		System.out.println("Encrypted text is:\n" + cypherText);

		decryptedText = rf.decrypt(cypherText, depth);

		System.out.println("Decrypted text is:\n" + decryptedText);*/
		
		
		
		
		
		System.out.println("Enter Encrypted text:");
		encryptedText = scn.nextLine();
		
		System.out.println("Enter depth for Decryption(Rails):");
		depth = scn.nextInt();
		
		decryptedText = rf.decrypt(encryptedText, depth);
		System.out.println("Decrypted text is:\n" + decryptedText);
			

	}

	private static String readLine(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
