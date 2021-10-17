package model;

public class Identification {
	private int id;
	private String idType;
	
	public Identification(String idType, int id) {
		this.id=id;
		this.idType=idType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}
	
	
}
