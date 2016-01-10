package ie.gmit.sw;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Runner {
	
	/**
	 * TEST :  Type HELOL (hello encyphered) and wait form result.
	 * Input converted to UpperCase for scoring functionality.
	 * 
	 */

	
	public static void main(String[] args) {
		
		
		
		
		RailFence rf = new RailFence();
		//Scanner scanner = new Scanner(System.in);
		int depth;

		String plainText, cypherText2, decryptedText;

		
		
				
		System.out.println("Enter plain text:");
		//plainText = scn.nextLine();
		plainText = JOptionPane.showInputDialog(null, "Enter Plain Text: ", "User Input", JOptionPane.INFORMATION_MESSAGE );

		System.out.println("Enter depth for Encryption:");
		//depth = scn.nextInt();
		depth = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Depth for encryption: " , "DEPTH", JOptionPane.INFORMATION_MESSAGE));

		
		
		
		cypherText2 = rf.encrypt(plainText, depth);
		System.out.println("Encrypted text is:\n" + cypherText2);

		decryptedText = rf.decrypt(cypherText2, depth);

		System.out.println("Decrypted text is:\n" + decryptedText);
		
		//JOptionPane.showMessageDialog ( 
			//	null, "Encrypted Text: " + cypherText, " Decrypted Text: " + decryptedText, JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null,"Please copy the Encrypted text from the console. It will be needed in the next step. ", "RESULTS", JOptionPane.INFORMATION_MESSAGE );
		JOptionPane.showMessageDialog(null,"Please copy the Encrypted Text from the CONSOLE as it will be needed in the decryption process...\n"
			   + "													\n"
			    + "EncryptedText: "+ cypherText2 + "\n" + "PlainText:          "+ decryptedText, "RESULTS", JOptionPane.INFORMATION_MESSAGE );
		
		
		
		
		
		
		
		//Encryptor encryptor = new Encryptor();
		
		new Thread(new Consumer()).start();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter encrypted text:");
		//String cypherText = scn.nextLine().toUpperCase();
		String cypherText = JOptionPane.showInputDialog("Enter Encrypted Text: ").toUpperCase();
		//cypherText.toUpperCase();
		
		System.out.println("Working...");
		//custom 
		JOptionPane.showMessageDialog(null,
		    "Decryption in process.",
		    "Please Wait",
		    JOptionPane.WARNING_MESSAGE);
		
		Worker worker = Worker.getInstance();
		
		worker.addJob(cypherText);
		
		//SATTMTSLSOETAEEPHHCGTTEA
	}
}
