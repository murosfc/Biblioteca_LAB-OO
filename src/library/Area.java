package library;

import model.DomainObjectAbstract;

public class Area extends DomainObjectAbstract{
	private String name;
	
	public Area(long id, String name) {
		super(id);
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name ==  null || name.trim().isEmpty())
			throw new IllegalArgumentException("The area of knowledge must be provided");
		this.name = name;		
	}

}
