package model;

import exceptions.BadIdException;

public class IdManager {
	public static String idTypeCondition(int idType0) throws BadIdException {
		String idType1=String.valueOf(idType0);
		if(idType0 == 1) {
			throw new BadIdException(idType0);
		} else {
			switch(idType0) {
			case 2: idType1="CC";
			break;
			case 3: idType1="PP";
			break;
			case 4: idType1="CE";
			break;
			}
		}
		return idType1;
		
	}
}
