package edu.wmich.cs1120.LA5;

import java.io.File;
import java.util.Scanner;

public class ContactInformationFormatter implements IContactInformationFormatter{
	
	
	@Override
	public void readContactInformation(String[] filePaths) {
		
		
		
	}

	@Override
	public void formatContactInformation(String fileName) {
		
		File file = new File(fileName);
		Scanner inputFile = new Scanner(fileName);
		
		String name = inputFile.nextLine();
		String number = inputFile.nextLine();
		String email = inputFile.nextLine();
		
		try { formatName(name); }
		catch(NameFormatException e) {
			FormatExceptionHandler.handleNameFormatException(e);
		}
		
	}

	@Override
	public void formatEmail(String email) throws EmailAddressFormatException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void formatPhoneNumber(String phoneNumber) throws PhoneNumberFormatException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void formatName(String name) throws NameFormatException {
		
		String[] FLName = name.trim().split(" ");
		
		if(FLName[0].charAt(0) > 64 && FLName[0].charAt(0) < 93) {
			if(FLName[1].charAt(0) > 64 && FLName[1].charAt(0) < 93) {
				if(FLName[0].substring(1).compareTo(FLName[0].toLowerCase().substring(1)) == 0) {
					if(FLName[1].substring(1).compareTo(FLName[1].toLowerCase().substring(1)) == 0) {
						System.out.println(name);
						return;
					}
				}
			}
		}
		
		throw new NameFormatException(name);
		
	}

}
