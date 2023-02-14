package person;

import model.DomainObjectAbstract;

public abstract class Person extends DomainObjectAbstract{
	private String name;
	
	public Person(long id, String name) {
		super(id);
		this.name = name;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name ==  null || name.trim().isEmpty())
			throw new IllegalArgumentException("A name must be provided");
		this.name = name;
	}
}
