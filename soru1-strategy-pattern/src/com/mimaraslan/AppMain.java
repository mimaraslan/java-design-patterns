package com.mimaraslan;

import java.util.Scanner;

import com.mimaraslan.connection.Email;
import com.mimaraslan.connection.Letter;
import com.mimaraslan.connection.Sms;
import com.mimaraslan.connection.Telegram;
import com.mimaraslan.connection.Telephone;

public class AppMain {

	public static void main(String[] args) {

		Context context = new Context();
		
		boolean isPlaying = true;
		while (isPlaying) {

			// Display the menu
			System.out.println("1\t Letter");
			System.out.println("2\t Telephone");
			System.out.println("3\t Email");
			System.out.println("4\t Sms");
			System.out.println("5\t Telegram");

			System.out.print("Please enter your choice: ");
			// Get user's choice
			
			Scanner in = new Scanner(System.in);

			int choice = in.nextInt();

			// Display the title of the chosen module
			switch (choice) {
			case 1:
				System.err.println(" ------------------------> Letter");
				context.setCommunicate(new Letter());
				break;
			case 2:
				System.err.println(" -----------------------> Telephone");
				context.setCommunicate(new Telephone());
				break;
			case 3:
				System.err.println(" -----------------------> Email");
				context.setCommunicate(new Email());
				break;
			case 4:
				System.err.println(" -----------------------> Sms");
				context.setCommunicate(new Sms());
				break;
			case 5:
				System.err.println(" -----------------------> Telegram");
				context.setCommunicate(new Telegram());
				break;
			default:
				System.err.println(" -----------------------> Invalid choice");
				// isPlaying = false; //Break out of the loop!
			}
			System.out.println("-----------------------------");
		}		
	}
}