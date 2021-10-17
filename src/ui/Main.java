package ui;

import java.util.ArrayList;
import java.util.Scanner;

import model.Identification;

public class Main {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		

		System.out.println("/-/-/-/-/-WELCOME-/-/-/-/-/ \n \n"
						 + "1. Register new client \n"
						 + "2. Check the total amount of clients \n"
						 + "3. Exit the program\n");
		int menuNumber = sc.nextInt();
		sc.nextLine();
		
		int totalClients=0;
		switch(menuNumber){
			case 1: 
				totalClients++;
				System.out.println("Select your ID type \n"
									+ "1. TI \n"
									+ "2. CC \n"
									+ "3. PP \n"
									+ "4. CE");
				int idType0=sc.nextInt();
				sc.nextLine();
				idTypeCondition(idType0);
				
					System.out.println("Digit your ID \n");
					
					int id=sc.nextInt();
					//String idLength = String.valueOf(id);
					ArrayList<Identification> data=new ArrayList<Identification>();
				break;
			case 2: 
				System.out.println("A total of "+ totalClients +" clients.");
				break;
			case 3: 
				System.out.println("See you soon!");
				break;
				default: System.out.println("Please digit a number from 1 to 3 to use the program.");
			}
		}
	
	public static void idTypeCondition(int idType0) {
		if(idType0 == 1) {
			System.out.println("We can't register you because you're underage, please try when you're older.");
		} else {
			
			String idType ="";
			switch(idType0) {
			case 2: idType="CC";
			break;
			case 3: idType="PP";
			break;
			case 4: idType="CE";
			break;
			}
		}
	}
}
	
