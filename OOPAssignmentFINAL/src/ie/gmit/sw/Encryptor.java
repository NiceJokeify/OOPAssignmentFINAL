package ie.gmit.sw;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Encryptor {
	
	/**
	 * 
	 * Encryptor class used to encrypt PLAINTEXT while specifying amount of rails used to encrypt.
	 * Spaces can be used while encrypting text. 
	 * Example: hello -> he llo, message will be encrypted and decrypted.
	 */
	
    
	public static void main(String[] args) throws IOException {

		
		RailFence rf = new RailFence();
		Scanner scn = new Scanner(System.in);
		int depth;

		String plainText, cypherText, decryptedText;

		
		
				
		System.out.println("Enter plain text:");
		//plainText = scn.nextLine();
		plainText = JOptionPane.showInputDialog("Enter Plain Text: ");

		System.out.println("Enter depth for Encryption:");
		//depth = scn.nextInt();
		depth = Integer.parseInt(JOptionPane.showInputDialog("Enter Depth for encryption: "));

		
		
		
		cypherText = rf.encrypt(plainText, depth);
		System.out.println("Encrypted text is:\n" + cypherText);

		decryptedText = rf.decrypt(cypherText, depth);

		System.out.println("Decrypted text is:\n" + decryptedText);
		
		//JOptionPane.showMessageDialog ( 
			//	null, "Encrypted Text: " + cypherText, " Decrypted Text: " + decryptedText, JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "EncryptedText: "+ cypherText + "\n" + "DecryptedText: "+ decryptedText);
		/*
		System.out.println("---------------------------------------------");
		
		String encryptedText;
		
		System.out.println("Enter encrypted text:");
		encryptedText = scn.nextLine();
		
		System.out.println("Enter depth for Decryption:");
		depth = scn.nextInt();
		
		cypherText2 = rf.decrypt(encryptedText, depth);
		System.out.println("Decrypted text is:\n" + cypherText2);
			*/

	}
	
	

	private static String readLine(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
