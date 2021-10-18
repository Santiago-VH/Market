package model;

public class Identification {
	private int id;
	private String idType1;
	
	public Identification(String idType1, int id) {
		this.id=id;
		this.idType1=idType1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdType1() {
		return idType1;
	}

	public void setIdType1(String idType1) {
		this.idType1 = idType1;
	}
	
	
}
