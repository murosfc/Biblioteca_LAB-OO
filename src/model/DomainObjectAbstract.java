package model;

public abstract class DomainObjectAbstract implements DomainObject{
	private long id;
	
	public DomainObjectAbstract(long id) {
		super();
		this.id = id;		
	}

	public long getId() {		
		return id;
	}
}
