package ui;

import java.util.ArrayList;
import java.util.Scanner;

import exceptions.BadIdException;
import model.IdManager;
import model.Identification;

public class Main {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args, String idType1) throws BadIdException {
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
			
			IdManager.idTypeCondition(idType0);
			
				System.out.println("Digit your ID \n");
				
				int id=sc.nextInt();
				
				
				
				Identification data = new Identification(idType1, id);
				data.getIdType1();
				try {
					IdManager.idTypeCondition(idType0);
				}catch(BadIdException bie) {
					
				}
				//ArrayList<Identification> data=new ArrayList<Identification>();
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
	

}
	
